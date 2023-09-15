package com.example.logbook2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class page3 extends AppCompatActivity {
    Button back_button3, next_button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page3);

        back_button3 = findViewById(R.id.back3);
        back_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page3.this, MainActivity.class);
                startActivity(intent);
            }
        });

        next_button3 = findViewById(R.id.next3);
        next_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page3.this, page1.class);
                startActivity(intent);
            }
        });
    }
}