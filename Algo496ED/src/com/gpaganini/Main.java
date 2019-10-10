package com.gpaganini;

import javax.swing.*;

public class Main {

    //criar uma função que receba um vetor e um elemento e verifique se o elemento esta no vetor.

    public static void main(String[] args) {
        int l, c;
        double num[] = new double[10];
        double n;
        Funcao f = new Funcao();

        for (l = 0; l < 10; l++) {
            num[l] = Double.parseDouble(JOptionPane.showInputDialog(
                    "Digite numero: " +l+1 + ": "));
        }
        n = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite numero de busca"));
        f.ordena(num,10);
        c = f.busca(num,10, n);

        System.out.println("VETOR");

        for (l = 0; l < 10; l++) {
            System.out.println(l+1 + " - " + num[l]);
        }

        if (c == 1) {
            System.out.println("ENCONTRADO");
        } else {
            System.out.println("NÃO ENCONTRADO");
        }
    }
}
