package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HIstory extends AppCompatActivity {

    Button btn_badges;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        btn_badges = findViewById(R.id.btn_badges);

        btn_badges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HIstory.this,ProfilePage.class);
                finish();
                startActivity(intent);
            }
        });
    }
}