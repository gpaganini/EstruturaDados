package com.paganini.ed;

import com.sun.codemodel.internal.JOp;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

//        calc.entrada();

        String[] options = {"+", "-", "/", "*"};
        int op = JOptionPane.showOptionDialog(null,
                "Escolha a operação a ser calculada",
                "Escolha a operação",
                JOptionPane.NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        System.out.println(options[op]);
        System.out.println(op);


        switch (options[op]) {
            case "+":
                calc.a = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número: "));
                calc.b = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número: "));
                calc.resp = calc.somar(calc.a, calc.b);
                JOptionPane.showMessageDialog(null,
                        "Resultado da soma: " +calc.resp,
                        "Resultado",
                        JOptionPane.INFORMATION_MESSAGE);
            break;

            case "-":
                calc.a = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número: "));
                calc.b = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número: "));
                calc.resp = calc.subtrair(calc.a, calc.b);
                JOptionPane.showMessageDialog(null,
                        "Resultado da subtração: " +calc.resp,
                        "Resultado",
                        JOptionPane.INFORMATION_MESSAGE);
            break;

            case "/":
                calc.a = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número: "));
                calc.b = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número: "));
                calc.resp = calc.dividir(calc.a, calc.b);
                JOptionPane.showMessageDialog(null,
                        "Resultado da divisão: " +calc.resp,
                        "Resultado",
                        JOptionPane.INFORMATION_MESSAGE);
            break;

            case "*":
                calc.a = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número: "));
                calc.b = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número: "));
                calc.resp = calc.multiplicar(calc.a, calc.b);
                JOptionPane.showMessageDialog(null,
                        "Resultado da multiplicação: " +calc.resp,
                        "Resultado",
                        JOptionPane.INFORMATION_MESSAGE);
            default:
                JOptionPane.showMessageDialog(null, "Operação não encontrada", "Erro",
                        JOptionPane.ERROR);
        }

        /*calc.resp = calc.somar(calc.a, calc.b);
        System.out.println(calc.resp);

        calc.resp = calc.diferenca(calc.a, calc.b);
        System.out.println(calc.resp);

        calc.resp = calc.dividir(calc.a, calc.b);
        System.out.println(calc.resp);

        calc.resp = calc.multiplicar(calc.a, calc.b);
        System.out.println(calc.resp);*/
    }
}
