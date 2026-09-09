package com.ga.bankingJava.models;

import java.time.LocalDateTime;

public class Transaction {
    private int transactionID;
    private LocalDateTime timestamp;
    String transactionType; //deposit, withdraw or transfer
    private double amount;
    private double postTransBal; //helps in transaction sheets
    private String desc;

    public Transaction(int transactionID, LocalDateTime timestamp, String transactionType, double amount, double postTransBal, String desc) {
        this.transactionID = transactionID;
        this.timestamp = LocalDateTime.now();
        this.transactionType = transactionType;
        this.amount = amount;
        this.postTransBal = postTransBal;
        this.desc = desc;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public double getPostTransBal() {
        return postTransBal;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return String.format(
                "[%s] %s | Amount: $%.2f | Balance After: $%.2f | %s ",
                timestamp.toLocalDate(),
                transactionType,
                amount,
                postTransBal,
                desc
        );
    }

}
