package com.gpaganini;

import java.util.Stack;

public class HanoiIterativo {
    //substituição das chamadas recursivas por uma pilha decomandos
    private static Stack<String> pilha = new Stack<>();

    private static long numMov;

    // metodo que faz a movimentação e impressão
    private static void mover(int o, int d) {
        numMov++;
        System.out.println("[" + numMov + "]:" + o + "=>" + d);
    }

    //metodo que implementa o algoritmo de hanoi iterativo
    public static void hanoi(int n) {
        int o = 1;
        int d = 3;
        int t = 2;

        //monta e empilha o primeiro comando
        String comandoAtual = n + "," + o + "," + d + "," + t;
        pilha.push(comandoAtual);

        //chega ao fim quando a pilha estiver vazia
        while (!pilha.isEmpty()) {
            // se n for maior que 1, empilhar novo comando
            if (n > 1) {
                n--;
                String[] vetAux = comandoAtual.split(",");
                o = Integer.parseInt(vetAux[1]);
                d = Integer.parseInt(vetAux[2]);
                t = Integer.parseInt(vetAux[3]);


                comandoAtual = n + "," + o + "," + t + "," + d;

                // empilhar o novo comando
                pilha.push(comandoAtual);
            } else {

                // desempilha um comando
                comandoAtual = pilha.pop();

                // separa n, origem, destino e o pino de trabalho
                String[] vetAux = comandoAtual.split(",");
                n = Integer.parseInt(vetAux[0]);
                o = Integer.parseInt(vetAux[1]);
                d = Integer.parseInt(vetAux[2]);
                t = Integer.parseInt(vetAux[3]);

                // realiza o movimento
                mover(o, d);

                // se n > 1, empilhar o comando e depois o movimento
                if (n > 1) {
                    n--;
                    comandoAtual = n + "," + t + "," + d + "," + o;
                    pilha.push(comandoAtual);
                }
            }
        }
    }
}
