package com.paganini.ed;

public class FAT {
    double calcfat(double x) {
        if (x == 0) {
            return 1;
        }
        return(x*calcfat(x-1));
    }

    long fatorialRecursivo(long n) {
        if (n <=1) {
            return 1;
        }
        return n*fatorialRecursivo(n-1);
    }

    long fatorialIterativo(long n) {
        long resultado = 1, i = 1;
        while (i<=n) {
            resultado *= i;
            i++;
        }
        return resultado;
    }
}
