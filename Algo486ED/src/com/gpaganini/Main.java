package com.gpaganini;

import javax.swing.*;

public class Main {

    //receber o vetor e um elemento e verificar se o elemento esta no vetor.
    // o vetor esta desordenado e tem 10 elementos

    public static void main(String[] args) {
	    int l, c, n;
	    Funcao funcao = new Funcao();
	    double num[] = new double[10];

	    for (l = 0; l < 10; l++) {
	        num[l] = Double.parseDouble(JOptionPane.showInputDialog(
	                "Digite numero: " + l+1 + ": "));
        }

        n = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite o numero de busca"));
        c = funcao.pertence(num,10,n);

        System.out.println("VETOR");

        for (l = 0; l < 10; l++) {
            System.out.println(l+1 + " - " + num[l]);
        }

        if (c == 1) {
            System.out.println("ENCONTRADO");
        } else {
            System.out.println("NAO ENCONTRADO");
        }
    }
}
