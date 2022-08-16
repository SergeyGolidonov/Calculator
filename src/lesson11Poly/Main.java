package lesson11Poly;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player player = new Player();
        System.out.format("У игрока %d слотов с оружием,"
                + " введите номер, чтобы выстрелить,"
                + " -1 чтобы выйти%n", player.getSlotsCount());
        int slot;

        while (true) {
            System.out.println("Введите номер для выбора оружия или -1 для выхода");
            slot = sc.nextInt();
            if (slot == -1) {
                break;
            }
            player.shotWithWeapon(slot);
        }
        System.out.println();
        System.out.println("Game over!");
    }
}