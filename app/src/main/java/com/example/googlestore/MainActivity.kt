package com.example.googlestore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recycler = findViewById<RecyclerView>(R.id.mainRecyclerView)
        val list = ArrayList<MainData>()
        repeat(8){
            val itemlist = ArrayList<HorizontalData>()
            repeat(4){
                itemlist.add(HorizontalData(R.drawable.insta, "insta", "4.5 Star"))
                itemlist.add(HorizontalData(R.drawable.face, "face", "5 Star"))
            }
            list.add(MainData(itemlist))
        }
        recycler.adapter = MainAdapter(list)
        recycler.layoutManager = LinearLayoutManager(this)
    }

}