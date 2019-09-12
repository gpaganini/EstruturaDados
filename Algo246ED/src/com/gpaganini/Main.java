package com.gpaganini;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    Num n = new Num();
	    n.idadegot = 0;
	    n.opexc = 0;
	    n.opbom = 0;
	    n.opregular = 0;

	    for (n.i = 1;n.i<=15;n.i++) {
	        n.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite idade: "));
	        n.op = Integer.parseInt(JOptionPane.showInputDialog("Digite opinião: " +
                    "\nExcelente - 3 " +
                    "\nBom - 2 " +
                    "\nRegular - 1:"));
	        if (n.op ==3) {
	            n.opexc++;
	            n.idadegot = n.idadegot + n.idade;
            } else if (n.op == 2) {
	            n.opregular++;
            } else if (n.op == 1) {
	            n.opbom++;
            }
        }
	    if (n.opexc != 0) {
            System.out.println("Média da idade de pessoas que responderam excelente: " +n.idadegot / n.idade);

        } else {
            System.out.println("Ninguém escolheu excelente!");
        }

        if (n.opregular != 0) {
            System.out.println("Quantidade de pessoas que responderam regular: " +n.opregular);

        } else {
            System.out.println("Ninguém escolheu Regular!");
        }

        if (n.opbom != 0) {
            System.out.println("Porcentagem de pessoas que responderam Bom: " +(n.opbom * 100) / 15);

        } else {
            System.out.println("Ninguém escolheu Bom!");
        }
    }
}
