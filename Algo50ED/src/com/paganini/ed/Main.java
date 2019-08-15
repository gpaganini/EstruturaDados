package com.paganini.ed;

public class Main {

    public static void main(String[] args) {
        Num n = new Num();

        n.base = 20;
        n.altura = 30;

        n.perimetro = 2 * (n.base + n.altura);
        n.area = n.base * n.altura;
        n.diagonal = Math.sqrt(Math.pow(n.base,2) + Math.pow(n.altura,2));

        System.out.println("Base: " +n.base);
        System.out.println("Altura: " +n.altura);
        System.out.println("Perimetro: " +n.perimetro);
        System.out.println("Área: " +n.area);
        System.out.println("Diagonal: " +n.diagonal);
    }
}
