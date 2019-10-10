package com.gpaganini;

public class Funcao {
    int inverte (int vet[], int max) {
        int k, i, aux;
        k = max;

        for (i = 0; i < max / 2; i++) {
            aux = vet[i];
            k--;
            vet[i] = vet[k];
            vet[k] = aux;
        }
        return (vet[k]);
    }
}
