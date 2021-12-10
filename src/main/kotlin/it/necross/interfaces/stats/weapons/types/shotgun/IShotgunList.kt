package it.necross.interfaces.stats.weapons.types.shotgun

import com.google.gson.annotations.SerializedName
import it.necross.interfaces.stats.weapons.types.IGeneralWeaponInfo

data class IShotgunList(
    val m590a1: IGeneralWeaponInfo,
    val m1014: IGeneralWeaponInfo,
    @SerializedName("sg-cqb")
    val sgCqb: IGeneralWeaponInfo,
    @SerializedName("sasg-12")
    val sasg12: IGeneralWeaponInfo,
    val m870: IGeneralWeaponInfo,
    val super_90: IGeneralWeaponInfo,
    @SerializedName("spas-12")
    val spas12: IGeneralWeaponInfo,
    @SerializedName("spas-15")
    val spas15: IGeneralWeaponInfo,
    val supernova: IGeneralWeaponInfo,
    val ita121: IGeneralWeaponInfo,
    val ita12s: IGeneralWeaponInfo,
    val six12: IGeneralWeaponInfo,
    val six12_sd: IGeneralWeaponInfo,
    @SerializedName("fo-12")
    val fo12: IGeneralWeaponInfo,
    @SerializedName("bosg.12.2")
    val bosg12_2: IGeneralWeaponInfo,
    val acs12: IGeneralWeaponInfo,
    val tcsg12: IGeneralWeaponInfo,
    val super_shorty: IGeneralWeaponInfo,
)
