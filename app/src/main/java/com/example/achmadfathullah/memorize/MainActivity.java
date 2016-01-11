package com.example.achmadfathullah.memorize;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  {
    //Widget Button Declare
    Button masuk;
    //AlertDialog alert;
    EditText password;
    EditText user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    masuk = (Button) findViewById(R.id.btn_masuk);
    user = (EditText) findViewById(R.id.txt_username);
    //user.getText();
    password = (EditText) findViewById(R.id.txt_password);


    //Inisisasi alertdialog
        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                alert.setTitle("Alert");
                alert.setMessage("Username anda  == " + user.getText().toString() + "\nPassword Anda == " + password.getText().toString());

                alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // code...
                    }
                });
                alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // code...
                    }
                });
                alert.create();
                alert.show();
            }
        });



    }

}



