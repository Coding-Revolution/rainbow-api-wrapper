package it.necross.interfaces.rank

data class IBoards(val id: String, val boardInfo: IBoardInfo, val current: ICurrent, val max: IBoardMax, val lastMatch: IBoardLastMatch, val pastSeasons: IBoardPastSeasons,
                   val previousMmr: Int, val nextMmr: Int,
                   val topRankPosition: Int, val kills: Int, val deaths: Int, val kd: Double, val wins: Int, val losses: Int, val winRate: String, val matches: Int, val abandons: Int, val updateTime: String)
