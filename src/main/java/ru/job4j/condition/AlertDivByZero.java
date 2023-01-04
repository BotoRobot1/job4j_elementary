package ru.job4j.condition;

import javax.crypto.spec.PSource;

public class AlertDivByZero {
    public static void possibleDiv (int number){
        if(number == 0){
            System.out.println("Could not div by 0.");
        }
        if(number > 0){
            System.out.println("ЭТО НЕ НОЛЬ!!!");
        }
        if(number < 0){
            System.out.println("This is negative number");
        }
    }

    public static void main(String[] args) {
        AlertDivByZero.possibleDiv(0);
        AlertDivByZero.possibleDiv(-4);
        AlertDivByZero.possibleDiv(1);
        ;
    }
}
