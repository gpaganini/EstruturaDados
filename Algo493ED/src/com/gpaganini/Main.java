package com.gpaganini;

import javax.swing.*;

public class Main {

    //criar uma funcao que receba um vetor e verifique se está ordenado de forma crescente, decrescente, desordenado

    public static void main(String[] args) {
	    int l, c, aux, num[] = new int[10];
	    Funcao f = new Funcao();

	    for (l = 0; l < 10; l++) {
	        num[l] = Integer.parseInt(JOptionPane.showInputDialog(
	                "Digite numero: " + l+1 + ": "));
        }
	    c = f.verificaOrdem(num, 10);

	    if (c == 1) {
            System.out.println("ORDENAÇÃO CRESCENTE");
        } else {
	        if (c == 2) {
                System.out.println("ORDENAÇÃO DECRESCENTE");
            } else {
                System.out.println("NÃO ESTA ORDENADO");
            }
        }
    }
}
