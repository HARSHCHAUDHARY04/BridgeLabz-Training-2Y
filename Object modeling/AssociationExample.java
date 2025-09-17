

import java.util.*;

class bank_accountholder {
    String name;
    double balance;

    bank_accountholder(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + " has balance: $" + balance);
    }
}

class Bank {
    String bankName;
    List<bank_accountholder> bank_accountholders;

    Bank(String bankName) {
        this.bankName = bankName;
        bank_accountholders = new ArrayList<>();
    }

    void openAccount(bank_accountholder c) {
        bank_accountholders.add(c);
        System.out.println(c.name + " opened an account in " + bankName);
    }

    void showbank_accountholders() {
        System.out.println("bank_accountholders in " + bankName + ":");
        for (bank_accountholder c : bank_accountholders) {
            System.out.println(c.name);
        }
    }
}

public class AssociationExample {
    public static void main(String[] args) {
        Bank bank = new Bank("HDFC Bank");
        bank_accountholder c1 = new bank_accountholder("Alice", 5000);
        bank_accountholder c2 = new bank_accountholder("Bob", 7000);

        bank.openAccount(c1);
        bank.openAccount(c2);

        c1.viewBalance();
        c2.viewBalance();
        bank.showbank_accountholders();
    }
}
