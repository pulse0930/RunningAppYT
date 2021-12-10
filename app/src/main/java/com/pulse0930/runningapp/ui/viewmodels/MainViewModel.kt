package com.pulse0930.runningapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.pulse0930.runningapp.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val mainRepository: MainRepository
): ViewModel() {

}