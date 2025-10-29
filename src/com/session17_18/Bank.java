package com.session17_18;

interface Bank {
    double getBalance();
}

class BankA implements Bank {
    @Override
    public double getBalance() {
        return 100;
    }
}

class BankB implements Bank {
    @Override
    public double getBalance() {
        return 150;
    }
}

class BankC implements Bank {
    @Override
    public double getBalance() {
        return 200;
    }
}

class TestBank {
    public static void main(String[] args) {
        Bank b1 = new BankA();
        Bank b2 = new BankB();
        Bank b3 = new BankC();

        System.out.println("Bank A balance: " + b1.getBalance());
        System.out.println("Bank B balance: " + b2.getBalance());
        System.out.println("Bank C balance: " + b3.getBalance());
    }
}
