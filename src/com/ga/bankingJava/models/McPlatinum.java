package com.ga.bankingJava.models;

public class McPlatinum extends DebitCard{
    public McPlatinum(long cardNo) {
        super(cardNo, "Platinum");
        setDailyDeposit(100000);
        setDailyTransfer(40000);
        setDailyWithdraw(20000);
        setTransferOwnAcc(80000);
        setDepositOwnAcc(200000);
        }
    }

