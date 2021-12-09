package it.necross.interfaces.stats.weapons.types.lmg

import com.google.gson.annotations.SerializedName
import it.necross.interfaces.stats.weapons.types.IGeneralWeaponInfo

data class ILmgList(
    @SerializedName("6p41")
    val _6p41: IGeneralWeaponInfo,
    val g8a1: IGeneralWeaponInfo,
    val m249: IGeneralWeaponInfo,
    @SerializedName("t-95_lsw")
    val t95_lsw: IGeneralWeaponInfo,
    @SerializedName("lmg-e")
    val lmg_e: IGeneralWeaponInfo,
    @SerializedName("alda_5.56")
    val alda_556: IGeneralWeaponInfo,
    val m249_saw: IGeneralWeaponInfo,
    val dp27: IGeneralWeaponInfo
)
