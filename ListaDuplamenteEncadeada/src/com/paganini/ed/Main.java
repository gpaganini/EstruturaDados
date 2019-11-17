package com.paganini.ed;

public class Main {

    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();

        lista.Adiciona("Rafael");
        lista.Adiciona("Paula");

        System.out.println(lista.Imprimir());
        System.out.println("=================================================");

        lista.EsvaziaLista();
        System.out.println(lista.Imprimir());
        System.out.println("=================================================");

        lista.Adiciona("Rafael");
        lista.Adiciona(0,"Paulo");
        lista.Adiciona(1,"Camila");
        System.out.println(lista.Imprimir());
        System.out.println("=================================================");
    }
}
