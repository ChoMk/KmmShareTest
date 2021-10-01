package com.example.kmmsharetest.network

import kotlinx.serialization.json.Json
import io.ktor.client.*
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.*

/**
 * @author MyeongKi
 */
object ApiClient {
    val httpClient = HttpClient {
        install(JsonFeature) {
            val json = Json { ignoreUnknownKeys = true }
            serializer = KotlinxSerializer(json)
        }
    }
}