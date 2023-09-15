package com.example.logbook2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class page1 extends AppCompatActivity {
    Button back_button1, next_button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page1);

        back_button1 = findViewById(R.id.back1);
        back_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page1.this, page3.class);
                startActivity(intent);
            }
        });

        next_button1 = findViewById(R.id.next1);
        next_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page1.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}