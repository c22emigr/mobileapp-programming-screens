package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   private Intent knopp;
   private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button);


        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent (MainActivity.this, MainActivity2.class));
                knopp = new Intent(MainActivity.this, MainActivity2.class);
                knopp.putExtra("name", "Emil"); // Optional
                knopp.putExtra("number", 99); // Optional
                startActivity(knopp);
            }
    });
    }
}
