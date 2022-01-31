package it.necross.service

import it.necross.RainbowWrapper
import it.necross.connection.ConnectionBuilder
import it.necross.enums.GamePlatform
import it.necross.enums.RestType
import it.necross.interfaces.rank.IRank
import it.necross.util.Data

class RankService(private val connectionBuilder: ConnectionBuilder) {

    fun getRanksByUserName(platform: GamePlatform, userName: String): IRank{
        val result = connectionBuilder.makeRequest("${Data.apiUrl}/${platform.identifier}/rank/username/$userName", RestType.GET)
        val jsonData: String = result.body!!.string()

        return RainbowWrapper.gson.fromJson(jsonData, IRank::class.java)
    }
}