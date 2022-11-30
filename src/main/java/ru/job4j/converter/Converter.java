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


    }
}
