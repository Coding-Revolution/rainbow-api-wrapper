package it.necross.service

import it.necross.RainbowWrapper
import it.necross.connection.ConnectionBuilder
import it.necross.enums.RestType
import it.necross.interfaces.ServerStatusInterface
import it.necross.util.Data
import org.json.JSONObject


class ServerStatusService(private val connectionBuilder: ConnectionBuilder) {

    fun getStatus(): List<ServerStatusInterface> {
        val result = connectionBuilder.makeRequest(Data.apiUrl + "/status", RestType.GET);
        val jsonData: String = result.body!!.string()

        return RainbowWrapper.gson.fromJson(jsonData, Array<ServerStatusInterface>::class.java).toList()
    }
}