package com.example.kmmsharetest.repository

import com.example.kmmsharetest.network.SampleDataResponse
import kotlinx.coroutines.flow.Flow

/**
 * @author MyeongKi
 */
interface SampleRepository {
    fun getSampleDataList(): Flow<SampleDataResponse>
}