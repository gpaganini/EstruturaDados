package com.gpaganini;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int num, a;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite numero ou -999 para acabar:"));

        while (num != -999) {
            System.out.println("\n1");
            for (a = 2; a <=num / 2;a++) {
                if (num % a == 0) {
                    System.out.println(a);
                }
            }
            System.out.println(num);
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite numero ou -999 para acabar:"));
        } num++;
    }
}
