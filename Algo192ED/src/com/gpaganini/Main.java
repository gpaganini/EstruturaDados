package com.gpaganini;

import javax.swing.*;

public class Main {

    /*Criar um algoritmo que leia um número que será o limite superior de um intervalo
    * e imprimir todos os números ímpares menores que esse número*/

    /*Ex: Limite superior 15
    * Saída: 1 3 5 7 9 11 13*/

    public static void main(String[] args) {
	    Num n = new Num();

        n.num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        n.vf = n.num - 1;

        for (n.i = 1; n.i <= n.vf; n.i = (n.i + 2)) {
            System.out.println(n.i);
        }
    }
}
