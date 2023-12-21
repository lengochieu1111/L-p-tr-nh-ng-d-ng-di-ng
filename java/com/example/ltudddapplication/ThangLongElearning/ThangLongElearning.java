package com.example.ltudddapplication.ThangLongElearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.ltudddapplication.R;

public class ThangLongElearning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thang_long_elearning);
    }

    public void OnClick_Forgotten(View view) {
        Toast.makeText(this, "Hết cứu!", Toast.LENGTH_SHORT).show();
    }

    public void OnClick_Google(View view) {
        Toast.makeText(this, "Liên kết google không khả dụng!", Toast.LENGTH_SHORT).show();
    }

    public void OnClick_Microsoft(View view) {
        Toast.makeText(this, "Liên kết microsoft không khả dụng!", Toast.LENGTH_SHORT).show();
    }


}