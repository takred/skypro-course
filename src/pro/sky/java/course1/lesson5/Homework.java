package pro.sky.java.course1.lesson5;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    static void task1() {
        int[] mass = generateRandomArray();
        int sum = 0;

        for (int i = 0; i < mass.length; i++) {
            sum = sum + mass[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    static void task2() {
        int[] mass = generateRandomArray();
        int minSum = mass[0];
        int maxSum = mass[0];

        for (int i = 1; i < mass.length; i++) {
            if (minSum > mass[i]) {
                minSum = mass[i];
            }
            if (maxSum < mass[i]) {
                maxSum = mass[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей." +
                "\nМаксимальная сумма трат за день составила " + maxSum + " рублей.");
    }

    static void task3() {
        int[] mass = generateRandomArray();
        int sum = 0;
        double middleSum;

        for (int i = 0; i < mass.length; i++) {
            sum = sum + mass[i];
        }
        middleSum = sum / 30d;
        System.out.println("Средняя сумма трат за месяц составила " + middleSum + " рублей.");
    }

    static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i > -1; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }

    static void task5() {
        int[][] matrix = new int[3][3];
        boolean write = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (write) {
                    matrix[i][j] = 1;
                }
                write = !write;
            }
        }


        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    static void task6() {
        int[] mass = new int[] {5, 4, 3, 2, 1};
        int[] massRevers = new int[5];

        System.out.println(Arrays.toString(mass));

        for (int i = 0; i < mass.length; i++) {
            massRevers[i] = mass[mass.length - (i + 1)];
        }
        System.out.println(Arrays.toString(massRevers));
    }

    static void task7() {
        int[] mass = new int[] {5, 4, 3, 2, 1};
        int saver;

        System.out.println(Arrays.toString(mass));

        for (int i = 0; i < mass.length / 2; i++) {
            saver = mass[i];
            mass[i] = mass[(mass.length - i) - 1];
            mass[(mass.length - i) - 1] = saver;
        }
        System.out.println(Arrays.toString(mass));
    }

    static void task8() {
        int[] mass = new int[]{-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        boolean brakeCycle = false;

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                if (i != j && mass[i] + mass[j] == -2) {
                    System.out.println(mass[i] + " и " + mass[j]);
                    brakeCycle = true;
                    break;
                }
            }
            if (brakeCycle) {
                break;
            }
        }
    }

    static void task9() {
        int[] mass = new int[]{-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                if (i != j && mass[i] + mass[j] == -2) {
                    System.out.println(mass[i] + " и " + mass[j]);
                }
            }
        }
    }
}
