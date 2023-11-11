package com.alpha.www.JMockit.pack1;

public class Calculator {

	public double performMathOperation(String operation, double a, double b) {
		double result = 0;
		if (operation.equals("add")) {
			result = new Addition(a, b).performAddition();
		} else if (operation.equals("sub")) {
			result = new Subtraction(a, b).performSubtraction();
		} else if (operation.equals("mul")) {
			result = new Multiplication(a, b).performMultiplication();
		} else if (operation.equals("div")) {
			result = new Division(a, b).performDivision();
		} else {
			throw new RuntimeException("Invalid Operation!");
		}
		return result;
	}
}
