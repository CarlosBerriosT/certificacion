package com.example.certificacion.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.certificacion.R
import com.example.certificacion.data.SignRepository
import com.example.certificacion.ui.adapter.SignAdapter
import com.example.certificacion.ui.view.SignViewModelFactory
import com.example.certificacion.ui.viewmodel.SignListViewModel
import androidx.navigation.fragment.findNavController


class SignListFragment : Fragment(R.layout.fragment_sign_list) {

    private lateinit var viewModel: SignListViewModel
    private lateinit var adapter: SignAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Configuración del ViewModel
        val signRepository = SignRepository(requireContext())
        val factory = SignViewModelFactory(signRepository)
        viewModel = ViewModelProvider(this, factory).get(SignListViewModel::class.java)

        // Configuración del RecyclerView
        val recyclerView = view.findViewById<RecyclerView>(R.id.rvSigns)
        recyclerView.layoutManager = LinearLayoutManager(context)
        adapter = SignAdapter { sign ->
            // Acción para navegar al detalle del signo
            findNavController().navigate(SignListFragment.actionSignListFragmentToSignDetail¿(sign.id))
        }
        recyclerView.adapter = adapter

        // Observando los datos de signos
        viewModel.getSigns().observe(viewLifecycleOwner, Observer { signs ->
            adapter.submitList(signs)
        })
    }
}
