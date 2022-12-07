package ru.job4j.converter;

public class Converter {
    public static float rublesToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rublesToDollars(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float euro = Converter.rublesToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollars = Converter.rublesToDollars(210);
        System.out.println("210 rubles are " + dollars + " dollars.");
        System.out.println("\n" + "Результаты проверки - 1:");

        float in = 140;
        float ecspectedEuro = 2;
        float outEuro = Converter.rublesToEuro(in);
        boolean resultTestEuro = ecspectedEuro == outEuro;
        System.out.println("140 rubles are 2. Test result: " + resultTestEuro);
        System.out.println("\n" + "Результаты проверки - 2:");

        float rub = 180;
        float expectrdDoll = 3;
        float outDoll = Converter.rublesToDollars(rub);
        boolean resultTestDollars = expectrdDoll == outDoll;
        System.out.println("Результат конвертации 180 рублей в 3 доллара: " + resultTestDollars);



    }
}
