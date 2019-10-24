package com.paganini.ed;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
        FAT f = new FAT();

        long start = System.currentTimeMillis();
        System.out.println("Fatorial (R) de 5: " +f.calcfat(50));
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss:SS");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        System.out.println("Tempo de execução: " +dateFormat.format(new Date(elapsed)));


       // System.out.println("Fatorial (I) de 5: " +f.fatorialIterativo(20));
    }
}
