package com.gpaganini;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) throws IOException {
        NoArvore arv = new NoArvore();
        int vet[]= new int[1000000];
        Random r = new Random();

        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss:SS");
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        FileWriter arq = new FileWriter("Arvore " +new SimpleDateFormat("dd_MMM_yyyy-HH_mm_ss").format(new Date(System.currentTimeMillis()))+".txt");
        PrintWriter gravaArq = new PrintWriter(arq);

        arv.InsereRaiz(arv, 0);

        for (int i=0; i < 1000000; i++) {
            arv.Insere(arv, r.nextInt(10000 + 1));
        }

        long start = System.currentTimeMillis();
        arv.Imp_Cres(arv, gravaArq);
        long finish = System.currentTimeMillis();

        long elapsed = finish - start;
        gravaArq.println("\nTempo de execução: " +df.format(new Date(elapsed)));

        arq.close();
    }
}
