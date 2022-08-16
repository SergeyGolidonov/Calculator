package lesson5;

public class Author {
    public String authorsName;

    public Author(String authorsName) {
        this.authorsName = authorsName;
    }

    public Author(){}

    @Override
    public String toString() {
        return authorsName;
    }
}