package it.necross.interfaces.stats.weapons.types.smg

import com.google.gson.annotations.SerializedName
import it.necross.interfaces.stats.weapons.types.IGeneralWeaponInfo

data class ISmgList(
    @SerializedName("fmg-9")
    val fmg9: IGeneralWeaponInfo,
    val mp5k: IGeneralWeaponInfo,
    val ump45: IGeneralWeaponInfo,
    val mp5: IGeneralWeaponInfo,
    val p90: IGeneralWeaponInfo,
    @SerializedName("9x19vsn")
    val weapon_9x19vsn: IGeneralWeaponInfo,
    val mp7: IGeneralWeaponInfo,
    @SerializedName("9mm_c1")
    val weapon_9mm_c1: IGeneralWeaponInfo,
    val mpx: IGeneralWeaponInfo,
    val m12: IGeneralWeaponInfo,
    val mp5sd: IGeneralWeaponInfo,
    val pdw9: IGeneralWeaponInfo,
    @SerializedName("vector_.45_acp")
    val weapon_vector_45_acp: IGeneralWeaponInfo,
    @SerializedName("t-5_smg")
    val t5_smg: IGeneralWeaponInfo,
    val scorpion_evo_3_a1: IGeneralWeaponInfo,
    val k1a: IGeneralWeaponInfo,
    val mx4_storm: IGeneralWeaponInfo,
    val aug_a3: IGeneralWeaponInfo,
    val p10_roni: IGeneralWeaponInfo
)
