package com.paganini.ed;

import com.sun.codemodel.internal.JOp;

import javax.swing.*;
import java.text.Format;

public class Main {

    public static void main(String[] args) {
        Num n = new Num();

        n.seno = 0;
        n.expden = 0;

        n.x = Double.parseDouble(JOptionPane.showInputDialog("" +
                "Digite o valor de x: "));

        n.x = (n.x * Math.PI) / 180;

        for (n.c = 1; n.c <= 10; n.c++) {
            n.fat = 1;
            for (n.d = 1; n.d <= n.expden; n.d++) {
                n.fat = n.fat * n.d;
            }
            if (n.c % 2 == 0) {
                n.seno = n.seno - Math.pow(n.x,n.expden) / n.fat;
            } else {
                n.seno = n.seno + Math.pow(n.x,n.expden) / n.fat;
            }
            n.expden = n.expden + 2;
        }
        System.out.println(n.seno);

        Format
    }
}
