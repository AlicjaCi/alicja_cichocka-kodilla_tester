package com.kodilla.bank;

import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void testBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(3000);
        cashMachine.addTransaction(-1000);
        cashMachine.addTransaction(0);

        int balance = cashMachine.getBalance();

        assertEquals(2000, balance);
    }
    @Test
    public void testTransactionsCount() {

        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(215);
        cashMachine.addTransaction(-140);
        cashMachine.addTransaction(520);
        cashMachine.addTransaction(-20);

        int transactionCount = cashMachine.getTransactionCount();
        assertEquals(4, transactionCount);
    }

    @Test
    public void testDepositCount() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(0);
        cashMachine.addTransaction(-100);

        int transactionCount = cashMachine.getDepositCount();
        assertEquals(1, transactionCount);
    }

    @Test
    public void testWithdrawalsCount() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(2200);
        cashMachine.addTransaction(0);
        cashMachine.addTransaction(-500);
        cashMachine.addTransaction(-200);

        int transactionCount = cashMachine.getWithdrawalCount();
        assertEquals(2, transactionCount);
    }
    @Test
    public void testDepositBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(3000);
        cashMachine.addTransaction(1000);
        cashMachine.addTransaction(-1000);
        cashMachine.addTransaction(0);

        int balance = cashMachine.getDeposits();
        assertEquals(4000, balance);
    }
    @Test
    public void testWithdrawalsBalance(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-3000);
        cashMachine.addTransaction(1000);
        cashMachine.addTransaction(-1000);
        cashMachine.addTransaction(0);

        int balance = cashMachine.getWithdrawals();
        assertEquals(-4000, balance);
    }



}
