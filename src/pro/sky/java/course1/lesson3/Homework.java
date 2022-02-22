package pro.sky.java.course1.lesson3;

public class Homework {
    public static void main(String[] args) {
        // Задание 1
        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Для Вашей системы версии приложения нет.");
        }

        // Задание 2
        int clientDeviceYear = 2015;

        if (clientOS == 0 && clientDeviceYear >= 2019) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 0) {
            System.out.println("Установите lite-версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear >= 2019) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите lite-версию приложения для Android по ссылке.");
        } else {
            System.out.println("Для Вашей системы версии приложения нет.");
        }

        // Задание 3
        int year = 2021;

        if (year % 400 == 0) {
            System.out.println(year + "год - високосный.");
        } else if (year % 100 == 0) {
            System.out.println(year + "год - не високосный.");
        } else if (year % 4 == 0) {
            System.out.println(year + "год - високосный.");
        } else {
            System.out.println(year + "год - не високосный.");
        }

        // Задание 4
        int deliveryDistance = 95;

        if (deliveryDistance < 20) {
            System.out.println("Для доставки потребуются одни сутки.");
        } else if (deliveryDistance < 60) {
            System.out.println("Для доставки потребуется двое суток.");
        } else {
            System.out.println("Для доставки потребуется трое суток.");
        }

        // Задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Змма");
                break;
            default:
                System.out.println(monthNumber + " - что за несуществующий месяц?");
        }

        // Задание 6
        int age = 19;
        int salary = 58000;
        double limit;

        if (age >= 23) {
            limit = salary * 3;
        } else {
            limit = salary * 2;
        }

        if (salary > 80000) {
            limit = limit * 1.5;
        } else if (salary > 50000) {
            limit = limit * 1.2;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");

        // Задание 7
        int age2 = 25;
        double salary2 = 60000;
        double wantedSum = 330000;
        double rate = 0.1;
        double maxMonthlyPayment = salary2 / 2;

        if (age2 < 30 && age2 > 22) {
            rate = rate + 0.005;
        } else if (age2 < 23) {
            rate = rate + 0.01;
        }

        if (salary2 > 80000) {
            rate = rate - 0.007;
        }

        double sumCredit = (rate + 1) * wantedSum;
        double monthlyPayment = sumCredit / 12;
        if (maxMonthlyPayment > monthlyPayment) {
            System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + monthlyPayment + " рублей. Одобрено.");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + monthlyPayment + " рублей. Отказано.");
        }
    }
}
