package com.gpaganini;

import javax.swing.*;

public class Main {

    //Entrar com números e imprimir o triplo de cada um. O programa encerra quando o número -999 for digitado

    public static void main(String[] args) {
	    float num;

	    num = Float.parseFloat(JOptionPane.showInputDialog(
	            "Digite um número ou -999 para terminar: "));

	    while (num != -999) {
            System.out.println("Triplo: " +num*3);
            num = Float.parseFloat(JOptionPane.showInputDialog(
                    "Digite um número ou -999 para terminar: "));
        } num++;
    }
}
