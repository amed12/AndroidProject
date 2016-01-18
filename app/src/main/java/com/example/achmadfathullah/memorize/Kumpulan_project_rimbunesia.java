package com.example.achmadfathullah.memorize;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Kumpulan_project_rimbunesia extends AppCompatActivity {
    Button tutorial1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kumpulan_project_rimbunesia);
        tutorial1 = (Button) findViewById(R.id.tutorial1);
        tutorial1.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View v){
                Intent i = new Intent(getApplicationContext(), Belajar_list_view.class);
                startActivity(i);
            }

        });
    }
}
