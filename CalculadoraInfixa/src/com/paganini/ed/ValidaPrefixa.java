package com.paganini.ed;

import java.util.Stack;

public class ValidaPrefixa {

    static String posfixoParaPrefixo(String posfixo) {
        Stack<String> pilha = new Stack<>();

        for (int i = 0; i < posfixo.length(); i++) {
            char c = posfixo.charAt(i);

            if (ValidaOperacoes.isOperador(c)) {
                String op1 = pilha.peek();
                pilha.pop();
                String op2 = pilha.peek();
                pilha.pop();

                String temp = c + op2 + op1;

                pilha.push(temp);
            } else {
               pilha.push(c + "");
            }
        }
        return pilha.peek();

    }

    static int evaluatePrefix(String prefixo) {
        Stack<Integer> pilha = new Stack<>();

        for (int i = prefixo.length() -1; i >= 0; i--) {
            char c = prefixo.charAt(i);

            /** Se for um operando, empilhar */
            if (Character.isLetterOrDigit(c)) {
                pilha.push(c - '0');
            } else { /** Se for um operador, desempilhar dois elementos da pilha e aplicar o operador */
                int val1 = pilha.peek();
                pilha.pop();
                int val2 = pilha.peek();
                pilha.pop();

                /** Realizar o cálculo da expressão de acordo com o operador encontrado */
                switch (c) {
                    case '+':
                        pilha.push(val1 + val2);
                        break;
                    case '-':
                        pilha.push(val1 - val2);
                        break;
                    case '*':
                        pilha.push(val1 * val2);
                        break;
                    case '/':
                        pilha.push(val1 / val2);
                        break;
                    case '^':
                        pilha.push((int) Math.pow(val1, val2));
                        break;
                }
            }
        }

        /** Retorna resultado da expressão */
        return pilha.peek();
    }

    public int calcular(String s) {
        return evaluatePrefix(posfixoParaPrefixo(s));
    }
}

