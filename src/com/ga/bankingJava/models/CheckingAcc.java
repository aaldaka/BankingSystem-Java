package com.ga.bankingJava.models;

public class CheckingAcc extends BankAccount{
    private final int OVERDRAFT_FEE = 35;

    public CheckingAcc(int accID){
        super(accID);
    }

    public boolean withdraw(double amount){
        if (isDeactivated()){
            System.out.println("The account is deactivated due to Overdraft violations.");
            return false;
        }else{
            if(getBalance() < 0 && amount > 100){ //more than the allowed 100 deduction
                System.out.println("Failed Transaction:");
                System.out.println("The amount exceeds the $100 allowance when the balance is below zero.");
                return false;
            }

            System.out.println("Successful Transaction: ");
            setBalance(getBalance() - amount);
            System.out.println(getBalance()+ " has been withdrawn from your account.");


            if (getBalance() < 0){
                System.out.println("An overdraft fee has been issued to your account: $" + OVERDRAFT_FEE);
                setBalance(amount - OVERDRAFT_FEE);
                setOverdrafted(getOverdrafted() + 1);

                if (getOverdrafted() >= 2){ //overdraft violations
                    setDeactivated(true);
                    System.out.println("Status Change:");
                    System.out.println("Due to 2 overdraft violations, your account is now deactivated.");
                    System.out.println("You must pay the overdraft fee: " + OVERDRAFT_FEE * 2 + " and make your balance above zero.");
                }
            }
        }
        return true;
    }

    public boolean deposit(double amount){
        System.out.println("Successful Transaction: ");
        setBalance(getBalance() + amount);
        System.out.println(amount+ " has been deposited to your account.");

        if (getBalance() >= 0 && isDeactivated()){
            setDeactivated(false);
            setOverdrafted(0);
            System.out.println("Status Change: ");
            System.out.println("You account has been reactivated! Happy banking.");
        }
        return true;
    }

}
