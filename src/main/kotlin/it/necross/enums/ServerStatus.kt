package it.necross.enums

enum class ServerStatus(val identifier: String) {
    ONLINE("Online"),
    INTERRUPTED("Interrupted"),
    DEGRADED("Degraded"),
    MAINTENANCE("Maintenance"),
}