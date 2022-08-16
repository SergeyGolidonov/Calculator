package lesson12FirstExercise.usersOfLibrary;

import lesson12FirstExercise.Book;

public interface Administrator {
    void lateNotice(Reader reader, Book book);

    void takeBook(Reader reader, Book book);
}