package com.mylab.myapplication

import androidx.lifecycle.ViewModel
import com.mylab.myapplication.data.NumberRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

@HiltViewModel
class MainViewModel @Inject constructor(
    private val numberRepository: NumberRepository,
) : ViewModel() {
    private val _number = MutableStateFlow(numberRepository.getNumber())
    val number = _number.asStateFlow()

    fun generateNumber() {
        _number.value = numberRepository.getNumber()
    }
}

