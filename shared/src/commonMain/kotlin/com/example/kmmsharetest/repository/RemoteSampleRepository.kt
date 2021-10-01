package com.example.kmmsharetest.repository

import com.example.kmmsharetest.network.SampleApi
import com.example.kmmsharetest.network.SampleDataResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

/**
 * @author MyeongKi
 */
class RemoteSampleRepository : SampleRepository {
    override fun getSampleDataList(): Flow<SampleDataResponse> {
        return flow {
            val result = SampleApi.getSampleList()
            emit(result)
        }
    }
}