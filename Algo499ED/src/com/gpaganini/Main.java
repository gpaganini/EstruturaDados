package com.gpaganini;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    int num[] = new int[5];
	    int l, flag, op;

	    Funcao f = new Funcao();
	    flag = 0;

	    for (l = 0; l < 5; l++) {
	        num[l] = 0;
        }

	    do {
            System.out.println("MENU VETOR - FUNCAO");
            System.out.println("1 DADOS DO VETOR");
            System.out.println("2 ORDENA VETOR");
            System.out.println("3 IMPRIME VETOR");
            System.out.println("4 SAI DO PROGRAMA");

            op = Integer.parseInt(JOptionPane.showInputDialog("OPÇÃO: "));

            switch (op) {
                case 1:
                    f.entrada(num, 5);
                    flag = 1;
                break;

                case 2:
                    if (flag == 1) {
                        f.ordena(num,5);
                    } else {
                        System.out.println("Escolha primeiro opção 1");
                    }
                break;

                case 3:
                    if (flag == 1) {
                        f.imprime(num, 5);
                    } else {
                        System.out.println("Escolha primeiro opção 1");
                    }
                break;

                case 4:
                    System.out.println("Saindo do algoritmo");
                    break;
                default:
                    System.out.println("\nOPÇÃO INVALIDA\n");
            }
        } while (op != 4);
    }
}
