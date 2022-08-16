package lesson5;

public class User {
    public static int count;
    public String firstName;
    public String secondName;
    public String email;

    public User(String firstName, String secondName, String email) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        count++;
    }

    public static int getCountOfUsers() {
        return count;
    }

    @Override
    public String toString() {
        return "Имя пользователя " + firstName +
                ", Фамилия пользователя " + secondName +
                ", Электронная почта пользователя" + email;
    }
}