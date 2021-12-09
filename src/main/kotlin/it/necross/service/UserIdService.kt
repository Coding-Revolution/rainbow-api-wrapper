package it.necross.service

import it.necross.RainbowWrapper
import it.necross.connection.ConnectionBuilder
import it.necross.enums.GamePlatform
import it.necross.enums.RestType
import it.necross.interfaces.UbisoftId
import it.necross.util.Data

class UserIdService(private val connectionBuilder: ConnectionBuilder) {

    fun getUserID(platform: GamePlatform, userName: String): UbisoftId {
        val result = connectionBuilder.makeRequest("${Data.apiUrl}/${platform.identifier}/id/$userName", RestType.GET)
        val jsonData: String = result.body()!!.string()

        return RainbowWrapper.gson.fromJson(jsonData, UbisoftId::class.java)
    }
}