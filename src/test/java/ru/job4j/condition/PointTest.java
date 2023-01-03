package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To20Then2() {
        int x1 = 0;
        int x2 = 0;
        int x3 = 2;
        int x4 = 0;
        double expected = 2;
        double out = Point.distance(x1, x2, x3, x4);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11To33Then2dot82() {
        int x1 = 1;
        int x2 = 1;
        int x3 = 3;
        int x4 = 3;
        double expected = 2.82;
        double out = Point.distance(x1, x2, x3, x4);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when105To63Then4dot47() {
        int x1 = 10;
        int x2 = 5;
        int x3 = 6;
        int x4 = 3;
        double expected = 4.47;
        double out = Point.distance(x1, x2, x3, x4);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when68To1216Then10() {
        int x1 = 6;
        int x2 = 8;
        int x3 = 12;
        int x4 = 16;
        double expected = 10;
        double out = Point.distance(x1, x2, x3, x4);
        Assert.assertEquals(expected, out, 0.01);
    }
}