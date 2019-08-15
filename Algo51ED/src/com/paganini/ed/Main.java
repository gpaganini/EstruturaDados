package com.paganini.ed;

public class Main {

    public static void main(String[] args) {
        Num n = new Num();

        n.raio = 37.2;
        System.out.println("Raio: " +n.raio);

        n.perimetro = 2* Math.PI *n.raio;
        n.area = Math.PI * Math.pow(n.raio,2);

        System.out.println("Perimetro: " +n.perimetro);
        System.out.println("Area: " +n.area);
    }
}
