package com.gpaganini;

public class Main {

    public static void main(String[] args) {
	    Num n = new Num();

	    n.soma = 0;

	    for (n.i = 26; n.i <= 198; n.i = (n.i +2)) {
	        n.soma = n.soma + n.i;
        }
        System.out.println("Soma 26 - 128: " +n.soma);
    }
}
