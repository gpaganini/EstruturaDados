package com.paganini.ed;

public class Main {

    public static void main(String[] args) {
        Num n = new Num();

        n.numero = 10.5;
        n.quad = n.numero * n.numero;

        n.raizquad = Math.sqrt(n.quad);

        System.out.println("Número: " +n.numero);
        System.out.println("Quadrado " +n.quad);
        System.out.println("Raiz: " +n.raizquad);
    }
}
