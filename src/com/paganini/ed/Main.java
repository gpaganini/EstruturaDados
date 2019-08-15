package com.paganini.ed;

public class Main {

    public static void main(String[] args) {

        Num num = new Num();
        num.num1 = 82;
        num.num2 = 7;

        System.out.println("Primeiro número: " +num.num1);
        System.out.println("Segundo número: " +num.num2);

        num.prod = num.num1 * num.num2;

        System.out.println("Produto: " +num.prod);
        System.out.println("\n");

    }
}
