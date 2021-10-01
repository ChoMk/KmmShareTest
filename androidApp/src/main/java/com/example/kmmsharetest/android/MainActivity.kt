package com.example.kmmsharetest.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kmmsharetest.state.AppState
import com.example.kmmsharetest.state.ClickFilter
import com.example.kmmsharetest.state.ClickTestButton
import com.example.kmmsharetest.state.rootReducer
import kotlinx.android.synthetic.main.activity_main.*
import org.reduxkotlin.StoreSubscription
import org.reduxkotlin.createThreadSafeStore

val store = createThreadSafeStore(::rootReducer, AppState())

class MainActivity : AppCompatActivity() {
    private lateinit var storeSubscription: StoreSubscription
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        click_button.setOnClickListener {
            store.dispatch(ClickTestButton(ClickFilter.CLICKED))
        }
        storeSubscription = store.subscribe { render(store.state) }
        render(store.state)
    }

    private fun render(state: AppState) {
        event_result.text = state.resultText
    }
}
