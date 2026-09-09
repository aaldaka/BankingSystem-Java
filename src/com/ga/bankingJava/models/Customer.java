package com.ga.bankingJava.models;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class Customer extends Person {
    private CheckingAcc checkingAcc;
    private SavingAcc savingAcc;
    private DebitCard card;
    private int loginAttempts;
    private LocalDateTime lockedOutTime;
    private boolean locked;
    private ArrayList<Transaction> transactionHistory;

    public Customer(String fname, String lname, int id, String password) {
        super(fname, lname, id, password, "Customer");
        this.locked = false; //initially isn't locked out
        this.transactionHistory = new ArrayList<Transaction>();
        this.loginAttempts = 0;
    }

    public CheckingAcc getCheckingAcc() {
        return checkingAcc;
    }

    public void setCheckingAcc(CheckingAcc checkingAcc) {
        this.checkingAcc = checkingAcc;
    }

    public SavingAcc getSavingAcc() {
        return savingAcc;
    }

    public void setSavingAcc(SavingAcc savingAcc) {
        this.savingAcc = savingAcc;
    }

    public DebitCard getCard() {
        return card;
    }

    public void setCard(DebitCard card) {
        this.card = card;
    }

    public int getLoginAttempts() {
        return loginAttempts;
    }

    public void setLoginAttempts(int loginAttempts) {
        this.loginAttempts = loginAttempts;
    }

    public LocalDateTime getLockedOutTime() {
        return lockedOutTime;
    }

    public void setLockedOutTime(LocalDateTime lockedOutTime) {
        this.lockedOutTime = lockedOutTime;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public ArrayList<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(ArrayList<Transaction> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }
}
