package com.example.googlestore

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.widget.*
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val array = ArrayList<Data>()
        array.add(Data(1, "Nguyen Thanh Trung", "0394857283", "nguyentt@gmai.com"))
        array.add(Data(2, "Nguyen Thanh Tien", "0394857283", "nguyentt@gmai.com"))
        array.add(Data(3, "Nguyen Thanh Nam", "0394857283", "nguyentt@gmai.com"))
        array.add(Data(4, "Nguyen Thanh Bang", "0394857283", "nguyentt@gmai.com"))
        array.add(Data(5, "Nguyen Thanh Hien", "0394857283", "nguyentt@gmai.com"))
        array.add(Data(6, "Nguyen Thanh Nghia", "0394857283", "nguyentt@gmai.com"))
        array.add(Data(7, "Nguyen Thanh Hiep", "0394857283", "nguyentt@gmai.com"))
        array.add(Data(8, "Nguyen Thanh Kien", "0394857283", "nguyentt@gmai.com"))
        array.add(Data(9, "Nguyen Thanh Hoa", "0394857283", "nguyentt@gmai.com"))
        array.add(Data(10, "Nguyen Thanh Phong", "0394857283", "nguyentt@gmai.com"))
        val adapter = PhoneAdapter(array)
        findViewById<ListView>(R.id.lv).adapter = adapter
        val listview = findViewById<ListView>(R.id.lv)
        listview.setOnCreateContextMenuListener { menu, v, menuInfo ->
            val info = menuInfo as AdapterView.AdapterContextMenuInfo
            val position = info.position

            menu.setHeaderTitle("Context Menu")
            menu.add(Menu.NONE, 0, 0, "Action 1")
            menu.add(Menu.NONE, 1, 1, "Action 2")

        }


    }
}