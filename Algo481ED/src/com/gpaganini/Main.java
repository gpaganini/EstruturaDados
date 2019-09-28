package com.gpaganini;

import javax.sound.midi.Soundbank;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int num, base, c;
        Funcao funcao = new Funcao();

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite numero maior ou igual a 0:"));

        while (num < 0) {
            num = Integer.parseInt(JOptionPane.showInputDialog(
                    "Número negativo! Digite numero maior ou igual a 0:"));
        }

        base = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite a base em que deseja representá-lo: (2-10)"));
        while (base < 2 || base > 10) {
            base = Integer.parseInt(JOptionPane.showInputDialog(
                    "Não sei converter! Digite a base em que deseja representá-lo: (2-10)"));
        }
        c = funcao.converte(num, base);
        System.out.println("Número em decimal: " + num);
        System.out.println("Numero em base " + base + " : " + c);
    }
}
