package com.gpaganini;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    Num num = new Num();

        num.n = Integer.parseInt(JOptionPane.showInputDialog("Qual tabuada: "));

        if (num.n > 0) {
            String output = String.format("Tabuada do %d", num.n);
            System.out.println(output);

            for (num.c=1;num.c<=10;num.c++) {
                String message = String.format("%d x %d = %d", num.n, num.c, num.n*num.c);
                System.out.println(message);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não existe tabuada!");
        }
    }
}
