package com.paganini.ed;

public class Main {

    public static void main(String[] args) {
        Contador cont = new Contador();

        cont.x = 1;

        while (cont.x <= 10) {
            System.out.println("while o valor de x é: " +cont.x);
            cont.x++;
        }

        System.out.print("\n");

        cont.x = 1;

        do {
            System.out.println("do-while: O valor de x é: " +cont.x);
            cont.x++;
        } while (cont.x <= 10);

        System.out.print("\n");

        for (cont.x = 1; cont.x <= 10; cont.x++) {
            System.out.println("For: Valor de x é: " +cont.x);
        }


        /*for (int i = 1; i <= 512; i++) {
            if (i % 2 == 0){
                System.out.println("pares: " +i);
            }
        }*/
    }
}
