package pro.sky.java.course1.lesson2;

public class Homework {
    public static void main(String[] args) {
        // Задача 1
        byte a = 1;
        short b = 1;
        int c = 1;
        long d = 123L;
        float e = 12.3F;
        double f = 12.6;

        // Задача 2
        float firstFighter = 78.2F;
        float secondFighter = 82.7F;

        float totalWeight = firstFighter + secondFighter;
        System.out.println("Общий вес бойцов : " + totalWeight + "кг");

        float differenceWeight = secondFighter % firstFighter;
        System.out.println("Разница в весе составляет : " + differenceWeight + "кг");

        // Задача 3
        byte bananas = 5;
        byte bananaWeight = 80;
        short milk = 200;
        float milkWeightInGrams = 1.05F;
        byte iceCreams = 2;
        byte iceCreamWeight = 100;
        byte eggs = 4;
        byte eggWeight = 70;
        float totalMassBlendInGrams = (bananas * bananaWeight) + (milk * milkWeightInGrams) + (iceCreams * iceCreamWeight) + (eggs * eggWeight);
        float totalMassBlendInKilograms = totalMassBlendInGrams / 1000;
        System.out.println("Масса всей смеси : " + totalMassBlendInKilograms + "кг");

        // Задача 4
        short weightLossMin = 250;
        short weightLossMax = 500;
        float targetWeight = 7000f;

        float daysWithMinimalWeightLoss = targetWeight / weightLossMin;
        System.out.println(daysWithMinimalWeightLoss + " дней потребуется, если худеть на " + weightLossMin + " грамм в день.");

        float daysWithMaximumWeightLoss = targetWeight / weightLossMax;
        System.out.println(daysWithMaximumWeightLoss + " дней потребуется, если худеть на " + weightLossMax + " грамм в день.");

        float daysWithAverageWeightLoss = (daysWithMinimalWeightLoss + daysWithMaximumWeightLoss) / 2;
        System.out.println(daysWithAverageWeightLoss + " дней в среднем потребуется для похудения.");

        // Задача 5
        float incomeMashaOld = 67760F;
        float incomeMashaNew = incomeMashaOld * 1.1F;
        float incomeDifferenceMasha = incomeMashaNew - incomeMashaOld;
        System.out.println("Маша теперь получает " + incomeMashaNew + " рублей. Годовой доход вырос на " + (incomeDifferenceMasha * 12) + " рублей");

        float incomeDenisOld = 83690F;
        float incomeDenisNew = incomeDenisOld * 1.1F;
        float incomeDifferenceDenis = incomeDenisNew - incomeDenisOld;
        System.out.println("Денис теперь получает " + incomeDenisNew + " рублей. Годовой доход вырос на " + (incomeDifferenceDenis * 12) + " рублей");

        float incomeKristinaOld = 76230F;
        float incomeKristinaNew = incomeKristinaOld * 1.1F;
        float incomeDifferenceKristina = incomeKristinaNew - incomeKristinaOld;
        System.out.println("Кристина теперь получает " + incomeKristinaNew + " рублей. Годовой доход вырос на " + (incomeDifferenceKristina * 12) + " рублей");

        // Задача 6
        int aa = 12;
        int bb = 27;
        int cc = 44;
        int dd = 15;
        int ee = 9;
        int result = aa * (bb + (cc - dd * ee));
        System.out.println(-result);

        // Задача 7
        int aaa = 5;
        int bbb = 7;
        aaa = bbb;
        bbb = (bbb + bbb + bbb + bbb + bbb) / bbb;

        // Задача 8
        int aaaa = 349;
        int bbbb = (aaaa / 10) % 10;
    }
}

