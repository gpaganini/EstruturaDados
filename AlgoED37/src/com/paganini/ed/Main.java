package com.paganini.ed;

public class Main {

    public static void main(String[] args) {
	    Numeros num = new Numeros();

	    num.iNum1 = 50;
	    num.iNum2 = 100;

	    num.iNum1 = num.iNum1 * num.iNum2;

        System.out.println(num.iNum1);

    }
}
