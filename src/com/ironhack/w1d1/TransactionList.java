package com.ironhack.w1d1;

import java.util.ArrayList;

public interface TransactionList {
    Transaction getLastTransaction();
    void addTransaction(Transaction transaction);
    Transaction getTransactionByDate(int date);
    ArrayList<Transaction> getAllTransaction();
}