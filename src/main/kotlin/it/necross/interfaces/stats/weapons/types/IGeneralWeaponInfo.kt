package it.necross.interfaces.stats.weapons.types

data class IGeneralWeaponInfo(val name: String, val icon: String, val kills: Int, val deaths: Int, val kd: Double,
val headshots: Int, val bulletsFired: Int, val bulletsConnected: Int, val timesChosen: Int)
