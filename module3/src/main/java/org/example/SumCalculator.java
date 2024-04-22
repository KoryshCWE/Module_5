package org.example;


public class SumCalculator {
    public int sum(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n must be a positive number");
        }
        return (n * (n + 1)) / 2;
    }
}
