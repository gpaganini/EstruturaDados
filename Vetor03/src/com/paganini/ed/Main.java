package com.paganini.ed;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Numeros num = new Numeros();
        int i;

        i = 0;
        do {
            num.v1[i] = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite um número:")
            );
            i++;

        } while (i < 10);


        i = 0;
        while (i < 10) {
            System.out.println("O valor digitado no número "+i+" é: " +num.v1[i]);
            i++;
        }

        int aux;
        for (i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (num.v1[i] > num.v1[j] && (j > i)) {
                    aux = num.v1[i];
                    num.v1[i] = num.v1[j];
                    num.v1[j] = aux;
                }
            }
        }

        System.out.println("\n");

        for (i = 0; i < 10; i++) {
            System.out.println("O valor ordenado na posição "+i+" é: " +num.v1[i]);
        }
    }
}
