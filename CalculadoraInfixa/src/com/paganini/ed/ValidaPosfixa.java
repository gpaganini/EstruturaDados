package com.paganini.ed;

import java.util.Stack;

public class ValidaPosfixa {

    static int PrecSinal(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }

        return -1;
    }

    static boolean isOperador(char op) {
        switch (op) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
                return true;
        }
        return false;
    }


    static String infixoParaPosfixo(String expr) {
        String resultado = new String ("");

        Stack<Character> pilha = new Stack<>();
        //PilhaAR pilha = new PilhaAR();

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                resultado += c;
            } else if (c == '(') {
                pilha.push(c);
            } else if (c == ')') {
                while (!pilha.isEmpty() && pilha.peek() != '(') {
                    resultado += pilha.pop();
                }

                if (!pilha.isEmpty() && pilha.peek() != '(') {
                    return "Invalid Expression";
                } else {
                    pilha.pop();
                }
            } else {
                while (!pilha.isEmpty() && PrecSinal(c) <= PrecSinal(pilha.peek())) {
                    if (pilha.peek() == '(') {
                        return "Invalid Expression";
                    }
                    resultado += pilha.pop();
                }
                pilha.push(c);
            }
        }

        while (!pilha.isEmpty()) {
            if (pilha.peek() == '(') {
                return "Invalid Expression";
            }
            resultado += pilha.pop();
        } return resultado;
    }


    static String postToPre(String post_exp) {
        Stack<String> s = new Stack<>();

        for (int i = 0; i < post_exp.length(); i++) {
            if (isOperador(post_exp.charAt(i))) {
                String op1 = s.peek();
                s.pop();
                String op2 = s.peek();
                s.pop();

                String temp = post_exp.charAt(i) + op2 + op1;

                s.push(temp);
            } else {
                s.push(post_exp.charAt(i) + "");
            }
        }
        return s.peek();
    }

    /*static StringBuilder infixoParaPrefixo (String infixo) {
        int l = infixo.length();
        StringBuilder input = new StringBuilder();
        input.reverse();

        for (int i = 0; i < 1; i++) {
            char c = infixo.charAt(i);

            if (c == '(') {
                c = ')';
                c++;
            } else if (c == ')') {
                c = '(';
                c++;
            }
        }

        String prefix = infixoParaPosfixo(infixo);

        input.reverse(prefix);

    }*/

    /*static String infixoParaPrefixo (String expr) {
        String resultado = new String("");
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                resultado += c;
            } else if (c == ')') {
                pilha.push(c);
            } else if (c == '(') {
                while (!pilha.isEmpty() && pilha.peek() != ')') {
                    resultado += pilha.pop();
                }

                if (!pilha.isEmpty() && pilha.peek() != ')') {
                    return "Invalid Expression";
                } else {
                    pilha.pop();
                }
            } else {
                while (!pilha.isEmpty() && PrecSinal(c) <= PrecSinal(pilha.peek())) {
                    if (pilha.peek() == '(') {
                        return "Invalid Expression";
                    }
                    resultado += pilha.pop();
                }
                pilha.push(c);
            }
        }

        while (!pilha.isEmpty()) {
            if (pilha.peek() == '(') {
                return "Invalid Expression";
            }
            resultado += pilha.pop();
        } return resultado;

        for (int i = resultado.length() -1; i>=0; i--) {
            String t = "";
            t += expr.charAt(i);
            System.out.println("prefix: " +t);
        }



    }*/

    /*private String iS;
    private Stack s;
    public ValidaPosfixa(String iString){
        iS = iString;
        s = new Stack();
        String outputString = "";
        boolean fI = false;
        for(int i = 0;i < iS.length();i++){
            char curChar = iS.charAt(i);
            if(!isOperator(curChar)){
                outputString += Character.toString(curChar);
                if(i == (iS.length()-1)){
                    while(!s.empty()){
                        outputString += s.pop();
                    }
                }
            }else{
                if(fI){
                    if(pMin(curChar) && pMin((Character)s.peek())){
                        outputString += s.pop();
                        s.push(curChar);
                        if(i == (iS.length()-1)){
                            while(!s.empty()){
                                outputString += s.pop();
                            }
                        }
                    }else if(mDiv(curChar) && mDiv((Character)s.peek())){
                        outputString += s.pop();
                        s.push(curChar);
                        if(i == (iS.length()-1)){
                            while(!s.empty()){
                                outputString += s.pop();
                            }
                        }
                    }else if(pMin(curChar) && mDiv((Character)s.peek())){
                        outputString += s.pop();
                        s.push(curChar);
                        if(i == (iS.length()-1)){
                            while(!s.empty()){
                                outputString += s.pop();
                            }
                        }
                    }else if(mDiv(curChar) && pMin((Character)s.peek())){
                        s.push(curChar);
                        if(i == (iS.length()-1)){
                            while(!s.empty()){
                                outputString += s.pop();
                            }
                        }
                    }else{
                        outputString += Character.toString(curChar);
                        if(i == (iS.length()-1)){
                            while(!s.empty()){
                                outputString += s.pop();
                            }
                        }
                    }
                }else{
                    s.push(curChar);
                    fI = true;
                }
            }
        }
        System.out.println(outputString);
    }

    public boolean isOperator(char op){
        switch(op){
            case '+':
                return true;
            case '-':
                return true;
            case '/':
                return true;
            case '*':
                return true;
            case '^':
                return true;
            default:
                return false;
        }
    }

    public boolean pMin(char op){
        switch(op){
            case '+':
                return true;
            case '-':
                return true;
            default:
                return false;
        }
    }

    public boolean mDiv(char op){
        switch(op){
            case '*':
                return true;
            case '/':
                return true;
            default:
                return false;
        }
    }*/
}
