package com.gpaganini;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    Num n = new Num();

	    n.soma = 0;

	    for (n.a = 1; n.a <= 12; n.a++) {
            n.numero = Float.parseFloat( JOptionPane.showInputDialog("Digite número:"));
            n.soma = n.soma + n.numero;
        }
	    JOptionPane.showMessageDialog(null, "Média: " +n.soma / 12);
    }
}
