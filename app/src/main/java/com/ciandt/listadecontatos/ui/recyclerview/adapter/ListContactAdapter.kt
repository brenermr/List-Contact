package com.ciandt.listadecontatos.ui.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ciandt.listadecontatos.data.model.ContactInfo
import com.ciandt.listadecontatos.databinding.ItemListBinding
import com.ciandt.listadecontatos.ui.recyclerview.viewholder.ListViewHolder

class ListContactAdapter(val contactInfo: List<ContactInfo>) : RecyclerView.Adapter<ListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        return ListViewHolder(
            ItemListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        )
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bindingView(contactInfo[position])
    }

    override fun getItemCount() = contactInfo.count()

}