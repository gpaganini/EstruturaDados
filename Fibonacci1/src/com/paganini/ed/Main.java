package com.paganini.ed;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
        int n;
        Fibo fibo = new Fibo();

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de termos:"));

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            System.out.println("(" + i + "):" +fibo.fibonacciIterativo(i));
        }
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;

        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss:SS");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        System.out.println("Tempo de execução: " +dateFormat.format(new Date(elapsed)));

    }
}
