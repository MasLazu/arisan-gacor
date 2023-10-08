package com.mfaziz.arisanku.entity;

import java.util.ArrayList;

public class User implements Comparable<User> {
    public String username;
    public String password;
    private int balance;
    private ArrayList<TransactionHistory> transactionHistorys;
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.balance = 0;
        this.transactionHistorys = new ArrayList<>();
    }
    
    @Override
    public boolean equals(Object object) {
        if (object instanceof User user) {
            return this.username.equals(user.username) 
                    && this.password.equals(user.password);
        }
        return false;
    }
    
    public void deposit(int amount, String message) throws Exception {
        if(amount<0)
            throw new Exception("invalid amount");
        
        balance += amount;
        transactionHistorys.add(new TransactionHistory(message, amount));
    }
    
    public void withdraw(int amount, String message) throws Exception {
        if(amount>balance)
            throw new Exception("not enough balance");
        
        balance -= amount;
        transactionHistorys.add(new TransactionHistory(message, -amount));
    }
    
    public void transfer(User user, int amount) throws Exception {
        withdraw(amount, "Transfer to " + user.username);
        user.deposit(amount, "Transfer from " + username);
    }
    
    public int getBalance() {
        return balance;
    }
    
    public ArrayList<TransactionHistory> getTransactionHistorys() {
        return transactionHistorys;
    }
    
    @Override
    public int compareTo(User other) {
        return Integer.compare(this.balance, other.getBalance());
    }
}
