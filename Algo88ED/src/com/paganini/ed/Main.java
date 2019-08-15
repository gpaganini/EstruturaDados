package com.paganini.ed;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.fNum1 = Float.parseFloat(JOptionPane.showInputDialog("" +
                "Digite o Primeiro número:"));
        calc.fNum2 = Float.parseFloat(JOptionPane.showInputDialog("" +
                "Digite o Segundo número:"));
        calc.sOp = JOptionPane.showInputDialog("Digite o Operador: " +
                "[+] [-] [*] [/]");

        switch (calc.sOp) {
            case "+":
                calc.fResp = calc.fNum1 + calc.fNum2;
                break;
            case "-":
                calc.fResp = calc.fNum1 - calc.fNum2;
                break;
            case "*":
                calc.fResp = calc.fNum1 * calc.fNum2;
                break;
            case "/":
                calc.fResp = calc.fNum1 / calc.fNum2;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operador incorreto!");
                return;
        }

        String message = String.format("%.1f %s %.1f = %.1f", calc.fNum1, calc.sOp, calc.fNum2, calc.fResp);
        JOptionPane.showMessageDialog(null, message);

    }
}
