package com.ironhack.w1d1;

public class Transaction {
    private int sellerAccountNumber;
    private int buyerAccountNumber;
    private int amount;
    private int date;

    public Transaction(int sellerAccountNumber, int buyerAccountNumber, int amount, int date) {
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

    public int getAmount() {
        return amount;
    }

    public int getDate() {
        return date;
    }

    public void setSellerAccountNumber(int sellerAccountNumber) {
        this.sellerAccountNumber = sellerAccountNumber;
    }

    public void setBuyerAccountNumber(int buyerAccountNumber) {
        this.buyerAccountNumber = buyerAccountNumber;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setDate(int date) {
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
}
