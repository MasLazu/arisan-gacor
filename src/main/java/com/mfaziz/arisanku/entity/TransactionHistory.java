package com.mfaziz.arisanku.entity;

public class TransactionHistory {
    private final int amount;
    private final String message;
    
    public TransactionHistory(String message, int amount) {
        this.message = message;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public String getMessage() {
        return message;
    }
}
