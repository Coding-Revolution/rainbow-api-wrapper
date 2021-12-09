package it.necross.enums

import com.google.gson.annotations.JsonAdapter
import com.google.gson.annotations.SerializedName

enum class ServerPlatforms(val identifier: String) {
    PC("PC"),
    PS4("PS4"),
    @SerializedName("XBOXONE")
    XBOXONE("XBOXONE"),
    PS5("PS5"),
    @SerializedName("XBOX SERIES X")
    XBOXSERIESX("XBOX SERIES X")
}