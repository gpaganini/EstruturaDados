package com.gpaganini;

public class Funcao {
    int busca (int vet[], int tam, int chave) {
        int i, ini, meio, fim, n;
        ini = 0;
        fim = tam -1;

        while (ini <= fim) {
            meio = (ini+fim) / 2;

            if (chave == vet[meio]) {
                return(meio);
            } else if (chave < vet[meio]) {
                fim = meio -1;
            } else {
                ini = meio +1;
            }
        }
        meio = (-1);
        return (meio);
    }

    int ordena (int vet[], int tam) {
        int l1, c1, aux;

        for (l1 = 0; l1 < tam -1; l1++) {
            for (c1 = l1+1; c1 < tam; c1++) {
                if (vet[l1] > vet[c1]) {
                    aux = vet[l1];
                    vet[l1] = vet [c1];
                    vet[c1] = aux;
                }
            }
        }
        return (vet[l1]);
    }
}
