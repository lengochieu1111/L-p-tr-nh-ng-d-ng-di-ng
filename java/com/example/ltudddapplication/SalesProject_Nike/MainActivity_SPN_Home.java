package com.example.ltudddapplication.SalesProject_Nike;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.ltudddapplication.R;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;
// import com.squareup.picasso.Picasso;

public class MainActivity_SPN_Home extends AppCompatActivity {
    ImageView img_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_spn_home);

        img_test = findViewById(R.id.img_test);

        String url = "https://images.pexels.com/photos/5413302/pexels-photo-5413302.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load";

        Glide.with(this).load(url).into(img_test);

    }

}