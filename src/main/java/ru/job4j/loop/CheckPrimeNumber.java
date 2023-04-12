package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
         if (number == 2 || number == 3)
             System.out.println(prime);
        else if (number > 1  && number % 2 != 0 && number % 3 != 0)
             System.out.println(prime);
        else prime = false;
        return prime;
    }



    public static void main(String[] args) {
       boolean b = check(197);

    }
}
