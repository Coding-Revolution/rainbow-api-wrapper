package it.necross.interfaces.rank

import com.google.gson.annotations.SerializedName
import java.util.*

data class IRank(val id: UUID, val seasons: List<ISeason>)
