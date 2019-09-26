package com.paganini.ed;

import javax.swing.*;

public class Calculadora {
    float a, b, resp;

    public float somar(float n1, float n2) {
        return (n1 + n2);
    }

    public float subtrair(float n1, float n2){
        return (n1 - n2);

    }

    public float dividir(float n1, float n2) {
        return (n1 / n2);
    }

    public float multiplicar(float n1, float n2) {
        return (n1 * n2);
    }

    public void entrada() {
        JOptionPane.showMessageDialog(null,
                "Seja bem-vindo à calculadora do Paganois",
                "Calculadora",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
