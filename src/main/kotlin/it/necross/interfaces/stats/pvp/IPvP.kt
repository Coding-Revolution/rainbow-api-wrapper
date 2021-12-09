package it.necross.interfaces.stats.pvp

import it.necross.interfaces.stats.general.IStatsGeneral
import it.necross.interfaces.stats.pvp.modes.IModes
import it.necross.interfaces.stats.pvp.queues.Queues
import it.necross.interfaces.stats.weapons.IWeapons

data class IPvP(val general: IStatsGeneral, val operators: IOperators, val weapons: IWeapons, val queues: Queues, val modes: IModes)