package com.gpaganini;

import javax.swing.*;

public class Main {

    //criar uma funcao que implemente uma busca binaria. essa funcao recebe um vetor de inteiros, seu tamanho e uma chave
    //e retorna a posição da chave no vetor. o vetor deve estar ordenado

    public static void main(String[] args) {
        int l, c, num[] = new int[10], n, aux;
        Funcao f = new Funcao();

        for (l = 0; l < 10; l++) {
            num[l] = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite numero: " +l+1 + ": "));
        }
        n = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite numero de busca: "));

        f.ordena(num, 10);
        c = f.busca(num, 10, n);

        System.out.println("\nVETOR\n");

        for (l = 0; l < 10; l++) {
            System.out.println(l+1 + " - " + num[l]);
        }
        c++;

        if (c != 0) {
            System.out.println("Posição no vetor: " +c);
        } else {
            System.out.println("NÃO ENCONTRADO");
        }
    }
}
