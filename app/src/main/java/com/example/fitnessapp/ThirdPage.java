package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ThirdPage extends AppCompatActivity {

    TextView yourName;
    ImageView setting;

    LinearLayout today_workout,quads,connect,pushup,sideplank,situps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);

        yourName = findViewById(R.id.yourName);
        connect = findViewById(R.id.connect);
        setting = findViewById(R.id.setting);
        quads = findViewById(R.id.quads);
        pushup = findViewById(R.id.pushup);
        sideplank = findViewById(R.id.sideplank);
        situps = findViewById(R.id.situps);
        today_workout = findViewById(R.id.today_workout);

        String Name = getIntent().getStringExtra("Name");
        yourName.setText(Name);

        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ThirdPage.this,ConnectDevice.class);
                startActivity(intent);
            }
        });

        today_workout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ThirdPage.this,TodayWorkout.class);
                startActivity(intent);
            }
        });

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ThirdPage.this,ProfilePage.class);
                startActivity(intent);
            }
        });

        quads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ThirdPage.this,Quads.class);
                startActivity(intent);
            }
        });

        pushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ThirdPage.this,PushupRouting.class);
                startActivity(intent);
            }
        });

        sideplank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ThirdPage.this,SidePlanks.class);
                startActivity(intent);
            }
        });

        situps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ThirdPage.this,Situps.class);
                startActivity(intent);
            }
        });
    }
}