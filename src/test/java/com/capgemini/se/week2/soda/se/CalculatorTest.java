package com.capgemini.se.week2.soda.se;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void sum() {
        int result = calculator.sum(5, 5);

        Assert.assertEquals(10, result);
    }

    @Test
    public void multiply() {
        int result = calculator.multiply(5, 5);

        Assert.assertEquals(25, result);
    }
}