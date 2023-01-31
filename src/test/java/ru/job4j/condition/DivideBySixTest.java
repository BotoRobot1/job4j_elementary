package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideBySixTest {

    @Test
    void whencheckNumber() {
        int in = 24;
        String rsl = DivideBySix.checkNumber(in);
        String expected = "The number divides by 6.";
        rsl.equals(expected);
    }
    @Test
    void whenNumberDivideBy3AndNotEven() {
        int in = 9;
        String rsl = DivideBySix.checkNumber(in);
        String expected = "The number divides by 3, but it isn't the even number.";
        rsl.equals(expected);
    }

    @Test
    void whenNumberNoDivideBy3AndEven(){
        int in = 14;
        String rsl = DivideBySix.checkNumber(in);
        String expected = "The number doesn't divide by 3, but it is the even number.";
        rsl.equals(expected);
    }

    @Test
    void whenNumberNoDivideBy3AndNotEven(){
        int in = 25;
        String rsl = DivideBySix.checkNumber(in);
        String expected = "The number doesn't divide by 3 and it isn't the even number.";
        rsl.equals(expected);
    }
}