package session15_16;

import java.util.concurrent.atomic.AtomicInteger;

public class BankAccount {

    private static final AtomicInteger accountCounter = new AtomicInteger(1000);
    private String accountHolderName;
    private final int accountNumber;
    private double balance;


    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountCounter.getAndIncrement();
        if (initialBalance < 0) {
            System.out.println("Initial balance cannot be negative. Set it to 0.");
            this.balance = 0;
        } else {
            this.balance = initialBalance;
        }
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Current balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        }
    }


    public double getBalance() {
        return balance;
    }

    public void getAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }

    public void transferFunds(BankAccount targetAccount, double amount) {
        if (amount <= 0) {
            System.out.println("Transfer amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds for transfer. Current balance: " + balance);
        } else {
            this.withdraw(amount);
            targetAccount.deposit(amount);
            System.out.println("Transferred " + amount + " to " + targetAccount.accountHolderName);
        }
    }
}
