package com.paganini.ed;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Notas nt = new Notas();

        nt.pr1 = Double.parseDouble(JOptionPane.showInputDialog("" +
                "Digite a PR1: "));
        nt.pr2= Double.parseDouble(JOptionPane.showInputDialog("" +
                "Digite PR2: "));

        nt.mf = (nt.pr1 + nt.pr2) / 2;

        JOptionPane.showMessageDialog(null,
                "Media Truncada: "
                        +((nt.mf - 0.5) + 0.001));
        JOptionPane.showMessageDialog(null, "" +
                "Media Arredondada: "
                +(nt.mf + 0.001));

    }
}
