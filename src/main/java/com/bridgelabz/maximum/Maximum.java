package com.bridgelabz.maximum;

public class Maximum<E extends Comparable<E>> {
	E firstValue;
	E secondValue;
	E thirdValue;

	public Maximum(E firstValue, E secondValue, E thirdValue) {
		this.firstValue = firstValue;
		this.secondValue = secondValue;
		this.thirdValue = thirdValue;
	}

	public static void main(String[] args) {
		System.out.println(Maximum.getMax("apple", "peach", "banana"));
	}

	public static <E extends Comparable<E>> E getMax(E firstValue, E secondValue, E thirdValue) {
		E max = firstValue;
		if (secondValue.compareTo(max) > 0)
			max = secondValue;
		if (thirdValue.compareTo(max) > 0)
			max = thirdValue;
		return max;
	}

	public <E extends Comparable<E>> E getMax() {
		E max = (E) getMax(firstValue, secondValue, thirdValue);
		return max;
	}
}