package lesson12FirstExercise.usersOfLibrary;

public abstract class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}