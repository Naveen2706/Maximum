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
	    @Test
	    public void givenFloatFirstNumberGreater_WhenLargest_ShouldReturnTrue() {
	        Float expected = 5.6f ;
	        Assert.assertEquals(expected,maximum.getMax(5.6f,4.2f,2.2f));
	    }

	    @Test
	    public void givenFloatSecondNumberGreater_WhenLargest_ShouldReturnTrue() {
	        Float expected = 5.6f ;
	        Assert.assertEquals(expected,maximum.getMax(2.2f,5.6f,4.3f));
	    }

	    @Test
	    public void givenFloatThirdNumberGreater_WhenLargest_ShouldReturnTrue() {
	        Float expected = 5.6f ;
	        Assert.assertEquals(expected,maximum.getMax(1.2f,4.2f,5.6f));
	    }
	}