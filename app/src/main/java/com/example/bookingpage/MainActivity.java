package com.example.bookingpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    RecyclerView seat_List;
    List<String> titles;
    List<Integer> images;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seat_List = findViewById(R.id.seat_List);

        titles = new ArrayList<>();
        images = new ArrayList<>();


        titles.add("seat 1");
        titles.add("seat 2");
        titles.add("seat 3");
        titles.add("seat 4");
        titles.add("seat 5");
        titles.add("seat 6");
        titles.add("seat 7");
        titles.add("seat 8");
        titles.add("seat 9");
        titles.add("seat 10");
        titles.add("seat 11");


        images.add(R.drawable.seat);
        images.add(R.drawable.seat);
        images.add(R.drawable.seat);
        images.add(R.drawable.seat);
        images.add(R.drawable.seat);
        images.add(R.drawable.seat);
        images.add(R.drawable.seat);
        images.add(R.drawable.seat);
        images.add(R.drawable.seat);
        images.add(R.drawable.seat);
        images.add(R.drawable.seat);

       adapter = (Adapter) new SeatAdapter(this,titles,images);


        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3,
                GridLayoutManager.VERTICAL, false);
        seat_List.setLayoutManager(gridLayoutManager);
        seat_List.setAdapter((RecyclerView.Adapter) adapter);
    }



}


