
package com.example.engineeringvillageproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout startLoginPage, loginPage;
    EditText etUsername, etPassword;
    Button btLoginStart, btLogin;
    Intent i;
    String username, password;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btLoginStart = findViewById(R.id.btLoginStart);
        btLogin = findViewById(R.id.btLogin);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        startLoginPage = findViewById(R.id.startLoginPage);
        loginPage = findViewById(R.id.loginPage);
        i = new Intent(MainActivity.this, LoginActivity.class);
        username = "admin";
        password = "admin";

        btLoginStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = startLoginPage.getVisibility();
                int y = loginPage.getVisibility();
                if (x == View.VISIBLE && y == View.GONE) {
                    startLoginPage.setVisibility(View.GONE);
                    loginPage.setVisibility(View.VISIBLE);
                }
            }
        });

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String y = etPassword.getText().toString();
                if (etUsername.getText().toString().equals(username) && etPassword.getText().toString().equals(password)) {
                    startActivity(i);
                }else {
                    Toast.makeText(MainActivity.this, "Login Filed!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}