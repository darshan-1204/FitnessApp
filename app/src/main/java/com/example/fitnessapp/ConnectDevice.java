package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ConnectDevice extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect_device);

        btn = findViewById(R.id.btn_connect);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(ConnectDevice.this,"Connect Successfully",Toast.LENGTH_SHORT);
                Intent intent = new Intent(ConnectDevice.this,ThirdPage.class);
                finish();
                startActivity(intent);
            }
        });
    }
}