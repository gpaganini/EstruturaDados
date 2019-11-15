package com.gpaganini;

public class TorresDeHanoi {

    //realiza a impressão do algoritmo
    private static void mover(int o, int d) {
        System.out.println(o + " -> " + d);
    }

    //metodo que realiza a recursão
    // o = origem
    // d = destino
    // t = pino de trabalho
    static void hanoi(int n, int o, int d, int t) {
        if (n > 0) {
            hanoi(n - 1, o, t, d);
            mover(o, d);
            hanoi(n-1, t, d, o);
        }
    }
}
