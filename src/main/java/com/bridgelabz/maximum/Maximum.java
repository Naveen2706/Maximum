package com.bridgelabz.maximum;

public class Maximum {

	public static void main(String[] args) {
		Maximum maximum = new Maximum();
		System.out.println(maximum.getMax("apple", "peach", "banana"));

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

	public String getMax(String firstValue, String secondValue, String thirdValue) {
		String max = firstValue;
		if (secondValue.compareTo(max) > 0)
			max = secondValue;
		if (thirdValue.compareTo(max) > 0)
			max = thirdValue;

		return max;
	}

}
