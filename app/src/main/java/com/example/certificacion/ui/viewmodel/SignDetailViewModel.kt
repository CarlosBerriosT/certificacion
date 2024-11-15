package com.example.certificacion.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.certificacion.data.SignRepository
import com.example.certificacion.model.SignDetail
import kotlinx.coroutines.launch

class SignDetailViewModel(private val signRepository: SignRepository) : ViewModel() {

    private val _signDetail = MutableLiveData<SignDetail>()
    val signDetail: LiveData<SignDetail> = _signDetail

    fun getSignDetail(id: Int) {
        viewModelScope.launch {
            val response = signRepository.getSignById(id)
            _signDetail.postValue(response)
        }
    }
}
