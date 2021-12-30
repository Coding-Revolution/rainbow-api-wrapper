package it.necross

import it.necross.enums.GamePlatform

fun main(args: Array<String>) {
    val wrapper = RainbowWrapper("wfe")

    val userName = "Cerberus.PRCLK"
    var userId = "";

    wrapper.serverStatusService.getStatus().forEach {
        println(it.platform.identifier)
    }

    wrapper.ubisoftIdService.getUserID(GamePlatform.UPLAY, "Cerberus.PRCLK").apply {
        println(this.id)
        userId = this.id
    }

    wrapper.levelService.getLevelByUsername(GamePlatform.UPLAY, "Cerberus.PRCLK").apply {
        println(this.level)
        println(this.lootboxProbability.percent)
    }

    wrapper.playtimeService.getPlaytimeByUserId(GamePlatform.UPLAY, userId).apply {
        println(this.pvp.general)
    }

    wrapper.userNameService.getUserName(GamePlatform.UPLAY, userId).apply {
        println(this.idOnPlatform)
        println(this.platform.identifier)
        println(this.avatar.high)
    }

    wrapper.statsService.getStatsById(GamePlatform.UPLAY, userId).apply {
        println("Kills with ash: ${this.pvp.operators.ash.kills}")
    }


    wrapper.rankService.getRanksByUserName(GamePlatform.UPLAY, "vMX.").apply {
        println(this.seasons.season24.regions.emea.boards.pvp_ranked.current.name)
    }
}