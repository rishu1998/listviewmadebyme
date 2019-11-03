package com.example.listviewmadebyme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lst=findViewById(R.id.listview);
        ArrayList<String> arrayList=new ArrayList();
        arrayList.add("jan");
        arrayList.add("feb");
        arrayList.add("jan1");
        arrayList.add("feb1");
        arrayList.add("jan3");
        arrayList.add("febhello");
        arrayList.add("jan");
        arrayList.add("feb");
        arrayList.add("jan1");
        arrayList.add("feb1");
        arrayList.add("jan3");
        arrayList.add("febhello");
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        lst.setAdapter(arrayAdapter);

    }
}
