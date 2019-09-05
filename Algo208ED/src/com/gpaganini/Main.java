package com.gpaganini;

public class Main {

    public static void main(String[] args) {
        Num n = new Num();

        n.ant = 0;
        n.atual = 1;

        for (int i = 1; i <= 10; i++) {
            System.out.println(n.atual);
            n.prox = n.ant + n.atual;
            n.ant = n.atual;
            n.atual = n.prox;
        }
    }
}
