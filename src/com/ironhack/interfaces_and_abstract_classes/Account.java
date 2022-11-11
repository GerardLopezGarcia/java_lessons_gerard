package com.ironhack.interfaces_and_abstract_classes;

public class Account {
    private String name;
    private String adress;
    private int accountNumber;
    private double balance;

    public Account(String name, String adress, int accountNumber, double balance) {
        this.name = name;
        this.adress = adress;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
