package com.gpaganini;

public class Main {

    /*Dados um país A, com 5.000.000 de habitantes e uma taxa de natalidade de 3% ao ano,
    * e um país B, com 7.000.000 de habitantes e uma taxa de natalidade de 2% ao ano,
    * calcular e imprimir o tempo necessário para que a população do país A ultrapasse a
    * população do país B.*/

    public static void main(String[] args) {
        int anos;
        double a, b;

        a = 5000000;
        b = 7000000;
        anos = 0;

        while (a <= b) {
            a = a * 1.03;
            b = b * 1.02;
            anos++;
        }
        System.out.println("Anos: " +anos);
    }
}
