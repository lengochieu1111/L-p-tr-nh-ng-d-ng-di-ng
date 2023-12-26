package com.example.ltudddapplication.Tuan2.ListView.Java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.ltudddapplication.R;

public class MainActivity_ListView extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list_view);

        lv = findViewById(R.id.lv);

        String[] arr = new String[] {"Tuan 1", "Tuan 2", "Tuan 3", "Tuan 4", "Tuan 5", "Tuan 6"};

        ArrayAdapter<String>adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);
        lv.setAdapter(adapter);
    }
}