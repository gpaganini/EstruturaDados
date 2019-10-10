package com.gpaganini;

import javax.swing.*;

public class Main {

	// receber um vetor de inteiros e seu tamanho, retornar 1 se for ordenado decrescente e 0 se não estiver

    public static void main(String[] args) {
	    int l, c, aux, num[] = new int[10];
	    Funcao f = new Funcao();

	    for (l = 0; l < 10; l++) {
	        num[l] = Integer.parseInt(JOptionPane.showInputDialog(
	                "Digite numero: " + l+1 + ": "));
        }
	    c = f.busca(num,10);

	    for (l = 0; l < 10; l++) {
            System.out.println(l+1 + " - " + num[l]);
        }

	    if (c == 1) {
			System.out.println("\n" +c + " - DECRESCENTE");
		} else {
			System.out.println("\n" +c + " - DESORDENADO");
		}
    }
}
