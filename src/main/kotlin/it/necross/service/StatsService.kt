package it.necross.service

import it.necross.RainbowWrapper
import it.necross.connection.ConnectionBuilder
import it.necross.enums.GamePlatform
import it.necross.enums.RestType
import it.necross.interfaces.stats.IStats
import it.necross.util.Data

class StatsService(private val connectionBuilder: ConnectionBuilder) {

    fun getStatsById(platform: GamePlatform, userId: String): IStats {
        val result = connectionBuilder.makeRequest("${Data.apiUrl}/${platform.identifier}/stats/id/$userId", RestType.GET)
        val jsonData: String = result.body!!.string()

        return RainbowWrapper.gson.fromJson(jsonData, IStats::class.java)
    }

    fun getStatsByUserName(platform: GamePlatform, userName: String): IStats {
        val result = connectionBuilder.makeRequest("${Data.apiUrl}/${platform.identifier}/stats/username/$userName", RestType.GET)
        val jsonData: String = result.body!!.string()

        return RainbowWrapper.gson.fromJson(jsonData, IStats::class.java)
    }
}