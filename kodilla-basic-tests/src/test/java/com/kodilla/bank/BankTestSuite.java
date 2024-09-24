package com.kodilla.bank;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    @Test
    public void testBalance() {

        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(2000);
        cashMachine1.addTransaction(-1000);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(3000);
        cashMachine2.addTransaction(-1000);

        CashMachine[] machines = {cashMachine1, cashMachine2};
        Bank bank = new Bank(machines);

        int totalBalance = bank.getTotalBalance();
        assertEquals(3000, totalBalance);
    }

    @Test
    public void testAverageWithdrawal() {
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(-200);
        cashMachine1.addTransaction(200);
        cashMachine1.addTransaction(-400);


        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(-100);
        cashMachine2.addTransaction(400);
        cashMachine2.addTransaction(-300);

        CashMachine[] machines = {cashMachine1, cashMachine2};
        Bank bank = new Bank(machines);

        double averageWithdrawal = bank.getAverageWithdrawal();
        assertEquals(-250, averageWithdrawal, 0.01);
    }

    @Test
    public void testAverageDeposit() {
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(700);
        cashMachine1.addTransaction(-50);
        cashMachine1.addTransaction(600);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(300);
        cashMachine2.addTransaction(-70);
        cashMachine2.addTransaction(400);

        CashMachine[] machines = {cashMachine1, cashMachine2};
        Bank bank = new Bank(machines);

        double averageDeposit = bank.getAverageDeposit();
        assertEquals(500, averageDeposit, 0.01);
    }

    @Test
    public void testDepositCount() {
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(700);
        cashMachine1.addTransaction(-600);
        cashMachine1.addTransaction(600);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(300);
        cashMachine2.addTransaction(0);

        CashMachine[] machines = {cashMachine1, cashMachine2};
        Bank bank = new Bank(machines);

        int transactionCount = bank.getTotalDepositCount();
        assertEquals(3,transactionCount);

    }

    @Test
    public void testWithdrawalCount() {
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(700);
        cashMachine1.addTransaction(600);
        cashMachine1.addTransaction(-600);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(-300);
        cashMachine2.addTransaction(0);

        CashMachine[] machines = {cashMachine1, cashMachine2};
        Bank bank = new Bank(machines);

        int transactionCount = bank.getTotalWithdrawalCount();
        assertEquals(2, transactionCount);
    }

}
