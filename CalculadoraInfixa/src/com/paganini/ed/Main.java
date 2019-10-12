package com.paganini.ed;

public class Main {

    public static void main(String[] args) {
        ValidaPosfixa vp = new ValidaPosfixa();

        String exp = "(2+3)*5";
        System.out.println(exp);
        String exp2 = "231*+9-";
        System.out.println("Conversão infixa para pós fixa: " +vp.infixoParaPosfixo(exp));
        System.out.println("Validação Pós Fixa: " +vp.evaluatePostfix(vp.infixoParaPosfixo(exp)));

        /*String post = vp.infixoParaPosfixo(exp);
        System.out.println(vp.infixoParaPosfixo(exp));
        System.out.println(vp.postToPre(post));*/
    }
}
