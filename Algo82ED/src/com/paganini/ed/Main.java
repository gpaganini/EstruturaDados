package com.paganini.ed;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Num n = new Num();

        n.fNum = Float.parseFloat(JOptionPane.showInputDialog("Digite um número:"));

        if (n.fNum > 20) {
            n.fMet = n.fNum / 2;
            JOptionPane.showMessageDialog(null,
                    "A metade do número é: " +n.fMet);
        } else {
            n.fDobro = n.fNum * 2;
            JOptionPane.showMessageDialog(null,
                    "O dobro do número é: " +n.fDobro);
        }

    }
}
