package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;


public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double theNeEnd(double first, double second) {
        return subtracting(first, second) + divide(first, second);
    }

    public static double theEnd(double first, double second) {
        return sumAndMultiply(first, second) - theNeEnd(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + theNeEnd(10,20));
        System.out.println("Результат расчета равен: " + theEnd(10,20));
    }


}
