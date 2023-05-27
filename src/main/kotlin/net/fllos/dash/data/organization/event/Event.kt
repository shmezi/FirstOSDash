package net.fllos.dash.data.event

import java.util.*

class Event(
    val id: UUID,
    val name: String,
    val type: EventType,
    //UserID: RoleID
    val volunteers: MutableMap<String, String>
)