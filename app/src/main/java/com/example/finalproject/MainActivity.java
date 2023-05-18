package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] chocolate = {"cake", "macaron","mousse"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.chocolates, chocolate));
    }
    protected void onListItemClick(ListView listView, View view, int position, long id)
    {
        switch(position)
        {
            case 0:
                startActivity(new Intent(MainActivity.this, cake.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, macaron.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, mousse.class));
                break;
        }
    }
}