package com.gpaganini;

import javax.swing.*;

public class Main {
    //criar uma funcao chamada inverte que receba um veotr de numeros inteiros como parametro e seu
    //tamanho. a funcao deve inverter a ordem dos elementos de modo que o 1º vire o ultimo e o 2º
    //vire o penultimo, assim por diante

    public static void main(String[] args) {
	    int l, n, num[] = new int[10];
	    Funcao f = new Funcao();

	    for (l = 0; l < 10; l++){
            num[l] = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite numero: " + l+1 + ": "));
        }

	    f.inverte(num,10);
        System.out.println("VETOR");

        for (l = 0; l < 10; l++) {
            System.out.println(l+1 + " - " + num[l]);
        }
    }
}
