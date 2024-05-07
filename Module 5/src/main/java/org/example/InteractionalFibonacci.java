package org.example;

public class InteractionalFibonacci {

    public static int fibonacci(int n) {
        if (n <= 1)
            return n;

        int fib = 0;
        int nextFib = 1;

        for (int i = 2; i <= n; i++) {
            int temp = nextFib;
            nextFib += fib;
            fib = temp;
        }

        return nextFib;
    }

    public static void main(String[] args) {
        int n = 6;
        int result = fibonacci(n);
        System.out.println("Fibonacci count " + n + " = " + result);
    }
}
