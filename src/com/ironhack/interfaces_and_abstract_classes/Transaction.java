package com.ironhack.interfaces_and_abstract_classes;

import java.util.Date;

public class Transaction {
    private int sellerAccountNumber;
    private int buyerAccountNumber;
    private double amount;
    private Date date;

    public Transaction(int sellerAccountNumber, int buyerAccountNumber, double amount, Date date) {
        this.sellerAccountNumber = sellerAccountNumber;
        this.buyerAccountNumber = buyerAccountNumber;
        this.amount = amount;
        this.date = date;
    }

    public int getSellerAccountNumber() {
        return sellerAccountNumber;
    }

    public int getBuyerAccountNumber() {
        return buyerAccountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public void setSellerAccountNumber(int sellerAccountNumber) {
        this.sellerAccountNumber = sellerAccountNumber;
    }

    public void setBuyerAccountNumber(int buyerAccountNumber) {
        this.buyerAccountNumber = buyerAccountNumber;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "sellerAccountNumber=" + sellerAccountNumber +
                ", buyerAccountNumber=" + buyerAccountNumber +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }

    public static class Dog {
        private String name;
        private int age;
        private String breed;
        private final long  id;

        public Dog(String name, int age, String breed, long id) {
            setName(name);
            setAge(age);
            setBreed(breed);
            this.id = id;
        }

        public Dog(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public long getId() {
            return id;
        }

    }
}
