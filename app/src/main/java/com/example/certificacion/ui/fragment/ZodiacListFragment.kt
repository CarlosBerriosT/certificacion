package com.example.certificacion.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.certificacion.R

class ZodiacListFragment : Fragment() {

    private fun navigateToSignDetail(signName: String) {
        // Crear un Bundle con el argumento
        val bundle = Bundle().apply {
            putString("signName", signName) // Añade el argumento que deseas pasar
        }

        // Navegar al SignDetailFragment con el Bundle
        findNavController().navigate(R.id.signDetailFragment, bundle)
    }
}
