package com.paganini.ed;

public class Main {

    public static void main(String[] args) {
        Ola ed = new Ola();
        Ola teste = new Ola();

        teste.turma = 'a';

        System.out.println("Olá Mundo, Turma " +ed.turma);
        System.out.println("Olá Mundo, Teste = " +teste.turma);

    }
}
