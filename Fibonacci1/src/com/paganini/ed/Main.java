package com.paganini.ed;

public class Main {

    public static void main(String[] args) {
        Fibo fibo = new Fibo();

        System.out.println("Iterativo: " +fibo.fibonacciIterativo(153));
        System.out.println("Termo da sequencia é: " +fibo.termofibo(153));
    }
}
