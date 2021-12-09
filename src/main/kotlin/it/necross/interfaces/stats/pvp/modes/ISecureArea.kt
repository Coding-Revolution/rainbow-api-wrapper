package it.necross.interfaces.stats.pvp.modes

data class ISecureArea(val name: String, val wins: Int, val losses: Int, val winRate: String, val matches: Int,
val bestScore: Int, val playtime: Int, val secured: Int, val defended: Int, val contested: Int)
