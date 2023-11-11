package com.alpha.www.JMockit.pack1;

public class Calculator {
	
//	int a, b;
//	
//	public Calculator(int a, int b) {
//		super();
//		this.a = a;
//		this.b = b;
//	}
	
	public String getUserOperation() {
		return UserConstants.operationType();
	}

//	public String publicString;
//	private String privateString;
//	public final String finalString="finalString";
//	String string="string";
//	int a;
//	float b;

	/* will throw -> java.lang.IllegalArgumentException: No constructor in tested 
	class that can be satisfied by available tested/injectable values */
//	public Calculator(int a, float b) { 
//		super();
//		this.a = a;
//		this.b = b;
//	}
	
//	public Calculator() {
//		
//	}

	public double performMathOperation(String operation, double a, double b) {
		double result = 0;
		if (operation.equals(getUserOperation())) {
			result = new Addition(a, b).performAddition();
		} else if (operation.equals(getUserOperation())) {
			result = new Subtraction(a, b).performSubtraction();
		} else if (operation.equals(getUserOperation())) {
			result = new Multiplication(a, b).performMultiplication();
		} else if (operation.equals("div")) {
			result = new Division(a, b).performDivision();
		} else {
			throw new RuntimeException("Invalid Operation!");
		}
		return result;
	}
}
