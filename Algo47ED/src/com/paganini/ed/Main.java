package com.paganini.ed;

public class Main {

    public static void main(String[] args) {

        Num n = new Num();

        n.numero = 300;
        n.c = n.numero / 100;
        n.d = n.numero % 100 / 10;
        n.u = n.numero % 10;

        n.num1 = n.u * 100 + n.d * 10 + n.c;

        System.out.println("Número: " +n.numero);
        System.out.println("Número invertido: " +n.num1);
    }
}
