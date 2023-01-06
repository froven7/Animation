package com.example.mw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
ArrayList<Items> itemsArrayList;
Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).hide();

        recyclerView=findViewById(R.id.recyclerarview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        itemsArrayList=new ArrayList<>();


addData();

    }
    private void addData(){

        for (int i=0 ; i<1000; i++){
            itemsArrayList.add(new Items(""+i,"Name"+i,"Email"+i+"@gmail.com"));
        }

        adapter=new Adapter(MainActivity.this,itemsArrayList);
        recyclerView.setAdapter(adapter);




    }
}