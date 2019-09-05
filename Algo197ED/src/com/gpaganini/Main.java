package com.gpaganini;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    Num n = new Num();

	    n.num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número maior que zero: "));
	    n.impar = 0;

	    for (int i = 1; i <= n.num * 2; i = (i + 2)) {
            n.impar = n.impar + i;
        }

        System.out.println(n.impar);
    }
}
