package lesson17Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static int numberOfFloor;
    public static int previousFloor = -1;
    public static int waitDoorsInSeconds = 10;
    public static int waitMoveInSeconds = 5;
    public static int totalSeconds;
    public static int totalMinutes;
    public static int resultOfTotalSeconds;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<Integer> floor = new ArrayDeque<>();

        while (true) {

            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            numberOfFloor = sc.nextInt();

            if (numberOfFloor == 0) {
                floor.offer(numberOfFloor);
                totalSeconds += Math.abs(numberOfFloor - previousFloor) * waitMoveInSeconds;
                totalSeconds += waitDoorsInSeconds;
                resultOfTotalSeconds = totalSeconds % 60;
                System.out.println("Лифт проследовал по этажам:");
                while (!floor.isEmpty()) {
                    Integer floors = floor.poll();
                    System.out.print("Этаж -> " + floors + " ");
                }
                System.out.println("\nВремя затраченное лифтом на маршрут: " + totalMinutes + " мин. " + resultOfTotalSeconds + " с.");
                if (totalMinutes > 2) {
                    System.out.println("\nКатаетесь как ребенок. На работу опоздаете.");
                }
                System.out.println("\nПрограмма завершила свою работу.\nВы приехали.");
                break;
            } else if (numberOfFloor < 0 || numberOfFloor > 25) {
                System.out.println("Такого этажа нет в доме");
            } else {
                if (previousFloor != numberOfFloor) {
                    floor.offer(numberOfFloor);
                    totalSeconds += Math.abs(numberOfFloor - previousFloor) * waitMoveInSeconds;
                    totalSeconds += waitDoorsInSeconds;
                    totalMinutes = totalSeconds / 60;
                } else {
                    System.out.println("Вы на этом этаже.");
                }
                previousFloor = numberOfFloor;
            }
        }
    }
}