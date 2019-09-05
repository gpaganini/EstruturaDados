package com.gpaganini;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    Num n = new Num();

	    for (n.i = 1; n.i <=2; n.i++) {
	        n.nome = JOptionPane.showInputDialog("Digite Nome:");
	        n.sexo = JOptionPane.showInputDialog("Digite Sexo");
	        n.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite Idade:"));

	        if ((n.sexo.charAt(0) == 'm' || n.sexo.charAt(0) == 'M') && n.idade >= 21) {
	            JOptionPane.showMessageDialog(null, n.nome);
            }
        }
    }
}
