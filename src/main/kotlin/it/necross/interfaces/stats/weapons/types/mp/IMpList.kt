package it.necross.interfaces.stats.weapons.types.mp

import com.google.gson.annotations.SerializedName
import it.necross.interfaces.stats.weapons.types.IGeneralWeaponInfo

data class IMpList(
    @SerializedName("smg-11")
    val smg11: IGeneralWeaponInfo,
    val bearing_9: IGeneralWeaponInfo,
    val c75_auto: IGeneralWeaponInfo,
    @SerializedName("smg-12")
    val smg12: IGeneralWeaponInfo,
    val spsmg9: IGeneralWeaponInfo
)
