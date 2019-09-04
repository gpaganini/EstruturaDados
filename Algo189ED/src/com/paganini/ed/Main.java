package com.paganini.ed;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Numero num = new Numero();

        num.f1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com a temperatura maior em Fahrenheit: "));
        num.f2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com a temperatura menor em Fahrenheit: "));

        num.dec = Integer.parseInt(JOptionPane.showInputDialog("Entre com o decremento"));

        for (num.t = num.f1; num.t >= num.f2; num.t = num.t - num.dec) {
            num.c = 5 * (num.t - 32) / 9;
            System.out.println("Temperatura em Celcius: " + num.c + "ºC");

        }
    }
}
