package com.example.certificacion.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.certificacion.databinding.ListItemSignBinding
import com.example.certificacion.model.Sign

class SignAdapter(private val onClick: (Sign) -> Unit) : ListAdapter<Sign, SignAdapter.SignViewHolder>(SignDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SignViewHolder {
        val binding = ListItemSignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SignViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SignViewHolder, position: Int) {
        val sign = getItem(position)
        holder.bind(sign)
    }

    inner class SignViewHolder(private val binding: ListItemSignBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(sign: Sign) {
            binding.apply {
                tvSignName.text = sign.name
                tvSignElement.text = sign.element
                root.setOnClickListener { onClick(sign) }
            }
        }
    }
}
