package lesson12FirstExercise;

import lesson12FirstExercise.usersOfLibrary.*;
import lesson12FirstExercise.usersOfLibrary.LibrarianInter;

public class AdminOfLibrary extends User implements Administrator, LibrarianInter {
    public AdminOfLibrary(String name) {
        super(name);
    }

    @Override
    public void lateNotice(Reader reader, Book book) {
        System.out.println("Администратор " + this + " предупредил " + reader + " о просрочке взятой книги: " + book + ".\n");
    }

    @Override
    public void takeBook(Reader reader, Book book) {
        System.out.println("Библиотекарь " + this + " выдал книгу " + book + " читателю: " + reader + ".\n");
    }

    @Override
    public void orderBook(Supplier supplier, Book book) {
        System.out.println("Библиотекарь " + this + " заказал книгу " + book + " у поставщика: " + supplier + ".\n");
    }
}