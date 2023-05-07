package com.todoApp

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.todoApp.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}
@Suppress("unused")
@kotlin.jvm.JvmOverloads
fun Application.module() {
   // configureSecurity()
    standardRouting()
}
