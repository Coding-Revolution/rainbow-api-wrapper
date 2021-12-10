package it.necross.interfaces.stats.weapons.types.pistol

import com.google.gson.annotations.SerializedName
import it.necross.interfaces.stats.weapons.types.IGeneralWeaponInfo

data class IPistolList(
    val p226_mk_25: IGeneralWeaponInfo,
    val m45_meusoc: IGeneralWeaponInfo,
    @SerializedName("5.7_usg")
    val _5_7_usg: IGeneralWeaponInfo,
    val p9: IGeneralWeaponInfo,
    val lfp586: IGeneralWeaponInfo,
    @SerializedName("gsh-18")
    val gsh_18: IGeneralWeaponInfo,
    val pmm: IGeneralWeaponInfo,
    val p12: IGeneralWeaponInfo,
    val mk1_9mm: IGeneralWeaponInfo,
    @SerializedName("d-50")
    val d_50: IGeneralWeaponInfo,
    val prb92: IGeneralWeaponInfo,
    val p229: IGeneralWeaponInfo,
    val usp40: IGeneralWeaponInfo,
    @SerializedName("q-929")
    val q_929: IGeneralWeaponInfo,
    val rg15: IGeneralWeaponInfo,
    val bailiff_410: IGeneralWeaponInfo,
    @SerializedName("keratos_.357")
    val keratos_357: IGeneralWeaponInfo,
    @SerializedName("1911_tacops")
    val weapon_1911_tacops: IGeneralWeaponInfo,
    @SerializedName("p-10c")
    val p_10c: IGeneralWeaponInfo,
    @SerializedName(".44_mag_semi-auto")
    val _44_mag_semi_auto: IGeneralWeaponInfo,
    val sdp_9mm: IGeneralWeaponInfo
)
