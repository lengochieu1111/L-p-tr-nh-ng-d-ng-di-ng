package com.example.ltudddapplication.Tuan2.TinhTong.Kotlin

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.ltudddapplication.R
import com.example.ltudddapplication.Tuan2.TinhTong.TinhTong.MainActivity_Tuan2_Intent

class MainActivity_Tuan2_TinhTong_Kotlin : AppCompatActivity() {

    var edt1: EditText? = null
    var edt2:EditText? = null
    var btn0: Button? = null
    var btn1:android.widget.Button? = null
    var btn2:android.widget.Button? = null
    var btn3:android.widget.Button? = null
    var btn4:android.widget.Button? = null
    var btn5:android.widget.Button? = null
    var btn6:android.widget.Button? = null
    var btn7:android.widget.Button? = null
    var btn8:android.widget.Button? = null
    var btn9:android.widget.Button? = null
    var btnDot:android.widget.Button? = null
    var btnResult:android.widget.Button? = null
    var btnAC:android.widget.Button? = null
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_tuan2_tinh_tong_kotlin)

        edt1 = findViewById<EditText>(R.id.edt_One)
        edt2 = findViewById<EditText>(R.id.edt_Two)

        btn1 = findViewById(R.id.btn_One)
        btn2 = findViewById(R.id.btn_Two)
        btn3 = findViewById(R.id.btn_Three)
        btn4 = findViewById(R.id.btn_Four)
        btn5 = findViewById(R.id.btn_Five)
        btn6 = findViewById(R.id.btn_Six)
        btn7 = findViewById(R.id.btn_Seven)
        btn8 = findViewById(R.id.btn_Eight)
        btn9 = findViewById(R.id.btn_Nine)
        btn0 = findViewById(R.id.btn_Zero)
        btnDot = findViewById(R.id.btn_Dot)
        btnResult = findViewById(R.id.btn_Result)
        btnAC = findViewById(R.id.btn_AC)

        edt1!!.setShowSoftInputOnFocus(false)
        edt2!!.setShowSoftInputOnFocus(false)
        // edt1!!.imeOptions = EditorInfo.IME_ACTION_DONE
        // edt2!!.imeOptions = EditorInfo.IME_ACTION_DONE

    }

    fun OnClick_Seven(view: View) {
        HandleOnClick_Number(view, btn7!!, "7")
    }

    fun OnClick_Eight(view: View) {
        HandleOnClick_Number(view, btn8!!, "8")
    }

    fun OnClick_Nine(view: View) {
        HandleOnClick_Number(view, btn9!!, "9")
    }

    fun OnClick_Four(view: View) {
        HandleOnClick_Number(view, btn4!!, "4")
    }

    fun OnClick_Five(view: View) {
        HandleOnClick_Number(view, btn5!!, "5")
    }

    fun OnClick_Six(view: View) {
        HandleOnClick_Number(view, btn6!!, "6")
    }

    fun OnClick_One(view: View) {
        HandleOnClick_Number(view, btn1!!, "1")
    }

    fun OnClick_Two(view: View) {
        HandleOnClick_Number(view, btn2!!, "2")
    }

    fun OnClick_Three(view: View) {
        HandleOnClick_Number(view, btn3!!, "3")
    }

    fun OnClick_Zero(view: View) {
        HandleOnClick_Number(view, btn0!!, "0")
    }

    fun OnClick_Dot(view: View) {
        HandleOnClick_Number(view, btnDot!!, ".")
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    fun OnClick_Result(view: View) {
        btnResult!!.background = resources.getDrawable(R.drawable.button_click_color)
        view.postDelayed({ btnResult!!.background = resources.getDrawable(R.drawable.button_result) }, 120) // Đợi 1 giây trước khi quay lại màu cũ
        Calculator()
    }

    private fun HandleOnClick_Number(view: View, button: Button, number: String) {
        HandleOnClick_ChangeColor(view, button)
        if (edt1!!.isFocused) {
            val newText = edt1!!.text.toString() + number
            edt1!!.setText(newText)
            edt1!!.setSelection(edt1!!.text.length)
        } else if (edt2!!.isFocused) {
            val newText = edt2!!.text.toString() + number
            edt2!!.setText(newText)
            edt2!!.setSelection(edt2!!.text.length)
        }
    }

    private fun HandleOnClick_ChangeColor(view: View, button: Button) {
        button.background = resources.getDrawable(R.drawable.button_click_color)
        view.postDelayed({ button.background = resources.getDrawable(R.drawable.button_shape) }, 120) // Đợi 1 giây trước khi quay lại màu cũ
    }

    private fun Calculator() {
        val text1 = edt1!!.text.toString()
        if (text1 == "") return
        val number1 = text1.toFloat()
        val text2 = edt2!!.text.toString()
        if (text2 == "") return
        val number2 = text2.toFloat()
        val result = number1 + number2

        // Log.e("result", String.valueOf(result));
//        String newText = String.valueOf(result);
//        edt1.setText(newText);
//        edt2.setText("");
        val calculatorIntent = Intent(this@MainActivity_Tuan2_TinhTong_Kotlin, MainActivity_Tuan2_Intent_TinhTong_Kotlin::class.java)
        calculatorIntent.putExtra("number1", number1)
        calculatorIntent.putExtra("number2", number2)
        startActivity(calculatorIntent)
    }

    fun OnClick_AC(view: View) {
        btnAC!!.background = resources.getDrawable(R.drawable.button_click_color)
        view.postDelayed({ btnAC!!.background = resources.getDrawable(R.drawable.button_result) }, 120)
        edt1!!.setText("")
        edt2!!.setText("")
    }

}