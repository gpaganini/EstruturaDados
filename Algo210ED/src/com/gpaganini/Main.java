package com.gpaganini;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Num n = new Num();

        n.a1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o primeiro termo: "));
        n.a2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o segundo termo: "));

        System.out.println(n.a1 + " e " + n.a2);

        for (int i = 3; i <= 10; i++) {
            if (i % 2 == 0) {
                n.termo = n.a2 - n.a1;
            } else {
                n.termo = n.a2 + n.a1;
            }
            System.out.println(n.termo);
            n.a1 = n.a2;
            n.a2 = n.termo;
        }
    }
}
