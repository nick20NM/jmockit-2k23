package com.alpha.www.JMockit.pack1;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.internal.stubbing.answers.Returns;

import mockit.Delegate;
import mockit.Expectations;
import mockit.FullVerifications;
import mockit.Injectable;
import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;
import mockit.Tested;
import mockit.Verifications;
import mockit.VerificationsInOrder;

public class CalculatorTest {
	
	@Mocked
	Calculator calculator;
	
	@Test
	@DisplayName("testVerificationsBlock")
	void testVerificationsBlock() {
		
		boolean checkForNull = Calculator.checkForNull(2, 2);
		assertTrue(!checkForNull);
		double result = calculator.performMathOperation("add", 2, 2);
		assertTrue(result==0);
		
//		new Verifications() {{
//			Calculator.checkForNull(2, 2);
////			times=1;
//			minTimes=1;
//			maxTimes=3;
//			calculator.performMathOperation("add", 2, 2);
////			times=1;
//			minTimes=1;
//			maxTimes=3;
//		}};
		
//		new VerificationsInOrder() {{
//			Calculator.checkForNull(2, 2);
//			times=1;
//			calculator.performMathOperation("add", 2, 2);
//			times=1;
//		}};
		
		new FullVerifications() {{
			calculator.performMathOperation("add", 2, 2);
			times=1;
//			Calculator.checkForNull(2, 2);
//			times=1;
		}};
	}

//	@Mocked
//	Calculator calculator;
//
//	@Test
//	@DisplayName("testExpectationsBlock")
//	void testExpectationsBlock() {
//		new Expectations(calculator) {
//			{
////				calculator.performMathOperation("add", 10, 10);
////				result = 1;
////				calculator.performMathOperation("add", 20, 20);
////				result = 2;
////				calculator.performMathOperation("add", 30, 30);
////				result = 3;
////				calculator.performMathOperation(anyString, anyDouble, anyDouble);
////				result = 3;
////				calculator.performMathOperation(anyString, anyDouble, anyDouble);
////				returns(1.0 , 2.0 , 3.0);
//				calculator.performMathOperation("add", anyDouble, anyDouble);
//				result = new Delegate<Calculator>() {
//					double performMathOperation(String operation, double a, double b) {
//						double result = calculator.performMathOperation("sub", 20.0, 10.0);
//						return result;
//					}
//				};
//			}
//		};
//		double result1 = calculator.performMathOperation("add", 10.0, 10.0);
//		assertTrue(result1 > 0);
//		System.out.println("result1="+result1);
//		
////		double result2 = calculator.performMathOperation("add", 20.0, 20.0);
////		assertTrue(result2 > 0);
////		
////		double result3 = calculator.performMathOperation("add", 30.0, 30.0);
////		assertTrue(result3 > 0);
//	}

//	@Test
//	@DisplayName("testStaticMethodMocking")
//	void testStaticMethodMocking() {
//		new MockUp<UserConstants>() {
//			@Mock
//			public String operationType() {
//				return "sub";
//			}
//		};
//		String result = calculator.getUserOperation();
//		assertTrue(result.equals("sub"));
//	}

//	@Test
//	@DisplayName("testConstructorMocking")
//	void testConstructorMocking() {
//		new MockUp<Calculator>() {
//			@Mock
//			public void $init(int a, int b) {
//				
//			}
//		};
//		Calculator calculator = new Calculator(1, 1);
//		double result = calculator.performMathOperation("add", 2, 2);
//		assertTrue(result > 0);
//	}

//	@Tested // @Tested -> Calculator calculator = new Calculator();
//	@Mocked
//	@Injectable
//	Calculator calculator2;
//	Calculator calculator;

//	@Test
//	@DisplayName("testAdditionOperation")
//	void testAdditionOperation() {
//		calculator2 = new Calculator();
////		Calculator calculator2 = new Calculator();
//		double result = calculator2.performMathOperation("add", 2, 2);
////		double result = calculator.performMathOperation("add", 2, 2);
//		assertTrue(result > 0);
//	}
//
//	@Test
//	@DisplayName("testSubtractionOperation")
//	void testSubtractionOperation() {
//		double result = calculator.performMathOperation("sub", 5, 2);
//		assertTrue(result > 0);
//	}
//
//	@Test
//	@DisplayName("testMultiplicationOperation")
//	void testMultiplicationOperation() {
//		double result = calculator.performMathOperation("mul", 2, 2);
//		assertTrue(result > 0);
//	}
//
//	@Test
//	@DisplayName("testDivisionOperation")
//	void testDivisionOperation() {
//		double result = calculator.performMathOperation("div", 10, 2);
//		assertTrue(result > 0);
//	}
//
//	@Test
//	@DisplayName("testInvalidOperation")
//	void testInvalidOperation() {
//		RuntimeException exception = assertThrows(RuntimeException.class,
//				() -> calculator.performMathOperation("invalidOperation", 10, 2));
//	}
}
