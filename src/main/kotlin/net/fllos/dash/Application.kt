package net.fllos.dash

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import net.fllos.dash.plugins.configureHTTP
import net.fllos.dash.plugins.configureRouting
import net.fllos.dash.plugins.configureSerialization


fun main() {
    embeddedServer(Netty, port = 1200, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
//    configureHTTP()
//    configureSerialization()
    configureRouting()
}
