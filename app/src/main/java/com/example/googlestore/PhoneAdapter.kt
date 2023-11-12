package com.example.googlestore

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

data class Data(val id: Int ,val name: String, val phone: String, val email: String)
class PhoneAdapter(val items: ArrayList<Data>) : BaseAdapter() {
    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(p0: Int): Any {
        return items[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var row: View
        var viewHolder: Holder
        if (p1 == null){
            row = LayoutInflater.from(p2?.context).inflate(R.layout.item_layout, p2,false)
            viewHolder = Holder(row.findViewById<TextView>(R.id.avatar), row.findViewById<TextView>(R.id.name))
            row.tag = viewHolder
        }else{
            row = p1
            viewHolder = p1.tag as Holder
        }
        viewHolder.avatar.text = items[p0].name.subSequence(0,1)
        viewHolder.name.text = items[p0].name
        row.setOnClickListener({
            val intent = Intent(p2?.context,DescriptionActivity::class.java)
            intent.putExtra("name", items[p0].name)
            intent.putExtra("phone", items[p0].phone)
            intent.putExtra("email", items[p0].email)
            p2!!.context.startActivity(intent)
        })
        return row
    }
    data class Holder(val avatar: TextView, val name: TextView)
}