package com.ga.bankingJava.models;

import java.time.LocalDate;

public abstract class DebitCard {
    private long cardNo;
    private String cardType; //platinum, titanium or normal MC

    private double dailyWithdraw; //daily quota
    private double dailyTransfer;
    private double dailyDeposit;
    private double depositOwnAcc;
    private double transferOwnAcc;

    private double withdrewToday; //checkers
    private double transferredToday;
    private double depositedToday;
    private LocalDate resetLimit;

    public DebitCard(long cardNo, String cardType) {
        this.cardNo = cardNo;
        this.cardType = cardType;
        withdrewToday = 0.0;
        transferredToday = 0.0;
        depositedToday = 0.0;
        resetLimit = LocalDate.now();
    }

    private void resetDailyLimit(){
        if(resetLimit.isBefore(LocalDate.now())){
            withdrewToday = 0.0;
            transferredToday = 0.0;
            depositedToday = 0.0;
            resetLimit = LocalDate.now();
        }
    }

    public boolean canWithdraw(double amount){
        resetDailyLimit();
        if (amount + withdrewToday <= dailyWithdraw){
                withdrewToday+=amount;
                System.out.println("Successful Transaction: ");
                return true;
            }
            return false;
        }


    public boolean canTransfer(double amount, boolean ownAccount){
        resetDailyLimit();
        double limit = ownAccount ? depositOwnAcc : dailyDeposit;
        if (amount + transferredToday <= dailyTransfer){
                transferredToday+=amount;
                System.out.println("Successful Transaction: ");
                return true;
            }
        return false;
    }

    public boolean canDeposit(double amount, boolean ownAccount){
        resetDailyLimit();
        double limit = ownAccount ? depositOwnAcc : dailyDeposit;
        if (amount + depositedToday <= limit){
                depositedToday+=amount;
                System.out.println("Successful Transaction: ");
                return true;
            }
        return false;
    }

    public long getCardNo() {
        return cardNo;
    }

    public void setCardNo(long cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public double getDailyWithdraw() {
        return dailyWithdraw;
    }

    public void setDailyWithdraw(double dailyWithdraw) {
        this.dailyWithdraw = dailyWithdraw;
    }

    public double getDailyTransfer() {
        return dailyTransfer;
    }

    public void setDailyTransfer(double dailyTransfer) {
        this.dailyTransfer = dailyTransfer;
    }

    public double getDailyDeposit() {
        return dailyDeposit;
    }

    public void setDailyDeposit(double dailyDeposit) {
        this.dailyDeposit = dailyDeposit;
    }

    public double getDepositOwnAcc() {
        return depositOwnAcc;
    }

    public void setDepositOwnAcc(double depositOwnAcc) {
        this.depositOwnAcc = depositOwnAcc;
    }

    public double getTransferOwnAcc() {
        return transferOwnAcc;
    }

    public void setTransferOwnAcc(double transferOwnAcc) {
        this.transferOwnAcc = transferOwnAcc;
    }

    public double getWithdrewToday() {
        return withdrewToday;
    }

    protected void setWithdrewToday(double withdrewToday) {
        this.withdrewToday = withdrewToday;
    }

    public double getTransferredToday() {
        return transferredToday;
    }

    protected void setTransferredToday(double transferredToday) {
        this.transferredToday = transferredToday;
    }

    public double getDepositedToday() {
        return depositedToday;
    }

    protected void setDepositedToday(double depositedToday) {
        this.depositedToday = depositedToday;
    }

    public LocalDate getResetLimit() {
        return resetLimit;
    }

    protected void setResetLimit(LocalDate resetLimit) {
        this.resetLimit = resetLimit;
    }
}
