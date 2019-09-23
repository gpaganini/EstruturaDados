package com.gpaganini;

import javax.swing.*;
import java.rmi.ServerError;

public class Main {

    /*Criar um algoritmo que leia a quantidade de numeros que se deseja digitar para que possa ser
    impresso o maior e o menor numero digitados*/

    public static void main(String[] args) {
        Num n = new Num();

        n.quant = Integer.parseInt(JOptionPane.showInputDialog("Quantos números você quer digitar?"));
        n.num = Float.parseFloat(JOptionPane.showInputDialog("Digite um número:"));
        n.maior = n.num;
        n.menor = n.num;

        for (int i = 1; i < n.quant; i++) {
            n.num = Float.parseFloat(JOptionPane.showInputDialog("Digite um número:"));
            if (n.num > n.maior) {
                n.maior = n.num;
            } else if (n.num < n.menor) {
                n.menor = n.num;
            }
        }

        System.out.println("Maior: " +n.maior);
        System.out.println("Menor: " +n.menor);
    }
}
