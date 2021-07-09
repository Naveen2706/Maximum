package com.bridgelabz.maximum;

public class Maximum<E extends Comparable<E>> {
	E firstValue;
	E secondValue;
	E thirdValue;
	E[] extraParamaters;

	public Maximum(E firstValue, E secondValue, E thirdValue, E... extraParamaters) {
		this.firstValue = firstValue;
		this.secondValue = secondValue;
		this.thirdValue = thirdValue;
		this.extraParamaters = extraParamaters;
	}

	public static void main(String[] args) {
		new Maximum(1.2f, 4.2f, 5.6f, 6.0f).getMax();
		new Maximum(40, 10, 90, 55).getMax();
		new Maximum("apple", "banana", "grapes", "mangoes", "Watermelon", "peach").getMax();
	}

	public static <E extends Comparable<E>> E getMax(E firstValue, E secondValue, E thirdValue, E... extraParamaters) {
		E max = firstValue;
		if (secondValue.compareTo(max) > 0)
			max = secondValue;
		if (thirdValue.compareTo(max) > 0)
			max = thirdValue;
		if (extraParamaters.length != 0) {
			for (E extraParamater : extraParamaters) {
				if (extraParamater.compareTo(max) > 0) {
					max = extraParamater;
				}
			}
		}
		return max;
	}

	public <E extends Comparable<E>> E getMax() {
		E max = (E) getMax(firstValue, secondValue, thirdValue, extraParamaters);
		printMax(max);
		return max;
	}

	public <E extends Comparable<E>> void printMax(E max) {
		System.out.println("Maximum Value " + max);
	}
}