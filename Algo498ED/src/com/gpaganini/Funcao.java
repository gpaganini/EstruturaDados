package com.gpaganini;

import javax.swing.*;

public class Funcao {
    int pertence (int vetor[], int t, int chave) {
        int achou, i;
        achou = 0;
        i = 0;

        while (achou == 0 && i < t){
            if (vetor[i] == chave) {
                achou = 1;
            } else {
                i++;
            }
        }

        if (achou == 1) {
            achou = i;
        } else {
            achou = (-1);
        }
        return (achou);
    }

    int maiorElemento (int vet[], int tam) {
        int i, maior;
        i = 0;
        maior = 0;

        for (i = 1; i < tam; i++) {
            if (vet[i] > vet[maior]) {
                maior = i;
            }
        }
        return (maior);
    }

    void ultimo () {
        int vet[] = new int[1000];
        int num, i, quant, x, r;
        int total[] = new int[1000];

        for (i = 0; i < 1000; i++) {
            total[i] = 0;
        }
        num = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite numero: "));
        quant = 0;

        while (num != 0 && quant < 1000) {
            r = pertence(vet, quant, num);
            if (r != -1) {
                total[r]++;
            } else {
                vet[quant] = num;
                quant++;
            }
            num = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite numero: "));
        }

        x = maiorElemento(total, quant);
        for (i = 0; i < quant; i++) {
            System.out.println(i+1 + " - " + vet[i]);
        }

        System.out.println("Numero de maior concorrencia: " + vet[x] +
                "\nQuantidade: " + (total[x]+1));
    }
}
