package com.paganini.ed;

import javax.swing.*;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Numero num = new Numero();

        byte i = 1;

        do {
            num.fNum = Float.parseFloat(JOptionPane.showInputDialog(
                    "Digite um numero: " ));

            System.out.println("O número digitado foi: " +num.fNum);
            System.out.println("O cubo da variável é: " +Math.pow(num.fNum,3));
            i++;

            if (num.fNum > 0) {
                System.out.println("Raiz quadrada: " +Math.sqrt(num.fNum));
            } else {
                JOptionPane.showMessageDialog(null,
                        "Não foi possível calcular raiz quadrada de número negativo, mano!",
                        "ERRO",
                        JOptionPane.WARNING_MESSAGE);
            }

        } while (i <= 5);

    }
}
