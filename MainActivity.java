package com.example.recyclercards;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ExampleItem> exampleList;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateFakeData();

        recyclerViewConfig();
    }

    public void generateFakeData() {

        exampleList = new ArrayList<>();

        exampleList.add(new ExampleItem(R.drawable.node, "Clicked at Studio"));
        exampleList.add(new ExampleItem(R.drawable.oner, "Clicked at Italy"));
        exampleList.add(new ExampleItem(R.drawable.twor, "Clicked at Rome"));
        exampleList.add(new ExampleItem(R.drawable.threer, "Clicked at Valencia"));
        exampleList.add(new ExampleItem(R.drawable.fourr, "Clicked at Paris"));
        exampleList.add(new ExampleItem(R.drawable.fiver, "Clicked at Edinburgh"));
        exampleList.add(new ExampleItem(R.drawable.sixr, "Clicked at Wales"));
    }

    public void recyclerViewConfig() {

        //Config for RV
        recyclerView = findViewById(R.id.recyclerView);
        //performance
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        adapter = new ExampleAdapter(exampleList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
