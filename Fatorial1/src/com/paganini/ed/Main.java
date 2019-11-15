package com.paganini.ed;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
        int n;
        FAT f = new FAT();

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de fatoriais: "));

        long start = System.currentTimeMillis();
        System.out.println("Fatorial (R) de ["+n+"]: " +f.fatorialIterativo(n));
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;

        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss:SS");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        System.out.println("Tempo de execução: " +dateFormat.format(new Date(elapsed)));


       // System.out.println("Fatorial (I) de 5: " +f.fatorialIterativo(20));
    }
}
