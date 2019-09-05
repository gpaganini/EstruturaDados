package com.gpaganini;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    Num n = new Num();

	    n.ini = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inicial: "));
	    n.f = Integer.parseInt(JOptionPane.showInputDialog("Digite o número final: "));

	    for (int i = n.ini; i <= n.f; i++) {
            System.out.println(i);
        }
    }
}
