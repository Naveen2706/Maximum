package com.bridgelabz.maximum;

public class Maximum {

	public static void main(String[] args) {
		Maximum maximum = new Maximum();
		Integer firstValue = 10;
		Integer secondValue = 15;
		Integer thirdValue = 20;
		
		System.out.println(maximum.getMax(firstValue, secondValue, thirdValue));
		
		
	}
    public Integer getMax(Integer firstValue,Integer secondValue,Integer thirdValue){
        Integer max = firstValue;
        if (secondValue.compareTo(max) > 0)
            max = secondValue;
        if (thirdValue.compareTo(max) > 0)
            max = thirdValue;

        return max;
    }
}
