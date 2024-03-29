package com.gpaganini;

//elaborar uma funcao que converta um numero de base 10 para qualquer base entre 2 e 10.

public class Funcao {
    int converte(int nnum, int nbase) {
        int nb, r, b;
        b = 0;
        nb = 0;

        while (nnum >= nbase) {
            r = nnum % nbase;
            nb = (int) (nb + Math.pow(10, b) * r);
            nnum = nnum / nbase;
            b++;
        }
        nb = (int) (nb + Math.pow(10, b) * nnum);
        return (nb);
    }
}
