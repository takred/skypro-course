package pro.sky.java.course1.lesson7;


import java.time.LocalDate;
import java.util.Arrays;

public class Homework {

    public static void forTask1(int year) {
        if (year % 400 == 0) {
            System.out.println(year + " - високосный год.");
        } else if (year % 100 == 0) {
            System.out.println(year + " - не високосный год.");
        } else if (year % 4 == 0) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год.");
        }
    }

    public static void forTask2(int clientOS, int clientDeviceYear)  {
        int currentYear = LocalDate.now().getYear();

        if (clientOS == 0 && clientDeviceYear > currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 0) {
            System.out.println("Установите lite-версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear > currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите lite-версию приложения для Android по ссылке.");
        } else {
            System.out.println("Для Вашей системы версии приложения нет.");
        }
    }

    public static int forTask3(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance < 60) {
            return 2;
        } else {
            return 3;
        }
    }

    public static void forTask4(String string) {
        char[] mass = string.toCharArray();

        for (int i = 1; i < mass.length; i++) {
            if (mass[i] == mass[i - 1]) {
                System.out.println("В строке дублируется символ - " + mass[i]);;
                return;
            }
        }
        System.out.println("В строке нет дублирования символов.");
    }

    public static void forTask5(int[] mass) {
        int saver;

        for (int i = 0; i < mass.length / 2; i++) {
            saver = mass[i];
            mass[i] = mass[(mass.length - i) - 1];
            mass[(mass.length - i) - 1] = saver;
        }
    }

    public static double forTask6(int[] mass) {
        int sum = sum(mass);

        return middleSum(sum);
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static int sum(int[] mass) {
        int sum = 0;

        for (int i = 0; i < mass.length; i++) {
            sum = sum + mass[i];
        }
        return sum;
    }

    public static double middleSum(int sum) {
        return sum / 30d;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {
        forTask1(2022);
    }

    public static void task2() {
        forTask2(1, 2021);
    }

    public static void task3() {
        int deliveryDays = forTask3(57);

        if (deliveryDays > 1) {
            System.out.println("Для доставки потребуется " + deliveryDays + " дня.");
        } else {
            System.out.println("Для доставки потребуется 1 день.");
        }
    }

    public static void task4() {
        String string = "aabccddefgghiijjkk";
        forTask4(string);
    }

    public static void task5() {
        int[] mass = new int[] {3, 2, 1, 6, 5};

        forTask5(mass);
    }

    public static void task6() {
        int[] mass = generateRandomArray();

        double middleSum = forTask6(mass);

        System.out.println("Средняя сумма трат за месяц составила " + middleSum + " рублей.");
    }
}
