package com.gpaganini;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    Num n = new Num();

	    n.num = Integer.parseInt(JOptionPane.showInputDialog("Quantos números você quer digitar? "));
	    n.maior = -1;

	    for (int i = 1; i <= n.num; i++) {
            n.num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite um número: "));
            if (n.num1 > n.maior) {
                n.maior = n.num1;
            }
        }
        JOptionPane.showMessageDialog(null, "Este é o maior número digitado: " +n.maior);
    }
}
