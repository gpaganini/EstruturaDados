package com.gpaganini;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    Num n = new Num();
	    n.h = 0;

	    /*n.num = Integer.parseInt(JOptionPane.showInputDialog("Digite número: "));
        System.out.println("Primeira solução.");

        for (n.c = 1; n.c <= n.num; n.c++){
            if (n.c % 2 == 1) {
                n.h = (n.h + 1) / n.c;
            } else {
                n.h = (n.h - 1) / n.c;
            }
        }
        JOptionPane.showMessageDialog(null, "Soma: " +n.h);*/

        n.num = Integer.parseInt(JOptionPane.showInputDialog("Digite número: "));
        System.out.println("Segunda solução.");

        for (n.c = 1; n.c <= n.num; n.c++) {
            n.h = n.h + (Math.pow(-1,n.c+1)) / n.c;
        }
        System.out.println(n.h);

    }
}
