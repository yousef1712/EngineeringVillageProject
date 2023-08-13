
package com.example.engineeringvillageproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout startLoginPage, loginPage;
    Button btLoginStart, btLogin;
    Intent i;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btLoginStart = findViewById(R.id.btLoginStart);
        btLogin = findViewById(R.id.btLogin);
        startLoginPage = findViewById(R.id.startLoginPage);
        loginPage = findViewById(R.id.loginPage);
        i = new Intent(MainActivity.this, LoginActivity.class);

        btLoginStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = startLoginPage.getVisibility();
                int y = loginPage.getVisibility();
                if (x == View.VISIBLE && y == View.GONE){
                    startLoginPage.setVisibility(View.GONE);
                    loginPage.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}