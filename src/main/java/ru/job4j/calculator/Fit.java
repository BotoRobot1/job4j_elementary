package ru.job4j.calculator;

public class Fit {
    public static double vesMj(int x) {
        double result = x * 1.10 - 100;
        return result;

    }

    public static double vesJn(int x) {
        double res2 = x * 1.10 - 110;
        return res2;
    }

    public static void main(String[] args) {

        double man = Fit.vesMj(187);
        double wman = Fit.vesJn(170);
        System.out.println("Вес мужчины при росте 187 см - " + man);
        System.out.println("Вес женщины при росте 170 см - " + wman);
    }
}
