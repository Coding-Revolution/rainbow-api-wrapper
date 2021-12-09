package it.necross.interfaces.stats.operators

data class IOperatorInformation(val name: String, val role: String, val unit: String, val icon: String,
val kills: Int, val deaths: Int, val kd: Double, val wins: Int, val losses: Int, val winRate: String,
val matches: Int, val headshots: Int, val meleeKills: Int, val dbno: Int, val xp: Int, val playtime: Int, )
