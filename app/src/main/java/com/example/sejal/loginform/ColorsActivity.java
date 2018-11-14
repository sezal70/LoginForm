package com.example.sejal.loginform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    GridView gridView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        gridView =(GridView) findViewById(R.id.gridView);
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Blue");
        colorList.add("Red");
        colorList.add("Yellow");
        colorList.add("Blue");
        colorList.add("Blue");
        colorList.add("Blue");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,colorList);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}



