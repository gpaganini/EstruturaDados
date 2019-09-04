package com.paganini.ed;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Numero cPol = new Numero();

        /*System.out.println("Conversão de Polegadas para Centímetros");

        cPol.pol = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite um numero em polegadas: "));
        System.out.println(cPol.pol + "\"" + " equivale a " + cPol.pol * 2.54 + "cm");*/

        for (cPol.pol = 1; cPol.pol <=20; cPol.pol++) {
            System.out.println(cPol.pol +"\" " + "equivale a " + cPol.pol * 2.54 + "cm");
        }
    }
}
