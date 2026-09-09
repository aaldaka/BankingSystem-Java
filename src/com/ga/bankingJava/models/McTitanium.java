package com.ga.bankingJava.models;

public class McTitanium extends DebitCard{
    public McTitanium(long cardNo) {
        super(cardNo, "Titanium");
        setDailyDeposit(100000);
        setDailyTransfer(20000);
        setDailyWithdraw(10000);
        setTransferOwnAcc(40000);
        setDepositOwnAcc(200000);
    }
}
