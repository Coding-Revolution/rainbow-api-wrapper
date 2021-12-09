package it.necross.interfaces.stats.weapons

data class IWeaponGeneral(val name: String, val kills: Int, val deaths: Int, val kd: Double,
val headshots: Int, val bulletsFired: Int, val bulletsConnected: Int, val timesChosen: Int)
