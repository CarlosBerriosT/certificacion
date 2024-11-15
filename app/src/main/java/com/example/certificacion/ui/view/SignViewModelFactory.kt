package com.example.certificacion.ui.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.certificacion.data.SignRepository
import com.example.certificacion.ui.viewmodel.SignListViewModel
import com.example.certificacion.ui.viewmodel.SignViewModel

class SignListViewModelFactory(
    private val signRepository: SignRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SignListViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return SignListViewModel(signRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}


