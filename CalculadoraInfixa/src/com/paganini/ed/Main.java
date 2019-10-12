package com.paganini.ed;

public class Main {

    public static void main(String[] args) {
        ValidaPosfixa vp = new ValidaPosfixa();

        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        String post = vp.infixoParaPosfixo(exp);
        System.out.println(vp.infixoParaPosfixo(exp));
        System.out.println(vp.postToPre(post));
    }
}
