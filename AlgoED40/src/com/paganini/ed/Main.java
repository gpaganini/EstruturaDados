package com.paganini.ed;

public class Main {

    public static void main(String[] args) {
        /*int a = 10;
        int b = 5;

        int x = a + b;

        System.out.println(x);*/

        Divisao dv = new Divisao();

        dv.iDividendo = 10;
        dv.iDivisor = 2;
        dv.iQuociente = dv.iDividendo / dv.iDivisor;
        dv.iResto = dv.iDividendo % dv.iDivisor;

        System.out.println("Dividendo = " +dv.iDividendo);
        System.out.println("Divisor = " +dv.iDivisor);
        System.out.println("Quociente = " +dv.iQuociente);
        System.out.println("Resto = " +dv.iResto);
    }
}
