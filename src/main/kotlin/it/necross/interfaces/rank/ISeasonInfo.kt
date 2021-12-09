package it.necross.interfaces.rank

data class ISeasonInfo(val seasonId: Int, val seasonName: String, val seasonColor: String, val seasonImage: String, val seasonReleaseDate: String, val regions: List<IRegions>)
