package com.gpaganini;

public class Funcao {
    int busca (double vetor[], int t, double chave) {
        int achou, i;
        achou = 0;
        i = 0;

        while (i < t-1 && chave > vetor[i]) {
            i++;
        }

        if (vetor[i] == chave) {
            achou = 1;
        }
        return (achou);
    }

    double ordena(double vet[], int tam) {
        int l1, c1;
        double aux;

        for (l1 = 0; l1 < tam -1; l1++) {
            for (c1 = l1+1; c1 < tam; c1++) {
                if (vet[l1] > vet[c1]) {
                    aux = vet[l1];
                    vet[l1] = vet[c1];
                    vet[c1] = aux;
                }
            }
        }
        return vet[l1];
    }
}
