package com.example.ltudddapplication.Tuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ltudddapplication.R;

public class Tuan4_MainActivity extends AppCompatActivity {
    Button btn_loadData;
    TextView tvw_result;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan4_main);

        Tuan4_Volley volley = new Tuan4_Volley();
        btn_loadData = findViewById(R.id.button);
        tvw_result = findViewById(R.id.textView);

        btn_loadData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volley.getJsonArrayOfObject(context, tvw_result);
            }
        });

    }
}