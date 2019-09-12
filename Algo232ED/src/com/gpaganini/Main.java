package com.gpaganini;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Num n = new Num();
        n.soma = 0;
        n.neg = 0;

        for (n.c=1;n.c<=20;n.c++) {
            n.numero = Float.parseFloat(JOptionPane.showInputDialog("Digite número:"));

            if (n.numero > 0) {
                n.soma = n.soma + n.numero;
            } else if (n.numero < 0) {
                n.neg++;
            }
        }
    }
}
