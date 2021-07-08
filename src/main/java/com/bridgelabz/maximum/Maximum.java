package com.bridgelabz.maximum;

public class Maximum {

	public static void main(String[] args) {
		Maximum maximum = new Maximum();
		Float firstValue = 18.6f, secondValue = 16.3f, thirdValue = 12.5f;
		System.out.println(maximum.getMax(firstValue, secondValue, thirdValue));

	}

	public Integer getMax(Integer firstValue, Integer secondValue, Integer thirdValue) {
		Integer max = firstValue;
		if (secondValue.compareTo(max) > 0)
			max = secondValue;
		if (thirdValue.compareTo(max) > 0)
			max = thirdValue;

		return max;
	}

	public Float getMax(Float firstValue, Float secondValue, Float thirdValue) {
		Float max = firstValue;
		if (secondValue.compareTo(max) > 0)
			max = secondValue;
		if (thirdValue.compareTo(max) > 0)
			max = thirdValue;

		return max;
	}
}
