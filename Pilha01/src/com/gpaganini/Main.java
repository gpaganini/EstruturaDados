package com.gpaganini;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int op;

        PilhaAR pilha = new PilhaAR();

        int topo = -1;
        int valor = 0;

        do {
            System.out.println("\n==== MENU DA PILHA ====");
            System.out.println("1 - EMPILHAR NÚMEROS");
            System.out.println("2 - DESEMPILHAR NÚMEROS");
            System.out.println("3 - VERIFICAR TOPO");
            System.out.println("4 - IMPRIMIR");
            System.out.println("99 - SAIR DO PROGRAMA");
            System.out.println("=========================");

            op = Integer.parseInt(JOptionPane.showInputDialog("DIGITE SUA OPÇÃO: "));

            switch (op) {
                case 1:
                    topo = pilha.push(topo,7);
                    topo = pilha.push(topo,3);
                    topo = pilha.push(topo,5);
                    topo = pilha.push(topo,6);
                    topo = pilha.push(topo,4);
                    topo = pilha.push(topo,8);
                    topo = pilha.push(topo,9);
                    topo = pilha.push(topo,2);
                break;

                case 2:
                    topo = pilha.pop(topo);
                break;

                case 3:
                    valor = pilha.top(topo);
                break;

                case 4:
                    pilha.imprimir(topo);
                break;

                case 99:
                    System.out.println("SAINDO DO PROGRAMA [3].. [2].. [1]..");
                break;

                default:
                    System.out.println("OPÇÃO INVÁLIDA");
            }
        } while (op != 99);
    }
}
