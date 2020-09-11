package com.mbcc.fizzbuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;

		System.out.println("Entered number is " + a);
		if ((0 == a % 3) && (0 == a % 5)) {
			System.out.println("FizzBuzz");
		}
		if (a % 3 == 0) {
			System.out.println("Fizz");
		}
		if (a % 5 == 0) {
			System.out.println("Buzz");
		}
		System.out.println(+a);

	}

}
