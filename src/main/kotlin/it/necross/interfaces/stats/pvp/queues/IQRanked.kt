package it.necross.interfaces.stats.pvp.queues

data class IQRanked(val name: String, val kills: Int, val deaths: Int, val kd: Double, val wins: Int, val losses: Int,
val winRate: String, val matches: Int, val playtime: Int)
