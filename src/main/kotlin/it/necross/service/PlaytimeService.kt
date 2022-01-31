package it.necross.service

import it.necross.RainbowWrapper
import it.necross.connection.ConnectionBuilder
import it.necross.enums.GamePlatform
import it.necross.enums.RestType
import it.necross.interfaces.playtime.Playtime
import it.necross.util.Data

class PlaytimeService(private val connectionBuilder: ConnectionBuilder) {

    fun getPlaytimeByUsername(platform: GamePlatform, userName: String): Playtime {
        val result = connectionBuilder.makeRequest("${Data.apiUrl}/${platform.identifier}/playtime/username/$userName", RestType.GET)
        val jsonData: String = result.body!!.string()

        return RainbowWrapper.gson.fromJson(jsonData, Playtime::class.java)
    }

    fun getPlaytimeByUserId(platform: GamePlatform, userId: String): Playtime {
        val result = connectionBuilder.makeRequest("${Data.apiUrl}/${platform.identifier}/playtime/id/$userId", RestType.GET)
        val jsonData: String = result.body!!.string()

        return RainbowWrapper.gson.fromJson(jsonData, Playtime::class.java)
    }
}