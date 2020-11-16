package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;





public class MainActivity extends AppCompatActivity //implements View.OnClickListener
{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button login= findViewById(R.id.log_in);
        Button signup= findViewById(R.id.signup);
        login.setOnClickListener(new View.OnClickListener(){



            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this , Login.class);
                startActivity(intent);
            }
        });


    }







}