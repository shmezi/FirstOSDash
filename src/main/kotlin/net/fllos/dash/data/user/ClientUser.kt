package net.fllos.dash.data.user

import java.util.*

open class ClientUser(
    val uuid: UUID,
    val name: Map<String, LanguageName>,
    val number: String
)