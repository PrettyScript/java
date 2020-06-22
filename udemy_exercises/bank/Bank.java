package udemy_exercises.bank;

import bank.Branch;

import java.util.ArrayList;

public class Bank {

    public static void main(String[] args) {
        Bank bank = new Bank("Chase");
        bank.addNewBranch("Dallas");
        bank.addNewBranch("Addison");
        bank.getBranches();

        bank.addCustomer("Dallas", "Jessica", 76.00);
        bank.addCustomer("Dallas", "Cici", 2.23);
        bank.addCustomer("Addison", "Jane", 46.00);
        bank.addCustomer("Addison", "Jon", 98.00);


        bank.addCustomerTransaction("Dallas", "Jessica", 120.62);
        bank.addCustomerTransaction("Dallas", "Cici", 20.22);
        bank.addCustomerTransaction("Dallas", "Cici", 520.99);
        bank.addCustomerTransaction("Addison", "Jane", 20.00);
        bank.addCustomerTransaction("Addison", "Jon", 0.67);
        bank.addCustomerTransaction("Dallas", "Hugh", 57.00);

        bank.printCustomers("Dallas");
        bank.printCustomers("Addison");
        bank.printCustomers("Frisco");
    }

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        if(branches.size() == 0) {
            System.out.println("There are no branches associated with this bank");
        } else  {
            System.out.println(getName() + " has " + branches.size() + " branches.");
        }
        return branches;
    }

    public void addNewBranch(String branchName) {
        if(findBranch(branchName) >= 0) {
            System.out.println("That branch has already been created");
        } else {
            branches.add(new Branch(branchName));
        }
    }

    private int findBranch(String branchName) {
        for(int i=0; i<branches.size(); i++) {
            Branch branch = branches.get(i);
            if(branch.getBranchName().equals(branchName)) {
                return i;
            }
        }
        return -1;
    }

    public void addCustomer(String branchName, String customerName, double initialDeposit) {
        int branch = findBranch(branchName);
        if(branch >= 0) {
            branches.get(branch).addCustomer(customerName, initialDeposit);
        }
    }

    public void addCustomerTransaction(String branchName, String customerName, double transaction) {
        int branch = findBranch(branchName);
        if(branch >= 0) {
            branches.get(branch).addCustomerTransactions(customerName, transaction);
        }
    }

    public void printCustomers(String branchName) {
        int branch = findBranch(branchName);
        if(branch >= 0) {
            branches.get(branch).getCustomers();
        } else {
            System.out.println(branchName + " is not a branch in our database.");
        }
    }
    
}


/*
**Banking w/ Java Classes**
   - **Bank class**
       - List of Branches
   - **Branch class**
     - List of Customers
     - List of Transactions
   - **Customer Class**:
     - Customer Name
   - **Branch Class**:
     - addCustomer and initial transaction amount.
     - Also needs to add additional transactions for that customer/branch
   - **Bank:**
     - Add a new branch
     - Add a customer to that branch with initial transaction
     - Add a transaction for an existing customer for that branch
     - Show a list of customers for a particular branch and optionally a list of their transactions
   - Demonstration autoboxing and unboxing in your code
   - Think about where you are adding the code to perform certain actions
*/