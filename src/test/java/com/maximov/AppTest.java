package com.maximov;

import org.junit.*;

import org.junit.Test;

import com.maximov.Calculator;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */


    @Test
    public void sumOf8And3(){
        Assert.assertEquals(11, Calculator.sum(8, 3));
    }

    @Test
    public void substractionOf15And14(){
        Assert.assertEquals(1, Calculator.substract(15, 14));
    }

    @Test
    public void divisionOf15And3(){
        Assert.assertEquals(5, Calculator.divide(15, 3));
    }

    @Test
    public void multiplyOf20And7(){
        Assert.assertEquals(140, Calculator.multiply(20, 7));
    }
}
