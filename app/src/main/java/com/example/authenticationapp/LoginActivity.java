package com.example.authenticationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {
    TextView gotoRegister;
    FrameLayout logo;
    Button login;
    TextInputLayout email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        gotoRegister = (TextView) findViewById(R.id.gotoRegister);
        login = (Button) findViewById(R.id.login);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        logo = findViewById(R.id.logo);
        logo.setOnClickListener(v -> {
            Intent i = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(i);
        });
        gotoRegister.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
        });
        User user = (User) getIntent().getSerializableExtra("user");
        login.setOnClickListener(v -> {
            if (user != null) {
                if (email.getEditText().getText().toString().equals("1")/*user.getEmail().equals(email.getEditText().getText().toString()) && user.getPassword().equals(password.getEditText().getText().toString())*/) {
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                } else {
                    Toast.makeText(LoginActivity.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}