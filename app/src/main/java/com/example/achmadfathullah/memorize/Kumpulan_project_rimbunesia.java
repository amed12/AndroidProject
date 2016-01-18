package com.example.achmadfathullah.memorize;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Kumpulan_project_rimbunesia extends AppCompatActivity {
    Button listview1, listview2, recycler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kumpulan_project_rimbunesia);
        listview1 = (Button) findViewById(R.id.listview1);
        listview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Belajar_list_view.class);
                startActivity(i);

            }

        });
        listview2 = (Button) findViewById(R.id.listview2);
        listview2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(getApplicationContext(), Belajar_list_view_2.class);
                startActivity(i);

            }

        });
        recycler = (Button) findViewById(R.id.recycler);
        recycler.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(getApplicationContext(), Belajar_list_view.class);
                startActivity(i);

            }

        });

    }
}
