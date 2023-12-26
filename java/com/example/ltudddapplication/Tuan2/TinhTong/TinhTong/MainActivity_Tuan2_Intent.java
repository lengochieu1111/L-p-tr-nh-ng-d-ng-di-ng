package com.example.ltudddapplication.Tuan2.TinhTong.TinhTong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.example.ltudddapplication.R;

public class MainActivity_Tuan2_Intent extends AppCompatActivity {

    EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tuan2_intent);

        edt = findViewById(R.id.edt);

        Intent resultIntent = getIntent();
        float number1 = resultIntent.getExtras().getFloat("number1");
        float number2 = resultIntent.getExtras().getFloat("number2");
        float result = number1 + number2;
        edt.setText(String.valueOf(result));

    }



}