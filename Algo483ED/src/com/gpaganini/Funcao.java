package com.gpaganini;

public class Funcao {
    int produtoInterno(int vet1[], int vet2[], int quant) {
        int prod, i;
        prod = 0;

        for (i = 0; i < quant; i++) {
            prod = prod + (vet1[i] * vet2[i]);
        }

        return (prod);
    }
}
