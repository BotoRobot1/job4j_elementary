package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short x) {
        double resultM = (x - 100) * 1.15;
        return resultM;
    }
    public static double womanWeight(short y) {
        double resultJ = (y - 110) * 1.15;
        return resultJ;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);
    }

}
