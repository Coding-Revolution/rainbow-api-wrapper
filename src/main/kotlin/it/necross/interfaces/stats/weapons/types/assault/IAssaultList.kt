package it.necross.interfaces.stats.weapons.types.assault

import com.google.gson.annotations.SerializedName
import it.necross.interfaces.stats.weapons.IWeaponGeneral
import it.necross.interfaces.stats.weapons.types.IGeneralWeaponInfo

data class IAssaultList(
    val l85a2: IGeneralWeaponInfo,
    val ar33: IGeneralWeaponInfo,
    val g36c: IGeneralWeaponInfo,
    @SerializedName("r4-c")
    val r4c: IGeneralWeaponInfo,
    @SerializedName("556xi")
    val weapon_556xi: IGeneralWeaponInfo,
    val f2: IGeneralWeaponInfo,
    @SerializedName("ak-12")
    val ak12: IGeneralWeaponInfo,
    val aug_a2: IGeneralWeaponInfo,
    @SerializedName("552_commando")
    val weapon_552_commando: IGeneralWeaponInfo,
    @SerializedName("416-c_carbine")
    val weapon_416_c_carbine: IGeneralWeaponInfo,
    @SerializedName("c8-sfw")
    val weapon_c8_sfw: IGeneralWeaponInfo,
    val mk17_cqb: IGeneralWeaponInfo,
    @SerializedName("para-308")
    val para_308: IGeneralWeaponInfo,
    @SerializedName("type-89")
    val type_89: IGeneralWeaponInfo,
    val c7e: IGeneralWeaponInfo,
    val m762: IGeneralWeaponInfo,
    val v308: IGeneralWeaponInfo,
    @SerializedName("spear_.308")
    val spear_308: IGeneralWeaponInfo,
    @SerializedName("ar-15.50")
    val ar_15_50: IGeneralWeaponInfo,
    val m4: IGeneralWeaponInfo,
    @SerializedName("ak-74m")
    val ak_74m: IGeneralWeaponInfo,
    val arx200: IGeneralWeaponInfo,
    val f90: IGeneralWeaponInfo,
    val commando_9: IGeneralWeaponInfo,
    val sc3000k: IGeneralWeaponInfo)