package lesson19TreeMapSet;

import java.util.Scanner;

import static lesson19TreeMapSet.PhoneBook.newContact;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        MissedCalls missedCalls = new MissedCalls();

        missedContacts(phoneBook);

        try (Scanner sc = new Scanner(System.in)) {
            String userInput;
            while (true) {
                System.out.println("Введите номер или \"end\"");
                userInput = sc.nextLine();
                if ("end".equals(userInput)) {
                    break;
                }
                missedCalls.addCalls(userInput);
            }
        }

        System.out.println(missedCalls.toString(phoneBook));

    }

    private static void missedContacts(PhoneBook phoneBook) {
        phoneBook.newRecord(newContact("Клиент1", "8999"));
        phoneBook.newRecord(newContact("Клиент2", "8998"));
        phoneBook.newRecord(newContact("Клиент3", "8997"));
        phoneBook.newRecord(newContact("Клиент4", "8996"));
    }
}