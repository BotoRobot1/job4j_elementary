package ru.job4j.condition;

public class Cinema {
    public static void porn(int ege){
        System.out.println("Желающему глянуть фильмец : " + ege + " лет");
        if(ege >= 18){
            System.out.println("Тащи из заначки билеты на клубничку");
        }
        else {
            System.out.println("Предложи мальцу глянуть мультики");
        }
    }

    public static void main(String[] args) {
        porn(17);
        porn(18);
    }
}
