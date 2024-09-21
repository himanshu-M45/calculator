package org.example;

public class Calculator {
    public double addition(double x, double... nums) {
        double sum = x;
        for (double num: nums) {
            sum += num;
        }
        return sum;
    }

    public double subtraction(double x, double... nums) {
        double sub = x;
        for (double num: nums) {
            sub -= num;
        }
        return sub;
    }

    public double multiplication(double x, double... nums) {
        double mul = x;
        for (double num: nums) {
            mul *= num;
        }
        return mul;
    }

    public double division(double x, double... nums) {
        double div = x;
        for (double num: nums) {
            div /= num;
        }
        return div;
    }
}
