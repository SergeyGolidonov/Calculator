package lesson13Exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        User currentUser = getUserByLoginAndPassword(login, password);
        validateUser(currentUser);

        System.out.println("Доступ предоставлен");
    }

    public static User[] getUsers() {
        User user1 = new User("Kvazimodo", "cucumber", 18, "a@a.com");
        User user2 = new User("Kvaz", "cucu", 17, "a@a.com");
        return new User[]{user1, user2};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (login.equals(user.login) && password.equals(user.password)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static User validateUser(User user) throws AccessDeniedException {
        User[] users = getUsers();
        for (User user1 : users) {
            if (user.age >= 18) {
                return user1;
            }
        }
        throw new AccessDeniedException("Доступ закрыт. Мало лет.");
    }
}