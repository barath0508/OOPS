package contacts;

import java.util.HashMap;
import java.util.Map;

public class ContactsBook {

    private Map<String, String> contacts;

    // Constructor
    public ContactsBook() {
        contacts = new HashMap<>();
    }

    // Method to add a contact
    public void addContact(String name, String phone) {
        contacts.put(name, phone);
        System.out.println("Contact '" + name + "' added successfully.");
    }

    // Method to search for a contact
    public void searchContact(String name) {
        if (contacts.containsKey(name)) {
            System.out.println("Found: " + name + " → " + contacts.get(name));
        } else {
            System.out.println("Contact '" + name + "' not found.");
        }
    }

    // Method to display all contacts
    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("📒 Contact List:");
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        ContactsBook book = new ContactsBook();

        // Adding contacts
        book.addContact("Alice", "9876543210");
        book.addContact("Bob", "9123456780");
        book.addContact("Charlie", "9988776655");

        // Searching
        book.searchContact("Bob");
        book.searchContact("David");

        // Display all
        book.displayContacts();
    }
}
