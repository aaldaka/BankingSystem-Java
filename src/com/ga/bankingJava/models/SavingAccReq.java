package com.ga.bankingJava.models;

import java.time.LocalDateTime;

//by default a checking acc is created. Savings is requested
public class SavingAccReq {
    private String savingReqId;
    private int custID;
    private String status; //pending, denied or accepted
    private LocalDateTime reqTimestamp;
    private String deniedMsg; //why was it denied

    public SavingAccReq(int customerId, String reqId){
        custID = customerId;
        savingReqId = reqId;
        status = "PENDING";
        reqTimestamp = LocalDateTime.now();
        deniedMsg = null;
    }

    public void setDeniedMsg(String deniedMsg) {
        this.deniedMsg = deniedMsg;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
