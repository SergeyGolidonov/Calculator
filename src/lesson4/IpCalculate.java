package lesson4;

import java.util.Scanner;

public class IpCalculate {
    public static int earnings = 0;
    public static int spendings = 0;
    public static String exit = "end";
    public static String input;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    Выберете операцию и введите её номер:
                    1. Добавить сумму дохода
                    2. Добавить сумму расхода
                    3. Выбрать систему налогообложения
                                                    \s
                    *** Наберите end для выхода из программы. ***""");
            input = sc.nextLine();
            if (exit.equals(input)) {
                System.out.println("Программа завершила свою работу! До свидания!");
                break;
            }

            int operation = Integer.parseInt(input);

            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    String moneyEar = sc.nextLine();
                    int moneyE = Integer.parseInt(moneyEar);
                    if (moneyE >= 0) {
                        earnings += moneyE;
                        break;
                    } else {
                        System.out.println("Вы ввели отрицательное значение.");
                    }
                    break;
                case 2:
                    System.out.println("Введите сумму расходов:");
                    String moneySpa = sc.nextLine();
                    int moneyS = Integer.parseInt(moneySpa);
                    if (moneyS >= 0) {
                        spendings += moneyS;
                        break;
                    } else {
                        System.out.println("Вы ввели отрицательное значение, либо не число.");
                    }
                    break;
                case 3:
                    System.out.println("Выбрать систему налогообложения.");
                    int fix15 = taxEarningsMinusSpendings(earnings, spendings);
                    int fix6 = taxEarningsFix6(earnings);
                    int profit;
                    if (fix6 > fix15) {
                        profit = fix6 - fix15;
                        System.out.println();
                        if (profit <= 0) {
                            System.out.println("Доход равен 0 либо расходы превысили доходы. Пересмотрите стратегию.");
                            System.out.println();
                            break;
                        } else {
                            System.out.println("*******************************************");
                            System.out.println("Мы рекомендуем УСН доходы минус расходы");
                            System.out.println("Ваш налог составит " + fix15 + " руб.");
                            System.out.println("Налог на другой системе составит " + fix6 + " руб.");
                            System.out.println();
                        }
                    } else {
                        profit = fix15 - fix6;
                        System.out.println();
                        if (profit <= 0) {
                            System.out.println("Доход равен 0 либо расходы превысили доходы. Пересмотрите стратегию.");
                            System.out.println();
                            break;
                        } else {
                            System.out.println("*******************************************");
                            System.out.println("Мы рекомендуем УСН доходы");
                            System.out.println("Ваш налог составит " + fix6 + " руб.");
                            System.out.println("Налог на другой системе составит " + fix15 + " руб.");
                            System.out.println();
                        }
                    }
                    System.out.println("Ваша выгода: " + profit + " руб.");
                    System.out.println();
                    break;
                default:
                    System.out.println("Вы ввели не корректные данные!");
            }
        }
    }

    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            System.out.println("Доход не может быть отрицательным.");
            return 0;
        }
    }

    public static int taxEarningsFix6(int earnings) {
        int tax = earnings * 6 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            System.out.println("Доход не может быть отрицательным.");
            return 0;
        }
    }
}