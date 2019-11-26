package com.gpaganini;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Ordenadores ord = new Ordenadores();
        long vet[] = new long[1000000];
        Random r = new Random();

        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss:SS");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        FileWriter arq = new FileWriter("Ordenacao " +new SimpleDateFormat("dd_MMM_yyyy-HH_mm_ss").format(new Date(System.currentTimeMillis()))+".txt");
        PrintWriter gravaArq = new PrintWriter(arq);

        gravaArq.println("===Desordenado===\n");

        for (int i = 0; i < 1000000; i++) {
            gravaArq.println(vet[i] = r.nextInt(10000));
        }

        gravaArq.println("\n===Ordenado com QuickSort===\n");

        long start1 = System.currentTimeMillis();
        ord.quicksort(vet, 0, vet.length - 1);
        gravaArq.println(Arrays.toString(vet));
        long finish1 = System.currentTimeMillis();
        long elapsed1 = finish1 - start1;
        gravaArq.println("\nTempo de execução: " +dateFormat.format(new Date(elapsed1)));

        gravaArq.println("\n===Ordenado com BubbleSort===\n");

        long start2 = System.currentTimeMillis();
        ord.bubbleSort(vet);
        gravaArq.println(Arrays.toString(vet));
        long finish2 = System.currentTimeMillis();
        long elapsed2 = finish2 - start2;
        gravaArq.println("\nTempo de execução: " +dateFormat.format(new Date(elapsed2)));

        gravaArq.println("\n===Ordenado com SelectionSort===\n");

        long start3 = System.currentTimeMillis();
        ord.selectionSort(vet);
        gravaArq.println(Arrays.toString(vet));
        long finish3 = System.currentTimeMillis();
        long elapsed3 = finish3 - start3;
        gravaArq.println("\nTempo de execução: " +dateFormat.format(new Date(elapsed3)));

        long totalElapsed = finish3 - start1;
        gravaArq.println("\nTempo Total de execução: " +dateFormat.format(new Date(totalElapsed)));

        arq.close();
    }
}
