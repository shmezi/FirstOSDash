package net.fllos.dash.data.user

import kotlinx.serialization.Serializable
import me.alexirving.lib.database.core.Cacheable
import net.fllos.dash.utils.UUIDSerializer
import java.util.*

/**
 * Represents a user
 * @param name The name/s of the user (Language code | Name)
 * @param phone The phone number of the user (including country / area code).
 * @param oAuth The oath string used for authentication
 */
@Serializable
class User(
    override val identifier: UUID,
    val name: Map<String, Name>,
    val phone: String,
    private val oAuth: String,
) : Cacheable<UUID>