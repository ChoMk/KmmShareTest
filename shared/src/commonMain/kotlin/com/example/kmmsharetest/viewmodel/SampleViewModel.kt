package com.example.kmmsharetest.viewmodel

import com.badoo.reaktive.base.invoke
import com.badoo.reaktive.disposable.CompositeDisposable
import com.badoo.reaktive.observable.subscribe
import com.badoo.reaktive.subject.Relay
import com.badoo.reaktive.subject.publish.PublishSubject
import com.example.kmmsharetest.event.ActionEvent
import dev.icerock.moko.mvvm.livedata.LiveData
import dev.icerock.moko.mvvm.livedata.MutableLiveData
import dev.icerock.moko.mvvm.livedata.setValue
import dev.icerock.moko.mvvm.viewmodel.ViewModel

/**
 * @author MyeongKi
 */
class SampleViewModel : ViewModel() {
    private val itemEventRelay: Relay<SampleEvent> = PublishSubject()
    private val disposable = CompositeDisposable()
    private val _sampleText: MutableLiveData<String> = MutableLiveData("test")
    val sampleText: LiveData<String> = _sampleText

    init {
        disposable.add(
            itemEventRelay.subscribe {
                _sampleText.value = "click"
            }
        )
    }

    override fun onCleared() {
        disposable.dispose()
        super.onCleared()
    }

    fun onClick() {
        itemEventRelay.invoke(SampleEvent.CLICK)
    }

    enum class SampleEvent : ActionEvent {
        CLICK;
    }
}