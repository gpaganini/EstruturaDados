package com.gpaganini;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    Num n = new Num();

       // JOptionPane.showMessageDialog(null, "Digite o número limite e o incremento:");

        n.limite = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite:"));
        n.incr = Integer.parseInt(JOptionPane.showInputDialog("Digite o incremento: "));

        for (n.i = 0; n.i <= n.limite; n.i = (n.i + n.incr)) {
            JOptionPane.showMessageDialog(null, n.i);
            //System.out.println(n.i);
        }
    }
}
