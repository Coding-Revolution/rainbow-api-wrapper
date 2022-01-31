package it.necross.connection

import com.google.gson.Gson
import it.necross.enums.RestType
import it.necross.interfaces.connection.RestBodyInterface
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.toRequestBody

class ConnectionBuilder(private val apiKey: String) {

    private val httpClient = OkHttpClient()

    fun makeRequest(url: String, restType: RestType): Response {
        val request = Request.Builder()
            .url(url)
            .method(restType.name, null)
            .addHeader("X-API-KEY", this.apiKey)
            .build();

        return httpClient.newCall(request).execute();
    }

    private fun generateRequestBody(restBodyInterface: RestBodyInterface): RequestBody {
        val jsonType = "application/json; charset=utf-8".toMediaTypeOrNull()
        val jsonConverter = Gson().toJson(restBodyInterface)

        return jsonConverter.toRequestBody(jsonType)
    }

    fun makeRequestWithBody(url: String, restBody: RestBodyInterface, restType: RestType): Response {
        val request = Request.Builder()
            .url(url)
            .method(restType.name, generateRequestBody(restBody))
            .addHeader("X-API-KEY", this.apiKey)
            .build();

        return httpClient.newCall(request).execute()
    }

    inline infix fun <reified T : Any> Response.convert(target: Class<T>): T {
        val responseString = this.body!!.string()
         return if (code !in 200..201) {
            //ProcessedResponse(code, null)
            this.close()
            println("Es ist ein Fehler aufgetreten. Code: $code")
            null as T
        } else {
            //ProcessedResponse(code, BackendWrapper.gson.fromJson(this.body!!.string(), target))
            this.close()
            Gson().fromJson(responseString, target)
        }
    }

}