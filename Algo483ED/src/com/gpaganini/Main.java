package com.gpaganini;

import javax.swing.*;

//receber dois vetores inteiros e um inteiro, indicando a quantidade de elementos que os dois vetores tem.
//retornar o produto interno dos dois vetores.

public class Main {

    public static void main(String[] args) {
	    int l, c, aux;
	    int num[] = new int[4];
	    int num1[] = new int[4];
	    Funcao funcao = new Funcao();

	    for (l = 0; l < 4; l++) {
	        num[l] = Integer.parseInt(JOptionPane.showInputDialog(
	                "Digite 1 numero " + l+1 + ":"));
        }

        for (l = 0; l < 4; l++) {
            num1[l] = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite 2 numero " + l+1 + ":"));
        }
        c = funcao.produtoInterno(num, num1, 4);
        System.out.println("Vetor A \t Vetor B");

        for (l = 0; l < 4; l++) {
            System.out.println(num[l] + "\t\t\t\t" + num1[l]);
        }
        System.out.println("\nProduto interno " + c);

    }
}
