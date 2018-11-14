package com.example.sejal.loginform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class FruitsActivity extends AppCompatActivity {

    GridView gridView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        gridView =(GridView) findViewById(R.id.gridView);
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Orange");
        list.add("Pineapple");
        list.add("Watermelon");
        list.add("Papaya");
        list.add("Litchi");
        list.add("Banana");
        list.add("Strawberry");
        list.add("Grapes");
        list.add("Raspberry");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}