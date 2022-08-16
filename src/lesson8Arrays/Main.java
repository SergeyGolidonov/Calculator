package lesson8Arrays;

import java.util.Scanner;

public class Main {

    public static String input;
    public static String exit = "end";
    public static int productNumber;
    public static int productCount;
    public static int sumProducts;
    public static int sumOfTheBasket;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] products = {"Сахар", "Молоко", "Гречка", "Картошка за 1кг"};
        int[] prices = {100, 50, 57, 35};
        int[] newProducts = new int[4];
        int[] newBasket = new int[4];

        while (true) {
            System.out.println("Товары нашего магазина:");
            for (int i = 0; i < products.length; i++) {
                System.out.println((i + 1) + ". " + products[i] + " = " + prices[i] + " руб/шт.");
            }
            System.out.println("*******************************************************");
            System.out.println("Введите номер товара и количество через пробел либо 'end' для завершения программы.");

            input = sc.nextLine();
            if (exit.equals(input)) {
                System.out.println("Программа завершена");
                System.out.println("Ваша корзина: ");
                break;
            }

            String[] parts = input.split(" ");

            productNumber = Integer.parseInt(parts[0]) - 1;
            productCount = Integer.parseInt(parts[1]);

            sumOfTheBasket = prices[productNumber];

            newBasket[productNumber] += sumOfTheBasket * productCount;
            newProducts[productNumber] += productCount;

            sumProducts += prices[productNumber] * productCount;

        }

        System.out.printf("|%-10s | %-10s | %-10s | %-10s |%n", "Наименование товара ", " Количество ", " Цена за ед. ", " Общая стоимость");
        for (int j = 0; j < products.length; j++) {
            if (newProducts[j] != 0) {
                System.out.printf("|%-1s. %-17s | %-12s | %-13s | %-16s |%n", (j + 1), products[j], newProducts[j], prices[j], newBasket[j]);
            }
        }
        System.out.printf("%-40s %-10s", "", "Общая сумма покупок: " + sumProducts);
    }
}