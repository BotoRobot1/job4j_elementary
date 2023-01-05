package ru.job4j.condition;

public class ProPer {
    public static void proba(int a, int b, int c) {
        if (a > b){
            if (a > c) {
                System.out.println(a);
            }
            else {
                System.out.println(c);
            }
        }
        else {
            if(b > c){
                System.out.println(b);
            }
            else {
                System.out.println(c);
            }
        }



    }

    public static void main(String[] args) {
        ProPer.proba(1024, 445, 636);
    }
}
