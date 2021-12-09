package it.necross.interfaces.stats.pvp.modes

data class IHostage(val name: String, val wins: Int, val losses: Int, val winRate: String,
val matches: Int, val bestScore: Int, val playtime: Int, val hostageRescued: Int, val hostageDefended: Int)
