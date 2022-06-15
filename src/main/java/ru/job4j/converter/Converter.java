package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float euro = value / 70;
        return euro;
    }

    public static float rubleToDollar(float value) {
        float doll = value / 60;
        return doll;
    }

    public static void main(String[] args) {

        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);


    }
}
