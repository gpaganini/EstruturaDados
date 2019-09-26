package com.paganini.ed;

import javax.swing.*;

public class Main {

    // perguntar se tem carburador
    // dizer que nao tem carburador
    // código insiste que tem carburador
    // enquanto disser que não tem carburador = tem carburador
    // se disser que tem carburador, questionar que a santana é nova e tem injeção eletrônica
    //

    public static void main(String[] args) {
        int havere = JOptionPane.showConfirmDialog(null,
                "Havère carburatore?");

        while (havere == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "NO HA CARBURATORE");
        }havere++;
    }
}
