package test2;

public class Main {

    public static int n = 10;

    public static char fields[][] = {
            {'Щ', '-', '-', '*', '*', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '*', '-', '*', '*', '-', '-'},
            {'-', '-', '-', '*', '-', '*', '-', '-', '-', '*'},
            {'-', '*', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '*', '-', '-', '-'},
            {'-', '-', '*', '-', '-', '*', '-', '-', '-', '-'},
            {'-', '-', '-', '*', '-', '-', '*', '*', '*', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '*', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '*', '-', '-'},
            {'-', '-', '-', '-', '-', '*', '*', '-', '-', '-'}
    };

    public static char memory[][];

    public static void main(String[] args) {
        for (char[] field : fields) {
            System.out.println(field);
        }
    }

    public static String findPath(char field[][], int x0, int y0) {
        boolean path[][] = new boolean[10][10];
        int x = x0;
        int y = y0;

        while (x != 0 && y != 0) {
            char direction = whereFrom(field, x, y, memory);
            if (direction == 'N') {
                return "Нет такого пути";
            } else if (direction == 'U') {
                y -= 1;
            } else if (direction == 'L') {
                x -= 1;
            }
        }

        for (y = 0; y < 10; y++) {
            for (x = 0; x < 10; x++) {
                if (x == x0 && y == y0) {
                    System.out.println('Ч');
                } else if (path[x][y]) {
                    System.out.println('x');
                } else {
                    System.out.println(field[x][y]);
                }
            }
        }
        return "";
    }

    public static char whereFrom(char field[][], int x, int y, char memory[][]) {
        if (memory[x][y] != '-') {
            return memory[x][y];
        }

        if (x > 0) {
            int leftX = x - 1;
            int leftY = y;
            if (leftX == 0 && leftY == 0) {
                memory[x][y] = 'L';
                return 'L';
            }
            if (field[leftX][leftY] != '*') {
                if (whereFrom(field, leftX, leftY, memory) != 'N') {
                    memory[x][y] = 'L';
                    return 'L';
                }
            }
        }

        if (y > 0) {
            int upX = x;
            int upY = y - 1;
            if (upX == 0 && upY == 0) {
                memory[x][y] = 'U';
                return 'U';
            }
            if (field[upX][upY] != '*') {
                if (whereFrom(field, upX, upY, memory) != 'N') {
                    memory[x][y] = 'U';
                    return 'U';
                }
            }
        }
        memory[x][y] = 'N';
        return 'N';
    }
}