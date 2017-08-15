package com.example.tushar.simplerecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Main Activity to show recyclerview implementation
 */
public class RecyclerViewActivity extends AppCompatActivity {
    RecyclerView simpleRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        ArrayList<String> recyclerviewItems = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            recyclerviewItems.add("Item number " + i);
        }

        RecyclerViewArrayAdapter recyclerViewArrayAdapter = new RecyclerViewArrayAdapter(R.layout.recyclerview_item, recyclerviewItems);
        simpleRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        simpleRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        simpleRecyclerView.setAdapter(recyclerViewArrayAdapter);
    }

}