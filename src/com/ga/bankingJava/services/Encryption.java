package com.ga.bankingJava.services;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encryption {
    public static String hashPassword(String plaintext){
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(plaintext.getBytes(StandardCharsets.UTF_8));

            StringBuilder hashed = new StringBuilder();
            for (byte b : hash) {
                hashed.append(String.format("%02x", b));
            }
            return hashed.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA-256 algorithm not found.", e);
        }
    }
}
