package it.necross.interfaces.stats.weapons.types.marksman

import com.google.gson.annotations.SerializedName
import it.necross.interfaces.stats.weapons.types.IGeneralWeaponInfo

data class IMarksmanList(
    @SerializedName("417")
    val `417`: IGeneralWeaponInfo,
    @SerializedName("ots-03")
    val ots03: IGeneralWeaponInfo,
    val camrs: IGeneralWeaponInfo,
    @SerializedName("sr-25")
    val sr25: IGeneralWeaponInfo,
    val mk_14_ebr: IGeneralWeaponInfo,
    val csrx_300: IGeneralWeaponInfo
)
