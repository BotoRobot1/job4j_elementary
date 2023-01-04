package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void when41Then1() {
        int a = 4;
        int b = 1;
        double expected = 1;
        double rsl = SqArea.square(a, b);
        Assert.assertEquals(expected, rsl, 0.01);

    }
    @Test
    public void when62Then2(){
        int a = 6;
        int b = 2;
        double expected = 2;
        double rsl = SqArea.square(a, b);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}