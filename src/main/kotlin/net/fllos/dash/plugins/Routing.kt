package net.fllos.dash.plugins

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.http.*
import io.ktor.server.application.*
import net.fllos.dash.data.user.ServerUser
import java.util.*

fun Application.configureRouting() {
    routing {

        get {

            call.respond(ServerUser(UUID.randomUUID(), mapOf(),"20",""))
        }
    }
//    install(StatusPages) {
//        exception<Throwable> { call, cause ->
//            call.respondText(text = "500: $cause", status = HttpStatusCode.InternalServerError)
//        }
//    }
}
