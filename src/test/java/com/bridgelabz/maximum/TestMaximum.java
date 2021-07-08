package com.bridgelabz.maximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    Maximum maximum = new Maximum();

    @Test
    public void givenIntegerFirstNumberGreater_WhenLargest_ShouldReturnTrue() {
        Integer expected = 90 ;
        Assert.assertEquals(expected,maximum.getMax(90,40,10));
    }

    @Test
    public void givenIntegerSecondNumberGreater_WhenLargest_ShouldReturnTrue() {
        Integer expected = 90 ;
        Assert.assertEquals(expected,maximum.getMax(40,90,10));
    }

    @Test
    public void givenIntegerThirdNumberGreater_WhenLargest_ShouldReturnTrue() {
        Integer expected = 90 ;
        Assert.assertEquals(expected,maximum.getMax(40,10,90));
    }
}