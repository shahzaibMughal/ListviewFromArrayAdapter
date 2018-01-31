package com.example.shahzaib.listviewfromarrayadapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends Activity {

    ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = (ListView) findViewById(R.id.myListView);
        String[] arr = {"Apple", "Boll", "Cat", "Dog", "Elephant", "Footbal"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr);
        // second parameter define how the data should appear

        myListView.setAdapter(adapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView itemClicked = (TextView) view;
                Toast.makeText(MainActivity.this, i+" index: "+ itemClicked.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}