package lesson12FirstExercise;

import lesson12FirstExercise.usersOfLibrary.LibrarianInter;
import lesson12FirstExercise.usersOfLibrary.Supplier;
import lesson12FirstExercise.usersOfLibrary.User;

public class Librarian extends User implements LibrarianInter {
    public Librarian(String name) {
        super(name);
    }

    @Override
    public void orderBook(Supplier supplier, Book book) {
        System.out.println("Библиотекарь " + this + " заказал книгу " + book + " у поставщика: " + supplier + ".\n");
    }
}