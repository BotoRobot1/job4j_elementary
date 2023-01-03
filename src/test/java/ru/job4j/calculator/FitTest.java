package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short a = 180;
        double expected = 92;
        double out = Fit.manWeight(a);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenWoman170Then69() {
        short a = 170;
        double expected = 69;
        double out = Fit.womanWeight(a);
        Assert.assertEquals(expected, out, 0.01);
    }
}