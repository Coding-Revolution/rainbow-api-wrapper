package it.necross.interfaces

import it.necross.enums.ServerPlatforms
import it.necross.enums.ServerStatus

data class ServerStatusInterface(val appId: String, val name: String, val spaceId: String, val mdm: String, val category: String = "instance",
val platform: ServerPlatforms, val status: ServerStatus, val maintenance: Boolean?, val impactedFeatures: Array<String>) {

}