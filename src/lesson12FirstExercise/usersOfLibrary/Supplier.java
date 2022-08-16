package lesson12FirstExercise.usersOfLibrary;

import lesson12FirstExercise.Book;
import lesson12FirstExercise.Librarian;

public interface Supplier {
    void giveBook(Librarian librarian, Book book);
}