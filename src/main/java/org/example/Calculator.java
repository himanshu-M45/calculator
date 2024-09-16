package org.example;

public class Calculator {
//    public int addition (int x, int y) {
//        return x + y;
//    }
    public double addition(double x, double... nums) {
        double sum = x;
        for (double num: nums) {
            sum += num;
        }
        return sum;
    }
}
