package it.necross.interfaces.rank

data class ISeason(
    val seasonId: Int,
    val seasonName: String,
    val seasonColor: String,
    val seasonImage: String,
    val seasonReleaseDate: String,
    val regions: IRegions
)
