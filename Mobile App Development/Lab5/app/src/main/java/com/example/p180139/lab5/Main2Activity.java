package com.example.p180139.lab5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    String [] colours = {"White", "Blue", "Black", "Red", "Green"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayAdapter adapt = new ArrayAdapter(Main2Activity.this, android.R.layout.simple_list_item_1, colours);
        GridView grid = (GridView)findViewById(R.id.grid);
        grid.setNumColumns(2);
        grid.setColumnWidth(80);
        grid.setVerticalSpacing(20);
        grid.setHorizontalSpacing(20);
        grid.setAdapter(adapt);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), ""+colours[position], Toast.LENGTH_SHORT).show();
            }
        });

        Button jumpGL = (Button)findViewById(R.id.jumpGL);
        jumpGL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
