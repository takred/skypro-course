package pro.sky.java.course1.lesson4;

public class Homework {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    static void task1() {
        int i = 0;
        while (i < 10) {
            System.out.print(i + 1 + " ");
            if (i == 9) {
                System.out.println();
            }
            i++;
        }

        for (; i > 0; i--) {
            System.out.print(i + " ");
            if (i == 1) {
                System.out.println();
            }
        }
    }

    static void task2() {
        int firstFridayOfTheMonth = 3;

        for (int i = firstFridayOfTheMonth; i <= 31; i++) {
            if ((i - firstFridayOfTheMonth) % 7 == 0) {
                System.out.println("Сегодня пятница," + i + "-ое число. Необходимо подготовить отчет.");
            }
        }
    }

    static void task3() {
        int currentYear = 2021;
        int yearsBefore = currentYear - 200;
        int yearsLater = currentYear + 100;

        for (; yearsBefore <= yearsLater; yearsBefore++) {
            if (yearsBefore % 79 == 0) {
                System.out.println(yearsBefore);
            }
        }
    }

    static void task4() {
        String ping = "ping";
        String pong = "pong";

        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": " + ping + " " + pong);
            } else if (i % 3 == 0) {
                System.out.println(i + ": " + ping);
            } else if (i % 5 == 0) {
                System.out.println(i + ": " + pong);
            } else {
                System.out.println(i + ":");
            }
        }
    }

    static void task5() {
        int num1 = 0;
        int num2 = 1;
        int sum;

        System.out.print(num1 + " " + num2);
        for (int i = 0; i < 8; i++) {
            sum = num1 + num2;
            System.out.print(" " + sum);
            if (i % 2 == 0) {
                num1 = sum;
            } else {
                num2 = sum;
            }
        }
    }
}
