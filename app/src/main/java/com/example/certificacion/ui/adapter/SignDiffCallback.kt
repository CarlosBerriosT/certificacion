package com.example.certificacion.ui.adapter


import androidx.recyclerview.widget.DiffUtil
import com.example.certificacion.model.Sign

class SignDiffCallback : DiffUtil.ItemCallback<Sign>() {

    override fun areItemsTheSame(oldItem: Sign, newItem: Sign): Boolean {
        // Compara si los items son el mismo (por ejemplo, si tienen el mismo ID)
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Sign, newItem: Sign): Boolean {
        // Compara si los contenidos son iguales
        return oldItem == newItem
    }
}
