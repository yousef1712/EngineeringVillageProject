package com.example.engineeringvillageproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button btProgrammingClub, btEngineeringClub, btScienceClub;
    Intent iProgrammingClub, iEngineeringClub, iScienceClub;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btProgrammingClub = findViewById(R.id.btProgrammingClub);
        btEngineeringClub = findViewById(R.id.btEngineeringClub);
        btScienceClub = findViewById(R.id.btScienceClub);
        iProgrammingClub = new Intent(LoginActivity.this, ProgrammingClubActivity.class);
        iEngineeringClub = new Intent(LoginActivity.this, EngineeringClubActivity.class);
        iScienceClub = new Intent(LoginActivity.this, ScienceClubActivity.class);

        btProgrammingClub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(iProgrammingClub);
            }
        });
        btEngineeringClub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(iEngineeringClub);
            }
        });
        btScienceClub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(iScienceClub);
            }
        });
    }
}