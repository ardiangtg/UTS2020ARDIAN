package com.example.uts_amub_ti7a_1711500018_ardian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button register, login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        register = findViewById(R.id.bnext);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent(com.example.uts_amub_ti7a_1711500018_ardian.MainActivity.this, com.example.uts_amub_ti7a_1711500018_ardian.RegisterOneActivity.class);
                startActivity(register);
            }
        });

        login = findViewById(R.id.bregister);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masuk = new Intent(com.example.uts_amub_ti7a_1711500018_ardian.MainActivity.this, com.example.uts_amub_ti7a_1711500018_ardian.RegisterOneActivity.class);
                startActivity(masuk);
            }
        });
    }
}