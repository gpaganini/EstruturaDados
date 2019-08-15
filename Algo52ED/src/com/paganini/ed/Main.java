package com.paganini.ed;

public class Main {

    public static void main(String[] args) {
        Num n = new Num();

        n.lado = 25;
        System.out.println("Lado: " +n.lado);

        n.perimetro = 4 * n.lado;
        n.area = Math.pow(n.lado,2);
        n.diagonal = n.lado * Math.sqrt(2);

        System.out.println("Perimetro: " +n.perimetro);
        System.out.println("Área: " +n.area);
        System.out.println("Diagonal: " +n.diagonal);
    }
}
