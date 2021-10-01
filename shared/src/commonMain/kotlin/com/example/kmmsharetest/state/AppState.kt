package com.example.kmmsharetest.state

/**
 * @author MyeongKi
 */
data class AppState(
    val clicked: ClickFilter = ClickFilter.NONE
) {
    val resultText: String
        get() = getSampleText(clicked)

    private fun getSampleText(clicked: ClickFilter): String {
        return when (clicked) {
            ClickFilter.NONE -> "none click"
            ClickFilter.CLICKED -> "clicked"
        }
    }
}

enum class ClickFilter {
    NONE,
    CLICKED;
}