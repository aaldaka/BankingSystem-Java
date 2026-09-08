package com.ga.bankingJava.models;

public abstract class Person {
    private String fname;
    private String lname;
    private int id;
    private String password;
    private String role;

    public Person(String fname, String lname, int id, String password, String role) {
        this.fname = fname;
        this.lname = lname;
        this.id = id;
        this.password = password;
        this.role = role;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


}
