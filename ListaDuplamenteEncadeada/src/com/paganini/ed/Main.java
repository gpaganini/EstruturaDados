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

        lista.AdicionaNoComeco("GOLD");
        lista.AdicionaNoComeco("GOLD");
        lista.AdicionaNoComeco("GOLD");
        lista.Adiciona("IRON");
        lista.Adiciona(5, "SILVER");
        lista.Adiciona("IRON");
        lista.Adiciona(5, "SILVER");
        lista.Adiciona("IRON");
        lista.Adiciona(5, "SILVER");
        lista.Adiciona("IRON");

        lista.Adiciona(5, "SILVER");
        lista.Adiciona("IRAO");
        lista.AdicionaNoComeco("GOLD");
        lista.Adiciona("IRON");
        lista.AdicionaNoComeco("GOLD");
        lista.Adiciona(5, "SILVER");
        lista.Adiciona(5, "SILVER");
        lista.Adiciona(34, "pika");

        System.out.println(lista.Imprimir());
        System.out.println("=================================================");
    }
}
