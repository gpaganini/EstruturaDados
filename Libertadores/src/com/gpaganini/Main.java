package com.gpaganini;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();
        Torcedor t = new Torcedor();

        for (int i = 0; i < 20; i++) {
            t.nome = JOptionPane.showInputDialog("Digite o nome do torcedor: ");
            t.ingresso = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de ingressos: "));
            t.programa = Integer.parseInt(JOptionPane.showInputDialog("Digite o programa: [1]GOLD || [2]SILVER || [3]IRON"));

            switch (t.programa) {
                case 1:
                    lista.AdicionaNoComeco("GOLD");
                    System.out.println("Torcedor: " + t.nome);
                    System.out.println("Quantidade de ingressos: " + t.ingresso);
                    System.out.println("PROGRAMA TORCEDOR GOLD");
                    break;

                case 2:
                    lista.Adiciona(5, "SILVER");
                    System.out.println("Torcedor: " + t.nome);
                    System.out.println("Quantidade de ingressos: " + t.ingresso);
                    System.out.println("PROGRAMA TORCEDOR SILVER");
                    break;

                case 3:
                    lista.Adiciona("IRON");
                    System.out.println("Torcedor: " + t.nome);
                    System.out.println("Quantidade de ingressos: " + t.ingresso);
                    System.out.println("PROGRAMA TORCEDOR IRON");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção não encontrada!");
            }
        }
        System.out.println(lista.Imprimir());
    }
}
