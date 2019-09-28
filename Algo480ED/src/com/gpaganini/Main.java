package com.gpaganini;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int n, x;

        Funcao funcao = new Funcao();

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        x = funcao.reverso(n);
        System.out.println(n + " - " + x);

        if (x == n) {
            System.out.println("É um número capicua");
        } else {
            System.out.println("Não é um numero capicua");
        }

    }
}
