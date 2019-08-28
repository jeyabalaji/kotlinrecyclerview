package com.jeyabalaji.kotlin_recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DataAdapter(val userList: ArrayList<Model>) : RecyclerView.Adapter<DataAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup?.context).inflate(R.layout.adapter_item_layout, viewGroup, false)
        return ViewHolder(v);
    }
    override fun getItemCount(): Int {
        return userList.size
    }
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        viewHolder.name?.text = userList[position].name
        viewHolder.count?.text = userList[position].count.toString()
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.title)
        val count = itemView.findViewById<TextView>(R.id.count)

    }
}