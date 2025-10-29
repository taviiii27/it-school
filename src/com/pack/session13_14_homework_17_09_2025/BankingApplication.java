package com.pack.session13_14_homework_17_09_2025;

import java.util.*;

class Transaction {
    private String type;
    private double amount;
    private double balanceAfter;

    public Transaction(String type, double amount, double balanceAfter) {
        this.type = type;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
    }

    public String toString() {
        return type + ": " + amount + " | Balance after: " + balanceAfter;
    }
}

class BankAccount {
    private String ownerName;
    private double balance;
    private List<Transaction> transactions = new ArrayList<>();

    public BankAccount(String ownerName, double initialDeposit) {
        this.ownerName = ownerName;
        this.balance = initialDeposit;
        transactions.add(new Transaction("Initial Deposit", initialDeposit, balance));
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction("Deposit", amount, balance));
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction("Withdrawal", amount, balance));
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void showTransactions() {
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}


public class BankingApplication {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Charlie", 500);

        acc.deposit(200);
        acc.withdraw(100);
        acc.withdraw(700);

        System.out.println("Current Balance: " + acc.getBalance());
        acc.showTransactions();
    }
}

