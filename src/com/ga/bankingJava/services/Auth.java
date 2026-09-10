package com.ga.bankingJava.services;

import com.ga.bankingJava.models.Banker;
import com.ga.bankingJava.models.Customer;
import com.ga.bankingJava.models.Person;

import java.time.LocalDateTime;
import java.util.Map;

public class Auth {
    private Map<Integer, Customer> customerList; //we'll load it from the data sheet
    private Map<Integer, Banker> bankersList;

    public Auth(Map<Integer, Customer> customers, Map<Integer, Banker> bankers) {
        customerList = customers;
        bankersList = bankers;
    }

    public Person login(int id, String password) {
        if (bankersList.containsKey(id)) {
            return loginBanker(id, password);
        } else if (customerList.containsKey(id)) {
            return loginCustomer(id, password);
        } else {

            return null;
        }
    }

    public Banker loginBanker(int id, String password) {
        Banker banker = bankersList.get(id);
        String pswd = Encryption.hashPassword(password); //checks against password in the db
        if (banker.getPassword().equalsIgnoreCase(pswd)) {
            System.out.println("Welcome back, " + banker.getFname() + " " + banker.getLname());
            return banker;
        } else {
            System.out.println("Password is incorrect. Try again.");
            return null;
        }
    }

    public Customer loginCustomer(int id, String password) {
        Customer customer = customerList.get(id);
        String pswd = Encryption.hashPassword(password);

        if (customer.isLocked()) {
            LocalDateTime unlockedBy = customer.getLockedOutTime().plusMinutes(60);
            if (LocalDateTime.now().isBefore(unlockedBy)) {
                System.out.println("Account is locked, please try again in: " + unlockedBy);
                return null;
            }
        } else { //lockout duation done
            customer.setLocked(false);
            customer.setLoginAttempts(0);
            customer.setLockedOutTime(null);
        }

        if (customer.getPassword().equalsIgnoreCase(pswd)) { //correct pswd
            System.out.println("Welcome back, " + customer.getFname() + " " + customer.getLname());
            customer.setLoginAttempts(0);
            System.out.println("Happy banking!");
            return customer;
        }
        //wrong
        customer.setLoginAttempts(customer.getLoginAttempts() + 1);
        System.out.println("Incorrect password: " + customer.getLoginAttempts());
        if (customer.getLoginAttempts() >= 3) {
            customer.setLocked(true);
            customer.setLockedOutTime(LocalDateTime.now());
            System.out.println("Your account is now locked. Try again in: " + customer.getLockedOutTime());
        }
        return null;
        }
    }

