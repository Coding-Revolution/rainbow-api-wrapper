package it.necross.interfaces.username

data class IUsername(val id: String, val userId: String, val idOnPlatform: String, val platform: AllPlatforms, val username: String, val avatar: IAvatar)
