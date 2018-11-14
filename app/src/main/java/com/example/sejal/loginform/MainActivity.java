package com.example.sejal.loginform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getData());


        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this, position+"", Toast.LENGTH_SHORT).show();

                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, item, Toast.LENGTH_SHORT).show();

                switch (position) {
                    case 0:
                        startActivity(new Intent(MainActivity.this, FruitsActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, ColorsActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this,AnimalsActivity.class));

                }
            }
        });

    }

    public ArrayList<String> getData() {
        ArrayList<String> itemList = new ArrayList<>();
        itemList.add("Fruits");
        itemList.add("Colors");
        itemList.add("Animals");


        return itemList;
    }
}
