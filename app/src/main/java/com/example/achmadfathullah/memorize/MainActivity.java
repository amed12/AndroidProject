package com.example.achmadfathullah.memorize;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
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
    String isi_pass, username;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        masuk = (Button) findViewById(R.id.btn_masuk);
        user = (EditText) findViewById(R.id.txt_username);
        //user.getText();
        password = (EditText) findViewById(R.id.txt_password);
        username = "amed12";
        isi_pass = "kamikase";

        //Inisisasi alertdialog
        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == masuk) {
                    if (password.getText().toString().equals(isi_pass) && user.getText().toString().equals(username)) {
                        final AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                        alert.setTitle("Confirm your Account");
                        alert.setMessage("Username anda  == " + user.getText().toString() + "\nPassword Anda == " + password.getText().toString() + "\nSelamat Anda Benar").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {

                                Intent i = new Intent(getApplicationContext(), Kumpulan_project_rimbunesia.class);
                                startActivity(i);

                            }
                        });
                        alert.create();
                        alert.show();
                    } else {
                        final AlertDialog.Builder pesan = new AlertDialog.Builder(MainActivity.this);
                        pesan.setMessage("Username anda  == " + user.getText().toString() + "\nPassword Anda == " + password.getText().toString() + "\nMohon Maaf silahkan login kembali").setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                user.setText("");
                                password.setText("");

                            }
                        });
                        pesan.create();
                        pesan.show();
                    }
                }


            }

        });


    }
}
