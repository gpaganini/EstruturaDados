package com.paganini.ed;

public class Main {

    public static void main(String[] args) {
        Num n = new Num();

        n.angulo = 90;
        n.rang = n.angulo * Math.PI / 180;

        System.out.println("Seno: " +Math.sin(n.rang));
        System.out.println("Coseno: " +Math.cos(n.rang));
        System.out.println("Tangente: " +Math.tan(n.rang));
        System.out.println("Co-secante: " +1/ Math.sin(n.rang));
        System.out.println("Secante: " +1/ Math.cos(n.rang));
        System.out.println("Co-tangente: " +1/ Math.tan(n.rang));

    }
}
