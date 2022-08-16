package lesson9Arrays;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int SIZE = 8;
    public static int mat;
    public static int[][] colors = new int[SIZE][SIZE];
    public static int[][] rotatedColors = new int[SIZE][SIZE];

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                colors[i][j] = rnd.nextInt(256);
            }
        }

        System.out.println("Дана матрица:");
        printArray(colors);

        System.out.println("Для разворота матрицы введите число кратное 90.");
        System.out.println("Матрица развернется на 90, 180 или 270 градусов.");

        String str = sc.nextLine();
        mat = Integer.parseInt(str) / 90;
        while (mat > 0) {
            rotateColors(colors);
            copyArrays(rotatedColors);
            mat--;
        }

        System.out.println("Матрица перевернута на " + str + "°");
        System.out.println();
        printArray(colors);
    }

    // Метод выводит в консоль матрицу (двумерный массив)
    public static void printArray(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.format("%4d", ints[j]);
            }
            System.out.println();
        }
    }

    // Метод копирует массив
    public static void copyArrays(int[][] arrayCopy) {
        for (int i = 0; i < SIZE; i++) {
            System.arraycopy(rotatedColors[i], 0, colors[i], 0, SIZE);
        }
    }

    // Метод поворачивает значения матрицы на 90°
    public static void rotateColors(int[][] matrix) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors[j][SIZE - (i + 1)] = matrix[i][j];
            }
        }
    }
}