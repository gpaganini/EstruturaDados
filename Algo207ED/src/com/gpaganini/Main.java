package com.gpaganini;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Num n = new Num();

        n.num1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o multiplicando: "));
        n.num2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o multiplicador: "));

        n.soma = 0;

        for (int i = 1; i <= n.num2; i++) {
            n.soma = n.soma + n.num1;
        }
        System.out.println("Produto: "+n.soma);

    }
}
