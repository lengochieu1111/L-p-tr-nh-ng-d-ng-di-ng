package com.example.ltudddapplication.Tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.ltudddapplication.R;

import java.util.ArrayList;

public class MainActivity_Tuan3_ListView extends AppCompatActivity {

    ListView lv;
    Tuan3Adapter adapter;
    ArrayList<Tuan3_Contact> ls = new ArrayList<Tuan3_Contact>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tuan3_list_view);

        lv = findViewById(R.id.tuan3_lv);

        ls.add(new Tuan3_Contact("Nguyễn Văn Toàn", "17", R.drawable.face_smiling));
        ls.add(new Tuan3_Contact("Trương Mai Anh", "19", R.drawable.head_female));
        ls.add(new Tuan3_Contact("Triệu Hoán", "20", R.drawable.head_sunglasses));

        adapter = new Tuan3Adapter(ls, this);
        lv.setAdapter(adapter);

    }
}