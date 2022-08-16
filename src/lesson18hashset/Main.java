package lesson18hashset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static String putter;
    public static String exit = "end";
    public static String nameOfStudent;
    public static String group;
    public static String id;

    public static void main(String[] args) {
        Set<Student> setStudents = new HashSet<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");
            putter = sc.nextLine();
            if (putter.equals(exit)) {
                System.out.println("Программа завершила свою работу.");
                System.out.println("Список студентов:");
                for (Student student : setStudents) {
                    System.out.println("    -" + student);
                }
                break;
            }

            String[] name = putter.split(", ");
            nameOfStudent = name[0];
            group = name[1];
            id = name[2];

            if (!setStudents.add(new Student(nameOfStudent, group, id))) {
                System.out.println("Студент с таким id уже существует.\n");
            }
        }
    }
}