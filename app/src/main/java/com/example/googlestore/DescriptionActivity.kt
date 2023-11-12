package com.example.googlestore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DescriptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)
        try{
            val name = intent.getStringExtra("name")
            val phone = intent.getStringExtra("phone")
            val email = intent.getStringExtra("email")
            findViewById<TextView>(R.id.tv_avatar).text = name?.get(0).toString()
            findViewById<TextView>(R.id.tv_name).text = name
            findViewById<TextView>(R.id.tv_phone).text = phone
            findViewById<TextView>(R.id.tv_email).text = email
        }catch (e: Exception){
        }
    }
}