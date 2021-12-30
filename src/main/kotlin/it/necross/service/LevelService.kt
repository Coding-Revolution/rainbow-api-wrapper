package it.necross.service

import it.necross.RainbowWrapper
import it.necross.connection.ConnectionBuilder
import it.necross.enums.GamePlatform
import it.necross.enums.RestType
import it.necross.interfaces.Level
import it.necross.util.Data

class LevelService(private val connectionBuilder: ConnectionBuilder) {

    fun getLevelByUsername(platform: GamePlatform, userName: String): Level {
        val result = connectionBuilder.makeRequest("${Data.apiUrl}/${platform.identifier}/level/username/$userName", RestType.GET)
        val jsonData: String = result.body()!!.string()

        return RainbowWrapper.gson.fromJson(jsonData, Level::class.java)
    }

    fun getLevelByUserID(platform: GamePlatform, userId: String): Level {
        val result = connectionBuilder.makeRequest("${Data.apiUrl}/${platform.identifier}/level/id/$userId", RestType.GET)
        val jsonData: String = result.body()!!.string()

        return RainbowWrapper.gson.fromJson(jsonData, Level::class.java)
    }

}