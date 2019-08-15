package com.paganini.ed;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Paralelepipedo pp = new Paralelepipedo();

        pp.dA = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da Base: "));
        System.out.println("Base: " +pp.dA);

        pp.dB = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da Altura: "));
        System.out.println("Base: " +pp.dB);

        pp.dC = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da Profundidade: "));
        System.out.println("Base: " +pp.dC);


        pp.dDiagonal = Math.sqrt(Math.pow(pp.dA,2) + Math.pow(pp.dB,2) + Math.pow(pp.dC,2));

        JOptionPane.showMessageDialog(null, "O valor da diagonal é: "+pp.dDiagonal);

        System.out.println("hmm yes the floor here is made out of floor");
    }
}
