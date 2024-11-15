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
import com.example.certificacion.data.SignRepository
import com.example.certificacion.databinding.FragmentSignListBinding
import com.example.certificacion.ui.viewmodel.SignViewModel
import com.example.certificacion.ui.adapter.SignAdapter
import com.example.certificacion.ui.view.SignListViewModelFactory
import com.example.certificacion.ui.viewmodel.SignListViewModel

class SignListFragment : Fragment(R.layout.fragment_sign_list) {

    private lateinit var binding: FragmentSignListBinding
    private val signRepository: SignRepository by lazy {
        SignRepository(requireContext())
    }
    private val signViewModel: SignListViewModel by viewModels {
        SignListViewModelFactory(signRepository)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignListBinding.inflate(inflater, container, false)

        val signAdapter = SignAdapter { sign ->
            val bundle = Bundle().apply {
                putInt("signId", sign.id)
            }
            findNavController().navigate(R.id.action_signListFragment_to_signDetailFragment, bundle)
        }

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
