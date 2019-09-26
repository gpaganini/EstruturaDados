package com.paganini.ed;

public class Main {

    public static void main(String[] args) {
        Numeros num = new Numeros();
        byte i;

        // leitura dos dados
        for (i = 0; i < 10; i++) {
            num.vovozinha[i] = i;
        }

        i = 0;
        while (i < 10) {
            System.out.println("O número na posição ["+i+"] é: " +num.vovozinha[i]);
            i++;
        }
    }
}
