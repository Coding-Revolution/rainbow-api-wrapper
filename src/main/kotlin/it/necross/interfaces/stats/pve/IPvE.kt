package it.necross.interfaces.stats.pve

import it.necross.interfaces.stats.IStatsGeneral
import it.necross.interfaces.stats.operators.IOperator
import it.necross.interfaces.stats.pve.modes.IModes
import it.necross.interfaces.stats.pve.queues.Queues
import it.necross.interfaces.stats.weapons.IWeapons

data class IPvE(val general: IStatsGeneral, val operators: IOperator, val queues: Queues, val weapons: IWeapons, val modes: IModes)
