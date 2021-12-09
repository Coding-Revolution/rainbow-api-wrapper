package it.necross.interfaces.stats.pve

import it.necross.interfaces.stats.general.IStatsGeneral
import it.necross.interfaces.stats.pve.modes.IModes
import it.necross.interfaces.stats.pve.queues.Queues
import it.necross.interfaces.stats.weapons.IWeapons

data class IPvE(val general: IStatsGeneral, val queues: Queues, val weapons: IWeapons, val modes: IModes)
