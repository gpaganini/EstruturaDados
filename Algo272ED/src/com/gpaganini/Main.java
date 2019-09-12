package com.gpaganini;

public class Main {

    public static void main(String[] args) {
	    int anos;
	    float c, j;

	    c = 1.5f;
	    j = 1.1f;
	    anos = 0;

	    while (j <= c) {
	        c = c + 0.02f;
	        j = j + 0.03f;
	        anos++;
        }
		System.out.println("Anos: " +anos);
    }
}
