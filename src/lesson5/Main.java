package lesson5;

public class Main {
    public static void main(String[] args) {
        System.out.println("******************************************************************");
        Book book = new Book("Война и мир", new Author("Толстой"), 1500, 1863, 1043);
        System.out.println(book);
        System.out.println("******************************************************************");

        if (book.howManyPagesRead()) {
            System.out.println("Вы не закончили читать книгу.");
        } else {
            System.out.println("Вы закончили читать книгу.");
        }

        System.out.println("******************************************************************");

        User user1 = new User("Anton", "Frolov", "anton@mail.ru");
        User user2 = new User("Anton", "Frolov", "anton@mail.ru");
        User user3 = new User("Anton", "Frolov", "anton@mail.ru");
        User user4 = new User("Anton", "Frolov", "anton@mail.ru");
        User user5 = new User("Anton", "Frolov", "anton@mail.ru");

        System.out.println("Количество пользователей online: " + User.getCountOfUsers() + ";");
    }
}