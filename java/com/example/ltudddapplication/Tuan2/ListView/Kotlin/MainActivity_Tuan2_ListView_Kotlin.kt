package com.example.ltudddapplication.Tuan2.ListView.Kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.ltudddapplication.R

class MainActivity_Tuan2_ListView_Kotlin : AppCompatActivity() {
    var lv_kt:ListView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_tuan2_list_view_kotlin)

        lv_kt  = findViewById(R.id.lv_kt)
        val arr = arrayOf("Thu 1", "Thu 2", "Thu 3", "Thu 4", "Thu 5", "Thu 6")
        val ad = ArrayAdapter(this,
                android.R.layout.simple_list_item_1, arr)
        lv_kt!!.adapter=ad
    }


}