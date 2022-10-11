package com.example.authenticationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.os.Parcelable;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.io.Serializable;

public class RegisterActivity extends AppCompatActivity {
    TextView backtoLogin,backtoSignIn2;
    TextInputLayout firstName,lastName,email,password,confirmPassword;
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Intent i = new Intent(RegisterActivity.this, LoginActivity.class);
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        confirmPassword = findViewById(R.id.confirmPass);

        backtoLogin = (TextView) findViewById(R.id.backtoSignIn);
        backtoSignIn2 = (TextView) findViewById(R.id.backtoSignIn2);

        backtoSignIn2.setOnClickListener(v -> {
            finish();
        });
        backtoLogin.setOnClickListener(v -> {
            finish();
        });
        register = (Button) findViewById(R.id.signUp);
        register.setOnClickListener(v -> {
            String firstName = this.firstName.getEditText().getText().toString();
            String lastName = this.lastName.getEditText().getText().toString();
            String email = this.email.getEditText().getText().toString();
            String password = this.password.getEditText().getText().toString();
            String confirmPassword = this.confirmPassword.getEditText().getText().toString();
            if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                this.firstName.setError("Please fill all the fields");
                this.lastName.setError("Please fill all the fields");
                this.email.setError("Please fill all the fields");
                this.password.setError("Please fill all the fields");
                this.confirmPassword.setError("Please fill all the fields");
            } else if (!password.equals(confirmPassword)) {
                this.password.setError("Password does not match");
                this.confirmPassword.setError("Password does not match");
            } else {

                User user = new User(lastName,firstName,email,password);

                Toast.makeText(this, "Register successfully", Toast.LENGTH_SHORT).show();
                i.putExtra("user", (Serializable) user);
                this.firstName.getEditText().setText("");
                this.lastName.getEditText().setText("");
                this.email.getEditText().setText("");
                this.password.getEditText().setText("");
                this.confirmPassword.getEditText().setText("");
            }
        });

    }

}