package com.mbcc.fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TddFizzBuzztest {

	TddFizzBuzz tddfizzbuzz = null;

	@BeforeEach
	void init() {
		tddfizzbuzz = new TddFizzBuzz();
		System.out.println("test");
	}

	@Test
	void testFizz() {
		assertEquals("Fizz", tddfizzbuzz.fizzbuzz(6));
		assertEquals("Fizz", tddfizzbuzz.fizzbuzz(9));
	}

	@Test
	void testBuzz() {
		assertEquals("Buzz", tddfizzbuzz.fizzbuzz(5));
		assertEquals("Buzz", tddfizzbuzz.fizzbuzz(10));

	}

	@Test
	void testFizzBuzz() {
		assertEquals("FizzBuzz", tddfizzbuzz.fizzbuzz(15));
		assertEquals("FizzBuzz", tddfizzbuzz.fizzbuzz(30));

	}

	@Test
	void testNumberOnly() {
		assertEquals("16", tddfizzbuzz.fizzbuzz(16));
		assertEquals("22", tddfizzbuzz.fizzbuzz(22));
		assertEquals("26", tddfizzbuzz.fizzbuzz(26));

	}

}
