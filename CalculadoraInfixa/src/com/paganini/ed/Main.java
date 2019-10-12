package com.paganini.ed;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        ValidaPosfixa valPos = new ValidaPosfixa();
        ValidaPrefixa valPre = new ValidaPrefixa();
        String exp = "(2+3)*5";

        String expressao = JOptionPane.showInputDialog("Digite uma operação no formato infixo: ");
        System.out.println("Expressão infixa digitada: " +expressao);
        System.out.println("Infixo para pós-fixo: " +valPos.infixoParaPosfixo(expressao));
        System.out.println("Resultado infixo para pós-fixo: " +valPos.calcular(expressao));
        System.out.println("Pós-fixo para Pré-fixo: " +valPre.posfixoParaPrefixo(valPos.infixoParaPosfixo(expressao)));
        System.out.println("Resultado pós-fixo para pré-fixo: " +valPre.calcular(valPos.infixoParaPosfixo(expressao)));



        /*String prefix = valPre.posfixoParaPrefixo(valPos.infixoParaPosfixo(exp));
        System.out.println("pos fixo para prefixo: " +prefix);

        System.out.println(valPre.evaluatePrefix(prefix));

        System.out.println("Calcular: " );*/

       // System.out.println("Posfixo2Prefixo validado: " +valPre.evaluatePrefix(post2pre));



        String exp2 = "231*+9-";


        /*String post = vp.infixoParaPosfixo(exp);
        System.out.println(vp.infixoParaPosfixo(exp));
        System.out.println(vp.postToPre(post));*/
    }
}
