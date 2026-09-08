package com.ga.bankingJava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    private CheckingAccount checkingAcc;
    private SavingAccount savingAcc;
    private DebitCard card;
    private int loginAttempts;
    private LocalDateTime lockedOutTime;
    private boolean locked;
    private ArrayListList<Transaction> transactionHistory;

    public Customer(String name, int id, String password) {
        super(name, id, password, "Customer");
        this.locked = false; //initially isn't locked out
        this.transactionHistory = new ArrayList<Transaction>();
        this.loginAttempts = 0;
    }

    public CheckingAccount getCheckingAcc() {
        return checkingAcc;
    }

    public void setCheckingAcc(CheckingAccount checkingAcc) {
        this.checkingAcc = checkingAcc;
    }

    public SavingAccount getSavingAcc() {
        return savingAcc;
    }

    public void setSavingAcc(SavingAccount savingAcc) {
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
