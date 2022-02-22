package pro.sky.java.course1.lesson6;

import java.util.Locale;

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
    }

    static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println(fullName);
    }

    static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        String fullNameFormat = fullName.toUpperCase();

        System.out.println("Данные ФИО сотрудника для заполнения отчета – " + fullNameFormat);
    }

    static void task3() {
        String fullName = "Ivanov Ivan Ivanovich";
        String fullNameFormat = fullName.replace(" ", ";");

        System.out.println("Данные ФИО сотрудника для административного отдела – " + fullNameFormat);
    }

    static void task4() {
        String fullName = "Иванов Семён Семёнович";
        String fullNameFormat = fullName.replace("ё", "е");

        System.out.println("Данные ФИО сотрудника – " + fullNameFormat);
    }

    static void task5() {
        String fullName = "Ivanov Ivan Ivanovich";
        String firstName = fullName.substring(fullName.indexOf(' ')).substring(0, fullName.indexOf(' '));
        String middleName = fullName.substring(0, fullName.indexOf(' '));
        String lastName = fullName.substring(fullName.indexOf(' ')).substring(fullName.indexOf(' '));

        System.out.println("Имя сотрудника – " + firstName);
        System.out.println("Фамилия сотрудника – " + middleName);
        System.out.println("Отчество сотрудника – " + lastName);
    }

    static void task6() {
        String fullName = "ivanov ivan ivanovich";
        String fullNameFormat;

        char[] mass = fullName.toCharArray();
        mass[0] = Character.toUpperCase(mass[0]);
        fullNameFormat = "" + mass[0];

        for (int i = 1; i < mass.length; i++) {
            if (mass[i - 1] == ' ') {
                mass[i] = Character.toUpperCase(mass[i]);
            }
            fullNameFormat = fullNameFormat + mass[i];
        }

        System.out.println("Верное написание ФИО сотрудника с заглавных букв – " + fullNameFormat);
    }

    static void task7() {
        String first = "135";
        String second = "246";
        String stringCombo = "";

        char[] firstMass = first.toCharArray();
        char[] secondMass = second.toCharArray();

        for (int i = 0; i < firstMass.length; i++) {
            stringCombo = stringCombo + firstMass[i] + secondMass[i];
        }
        System.out.println("Данные строки – " + stringCombo);
    }

    static void task8() {
        String string = "aabccddefgghiijjkk";
        String stringDuplic = "";
        char[] mass = string.toCharArray();

        for (int i = 1; i < mass.length; i++) {
            if (mass[i] == mass[i - 1]) {
                stringDuplic = stringDuplic + mass[i];
            }
        }
        System.out.println(stringDuplic);
    }
}
