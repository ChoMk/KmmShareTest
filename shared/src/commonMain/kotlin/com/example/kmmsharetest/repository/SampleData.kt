package com.example.kmmsharetest.repository

import kotlinx.serialization.Serializable

/**
 * @author MyeongKi
 */
@Serializable
data class SampleData(
    val id: Int,
    val name: String
)