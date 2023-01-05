package ru.job4j.condition;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
   public void max1() {
        int a = 2;
        int b =4;
        int rsl = Max.max(a, b);
        int expected = 4;
        Assert.assertEquals(rsl, expected);
    }
    @Test
    public void max2(){
        int a = 14;
        int b = 2;
        int c = Max.max(a, b);
        int expected = a;
        Assert.assertEquals(c, expected);
    }
    @Test
    public void max3(){
        int a = 12;
        int b = 12;
        int c = Max.max(a, b);
        int expected = a;
        Assert.assertEquals(c, expected);
    }
}