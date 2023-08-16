package com.example.engineeringvillageproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ScienceClubActivity extends AppCompatActivity {

    LinearLayout howWe, theOtherThing;
    Button btBack, btBackToClubs, btNext;
    Intent i;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_club);

        howWe = findViewById(R.id.howWe);
        theOtherThing = findViewById(R.id.theOtherThing);
        btBack = findViewById(R.id.btBack);
        btBackToClubs = findViewById(R.id.btBackToClubs);
        btNext = findViewById(R.id.btNext);
        i = new Intent(ScienceClubActivity.this, LoginActivity.class);

        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                howWe.setVisibility(View.GONE);
                theOtherThing.setVisibility(View.VISIBLE);
                btBackToClubs.setVisibility(View.GONE);
                btBack.setVisibility(View.VISIBLE);
                btNext.setVisibility(View.GONE);
            }
        });
        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                howWe.setVisibility(View.VISIBLE);
                theOtherThing.setVisibility(View.GONE);
                btBackToClubs.setVisibility(View.VISIBLE);
                btNext.setVisibility(View.VISIBLE);
                btBack.setVisibility(View.GONE);
            }
        });
        btBackToClubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });
    }
}