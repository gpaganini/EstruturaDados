package sample;

import com.sun.codemodel.internal.JOp;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String s;

        Paralelepipedo PP = new Paralelepipedo();

        s = JOptionPane.showInputDialog("Entre com o valor da Base: ");

        PP.dA = Double.parseDouble(s);
        System.out.println("yeet " +PP.dA);

        PP.dB = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da Altura: "));
        System.out.println("yoot " +PP.dB);

        PP.dC = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da Profundidade: "));
        System.out.println("yyak " +PP.dC);


        System.out.println("\nhmm yes the floor here is made out of floor");
    }
}
