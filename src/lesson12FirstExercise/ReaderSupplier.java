package lesson12FirstExercise;

import lesson12FirstExercise.usersOfLibrary.LibrarianInter;
import lesson12FirstExercise.usersOfLibrary.Reader;
import lesson12FirstExercise.usersOfLibrary.Supplier;
import lesson12FirstExercise.usersOfLibrary.User;

public class ReaderSupplier extends User implements Reader, Supplier {
    public ReaderSupplier(String name) {
        super(name);
    }

    @Override
    public void giveBook(Librarian librarianInter, Book book) {
        System.out.println("Поставщик " + this + " принес книгу " + book + " для библиотеки.\n");
    }

    @Override
    public void returnBook(LibrarianInter librarianInter, Book book) {
        System.out.println("Читатель " + this + " вернул книгу " + book + " " + librarianInter + ".\n");
    }
}
