package com.ga.bankingJava.models;

import java.time.LocalDateTime;

public class UpgradeCardReq {
    private String upgradeCardReqId;
    private int custID;
    private String status; //pending, denied or accepted
    private LocalDateTime reqTimestamp;
    private String deniedMsg; //why was it denied
    private DebitCard currentCard;
    private DebitCard requestedCard;

    public UpgradeCardReq(DebitCard currentCard, DebitCard requestedCard, int customerId, String reqId){
        custID = customerId;
        upgradeCardReqId = reqId;
        status = "PENDING";
        reqTimestamp = LocalDateTime.now();
        deniedMsg = null;
        if (requestedCard.getDailyWithdraw() <= currentCard.getDailyWithdraw()){ //its an actual upgrade
            throw new IllegalArgumentException("Requested card is not an upgrade.");
        }
        this.currentCard = currentCard;
        this.requestedCard = requestedCard;
    }

    public void setDeniedMsg(String deniedMsg) {
        this.deniedMsg = deniedMsg;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUpgradeCardReqId() {
        return upgradeCardReqId;
    }

    public int getCustID() {
        return custID;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getReqTimestamp() {
        return reqTimestamp;
    }

    public String getDeniedMsg() {
        return deniedMsg;
    }

    public DebitCard getCurrentCard() {
        return currentCard;
    }

    public DebitCard getRequestedCard() {
        return requestedCard;
    }
}
