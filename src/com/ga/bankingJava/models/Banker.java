package com.ga.bankingJava.models;

// banker must approve 2 things:
// 1. account creations (check if the ID is associated with an acc (diff type accounts is fine))
// 2. card upgrades (idk if logic should be there or no to approve the upgrade)

public class Banker extends Person{
    private int empID;

    public Banker(String fname, String lname ,int id, String password) {
        super(fname, lname, id, password, "Banker");
        this.empID = empID;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
}
