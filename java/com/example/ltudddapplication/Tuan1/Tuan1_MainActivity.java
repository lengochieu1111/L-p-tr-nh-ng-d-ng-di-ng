package com.example.ltudddapplication.Tuan1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

import com.example.ltudddapplication.R;

public class Tuan1_MainActivity extends AppCompatActivity {
    EditText edt1, edt2;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDot, btnResult, btnAC;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan1_main);

        edt1 = findViewById(R.id.edt_One);
        edt2 = findViewById(R.id.edt_Two);

        btn1 = findViewById(R.id.btn_One);
        btn2 = findViewById(R.id.btn_Two);
        btn3 = findViewById(R.id.btn_Three);
        btn4 = findViewById(R.id.btn_Four);
        btn5 = findViewById(R.id.btn_Five);
        btn6 = findViewById(R.id.btn_Six);
        btn7 = findViewById(R.id.btn_Seven);
        btn8 = findViewById(R.id.btn_Eight);
        btn9 = findViewById(R.id.btn_Nine);
        btn0 = findViewById(R.id.btn_Zero);
        btnDot = findViewById(R.id.btn_Dot);
        btnResult = findViewById(R.id.btn_Result);
        btnAC = findViewById(R.id.btn_AC);

        edt1.setShowSoftInputOnFocus(false);
        edt2.setShowSoftInputOnFocus(false);
    }

    public void OnClick_Seven(View view) {
        HandleOnClick_Number(view, btn7,"7");
    }

    public void OnClick_Eight(View view) {
        HandleOnClick_Number(view,btn8, "8");
    }

    public void OnClick_Nine(View view) {
        HandleOnClick_Number(view, btn9, "9");
    }

    public void OnClick_Four(View view) {
        HandleOnClick_Number(view, btn4, "4");
    }

    public void OnClick_Five(View view) {
        HandleOnClick_Number(view, btn5, "5");
    }

    public void OnClick_Six(View view) {
        HandleOnClick_Number(view, btn6, "6");
    }

    public void OnClick_One(View view) {
        HandleOnClick_Number(view, btn1, "1");
    }

    public void OnClick_Two(View view) {
        HandleOnClick_Number(view, btn2, "2");
    }

    public void OnClick_Three(View view) {
        HandleOnClick_Number(view, btn3, "3");
    }

    public void OnClick_Zero(View view) {
        HandleOnClick_Number(view, btn0, "0");
    }

    public void OnClick_Dot(View view) {
        HandleOnClick_Number(view, btnDot ,".");
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    public void OnClick_Result(View view) {
        btnResult.setBackground(getResources().getDrawable(R.drawable.button_click_color));

        view.postDelayed(new Runnable() {
            @Override
            public void run() {
                btnResult.setBackground(getResources().getDrawable(R.drawable.button_result));
            }
        }, 120); // Đợi 1 giây trước khi quay lại màu cũ

        Calculator();

    }

    private void HandleOnClick_Number(View view, Button button, String number)
    {
        HandleOnClick_ChangeColor(view, button);

        if (edt1.isFocused())
        {
            String newText = edt1.getText() + number;
            edt1.setText(newText);
            edt1.setSelection(edt1.getText().length());
        }
        else if (edt2.isFocused())
        {
            String newText = edt2.getText() + number;
            edt2.setText(newText);
            edt2.setSelection(edt2.getText().length());
        }
    }

    private void HandleOnClick_ChangeColor(View view, Button button)
    {
        button.setBackground(getResources().getDrawable(R.drawable.button_click_color));

        view.postDelayed(new Runnable() {
            @Override
            public void run() {
                button.setBackground(getResources().getDrawable(R.drawable.button_shape));
            }
        }, 120); // Đợi 1 giây trước khi quay lại màu cũ
    }

    private void Calculator()
    {
        String text1 = edt1.getText().toString();
        if (text1.equals("")) return;
        float number1 = Float.parseFloat(text1);

        String text2 = edt2.getText().toString();
        if (text2.equals("")) return;
        float number2 = Float.parseFloat(text2);
        float result = number1 + number2;

        // Log.e("result", String.valueOf(result));
        String newText = String.valueOf(result);
        edt1.setText(newText);
        edt2.setText("");
    }

    public void OnClick_AC(View view) {

        btnAC.setBackground(getResources().getDrawable(R.drawable.button_click_color));

        view.postDelayed(new Runnable() {
             @Override
             public void run() {
                 btnAC.setBackground(getResources().getDrawable(R.drawable.button_result));
             }
         },120);

        edt1.setText("");
        edt2.setText("");
    }
}