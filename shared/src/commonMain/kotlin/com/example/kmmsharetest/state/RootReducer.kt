package com.example.kmmsharetest.state

/**
 * @author MyeongKi
 */
fun rootReducer(state: AppState, action: Any) = AppState(
    clicked = clickStateFilterReducer(state.clicked, action)
)