package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachines;

    public Bank(CashMachine[] cashMachines) {
        this.cashMachines = cashMachines;
    }

    public int getTotalBalance() {
        int balance = 0;
        for (CashMachine cashMachine : cashMachines) {
            balance+= cashMachine.getBalance();
        }
        return balance;
    }

    public int getTotalWithdrawalCount() {
        int totalCount = 0;
        for (CashMachine cashMachine : cashMachines) {
            totalCount += cashMachine.getWithdrawalCount();
        }
        return totalCount;
    }


    public int getTotalDepositCount() {
        int totalCount = 0;
        for (CashMachine cashMachine : cashMachines) {
            totalCount += cashMachine.getDepositCount();
        }
        return totalCount;
    }

    public double getAverageWithdrawal() {
        int withdrawals = 0;
        int withdrawalCount = 0;

        for (CashMachine cashMachine : cashMachines) {
            withdrawals += cashMachine.getWithdrawals();
            withdrawalCount += cashMachine.getWithdrawalCount();
        }

        if (withdrawalCount == 0) {
            return 0;
        }

        return (double) withdrawals / withdrawalCount;
    }


    public double getAverageDeposit() {
        int deposits = 0;
        int depositCount = 0;

        for (CashMachine cashMachine : cashMachines) {
            deposits += cashMachine.getDeposits();
            depositCount += cashMachine.getDepositCount();
        }

        if (depositCount == 0) {
            return 0;
        }

        return (double) deposits / depositCount;
    }



}
