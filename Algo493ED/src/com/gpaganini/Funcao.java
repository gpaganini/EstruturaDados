package com.gpaganini;

public class Funcao {
    int busca (int vet[], int tam) {
        int i, x, l;

        for (i = 0; i < tam -1; i++) {
            if (vet [i] < vet [i+1]) {
                x = 0;
                return (x);
            }
        }
        x = 1;
        return (x);
    }

    int busca1 (int vet[], int tam) {
        int i, x, l;

        for (i = 0; i < tam -1; i++) {
            if (vet[i] > vet[i+1]) {
                x = 0;
                return (x);
            }
        }
        x = 1;
        return (x);
    }

    int verificaOrdem (int vetor[], int t) {
        int r, res, l;
        r = busca(vetor, t);

        if (r == 1) {
            res = 2;
            return (res);
        } else {
            r = busca1(vetor, t);
            if (r == 1) {
                res = 1;
                return (res);
            } else {
                res = 0;
                return (res);
            }
        }
    }
}
