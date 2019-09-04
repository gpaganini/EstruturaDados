package com.paganini.ed;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Num n = new Num();

        byte i = 1;

        while (i <=5) {
            n.num = Long.parseLong(JOptionPane.showInputDialog("Digite o " +i+ "º numero:"));
            System.out.println("O valor do quadrado é: " +n.num * n.num);
            i++;
        }

        /*for (n.c = 1; n.c <=5; n.c++) {
            n.num = Long.parseLong(JOptionPane.showInputDialog("Digite um número: "));
            JOptionPane.showMessageDialog(null, "" +
                    "Quadrado do número: " +Math.pow(n.num,2));
        }*/


        for (int c = 1; c <= 10; c = c + 2){
            System.out.println("\n"+c);

        }
    }
}
