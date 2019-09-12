package com.gpaganini;

public class Main {

    public static void main(String[] args) {
        int anos;
        float a, b;

        a = 5000000;
        b = 7000000;
        anos = 0;

        while (a <= b) {
            a = a * 1.03f;
            b = b * 1.02f;
            anos++;
        }
        System.out.println("Anos: " +anos);
    }
}
