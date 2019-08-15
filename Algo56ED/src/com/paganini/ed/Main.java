package com.paganini.ed;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        p.nome = JOptionPane.showInputDialog("Digite seu nome: ");
        p.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

        String message = String.format("Nome: %s \nIdade: %d", p.nome, p.idade);

        JOptionPane.showMessageDialog(null, message);

    }
}
