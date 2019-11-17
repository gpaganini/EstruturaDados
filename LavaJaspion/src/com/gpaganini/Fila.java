package com.gpaganini;

import java.util.ArrayList;
import java.util.List;

public class Fila {
    ArrayList<Carro> carros = new ArrayList<>();
    protected Ordenador ordenator;

    public void adicionarCarro(int ano, String modelo, String placa) {
        carros.add(new Carro(ano, modelo, placa));
    }


    void insere(Carro C){
        this.carros.add(C);
    }

    Carro remove() {
        return this.carros.remove(0);
    }

    boolean filaVazia() {
        return this.carros.isEmpty();
    }

    /*public void setOrdemDaFila(OrdemDaFila ordem) {
        ordenator = null;
        switch (ordem) {
            case porPlaca:
                ordenator = new OrderByPlaca();
                break;
            default:
                break;
        }
    }*/

    public void mostrarLista() {
        ArrayList<Carro> novaFila = new ArrayList<>();
        novaFila = carros;
        for (Carro carro : novaFila) {
            System.out.println("Ano: " + carro.Ano
                    + "\nModelo: " + carro.Modelo
                    + "\nPlaca: " + carro.Placa
                    + "\n");
        }
    }

    public void mostrarListaOrdenada() {
        ordenator = new OrderByPlaca();
        ArrayList<Carro> novaFila = new ArrayList<>();
        novaFila = ordenator.ordenarCarros(carros);

        for (Carro carro : novaFila) {
            System.out.println("Ano: " + carro.Ano
            + "\nModelo: " + carro.Modelo
            + "\nPlaca: " + carro.Placa
            + "\n");
        }
    }
}
