package com.alpha.www.JMockit.pack1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.alpha.www.JMockit.pack2.Calculator2;
import com.alpha.www.JMockit.pack2.Division2;

import mockit.Expectations;
import mockit.Injectable;
import mockit.Tested;

public class CalculatorTest2 {

    @Tested
    private Calculator2 calculator2;

    @Injectable
    private Division2 division2;

    @Test
    public void testPerformMathOperationForDivision() {
        // Arrange
        double a = 10.0;
        double b = 2.0;
        double expectedResult = 5.0;

        // Mock the behavior of the Division class
        new Expectations() {{
        	division2.performDivision(anyDouble, anyDouble);
            result = expectedResult;
        }};

        // Act
        double result = calculator2.performMathOperation("div", a, b);

        // Assert
        assertEquals(expectedResult, result, 0.01); // Adjust delta as needed
    }
}
