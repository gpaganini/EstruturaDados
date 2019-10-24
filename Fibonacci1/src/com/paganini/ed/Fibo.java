package com.paganini.ed;

public class Fibo {
    int termofibo(int x) {
        return(x < 2?x:termofibo(x-1) + termofibo(x-2));
    }

    int fibonacciIterativo(int n) {
        if (n <=1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

}
