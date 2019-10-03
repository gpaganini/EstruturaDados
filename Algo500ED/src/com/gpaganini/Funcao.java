package com.gpaganini;

import javax.swing.*;

public class Funcao {
    int entrada (int vet[], int t, String c) {
        int l;
        System.out.println("\nEntrada do vetor " +c + ":");

        for (l = 0; l < t; l++) {
            vet[l] = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite numero: " +l));
        }
        return (vet[l]);
    }

    int imprime (int vet[], int t, String c) {
        int l;
        System.out.println("VETOR " +c);

        for (l = 0; l < t; l++) {
            System.out.println(l+1 + " - " + vet[l]);
        }
        return (vet[l]);
    }

    void soma (int vet[], int vet1[], int t) {
        int l, s;
        System.out.println("SOMA");

        for (l = 0; l < t; l++) {
            s = vet[l] + vet1[l];
            System.out.println(s);
        }
    }

    void subtrai (int vet[], int vet1[], int t) {
        int l, d;
        System.out.println("DIFERENÇA");

        for (l = 0; l < t; l++) {
            d = vet[l] - vet1[l];
            System.out.println(d);
        }
    }
}
