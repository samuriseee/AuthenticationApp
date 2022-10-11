package com.example.authenticationapp;

public class Transaction {
    private String name;
    private String amount;
    private String date;
    private String type;

    public Transaction(String name, String amount, String date, String type) {
        this.name = name;
        this.amount = amount;
        this.date = date;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public String getType() {
        return type;
    }
}

