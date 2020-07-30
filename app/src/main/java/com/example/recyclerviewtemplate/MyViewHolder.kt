package com.example.recyclerviewtemplate

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
// uses the item.xml layout to inflate the row item
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item, parent, false)) {

    var mTextView: TextView = itemView.findViewById(R.id.itemTextView)
    fun bind(label: String) {
        mTextView?.text = label
    }
}