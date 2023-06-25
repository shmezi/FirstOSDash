package net.fllos.dash.data.user

import kotlinx.serialization.Serializable

/**
 * Represents a [User]'s names in a certain language.
 * @param first First name
 * @param last Last name
 */
@Serializable
data class Name(val first: String, val last: String)