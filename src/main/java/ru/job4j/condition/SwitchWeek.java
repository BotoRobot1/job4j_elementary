package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day){
        String name;
        switch (day){
            case 1:
                name = "Monday";
                break;
            case 2:
                name = "Tuesday";
                break;
            case 3:
                name = "Wednesday";
            case 4:
                name = "Thursday";
                break;
            case 5:
                name = "Friday";
                break;
            case 6:
                name = "Saturday";
            case 7:
                name = "Sunday";
            default:
                name = "Ошибка";
                break;
        } return name;
    }
}
