package com.ga.bankingJava.models;

public class Mastercard extends DebitCard{
    public Mastercard(long cardNo) { //default
        super(cardNo, "Mastercard");
        setDailyDeposit(100000);
        setDailyTransfer(10000);
        setDailyWithdraw(5000);
        setTransferOwnAcc(20000);
        setDepositOwnAcc(200000);
    }
}
