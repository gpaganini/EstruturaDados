package com.paganini.ed;

public class Main {

    public static void main(String[] args) {
        Num n = new Num();

        n.nota1 = 9.5f;
        n.nota2 = 7.2f;

        System.out.println("Primeira nota: " +n.nota1);
        System.out.println("Segunda nota: " +n.nota2);

        n.media = (n.nota1 + n.nota2) /2;

        System.out.println("Média: " +n.media);

    }
}
