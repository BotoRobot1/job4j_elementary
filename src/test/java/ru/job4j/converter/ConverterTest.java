package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;


public class ConverterTest {

    @Test
    public void wenConwert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rublesToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);

    }

    @Test
    public void wenConwert200RblThen3dot3333Dlr() {
        float in = 200;
        float expected = 3.3333f;
        float out = Converter.rublesToDollars(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}