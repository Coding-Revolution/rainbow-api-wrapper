package it.necross.interfaces.stats.weapons

import it.necross.interfaces.stats.weapons.types.assault.IAssault
import it.necross.interfaces.stats.weapons.types.launcher.ILauncher
import it.necross.interfaces.stats.weapons.types.lmg.ILmg
import it.necross.interfaces.stats.weapons.types.marksman.IMarksman
import it.necross.interfaces.stats.weapons.types.mp.IMp
import it.necross.interfaces.stats.weapons.types.pistol.IPistol
import it.necross.interfaces.stats.weapons.types.shield.IShield
import it.necross.interfaces.stats.weapons.types.shotgun.IShotgun
import it.necross.interfaces.stats.weapons.types.smg.ISmg
import it.necross.interfaces.stats.weapons.types.utility.IUtility

data class IWeapons(
    val assault: IAssault,
    val smg: ISmg,
    val lmg: ILmg,
    val marksman: IMarksman,
    val pistol: IPistol,
    val shotgun: IShotgun,
    val mp: IMp,
    val shield: IShield,
    val launcher: ILauncher,
    val utility: IUtility
)
