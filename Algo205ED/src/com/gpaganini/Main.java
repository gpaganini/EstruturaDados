package com.gpaganini;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Num n = new Num();

        n.num = Integer.parseInt(JOptionPane.showInputDialog("Quantos números você quer digitar? "));
        n.num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite um número: "));
        n.maior = n.num1;

        for (int i = 1; i <= n.num -1; i++) {
            n.num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite um número: "));
            if (n.num1 > n.maior) {
                n.maior = n.num1;
            }
        }
        System.out.println("maior numero digitado: " +n.maior);
    }
}
