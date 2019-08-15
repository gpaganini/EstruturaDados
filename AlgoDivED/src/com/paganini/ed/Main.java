package com.paganini.ed;

import com.sun.codemodel.internal.JOp;

import java.util.Scanner;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Num n = new Num();

        n.fNumerador = Float.parseFloat(JOptionPane.showInputDialog("" +
                "Digite o Numerador:"));
        n.fDenominador = Float.parseFloat(JOptionPane.showInputDialog("" +
                "Digite o Denominador:"));

        if (n.fDenominador != 0) {
            n.fResultado = n.fNumerador / n.fDenominador;
            JOptionPane.showMessageDialog(null, "O Resultado é: " +n.fResultado);
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a divisão, denominador = 0!");
        }

    }
}
