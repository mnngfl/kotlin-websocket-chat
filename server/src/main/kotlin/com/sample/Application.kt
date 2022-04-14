package com.sample

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.sample.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSockets()
    }.start(wait = true)
}
