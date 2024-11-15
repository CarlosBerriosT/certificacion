package com.example.certificacion.ui.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.certificacion.ui.viewmodel.SignViewModel

class SignViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SignViewModel::class.java)) {
            return SignViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
