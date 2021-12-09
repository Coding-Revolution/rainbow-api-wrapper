package it.necross.connection

import com.google.gson.Gson
import it.necross.enums.RestType
import it.necross.interfaces.connection.RestBodyInterface
import okhttp3.*

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
        val jsonType = MediaType.parse("application/json; charset=utf-8")
        val jsonConverter = Gson().toJson(restBodyInterface)

        return RequestBody.create(jsonType, jsonConverter)
    }

    fun convertResponseToClass(response: Response, target: Class<Any>): Class<Any> {
        return Gson().fromJson(response.body().toString(), target::class.java);
    }

    fun convertResToClassArray(response: Response, target: RestBodyInterface): Array<RestBodyInterface> {
        return Gson().fromJson(response.body().toString(), arrayOf(target)::class.java);
    }

    fun makeRequestWithBody(url: String, restBody: RestBodyInterface, restType: RestType): Response {
        val request = Request.Builder()
            .url(url)
            .method(restType.name, generateRequestBody(restBody))
            .addHeader("X-API-KEY", this.apiKey)
            .build();

        return httpClient.newCall(request).execute()
    }
}