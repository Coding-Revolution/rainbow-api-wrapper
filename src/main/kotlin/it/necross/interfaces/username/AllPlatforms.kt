package it.necross.interfaces.username

import com.google.gson.annotations.SerializedName

enum class AllPlatforms(val identifier: String) {
    @SerializedName("uplay")
    UPLAY("uplay"),
    @SerializedName("psn")
    PSN("psn"),
    @SerializedName("xbl")
    XBOX_LIFE("xbl"),
    @SerializedName("steam")
    STEAM("steam"),
    @SerializedName("epic")
    EPIC("epic"),
    @SerializedName("amazon")
    AMAZON("amazon"),
}