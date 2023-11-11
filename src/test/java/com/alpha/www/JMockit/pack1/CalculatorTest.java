package com.alpha.www.JMockit.pack1;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import mockit.Mocked;
import mockit.Tested;

public class CalculatorTest {

	@Tested // @Tested -> Calculator calculator = new Calculator();
	Calculator calculator;

	@Test
	@DisplayName("testAdditionOperation")
	void testAdditionOperation() {
		double result = calculator.performMathOperation("add", 2, 2);
		assertTrue(result > 0);
	}

	@Test
	@DisplayName("testSubtractionOperation")
	void testSubtractionOperation() {
		double result = calculator.performMathOperation("sub", 5, 2);
		assertTrue(result > 0);
	}

	@Test
	@DisplayName("testMultiplicationOperation")
	void testMultiplicationOperation() {
		double result = calculator.performMathOperation("mul", 2, 2);
		assertTrue(result > 0);
	}

	@Test
	@DisplayName("testDivisionOperation")
	void testDivisionOperation() {
		double result = calculator.performMathOperation("div", 10, 2);
		assertTrue(result > 0);
	}

	@Test
	@DisplayName("testInvalidOperation")
	void testInvalidOperation() {
		RuntimeException exception = assertThrows(RuntimeException.class,
				() -> calculator.performMathOperation("invalidOperation", 10, 2));
	}
}
