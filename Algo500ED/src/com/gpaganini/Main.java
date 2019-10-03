package com.gpaganini;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    int num[] = new int[5];
        int num1[] = new int[5];
	    int l, flag, flag1, op;
	    flag = 0;
	    flag1 = 0;

	    Funcao f = new Funcao();

	    for (l = 0; l < 5; l++) {
	        num[l] = 0;
	        num1[l] = 0;
        }

	    do {
            System.out.println("VETORES");
            System.out.println("1 - DADOS DO VETOR A");
            System.out.println("2 - DADOS DO VETOR B");
            System.out.println("3 - IMPRIME VETORES");
            System.out.println("4 - SOMA VETORES");
            System.out.println("5 - SUBTRAI VETORES");
            System.out.println("6 - SAI DO PROGRAMA");

            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "OPÇÃO:"));

            switch (op) {
                case 1:
                    f.entrada(num, 5, "A");
                    flag = 1;
                break;

                case 2:
                    f.entrada(num1, 5, "B");
                    flag1 = 1;
                break;

                case 3:
                    if (flag != 0 && flag1 != 0) {
                        f.imprime(num, 5, "A");
                        f.imprime(num1, 5, "B");
                    } else {
                        System.out.println("Escolha primeiro opções 1 e 2");
                    }
                break;

                case 4:
                    if (flag != 0 && flag1 != 0) {
                        f.soma(num, num1, 5);
                    } else {
                        System.out.println("Escolha primeiro opções 1 e 2");
                    }
                break;

                case 5:
                    if (flag != 0 && flag1 != 0) {
                        f.subtrai(num, num1, 5);
                    } else {
                        System.out.println("Escolha primeiro opções 1 e 2");
                    }
                break;

                case 6:
                    System.out.println("saindo do programa");
                default:
                    System.out.println("opção invalida");

            }
        } while (op != 6);
    }
}
