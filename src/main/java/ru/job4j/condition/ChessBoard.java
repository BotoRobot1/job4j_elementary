package ru.job4j.condition;

public class ChessBoard {

    public static int way (int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if(isValid(x1) && isValid(y1) && isValid(x2) && isValid(y2)) {
            if(Math.abs(x2 - x1) == Math.abs(y2 - y1)){
                rsl = Math.abs(x2 - x1);
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(way(6,7,0,1));
    }
    private static boolean isValid(int b){
      return   b >=0 && b <=7;
    }
}
