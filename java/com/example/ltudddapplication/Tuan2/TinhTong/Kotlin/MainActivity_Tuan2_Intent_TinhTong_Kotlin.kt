package com.example.ltudddapplication.Tuan2.TinhTong.Kotlin

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.ltudddapplication.R

class MainActivity_Tuan2_Intent_TinhTong_Kotlin : AppCompatActivity() {
    var edt: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_tuan2_intent_tinh_tong_kotlin)

        edt = findViewById<EditText>(R.id.edt)

        val resultIntent = intent
        val number1 = resultIntent.extras!!.getFloat("number1")
        val number2 = resultIntent.extras!!.getFloat("number2")
        val result = number1 + number2
        edt!!.setText(result.toString())
    }
}