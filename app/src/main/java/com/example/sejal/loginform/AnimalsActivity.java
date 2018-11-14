package com.example.sejal.loginform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class AnimalsActivity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);

        gridView =(GridView) findViewById(R.id.gridView);
        ArrayList<String> list = new ArrayList<>();
        list.add("Tiger");
        list.add("Lion");
        list.add("Dog");
        list.add("Cat");
        list.add("Horse");
        list.add("Zebra");
        list.add("Elephant");
        list.add("Monkey");
        list.add("Leopard");
        list.add("Gorilla");
        list.add("Rabbit");
        list.add("Camel");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}

