package lesson16List;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String input;
    public static String exit = "0";
    public static String addDeals;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> deals = new ArrayList<>();

        while (true) {
            System.out.println("""
                    Выберете действие:
                    1. Добавить задачу
                    2. Вывести список задач
                    3. Удалить задачу
                    4. Очистить список задач
                    0. Выход
                    """);
            input = sc.nextLine();

            if (exit.equals(input)) {
                System.out.println("Программа завершила работу!");
                break;
            }

            int operation = Integer.parseInt(input);

            switch (operation) {
                case 1:
                    System.out.println("\nНапишите наименование задачи: ");
                    addDeals = sc.nextLine();
                    deals.add(addDeals);
                    break;
                case 2:
                    if (deals.isEmpty()) {
                        System.out.println("\nСписок задач пуст, добавьте задачу.\n");
                    } else {
                        for (int i = 0; i < deals.size(); i++) {
                            String deal = deals.get(i);
                            System.out.println((i + 1) + ": " + deal);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    if (!deals.isEmpty()) {
                        System.out.println("Введите номер задачи: ");
                        input = sc.nextLine();
                        int number = Integer.parseInt(input) - 1;
                        deals.remove(number);
                        System.out.println("Задача удалена.\n");
                    } else {
                        System.out.println("Список пуст. Удалять нечего.\n");
                    }
                    break;
                case 4:
                    if (!deals.isEmpty()) {
                        deals.clear();
                        System.out.println("Список очищен.\n");
                    } else {
                        System.out.println("Список совсем пуст.\n");
                    }
                    break;
                default:
                    System.out.println("Вы ввели не корректные данные.\n");
            }
        }
    }
}