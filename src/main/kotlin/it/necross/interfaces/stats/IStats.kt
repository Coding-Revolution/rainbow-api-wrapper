package it.necross.interfaces.stats

import it.necross.interfaces.stats.pve.IPvE
import it.necross.interfaces.stats.pvp.IPvP

data class IStats(val id: String, val pvp: IPvP, val pve: IPvE)