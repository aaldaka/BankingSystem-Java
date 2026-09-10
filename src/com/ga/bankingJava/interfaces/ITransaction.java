package com.ga.bankingJava.interfaces;

public interface ITransaction {
    String getStatus();
    void setStatus(String status);
    String getDeniedMsg();
    void setDeniedMsg(String msg);
}
