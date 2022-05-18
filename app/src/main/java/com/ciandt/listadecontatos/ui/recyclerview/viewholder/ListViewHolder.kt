package com.ciandt.listadecontatos.ui.recyclerview.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.ciandt.listadecontatos.data.model.ContactInfo
import com.ciandt.listadecontatos.databinding.ItemListBinding

class ListViewHolder(binding: ItemListBinding):RecyclerView.ViewHolder(binding.root) {

    private var name = binding.nameContact
    private var contact = binding.phoneContact

    fun bindingView(contactInfo: ContactInfo){
        name.text = contactInfo.name
        contact.text = contactInfo.phone
    }

}