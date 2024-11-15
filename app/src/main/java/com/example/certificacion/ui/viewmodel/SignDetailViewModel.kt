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
    private val _signDetail = MutableLiveData<SignDetail>()
    val signDetail: LiveData<SignDetail> = _signDetail

    fun setSignDetail(sign: Sign) {
        // Supón que tienes información adicional en tu clase SignDetail
        val signDetail = SignDetail(
            id = sign.id,
            name = sign.name,
            dates = sign.dates,
            element = sign.element,
            planetRegent = sign.planetRegent,
            symbol = sign.symbol,
            color = sign.color,
            strengths = listOf(), // Aquí puedes pasar información adicional si la tienes
            weaknesses = listOf(),
            description = "", // Lo mismo aquí
            compatibility = listOf(),
            image = sign.logo // Suponiendo que el logo es una URL de imagen
        )
        _signDetail.value = signDetail
    }
}
