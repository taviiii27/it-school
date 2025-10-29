package com.session15_16;

public class TestingBankAccount {
    public static void main(String[] args) {


        BankAccount acc1 = new BankAccount("Alexia", 500);
        BankAccount acc2 = new BankAccount("Bogdan", 300);


        acc1.getAccountDetails();
        acc2.getAccountDetails();
        System.out.println();

        acc1.deposit(200);
        acc1.withdraw(100);
        acc2.withdraw(500);
        System.out.println();

        acc1.transferFunds(acc2, 250);
        System.out.println();

        System.out.println("Alexia balance: " + acc1.getBalance());
        System.out.println("Bogdan balance: " + acc2.getBalance());
    }
}
