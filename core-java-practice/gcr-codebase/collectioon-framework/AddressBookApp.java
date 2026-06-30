import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

class Contact {

    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    void display() {
        System.out.println("Name  : " + name);
        System.out.println("Phone : " + phone);
        System.out.println("Email : " + email);
        System.out.println("--------------------------");
    }
}

public class AddressBookApp {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> contactMap = new HashMap<>();
    static HashSet<String> phoneNumbers = new HashSet<>();

    // Add Contact
    static void addContact(String name, String phone, String email) {

        if (phoneNumbers.contains(phone)) {
            System.out.println("Duplicate phone number! Contact not added.\n");
            return;
        }

        Contact contact = new Contact(name, phone, email);

        contacts.add(contact);
        contactMap.put(name, contact);
        phoneNumbers.add(phone);

        System.out.println("Contact added successfully.\n");
    }

    // Search Contact
    static void searchContact(String name) {

        if (contactMap.containsKey(name)) {
            System.out.println("Contact Found:");
            contactMap.get(name).display();
        } else {
            System.out.println("Contact not found.\n");
        }
    }

    // Delete Contact
    static void deleteContact(String name) {

        Contact contact = contactMap.get(name);

        if (contact == null) {
            System.out.println("Contact not found.\n");
            return;
        }

        contacts.remove(contact);
        phoneNumbers.remove(contact.phone);
        contactMap.remove(name);

        System.out.println("Contact deleted successfully.\n");
    }

    // Display Contacts (Sorted)
    static void displayContacts() {

        Collections.sort(contacts, new Comparator<Contact>() {
            @Override
            public int compare(Contact c1, Contact c2) {
                return c1.name.compareToIgnoreCase(c2.name);
            }
        });

        System.out.println("------ Address Book ------");

        for (Contact c : contacts) {
            c.display();
        }
    }

    public static void main(String[] args) {

        addContact("Mukund", "9876543210", "mukund@gmail.com");
        addContact("Rahul", "9876500000", "rahul@gmail.com");
        addContact("Aman", "9876511111", "aman@gmail.com");

        // Duplicate Phone Number
        addContact("Rohit", "9876543210", "rohit@gmail.com");

        searchContact("Rahul");

        deleteContact("Aman");

        displayContacts();
    }
}
