package com.example.certificacion.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.certificacion.R

class SignDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar el diseño del fragmento
        return inflater.inflate(R.layout.fragment_sign_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Accede al argumento directamente usando el Bundle
        val signName = arguments?.getString("signName")

        // Usa el argumento en tu lógica
        signName?.let {
            // Muestra el nombre del signo en un TextView
            view.findViewById<TextView>(R.id.signNameTextView).text = it
        }
    }
}
