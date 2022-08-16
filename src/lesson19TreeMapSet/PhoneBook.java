package lesson19TreeMapSet;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    protected Map<String, Contact> phoneBook = new HashMap<>();

    public static Contact newContact(String name, String number) {
        return new Contact(name, number);
    }

    public void newRecord(Contact contact) {
        phoneBook.put(contact.getNumber(), contact);
    }

    public Contact searchingByNumber(String number) {
        return phoneBook.get(number);
    }
}