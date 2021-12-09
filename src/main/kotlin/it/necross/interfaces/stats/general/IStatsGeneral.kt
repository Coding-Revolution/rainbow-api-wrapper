package it.necross.interfaces.stats.general

data class IStatsGeneral(val bulletsFired: Int, val bulletsConnected: Int, val kills: Int, val deaths: Int, val kd: Double, val assists: Int,
                         val headshots: Int, val meleeKills: Int, val blindKills: Int, val penetrationKills: Int, val dbno: Int, val dbnoAssists: Int,
                         val revives: Int, val wins: Int, val losses: Int, val winRate: String, val matches: Int, val playtime: Int, val gadgetsDestroyed: Int,
                         val rappelBreaches: Int, val barricadesDeployed: Int, val reinforcementsDeployed: Int, val suicides: Int, val distanceTravelled: Int, val xp: Int)
