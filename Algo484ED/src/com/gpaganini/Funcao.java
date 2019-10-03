package com.gpaganini;

public class Funcao {
    int menorElemento(int vet[], int tam) {
        int i, menor;
        i = 0;
        menor = vet[0];

        for (i = 1; i < tam; i++) {
            if (vet[i] < menor) {
                menor = vet[i];
            }
        }
        return (menor);
    }
}
