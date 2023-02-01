package ru.job4j.loop;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void whenNumbersFromOneToFiveAreAddedUpThenFifteen() {
        int start = 1;
        int finish = 5;
        int rsl = Counter.sum(start, finish);
        int expected = 15;
        Assert.assertEquals(rsl, expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int rsl = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(rsl, expected);
    }

    @Test
    void whenEvenNumbersFromThreeToEightAreAddedUpThenEighteen(){
        int start = 3;
        int finish = 8;
        int rsl = Counter.sumByEven(start, finish);
        int expected = 18;
        Assert.assertEquals(rsl, expected);
    }
}