package com.example.ltudddapplication.Tuan4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.ltudddapplication.R

class Tuan4_Kotlin_MainActivity : AppCompatActivity() {

    var btn:Button? = null
    var tvw:TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan4_kotlin_main)

        tvw = findViewById(R.id.tvw)
        btn = findViewById(R.id.btn)

        val fn = Tuan4_Volley_Kottlin()
        btn!!.setOnClickListener()
        {
            fn.getJSONArrayObjectts(this, tvw!!)
        }
    }
}