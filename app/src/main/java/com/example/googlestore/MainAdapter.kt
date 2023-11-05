package com.example.googlestore

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(private val data: ArrayList<MainData>) :
    RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val horizontalRecyclerView: RecyclerView = itemView.findViewById(R.id.horizontalRecyclerView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.horizontal_layout, parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val horizontalAdapter = HorizontalAdapter(data[position].data)
        holder.horizontalRecyclerView.adapter = horizontalAdapter
        holder.horizontalRecyclerView.layoutManager = LinearLayoutManager(
            holder.horizontalRecyclerView.context,
            LinearLayoutManager.HORIZONTAL,
            false
        )
    }

    override fun getItemCount(): Int {
        return data.size
    }
}

data class MainData(val data: ArrayList<HorizontalData>)
