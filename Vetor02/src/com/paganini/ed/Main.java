package com.paganini.ed;

public class Main {

    public static void main(String[] args) {
        Numeros num = new Numeros();
        int i;

        num.vovozinho[0] = 1;

        i = 1;

        do {
            num.vovozinho[i] = (num.vovozinho[i - 1]) / 2;
            i++;
        } while (i < 20);

        for (i = 0; i < 20; i++) {
            System.out.println("Il vettore nella posizione "+i+" è: " +num.vovozinho[i]);
        }

    }
}
