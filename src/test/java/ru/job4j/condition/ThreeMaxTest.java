package ru.job4j.condition;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeMaxTest {

    @Test
    public void firstMax() {
        int first = 10;
        int second = 5;
        int third = 1;
        int rsl = ThreeMax.max(first, second, third);
        int expected = 10;
        Assert.assertEquals(rsl, expected);
    }

    @Test
    public void secondMax() {
        int first = 10;
        int second = 50;
        int third = 1;
        int rsl = ThreeMax.max(first, second, third);
        int expected = 50;
        Assert.assertEquals(rsl, expected);
    }

    @Test
    public void thirdMax(){
        int first = 1;
        int second = 5;
        int third = 100;
        int rsl = ThreeMax.max(first, second, third);
        int expected = 100;
        Assert.assertEquals(rsl, expected);
    }

    @Test
    public void allEq() {
        int first = 1;
        int second = 1;
        int third = 1;
        int result = ThreeMax.max(first, second, third);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void firstEqSecond() {
        int first = 10;
        int second = 10;
        int third = 1;
        int result = ThreeMax.max(first, second, third);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void firstEqThird() {
        int first = 100;
        int second = 1;
        int third = 100;
        int result = ThreeMax.max(first, second, third);
        int expected = 100;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void secondEqThird() {
        int first = 1;
        int second = 100;
        int third = 100;
        int result = ThreeMax.max(first, second, third);
        int expected = 100;
        Assert.assertEquals(result, expected);
    }


}