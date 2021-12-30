package it.necross.service

import it.necross.RainbowWrapper
import it.necross.connection.ConnectionBuilder
import it.necross.enums.GamePlatform
import it.necross.enums.RestType
import it.necross.interfaces.username.IUsername
import it.necross.util.Data

class UsernameService(private val connectionBuilder: ConnectionBuilder) {

    fun getUserName(platform: GamePlatform, userId: String): IUsername {
        val result = connectionBuilder.makeRequest("${Data.apiUrl}/user/${platform.identifier}/id/$userId", RestType.GET)
        val jsonData: String = result.body()!!.string()

        return RainbowWrapper.gson.fromJson(jsonData, IUsername::class.java)
    }
}