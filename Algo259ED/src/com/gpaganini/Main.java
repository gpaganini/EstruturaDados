package com.gpaganini;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    float num;
        num = Float.parseFloat(JOptionPane.showInputDialog("Digite um número"));

        while (num > 0) {
            System.out.println("Dobro do número: " + num*2);
            num++;
        }
    }
}
