package udemy_exercises.cell_phone;

import java.util.ArrayList;
import java.util.Scanner;

class MobilePhone {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        // Create a program that implements a simple mobile phone with the following capabilities.
        // Able to store, modify, remove and query contact names.
        // You will want to create a separate class for Contacts (name and phone number).
        // Create a master class (MobilePhone) that holds the ArrayList of Contacts
        // The MobilePhone class has the functionality listed above.
        // Add a menu of options that are available.
        // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
        // and search/find contact.
        // When adding or updating be sure to check if the contact already exists (use name)
        // Be sure not to expose the inner workings of the Arraylist to MobilePhone
        // e.g. no ints, no .get(i) etc
        // MobilePhone should do everything with Contact objects only.
        boolean quit = false;
        int choice = 0;
        printOptions();
        while(!quit) {
            System.out.println("Enter your choice ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printOptions();
                    break;
                case 1:
                    mobilePhone.printContact();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    editContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContacts();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printOptions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - Print choice options");
        System.out.println("\t 1 - To print the list of contacts. ");
        System.out.println("\t 2 - To add a contact to the contact list.");
        System.out.println("\t 3 - To modify a contact in the list.");
        System.out.println("\t 4 - To remove a contact from the list.");
        System.out.println("\t 5 - To search for a contact in the list");
        System.out.println("\t 6 - To quit the application");
    }

    public static void addContact() {
        System.out.print("Please enter a name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter a phone number: ");
        String phoneNumber = scanner.nextLine();
        mobilePhone.addNewContact( new udemy_exercises.cell_phone.Contact(name, phoneNumber));
    }

    public static void editContact() {
        System.out.print("Enter contact name you want to update: ");
        String oldName = scanner.nextLine();
        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String newNumber = scanner.nextLine();
        mobilePhone.editContact(new udemy_exercises.cell_phone.Contact(oldName, ""), new udemy_exercises.cell_phone.Contact(newName, newNumber));
    }

    public static void removeContact() {
        System.out.print("Enter contact name that you would like to remove: ");
        String contactName = scanner.nextLine();
        mobilePhone.removeContact(new udemy_exercises.cell_phone.Contact(contactName, ""));
    }

    public static void searchContacts() {
        System.out.print("Contact to search for: ");
        String searchContact = scanner.nextLine();
        if(mobilePhone.onPhone(new udemy_exercises.cell_phone.Contact(searchContact, ""))) {
            System.out.println("Found " + searchContact + " in your contact list.");
        } else {
            System.out.println(searchContact + " is not in the contact list.");
        }
    }

    private ArrayList<udemy_exercises.cell_phone.Contact> myContacts = new ArrayList<udemy_exercises.cell_phone.Contact>();

    public void printContact() {
        System.out.println("You have " + myContacts.size() + " contacts!");
        for(int i=0; i < myContacts.size(); i++) {
            System.out.println((i+1) + ". " + myContacts.get(i).getName() + ": " + myContacts.get(i).getPhoneNumber());
        }
    }

    public void addNewContact(udemy_exercises.cell_phone.Contact contact) {
        if(findContact(contact) >= 0) {
            System.out.println("This contact exists already");
        } else {
            myContacts.add(contact);
        }
    }

    public int findContact(udemy_exercises.cell_phone.Contact contact) {
        for(int i=0; i<myContacts.size(); i++) {
            if(myContacts.get(i).getName().equals(contact.getName())) {
                return i;
            }
        }
        return -1;
    }

    public void editContact(udemy_exercises.cell_phone.Contact oldContact, udemy_exercises.cell_phone.Contact contact) {
        int position = findContact(oldContact);
        if(position >= 0)  {
            editContact(position, contact);
        }
    }

    private void editContact(int position, udemy_exercises.cell_phone.Contact contact) {
        myContacts.get(position).setName(contact.getName());
        myContacts.get(position).setPhoneNumber(contact.getPhoneNumber());
        System.out.println("Contact in position " + (position+1) + " has been updated!");
    }

    public void removeContact(udemy_exercises.cell_phone.Contact removeContact) {
        int position = findContact(removeContact);
        if(position >= 0) {
            removeContact(position);
        }
    }

    private void removeContact(int position) {
        myContacts.remove(position);
    }

    public boolean onPhone(udemy_exercises.cell_phone.Contact searchContact) {
        int position = findContact(searchContact);
        if(position >= 0) {
            return true;
        }
        return false;
    }

}
