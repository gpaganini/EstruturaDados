package com.gpaganini;

import javax.sound.midi.Soundbank;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Num n = new Num();
        n.soma = 0;

        JOptionPane.showMessageDialog(null, "Relação dos alunos");

        for (n.c = 1; n.c<=15; n.c++) {
            n.nome = JOptionPane.showInputDialog("Digite o nome:");
            n.pr1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1:"));
            n.pr2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2:"));

            n.media = (n.pr1 + n.pr2) / 2;
            n.soma = n.soma + n.media;

            JOptionPane.showMessageDialog(null, " " + n.nome + " " + n.pr1 + " " + n.pr2 + " " + n.media+0.0001);
        }
        JOptionPane.showMessageDialog(null, "Média: " +n.soma / 15);
    }
}
