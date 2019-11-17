package com.paganini.ed;

public class Celula {
    Celula proxima;
    Object Elemento;

    public Celula(Celula proxima, Object elemento) {
        this.proxima = proxima;
        Elemento = elemento;
    }

    public Celula(Object elemento) {
        this.Elemento = elemento;
    }
}
