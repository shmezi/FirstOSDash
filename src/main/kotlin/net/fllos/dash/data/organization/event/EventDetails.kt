package net.fllos.dash.data.organization.event

import java.util.*

data class EventDetails(
    val type: EventType,
    val name: String,
    val date: Date,
    val location: String
)