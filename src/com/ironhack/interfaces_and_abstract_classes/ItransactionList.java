package com.ironhack.interfaces_and_abstract_classes;

import java.util.ArrayList;
import java.util.Date;

public interface ItransactionList {
    Transaction getLastTransaction();
    void addTransaction(Transaction transaction);
    Transaction getTransactionByDate(Date date);
    ArrayList<Transaction> getAllTransaction();
}