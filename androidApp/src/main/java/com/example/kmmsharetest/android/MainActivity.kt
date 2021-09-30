package com.example.kmmsharetest.android

import androidx.lifecycle.ViewModelProvider
import com.example.kmmsharetest.android.databinding.ActivityMainBinding
import com.example.kmmsharetest.viewmodel.SampleViewModel
import dev.icerock.moko.mvvm.MvvmActivity
import dev.icerock.moko.mvvm.createViewModelFactory

class MainActivity : MvvmActivity<ActivityMainBinding, SampleViewModel>() {
    override val layoutId: Int = R.layout.activity_main
    override val viewModelVariableId: Int = BR.viewmodel
    override val viewModelClass: Class<SampleViewModel> = SampleViewModel::class.java
    override fun viewModelFactory(): ViewModelProvider.Factory {
        return createViewModelFactory { SampleViewModel() }
    }
}
