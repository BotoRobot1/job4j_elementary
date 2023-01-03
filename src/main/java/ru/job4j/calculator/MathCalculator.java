package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMuitiplay(double first, double second) {
        return sum(first, second) + multiplay(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Result: " + sumAndMuitiplay(10, 20));
    }
}
