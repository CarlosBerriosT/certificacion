package com.example.certificacion.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.certificacion.data.SignRepository
import com.example.certificacion.model.Sign
import kotlinx.coroutines.launch

class SignListViewModel(private val signRepository: SignRepository) : ViewModel() {

    private val _signs = MutableLiveData<List<Sign>>()
    val signs: LiveData<List<Sign>> = _signs

    init {
        viewModelScope.launch {
            val response = signRepository.getAllSigns()
            _signs.postValue(response)
        }
    }
}
