package lesson12FirstExercise;

public class Book {
    private final String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}