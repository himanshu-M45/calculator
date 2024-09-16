package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testCalculator {
    @Test
    void testValidAdditionTwoValues() {
        double x = 5;
        double y = 8;
        double expectedResult = 13;
        Calculator calculator = new Calculator();

        double actualResult = calculator.addition(x, y);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testValidAdditionNegativeValue() {
        double x = -5, y = 8;
        double expectedResult = 3;
        Calculator calculator = new Calculator();

        double actualResult = calculator.addition(x, y);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testValidAdditionMultipleValues(){
        double x = 3, y = 5, z = 9, i = 8, j = 6;
        double expectedResult = 31;
        Calculator calculator = new Calculator();

        double actualResult = calculator.addition(x, y, z, i, j);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testValidAdditionFloatValues(){
        double x = 3.83, y = 5.934, z = 9, i = 8.7, j = 6;
        double expectedResult = 33.464;
        Calculator calculator = new Calculator();

        double actualResult = calculator.addition(x, y, z, i, j);

        assertEquals(expectedResult, actualResult);
    }
}