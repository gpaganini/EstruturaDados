package com.gpaganini;

import javax.swing.*;

public class Main {

    //todo corrigir algoritmo de troca
    //não esta trocando

    public static void main(String[] args) {
        int a, b, c;

        Funcao f = new Funcao();

        a = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite numero 1: "));
        b = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite numero 2: "));
        c = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite numero 3: "));

        if (a > b) {
            f.troca(a,b);
        }

        if (a > c) {
            f.troca(a,c);
        }

        if (b > c) {
            f.troca(b,c);
        }

        System.out.println("Ordem Crescente: " +a + ", " +b + ", " +c);
    }
}
