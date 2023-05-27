package net.fllos.dash.data.organization

import net.fllos.dash.data.organization.event.Event
import java.util.UUID

/**
 * An organization that can host events
 */
class Organization(
    //UUID of organization
    val id: UUID,
    //Name of organization
    val name: String,
    //EventId: Event
    val events: MutableMap<String, Event>,
    //UserId: RoleId
    val leads: Map<String, String>,
    //RoleId: Role
    val roles: MutableMap<String, Role>
)