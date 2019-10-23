package com.example.cardview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerAdapter recyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Clubs> clubList = new ArrayList<>();
        clubList.add(new Clubs(R.drawable.corinthians, "The Best of the World !", "Corinthians"));
        clubList.add(new Clubs(R.drawable.bahia, "Bahiano club !", "Bahia"));
        clubList.add(new Clubs(R.drawable.portuguesa, "Playing the serie D", "Portuguesa"));

        recyclerView = findViewById(R.id.recycler);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerAdapter = new RecyclerAdapter(clubList);

        recyclerView.setAdapter(recyclerAdapter);
    }
}
