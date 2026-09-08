package com.ga.bankingJava.models;

public abstract class BankAccount {
    private int accID;
    private double balance;
    private boolean isDeactivated;
    private int overdrafted;

    public BankAccount(int accID) {
        this.accID = accID;
        this.balance = 0.0;
        this.isDeactivated = false;
        this.overdrafted = 0;
    }

    public int getAccID() {
        return accID;
    }

    public void setAccID(int accID) {
        this.accID = accID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isDeactivated() {
        return isDeactivated;
    }

    public void setDeactivated(boolean deactivated) {
        isDeactivated = deactivated;
    }

    public int getOverdrafted() {
        return overdrafted;
    }

    public void setOverdrafted(int overdrafted) {
        this.overdrafted = overdrafted;
    }
}
