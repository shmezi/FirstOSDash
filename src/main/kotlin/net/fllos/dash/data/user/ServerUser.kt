package net.fllos.dash.data.user

import java.util.*

class ServerUser(uuid: UUID, name: Map<String, LanguageName>, number: String, oAuth:String) : ClientUser(uuid, name, number) {
}