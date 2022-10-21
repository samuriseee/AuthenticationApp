package com.example.authenticationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TransactionDetails extends AppCompatActivity {
    TextView name, amount, date, type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_details);
        name = findViewById(R.id.transaction_name);
        amount = findViewById(R.id.transaction_amount);
        date = findViewById(R.id.transaction_date);
        type = findViewById(R.id.transaction_type);
        name.setText(getIntent().getStringExtra("name"));
        amount.setText(getIntent().getStringExtra("amount"));
        date.setText(getIntent().getStringExtra("date"));
        type.setText(getIntent().getStringExtra("type"));
    }
}