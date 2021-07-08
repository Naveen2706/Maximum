package com.bridgelabz.maximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
	Maximum maximum = new Maximum();

	@Test
	public void givenStringSecondGreater_WhenLargest_ShouldReturnTrue() {
		String result = maximum.getMax("apple", "peach", "banana");
		Assert.assertEquals("peach", result);
	}

	@Test
	public void givenStringFirstGreater_WhenLargest_ShouldReturnTrue() {
		String result = maximum.getMax("Peach", "Apple", "Banana");
		Assert.assertEquals("Peach", result);
	}

	@Test
	public void givenStringThirdGreater_WhenLargest_ShouldReturnTrue() {
		String result = maximum.getMax("Banana", "Apple", "Peach");
		Assert.assertEquals("Peach", result);
	}
}