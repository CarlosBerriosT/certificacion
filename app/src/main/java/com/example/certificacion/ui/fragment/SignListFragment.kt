package com.example.certificacion.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.certificacion.R
import com.example.certificacion.databinding.FragmentSignListBinding
import com.example.certificacion.ui.viewmodel.SignViewModel
import com.example.certificacion.ui.adapter.SignAdapter

class SignListFragment : Fragment(R.layout.fragment_sign_list) {

    private lateinit var binding: FragmentSignListBinding
    private val signViewModel: SignViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignListBinding.inflate(inflater, container, false)

        val signAdapter = SignAdapter { sign ->
            // Crea un Bundle para pasar el 'id' del signo
            val bundle = Bundle().apply {
                putInt("signId", sign.id)  // Pasa el ID del signo
            }
            // Navega al SignDetailFragment con el Bundle
            findNavController().navigate(R.id.action_signListFragment_to_signDetailFragment, bundle)
        }

        // Aquí es donde se hace referencia al RecyclerView con el ID correcto
        binding.rvSigns.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = signAdapter
        }

        signViewModel.signs.observe(viewLifecycleOwner) { signs ->
            signs?.let {
                signAdapter.submitList(it)
            }
        }


        return binding.root
    }
}
