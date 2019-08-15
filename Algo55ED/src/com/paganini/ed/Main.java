package com.paganini.ed;

import com.sun.codemodel.internal.JOp;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    Losango los = new Losango();

	    los.diagmaior = Double.parseDouble(JOptionPane.showInputDialog("" +
                "Medida da diagonal maior:"));
	    los.diagmenor = Double.parseDouble(JOptionPane.showInputDialog("" +
                "Medida da diagonal menor:"));

	    los.area = (los.diagmaior * los.diagmenor) / 2;

        JOptionPane.showMessageDialog(null, "Área é: " +los.area);
    }
}
