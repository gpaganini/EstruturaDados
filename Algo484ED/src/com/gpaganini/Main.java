package com.gpaganini;

import javax.swing.*;

//receber vetor de inteiros e seu tamanho e retornar o menor dos elementos do vetor

public class Main {

    public static void main(String[] args) {
	    int l, c;
	    int num[] = new int[10];
	    Funcao funcao = new Funcao();

	    for (l = 0; l < 10; l++) {
	        num[l] = Integer.parseInt(JOptionPane.showInputDialog(
	                "Digite numero: "+l+1+": "));
        }
        c = funcao.menorElemento(num,10);
        System.out.println("VETOR");

        for (l = 0; l < 10; l++) {
            System.out.println(num[l]);
        }

        System.out.println("MENOR ELEMENTO: " +c);
    }
}
