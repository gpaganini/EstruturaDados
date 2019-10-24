package com.gpaganini;

import java.util.ArrayList;
import java.util.List;

public class Fila {
    List<Carro> carros = new ArrayList<>();

    void insere(Carro C){
        this.carros.add(C);
    }

    Carro remove() {
        return this.carros.remove(0);
    }

    boolean filaVazia() {
        return this.carros.isEmpty();
    }


}
