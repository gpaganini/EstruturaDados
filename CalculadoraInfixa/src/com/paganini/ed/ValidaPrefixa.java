package com.paganini.ed;

import java.util.Stack;

public class ValidaPrefixa {

    /**
     *
     * @param posfixo Recebe a expressão em notação pós-fixa e realiza a conversão para pré-fixa
     * @return retorna a expressão convertida em pré-fixa
     */
    static String posfixoParaPrefixo(String posfixo) {
        /** Inicialização da pilha */
        Stack<String> pilha = new Stack<>();

        /** Scaneia todos os caracteres */
        for (int i = 0; i < posfixo.length(); i++) {
            char c = posfixo.charAt(i);

            /** Verifica se é operador e desempilha dois elementos da pilha */
            if (ValidaOperacoes.isOperador(c)) {
                String op1 = pilha.peek();
                pilha.pop();
                String op2 = pilha.peek();
                pilha.pop();

                /** Concatena os operandos com operador */
                String temp = c + op2 + op1;

                /** Empilha novamente na pilha */
                pilha.push(temp);
            } else {
                /** Empilha o operando na pilha */
                pilha.push(c + "");
            }
        }
        /** Retorna o a expressão convertida */
        return pilha.peek();
    }

    static int evaluatePrefix(String prefixo) {
        /** Inicialização da Pilha */
        Stack<Integer> pilha = new Stack<>();

        /** Scaneia todos os caracteres */
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

    /**
     *
     * @param s Recebe uma expressão e realiza o calculo
     * @return Retorna o resultado do cálculo
     */
    public int calcular(String s) {
        return evaluatePrefix(posfixoParaPrefixo(s));
    }
}

