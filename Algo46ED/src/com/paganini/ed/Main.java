package com.paganini.ed;

public class Main {

    public static void main(String[] args) {

        Num n = new Num();

        n.saldo = 1786.67;
        System.out.println("Saldo: " +n.saldo);

        n.nsaldo = n.saldo * 1.01;
        System.out.println("Novo Saldo: " +n.nsaldo);

    }
}
