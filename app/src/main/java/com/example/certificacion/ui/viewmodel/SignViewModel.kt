package com.example.certificacion.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.certificacion.model.Sign

class SignViewModel : ViewModel() {

    // MutableLiveData para actualizar la lista de signos
    private val _signs = MutableLiveData<List<Sign>>()
    val signs: LiveData<List<Sign>> = _signs

    // Aquí puedes agregar la lógica para cargar datos, por ejemplo, desde un repositorio
    init {
        _signs.value = listOf() // Asigna tus datos aquí
    }
}
