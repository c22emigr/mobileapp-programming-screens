package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Intent knappen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button);

        btn.setOnClickListener();
        Intent knappen = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("name", "Daniel"); // Optional
        intent.putExtra("number", 1); // Optional
        startActivity(knappen);
    }

}
