package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double ch1 = x2 - x1;
        double ch2 = y2 - y1;
        double rs1 = Math.pow(ch1, 2);
        double rs2 = Math.pow(ch2, 2);
        double rs3 = rs1 + rs2;
        double rsl = Math.sqrt(rs3);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        double result1 = Point.distance(12, 23, 34, 45);
        System.out.println("result (12, 23) to (34, 45) " + result1);

        double result2 = Point.distance(22, 33, 144, 155);
        System.out.println("result (22, 33) to (144, 155) " + result2);
    }
}
