package com.gpaganini;

public class Funcao {
    int busca (int vet[], int tam) {
        int i;
        for (i = 0; i < tam -1; i++) {
            if (vet[i] < vet[i + 1]) {
                return (0);
            }
        }
        return (1);
    }
}
