package com.khan.Arrays;

import java.util.Arrays;

public class ArraysDSDemo {

	public static void main(String[] args) {

		// declare an arrays

		int[] numbers = new int[6];
		numbers[0] = 30;
		numbers[1] = 40;
		numbers[2] = 50;

		int[] items = { 10, 20, 30, 40, 50, 60 };

		display(items);
		System.out.println(Arrays.toString(numbers));
	}

	private static void display(int[] items) {
		// for loop with counter index
		for (int index = 0; index < items.length; index++) {
			System.out.println("The index " + index + " and value " + items[index]);
		}
		// enhance for loop
		for (int item : items) {
			System.out.println("The value :" + item);
		}
	}

}
