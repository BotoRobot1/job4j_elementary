package ru.job4j.condition;

public class Game {
    public static void menu (String name) {
        if("Super mario".equals(name)){
            System.out.println("Start - super mario");
        }
        if("Tanks".equals(name)){
            System.out.println("Start - Tanks");
        }
        if("Tetris".equals(name)){
            System.out.println("Start - Tetris");
        }
    }

    public static void main(String[] args) {
        Game.menu("Super mario");
        Game.menu("Tanks");
        Game.menu("Tetris");
    }
}
