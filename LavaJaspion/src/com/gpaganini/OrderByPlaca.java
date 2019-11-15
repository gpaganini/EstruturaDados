package com.gpaganini;

public class OrderByPlaca extends Ordenador {
    @Override
    public boolean isFirst(Carro carro1, Carro carro2) {
        if (carro1.Placa.compareToIgnoreCase(carro2.Placa) <= 0){
            return true;
        }
        return false;
    }
}
