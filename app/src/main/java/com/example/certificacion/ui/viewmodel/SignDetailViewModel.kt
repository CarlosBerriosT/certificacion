package com.example.certificacion.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.certificacion.data.SignRepository
import com.example.certificacion.model.Sign
import com.example.certificacion.model.SignDetail
import kotlinx.coroutines.launch

class SignDetailViewModel : ViewModel() {
    // Supongamos que esperas un SignDetail en lugar de un Sign
    private val _signDetail = MutableLiveData<SignDetail>()
    val signDetail: LiveData<SignDetail> = _signDetail

    fun setSignDetail(sign: Sign) {
        val signDetail = SignDetail(sign.name, sign.symbol) // Mapea el objeto Sign a SignDetail
        _signDetail.value = signDetail
    }
}
