package com.gpaganini;

public class Funcao {
    int pertence (double vetor[], int t, double chave) {
        int achou, i;
        achou = 0;
        i = 0;

        while (achou == 0 && i < t) {
            if (vetor[i] == chave) {
                achou = 1;
            } else {
                i++;
            }
        }
        return (achou);
    }
}
