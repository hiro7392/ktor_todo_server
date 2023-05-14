package com.todoApp.plugins

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*

fun Application.standardRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        get("/hello/{name}"){
            val name=call.parameters["name"]
            call.respondText("Hello $name")
        }

    }
}


