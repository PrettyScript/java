package bank;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialDeposit) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialDeposit);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        double balance = 0;
        if(transactions.size() == 0) {
            System.out.println("No transaction found.");
        } else {
            for(int i=0; i<transactions.size(); i++) {
                System.out.println((i+1) + ". " + transactions.get(i));
                balance += transactions.get(i);

            }
            System.out.println("=====================");
            System.out.println("balance: " + balance);
        }
        return transactions;
    }

    public double getBalance() {
        double balance = 0;
        for(int i=0; i<transactions.size(); i++) {
            balance += transactions.get(i);
        }
        return balance;
    }

    public void addTransaction(double amount) {
        transactions.add(amount);
    }
}
