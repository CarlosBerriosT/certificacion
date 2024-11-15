package com.example.certificacion.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.certificacion.R
import com.example.certificacion.databinding.FragmentSignDetailBinding
import com.example.certificacion.model.Sign
import com.example.certificacion.ui.viewmodel.SignDetailViewModel

class SignDetailFragment : Fragment(R.layout.fragment_sign_detail) {

    private lateinit var binding: FragmentSignDetailBinding
    private var signId: Int = 0
    private val signDetailViewModel: SignDetailViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignDetailBinding.inflate(inflater, container, false)

        // Recupera el id del signo pasado a través del Bundle
        arguments?.let {
            signId = it.getInt("signId")
        }

        // Aquí deberías buscar el signo con el id obtenido
        val sign = getSignById(signId) // Simulación de obtención de signo

        // Muestra la información del signo
        binding.tvSignName.text = sign.name
        binding.tvSignDescription.text = sign.dates

        return binding.root
    }

    private fun getSignById(id: Int): Sign {
        // Este es un ejemplo simulado; debes obtener el signo desde tu base de datos o ViewModel
        return Sign(id, "Aries", "March 21 - April 19", "Fire", "Mars", "Ram", "Red", "aries_logo_url")
    }
}
