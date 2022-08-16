package lesson18hashmap;

import java.util.Objects;

public class Contact {
    protected String name;
    protected int number;

    public Contact(String name, int number) {
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
        return getNumber() == contact.getNumber() && name.equals(contact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, getNumber());
    }

    public int getNumber() {
        return number;
    }
}