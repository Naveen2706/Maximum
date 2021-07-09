package com.bridgelabz.maximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {

	    @Test
	    public void givenIntegerFirstNumberGreater_WhenLargest_ShouldReturnTrue() {
	        Integer expected = 90 ;
	        Assert.assertEquals(expected,new Maximum(90,40,10).getMax());
	    }

	    @Test
	    public void givenIntegerSecondNumberGreater_WhenLargest_ShouldReturnTrue() {
	        Integer expected = 90 ;
	        Assert.assertEquals(expected,new Maximum(40,90,10).getMax());
	    }

	    @Test
	    public void givenIntegerThirdNumberGreater_WhenLargest_ShouldReturnTrue() {
	        Integer expected = 90 ;
	        Assert.assertEquals(expected,new Maximum(40,10,90).getMax());
	    }
	    @Test
	    public void givenFloatFirstNumberGreater_WhenLargest_ShouldReturnTrue() {
	        Float expected = 5.6f ;
	        Assert.assertEquals(expected,new Maximum(5.6f,4.2f,2.2f).getMax());
	    }

	    @Test
	    public void givenFloatSecondNumberGreater_WhenLargest_ShouldReturnTrue() {
	        Float expected = 5.6f ;
	        Assert.assertEquals(expected,new Maximum(4.2f, 5.6f, 2.2f).getMax());
	    }

	    @Test
	    public void givenFloatThirdNumberGreater_WhenLargest_ShouldReturnTrue() {
	        Float expected = 5.6f ;
	        Assert.assertEquals(expected,new Maximum(1.2f,4.2f,5.6f).getMax());
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