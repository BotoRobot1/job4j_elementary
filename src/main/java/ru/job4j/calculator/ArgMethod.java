package ru.job4j.calculator;

public class ArgMethod {

    public static void hello(String name) {
        System.out.println("Привет мужик, " + name);
    }

    public static void main(String[] args) {
        String name = "Мужитский Бро";
        ArgMethod.hello(name);
    }
}
