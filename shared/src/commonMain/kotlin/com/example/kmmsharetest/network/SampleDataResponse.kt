package com.example.kmmsharetest.network

import com.example.kmmsharetest.repository.SampleData
import kotlinx.serialization.SerialName

/**
 * @author MyeongKi
 */
data class SampleDataResponse(
    @SerialName("ok")
    val ok: Int,
    @SerialName("sampleDataList")
    val sampleDataList: List<SampleData>
)