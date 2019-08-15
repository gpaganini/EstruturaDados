package com.paganini.ed;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Num n = new Num();

        n.b = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da Base:"));
        n.a = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da Altura"));

        JOptionPane.showMessageDialog(null, "Área é: " + (n.a * n.b) / 2 );
    }
}