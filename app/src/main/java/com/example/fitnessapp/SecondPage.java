package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class SecondPage extends AppCompatActivity {

    ImageView img;
    Button button;
    EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        button = findViewById(R.id.button2);
        name = findViewById(R.id.name);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Name = name.getText().toString();
                Intent intent = new Intent(SecondPage.this,ThirdPage.class);
                intent.putExtra("Name",Name);
                startActivity(intent);
            }
        });
    }
}