package com.kodilla.bank.homework;

public class CashMachine {

    private int[] transactions;
    private int transactionCount;

    public CashMachine() {
        this.transactions = new int[0];
        this.transactionCount = 0;
    }

    public int getTransactionCount(){
        return transactionCount;
    }

    public int getBalance() {
        int balance = 0;
        for (int transaction : transactions) {
            balance+=transaction;
        }
        return balance;
    }

    public int getWithdrawalCount() {
        int count = 0;
        for (int transaction : transactions) {
            if (transaction < 0) {
                count++;
            }
        }
        return count;
    }

    public int getDepositCount() {
        int count = 0;
        for (int transaction : transactions) {
            if (transaction > 0) {
                count++;
            }
        }
        return count;
    }

    public int getWithdrawals() {
        int total = 0;
        for (int transaction : transactions) {
            if (transaction < 0) {
                total += transaction;
            }
        }
        return total;
    }

    public int getDeposits() {
        int total = 0;
        for (int transaction : transactions) {
            if (transaction > 0) {
                total += transaction;
            }
        }
        return total;
    }

    public void addTransaction(int amount) {
        if (amount == 0) {
            return;
        }
        transactionCount++;
        int[] newTab = new int[transactionCount];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[transactionCount - 1] = amount;
        transactions = newTab;
    }


}
