package com.gpaganini;

import com.sun.xml.internal.bind.v2.TODO;

import javax.swing.*;

public class Funcao {
    int entrada (int vet[], int t) {
        int l;
        System.out.println("Entrada do VETOR");
        //todo INDEX OUT OF BOUNDS
        for (l = 0; l < t; l++) {
            vet[l] = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite numero: " + l+1 + ": "));
        }
        return (vet[l]);
    }

    int imprime (int vet[], int t) {
        int l;
        System.out.println("VETOR");

        for (l = 0; l < t; l++) {
            System.out.println(l+1 + " - " + vet[l]);
        }
        return (vet[l]);
    }

    int ordena (int vet[], int tam) {
        int l1, c1, aux;
        for (l1 = 0; l1 < tam -1; l1++) {
            for (c1 = l1 + 1; c1 < tam; c1++) {
                if (vet[l1] > vet[c1]) {
                    aux = vet[l1];
                    vet[l1] = vet[c1];
                    vet[c1] = aux;
                }
            }
        }
        return (vet[l1]);
    }
}
