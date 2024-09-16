package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Test Driven Development");
        Calculator calculator = new Calculator();

        // addition
        System.out.println(calculator.addition(4, 6));

        // subtraction
        System.out.println(calculator.subtraction(4, 6));

        // multiplication
        System.out.println(calculator.multiplication(4, 6));

        // division
        System.out.println(calculator.division(8, 6));
    }
}