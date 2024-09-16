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

//    unit tests for subtraction
    @Test
    void testValidSubtractionTwoValues() {
        double x = 5;
        double y = 8;
        double expectedResult = -3;
        Calculator calculator = new Calculator();

        double actualResult = calculator.subtraction(x, y);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testValidSubtractionSingleNegativeValue() {
        double x = -5, y = 8;
        double expectedResult = -13;
        Calculator calculator = new Calculator();

        double actualResult = calculator.subtraction(x, y);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testValidSubtractionMultipleNegativeValues() {
        double x = -5, y = 8, z = -9, i = -8, j = 6;
        double expectedResult = -2;
        Calculator calculator = new Calculator();

        double actualResult = calculator.subtraction(x, y, z, i, j);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testValidSubtractionFloatValues(){
        double x = 3.83, y = 5.934, z = 9, i = 8.7, j = 6;
        double expectedResult = -25.804;
        Calculator calculator = new Calculator();

        double actualResult = calculator.subtraction(x, y, z, i, j);

        assertEquals(expectedResult, actualResult);
    }

    // unit tests for multiplication
    @Test
    void testValidMultiplicationTwoValues() {
        double x = 5;
        double y = 8;
        double expectedResult = 40;
        Calculator calculator = new Calculator();

        double actualResult = calculator.multiplication(x, y);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testValidMultiplicationNegativeValue() {
        double x = -5, y = 8;
        double expectedResult = -40.0;
        Calculator calculator = new Calculator();

        double actualResult = calculator.multiplication(x, y);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testValidMultiplicationMultipleValues(){
        double x = 3, y = 5, z = 9, i = 8, j = 6;
        double expectedResult = 6480;
        Calculator calculator = new Calculator();

        double actualResult = calculator.multiplication(x, y, z, i, j);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testValidMultiplicationFloatValues(){
        double x = 3.83, y = 5.934, z = 9, i = 8.7, j = 6;
        double expectedResult = 10677.247956;
        Calculator calculator = new Calculator();

        double actualResult = calculator.multiplication(x, y, z, i, j);

        assertEquals(expectedResult, actualResult);
    }

    // unit tests for division
    @Test
    void testValidDivisionTwoValues() {
        double x = 5;
        double y = 8;
        double expectedResult = 0.625;
        Calculator calculator = new Calculator();

        double actualResult = calculator.division(x, y);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testValidDivisionNegativeValue() {
        double x = -5, y = 8;
        double expectedResult = -0.625;
        Calculator calculator = new Calculator();

        double actualResult = calculator.division(x, y);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testValidDivisionMultipleValues(){
        double x = 78, y = 5, z = 4, i = 3, j = 2;
        double expectedResult = 0.65;
        Calculator calculator = new Calculator();

        double actualResult = calculator.division(x, y, z, i, j);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testValidDivisionFloatValues(){
        double x = 279.8, y = 5.934, z = 2;
        double expectedResult = 23.576002696326256;
        Calculator calculator = new Calculator();

        double actualResult = calculator.division(x, y, z);

        assertEquals(expectedResult, actualResult);
    }
}