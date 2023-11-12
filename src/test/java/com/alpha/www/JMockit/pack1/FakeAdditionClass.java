package com.alpha.www.JMockit.pack1;

import mockit.Invocation;
import mockit.Mock;
import mockit.MockUp;

public class FakeAdditionClass extends MockUp<Addition> {
	
//	@Mock
//	public double performAddition(double a, double b) {
//		return 100;
//	}
	
	@Mock
	public double performAddition(Invocation invocation ,double a, double b) {
		double result = invocation.proceed(a, b);
		return result+1;
	}
}
