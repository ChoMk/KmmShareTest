package com.example.kmmsharetest.network

import io.ktor.client.request.*

/**
 * @author MyeongKi
 */
object SampleApi {
    suspend fun getSampleList(): SampleDataResponse {
        return ApiClient.httpClient.get("http://localhost:3000/api/sample1")
    }
}