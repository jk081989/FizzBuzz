package com.mbcc.fizzbuzz;

public class TddFizzBuzz {

	public String fizzbuzz(int number)
	{
		
		if(number%3 ==0 && number%5 == 0)
		{
			return "FizzBuzz";
		}
		if(number%3==0)
		{
			return "Fizz";
		}
		if(number%5 ==0)
		{
			return "Buzz";
		}
			return String.valueOf(number);
		
	}
}

