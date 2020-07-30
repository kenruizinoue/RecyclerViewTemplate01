package com.example.recyclerviewtemplate

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val data: List<String>) : RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return MyViewHolder(inflater, parent)
    }

    // uses our custom ViewHolder (MyViewHolder)
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val label = data[position]
        holder.bind(label)
    }

    override fun getItemCount(): Int = data.size

}