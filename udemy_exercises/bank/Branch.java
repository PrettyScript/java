package bank;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {

        System.out.println("List of customers at the " + getBranchName() + " branch: ");

        for(int i=0; i<customers.size(); i++) {
            Customer branchCustomer = customers.get(i);
            System.out.println((1+i) + ". " + customers.get(i).getName() + " with a balance of " + "$" + branchCustomer.getBalance());
        }
        return customers;
    }

    public void addCustomer(String customer, double initialDeposit) {
        if(findCustomer(customer) >= 0) {
            System.out.println(customer + " already exists in our database.");
        } else {
            customers.add(new Customer(customer, initialDeposit));
            System.out.println(customer + " has been added to the " + getBranchName() + " branch with an initial deposit of $" + initialDeposit);
        }
    }

    private int findCustomer(String customerName) {
        for (int i=0; i<customers.size(); i++) {
            Customer branchCustomer = customers.get(i);
            if(branchCustomer.getName().equals(customerName)) {
                return i;
            }
        }
        return -1;
    }


    public void addCustomerTransactions(String customer, double transaction) {
        int branchCustomer = findCustomer(customer);
        if(branchCustomer >= 0) {
            customers.get(branchCustomer).addTransaction(transaction);
            System.out.println("$" + transaction + " added for " + customer + " in the " + getBranchName() + " branch");
        } else {
            System.out.println("This customer is not in our database");
        }

    }
}
