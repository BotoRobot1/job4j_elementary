package ru.job4j.condition;

public class Max {
    public static int max(int left, int right){
        int result = left > right ? left : right;
        return result;
    }

    public static void main(String[] args) {
       int a = Max.max(112, 224);
        System.out.println(a);
        int b = Max.max(12, 12);
        System.out.println(b);

}}
