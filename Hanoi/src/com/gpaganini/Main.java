package com.gpaganini;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
	    int n;
        TorresDeHanoi torresDeHanoi = new TorresDeHanoi();

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de discos"));

        long start = System.currentTimeMillis();
        //torresDeHanoi.hanoi(n, 1,3,2);
        HanoiIterativo.hanoi(n);
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;

        System.out.println("Início da execução: " +new SimpleDateFormat("HH:mm:ss:SS z").format(new Date(start)));
        System.out.println("Fim da execução: " +new SimpleDateFormat("HH:mm:ss:SS z").format(new Date(finish)));
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss:SS");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        System.out.println("Tempo de execução: " +dateFormat.format(new Date(elapsed)));
    }
}