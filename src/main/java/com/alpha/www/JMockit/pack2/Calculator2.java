package com.alpha.www.JMockit.pack2;

public class Calculator2 {
	
    private Division2 division2;

    // constructor
    public Calculator2(Division2 division2) {
        this.division2 = division2;
    }

    public double performMathOperation(String operation, double a, double b) {
        if ("div".equals(operation)) {
            return division2.performDivision(a, b);
        }
        // handle other operations
        return 0.0; // default value, adjust accordingly
    }
}

