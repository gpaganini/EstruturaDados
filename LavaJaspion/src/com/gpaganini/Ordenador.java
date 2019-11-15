package com.gpaganini;

import java.util.ArrayList;

public abstract class Ordenador {
    public abstract boolean isFirst(Carro carro1, Carro carro2);

    public ArrayList<Carro> ordenarCarros(ArrayList<Carro> fo) {
        ArrayList<Carro> filaOrdenada = new ArrayList<>();

        for (Carro carro : fo) {
            filaOrdenada.add(carro);
        }

        for (int i = 0; i < filaOrdenada.size(); i++){
            for (int j = i; j < filaOrdenada.size(); j++) {
                if (!isFirst(filaOrdenada.get(i), filaOrdenada.get(j))) {
                    Carro aux = filaOrdenada.get(j);
                    filaOrdenada.set(j, filaOrdenada.get(i));
                    filaOrdenada.set(i, aux);
                }
            }
        }
        return filaOrdenada;
    }
}
