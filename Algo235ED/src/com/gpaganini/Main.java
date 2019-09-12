package com.gpaganini;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    Num n = new Num();

	    n.num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite um número:"));
	    n.maior = n.num1;
	    n.menor = n.num1;

	    for (n.i=1;n.i<=10;n.i++) {
            n.num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite um número:"));
            if (n.num1 > n.maior) {
                n.maior = n.num1;
            } else if (n.num1 < n.menor) {
                n.menor = n.num1;
            }
        }
	    JOptionPane.showMessageDialog(null, "Maior número digitado: " +n.maior);
        JOptionPane.showMessageDialog(null, "Menor número digitado: " +n.menor);
    }
}
