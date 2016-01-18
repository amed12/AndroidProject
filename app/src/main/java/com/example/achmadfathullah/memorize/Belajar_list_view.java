package com.example.achmadfathullah.memorize;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Belajar_list_view extends ListActivity {
    Button next;
    String[] kotaDiJatim = {"Malang", "Surabaya", "Kepanjen", "Batu", "Pasuruan", "Jember", "Dampit", "Mojokerto", "Jombang"};
    private boolean isColorArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_belajar_list_view);
        next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Belajar_list_view_2.class);
                startActivity(i);
            }
        });
        isColorArray = false;

        ArrayAdapter myArrayAdapter;

        if (isColorArray){
            myArrayAdapter = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,getResources().getStringArray(R.array.DatakuArray));
        }else {
            myArrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,kotaDiJatim);
        }
        setListAdapter(myArrayAdapter);
    }
    @Override
    protected void onListItemClick(ListView a, View v, int position, long id){
        super.onListItemClick(a, v, position, id);
        if(isColorArray){
            String[] colorArray = getResources().getStringArray(R.array.DatakuArray);
            String selectedColor = colorArray[position];
            Toast.makeText(this, "Anda memilih:" + selectedColor, Toast.LENGTH_SHORT).show();

        }else{
            String selectedCountry = kotaDiJatim[position];
            Toast.makeText(this, "Anda memilih:" + selectedCountry, Toast.LENGTH_SHORT).show();

        }
    }
}
