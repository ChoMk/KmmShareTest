package com.example.kmmsharetest.state

/**
 * @author MyeongKi
 */

fun clickStateFilterReducer(state: ClickFilter, action: Any) =
    when (action) {
        is ClickTestButton -> {
            action.clickedFilter
        }
        else -> {
            state
        }
    }