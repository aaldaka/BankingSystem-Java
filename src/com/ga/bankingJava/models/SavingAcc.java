package com.ga.bankingJava.models;

public class SavingAcc extends BankAccount{

    public SavingAcc(int accID){
        super(accID);
    }

    public boolean withdraw(double amount) {
        if (isDeactivated()) {
            System.out.println("The account is deactivated.");
            return false;
        }

        if (getBalance() - amount < 0.0) { // cannot go negative
            System.out.println("Insufficient funds. Savings balance cannot go below 0.");
            return false;
        }

        setBalance(getBalance() - amount);
        System.out.println("Successful Transaction: ");
        System.out.println(amount + " has been withdrawn from your account.");
        return true;
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Successful Transaction: ");
        System.out.println(amount+ " has been deposited to your account.");
    }


}
