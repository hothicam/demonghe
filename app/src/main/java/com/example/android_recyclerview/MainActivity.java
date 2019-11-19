package com.example.android_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView rvNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvNumber = findViewById(R.id.recycler_number);
        rvNumber.setLayoutManager(new LinearLayoutManager(this));
        Adapter adapter = new Adapter();
        rvNumber.setAdapter(adapter);
    }
}
