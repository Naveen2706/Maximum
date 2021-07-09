package com.bridgelabz.maximum;

public class Maximum {

	public static void main(String[] args) {
		Maximum maximum = new Maximum();
		Float firstFloatVal = 18.6f, secondFloatVal = 16.3f, thirdFloatVal = 12.5f;
		Integer firstIntValue = 10, secondIntValue = 15, thirdIntValue = 20;
		
		System.out.println(maximum.getMax(firstFloatVal, secondFloatVal, thirdFloatVal));
		System.out.println(maximum.getMax(firstIntValue, secondIntValue, thirdIntValue));
		System.out.println(maximum.getMax("apple", "peach", "banana"));
	}

	public <E extends Comparable<E>> E getMax(E firstValue, E secondValue, E thirdValue) {
		E max = firstValue;
		if (secondValue.compareTo(max) > 0)
			max = secondValue;
		if (thirdValue.compareTo(max) > 0)
			max = thirdValue;

		return max;
	}
}