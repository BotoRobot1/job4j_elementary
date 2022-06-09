package ru.job4j.converter;

public class Converter {

    public static float ruToEur(float value) {
        float euro = value / 70;
        return euro;
    }

    public static float ruToDoll(float value) {
        float doll = value / 60;
        return doll;
    }

    public static void main(String[] args) {
        float euro = Converter.ruToEur(210);
        float doll = Converter.ruToDoll(180);
        System.out.println(euro + doll);
    }
}
