package com.gpaganini;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Num n = new Num();

        n.c12 = 0;
        n.total = 0;
        n.total12 = 0;

        n.codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite código " +
                "\n1-res" +
                "\n2-cond" +
                "\n3-ind" +
                " ou 0 para sair:"));

        while (n.codigo !=0) {
            n.qtde = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade em KWH"));
            n.total = n.total + n.qtde;

            if (n.codigo == 1) {
                System.out.println("Custo: " +n.qtde * 0.3);
                n.c12 = n.c12 + 1;
                n.total12 = n.total12 + n.qtde;
            } else if (n.codigo == 2) {
                System.out.println("Custo: " +n.qtde * 0.5);
                n.c12 = n.c12 + 1;
                n.total12 = n.total12 + n.qtde;
            } else if (n.codigo == 3) {
                System.out.println("Custo: " +n.qtde * 0.70);
            }
        }
        n.codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite código " +
                "\n1-res" +
                "\n2-cond" +
                "\n3-ind" +
                " ou 0 para sair:"));
    }
}
