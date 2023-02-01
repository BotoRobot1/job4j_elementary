package ru.job4j.loop;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expected = 120;
        int n = 5;
        int result = Factorial.calc(n);
        Assert.assertEquals(expected, result);
    }

    @Test
    void WhenToCalculateTheFactorialForSixThenSevenHundredAndTwenty(){
        int expected = 720;
        int n = 6;
        int result = Factorial.calc(n);
        Assert.assertEquals(expected, result);
    }
}