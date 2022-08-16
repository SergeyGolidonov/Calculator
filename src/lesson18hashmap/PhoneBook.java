package lesson18hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    protected Map<String, List<Contact>> phoneBook = new HashMap<>();

    public static Contact newContact(String name, int number) {
        return new Contact(name, number);
    }

    public void newGroup(String groupName) {
        if (phoneBook.containsKey(groupName)) {
            return;
        }
        phoneBook.put(groupName, new ArrayList<>());
    }

    public void newRecord(Contact contact, String... groupNames) {
        for (String groupName : groupNames) {
            if (!phoneBook.containsKey(groupName)) {
                return;
            }
            phoneBook.get(groupName).add(contact);
        }
    }

    public List<Contact> searchingByGroup(String groupName) {
        return new ArrayList<>(phoneBook.get(groupName));
    }

    public Contact searchingByNumber(int number) {
        for (List<Contact> listRecord : phoneBook.values()) {
            for (Contact record : listRecord) {
                if (record.getNumber() == number) {
                    return record;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<Contact>> group : phoneBook.entrySet()) {
            sb.append(group.getKey());
            sb.append("\n");
            for (Contact contact : group.getValue()) {
                sb.append("\t");
                sb.append(contact);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}