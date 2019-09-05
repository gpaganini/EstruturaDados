package com.gpaganini;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Num n = new Num();
        n.num = Integer.parseInt( JOptionPane.showInputDialog("Digite um número: "));

        n.vf = n.num * 2;

        for (n.i = 2; n.i <= n.vf; n.i = (n.i + 2)) {
            System.out.println(n.i);
        }
    }
}
