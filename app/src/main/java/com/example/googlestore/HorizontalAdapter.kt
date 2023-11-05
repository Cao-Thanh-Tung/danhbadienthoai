package com.example.googlestore

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HorizontalAdapter(private val data: ArrayList<HorizontalData>) :
    RecyclerView.Adapter<HorizontalAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val logo = itemView.findViewById<ImageView>(R.id.appIcon)
        val name = itemView.findViewById<TextView>(R.id.appName)
        val description = itemView.findViewById<TextView>(R.id.appDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent,false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.logo.setImageResource(data[position].logo)
        holder.name.text = data[position].name
        holder.description.text = data[position].des
    }

    override fun getItemCount(): Int {
        return data.size
    }
}

data class HorizontalData(val logo: Int,val name: String, val des: String)
