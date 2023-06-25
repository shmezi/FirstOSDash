package net.fllos.dash.data.organization.event

import net.fllos.dash.data.organization.Role
import net.fllos.dash.data.user.User
import java.util.*


class Event(
    val id: UUID,
    val name: String,
    val type: Program,
    //UserID: RoleID
    val volunteers: MutableMap<User, Role>
)