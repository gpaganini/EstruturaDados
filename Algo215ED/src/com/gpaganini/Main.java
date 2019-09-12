package com.gpaganini;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Num n = new Num();

        n.num = Integer.parseInt(JOptionPane.showInputDialog("Digite número: "));
        for (n.c=1;n.c<=n.num;n.c++) {
            if (n.num % n.c == 0) {
                System.out.println(n.c);
            }
        }
    }
}
