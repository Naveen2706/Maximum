package com.bridgelabz.maximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    @Test
    public void givenIntegerFirstNumberGreater_WhenLargest_ShouldReturnTrue() {
        Assert.assertEquals(90, new Maximum(90, 10,40).getMax());
    }

    @Test
    public void givenIntegerSecondNumberGreater_WhenLargest_ShouldReturnTrue() {
        Assert.assertEquals(90, new Maximum(10, 90, 40).getMax());
    }

    @Test
    public void givenIntegerThirdNumberGreater_WhenLargest_ShouldReturnTrue() {
        Assert.assertEquals(90, new Maximum(7, 10, 90).getMax());
    }

    @Test
    public void givenFloatFirstNumberGreater_WhenLargest_ShouldReturnTrue() {
        Assert.assertEquals(5.1f, new Maximum(5.1f, 3.2f, 1.9f).getMax());
    }

    @Test
    public void givenFloatSecondNumberGreater_WhenLargest_ShouldReturnTrue() {
        Assert.assertEquals(9.1f, new Maximum(6.1f, 9.1f, 4.5f).getMax());
    }

    @Test
    public void givenFloatThirdNumberGreater_WhenLargest_ShouldReturnTrue() {
        Assert.assertEquals(10.1f, new Maximum(5.7f, 3.4f, 10.1f).getMax());
    }

    @Test
    public void givenStringFirstGreater_WhenLargest_ShouldReturnTrue() {
        Assert.assertEquals("Peach", new Maximum("Apple", "Peach", "Banana").getMax());
    }

    @Test
    public void givenStringSecondGreater_WhenLargest_ShouldReturnTrue() {
        Assert.assertEquals("Peach", new Maximum("Peach", "Apple", "Banana").getMax());
    }

    @Test
    public void givenStringThirdGreater_WhenLargest_ShouldReturnTrue() {
        Assert.assertEquals("Peach", new Maximum("Banana", "Apple", "Peach").getMax());
    }
}