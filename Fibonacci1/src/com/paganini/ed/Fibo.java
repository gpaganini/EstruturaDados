package com.paganini.ed;

public class Fibo {
    int termofibo(int x) {
        return(x < 2?x:termofibo(x-1) + termofibo(x-2));
    }

    long fibonacciIterativo(int n) {
        int f = 0; //atual
        int ant = 0; //anterior

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                f = 1;
                ant = 0;
            } else {
                f += ant;
                ant = f - ant;
            }
        }
        return f;
    }
}