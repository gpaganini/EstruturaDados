package com.gpaganini;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    Num n = new Num();

	    n.a1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o primeiro termo:"));
        n.a2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o segundo termo:"));
        n.num = Integer.parseInt(JOptionPane.showInputDialog("Entre com n termos:"));

        n.soma = n.a1 + n.a2;

        if (n.num >= 3) {
            System.out.println(+n.a1 +n.a2);
            for (int i = 1; i <= n.num - 2; i++) {
                n.termo = n.a1 + n.a2;
                n.a1 = n.a2;
                n.a2 = n.termo;

                System.out.println(n.termo);
                n.soma = n.soma + n.termo;
            }
            System.out.println(n.soma);
        } else {
            System.out.println("Não tem serie");
        }
    }
}
