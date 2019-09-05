package com.gpaganini;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    Num n = new Num();
	    n.num = Integer.parseInt(JOptionPane.showInputDialog("Quantos números você quer digitar: "));

	    for (int i = 1; i <= n.num; i++) {
            n.num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o " + i + " numero de " + n.num + ": " ));
            JOptionPane.showMessageDialog(null, n.num1 * 3);
        }
    }
}
