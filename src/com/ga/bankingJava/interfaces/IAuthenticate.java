package com.ga.bankingJava.interfaces;

import com.ga.bankingJava.models.Person;

public interface IAuthenticate {
    Person login(String i);
    void logout();
}
