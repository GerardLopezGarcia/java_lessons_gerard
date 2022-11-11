package com.ironhack.interfaces_and_abstract_classes;

import java.util.ArrayList;
import java.util.Date;

public class PaymentList implements ItransactionList {

    private ArrayList<Transaction>  transactionsArray= new ArrayList<>();

    @Override
    public Transaction getLastTransaction() {
        return transactionsArray.get(transactionsArray.size()-1);
    }

    @Override
    public void addTransaction(Transaction transaction) {
        transactionsArray.add(transaction);
    }

    @Override
    public Transaction getTransactionByDate(Date date) {
        for (Transaction t : transactionsArray){
            if(t.getDate().equals(date)){
                return t;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Transaction> getAllTransaction() {
        return transactionsArray;
    }
}
