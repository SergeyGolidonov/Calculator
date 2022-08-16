package lesson19TreeMapSet;

import java.util.Objects;

public class Contact {
    protected String name;
    protected String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Имя: " + name + "; Номер телефона: " + number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return name.equals(contact.name) && getNumber().equals(contact.getNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, getNumber());
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}