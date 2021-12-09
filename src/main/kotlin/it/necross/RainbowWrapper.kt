package it.necross

import com.google.gson.Gson
import it.necross.connection.ConnectionBuilder
import it.necross.service.*
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class RainbowWrapper(private val apiKey: String) {

    private final var logger : Logger = LoggerFactory.getLogger(RainbowWrapper::class.java)

    private var connectionBuilder =  ConnectionBuilder(apiKey)

    var serverStatusService = ServerStatusService(connectionBuilder)

    var ubisoftIdService = UserIdService(connectionBuilder)

    var levelService = LevelService(connectionBuilder)

    var playtimeService = PlaytimeService(connectionBuilder)

    var rankService = RankService(connectionBuilder)

        init {
        logger.info("Initializing connection builder")
    }

    companion object {
        val gson = Gson()
    }
}