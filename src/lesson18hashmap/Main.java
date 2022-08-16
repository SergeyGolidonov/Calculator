package lesson18hashmap;

import java.util.List;
import static lesson18hashmap.PhoneBook.newContact;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        addGroups(phoneBook);
        addContacts(phoneBook);

        System.out.println(phoneBook);

        System.out.println("\nВсе контакты группы 'Семья':\n");
        List<Contact> family = phoneBook.searchingByGroup("Семья");
        for (Contact contact : family) {
            System.out.println(contact);
        }

        System.out.println("\nПоиск по номеру контакта '8925':\n");
        Contact searchNum = phoneBook.searchingByNumber(8925);
        System.out.println(searchNum);
    }

    private static void addGroups(PhoneBook phoneBook) {
        phoneBook.newGroup("Работа");
        phoneBook.newGroup("Друзья");
        phoneBook.newGroup("Семья");
    }

    private static void addContacts(PhoneBook phoneBook) {
        phoneBook.newRecord(newContact("Феофан", 8925), "Семья", "Работа");
        phoneBook.newRecord(newContact("Кирилл", 8916), "Друзья", "Работа");
        phoneBook.newRecord(newContact("Мефодий", 8925), "Семья", "Работа");
        phoneBook.newRecord(newContact("Оксана", 8915), "Друзья", "Работа");
        phoneBook.newRecord(newContact("Варвара", 8926), "Семья", "Друзья");
    }
}