package com.tinder.request

import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.request.get
import io.ktor.client.request.header
import io.ktor.client.request.url
import kotlinx.coroutines.runBlocking

fun main() {
    CircleCiRequest().get()
}

class CircleCiRequest {

    fun get() {
        runBlocking {
            val client = HttpClient(CIO) {
                install(JsonFeature) {
                    serializer = KotlinxSerializer()
                }

            }
            val message = client.get<String> {
                url("https://circleci.com/api/v2/project/")
                header("Circle-Token", "")
                header("Accept", "application/json")
            }
            println(message)

        }
    }
}

data class HelloWorld(val hello: String)