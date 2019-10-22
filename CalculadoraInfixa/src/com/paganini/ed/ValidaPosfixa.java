package com.paganini.ed;
import java.util.Stack;
import com.paganini.ed.ValidaOperacoes;

/**
 * Essa classe serve para realizar a validação e o cálculo de expressões numéricas Pós-fixas.
 * @version 1.1
 * @author Giovani Paganini
 */

public class ValidaPosfixa {
    /**
     *
     * @param infixo recebe a expressão em formato infixo em uma String e converte para a notação pós-fixa
     *             ex: (2+3)*5
     * @return retorna a expressão em notação pós-fixa: 23+5*
     */
    static String infixoParaPosfixo(String infixo) {
        /** Inicialização de string vazia pra resultado */
        String posfixo = new String ("");

        /** Inicialização da pilha */
        Stack<Character> pilha = new Stack<>();

        /** Scaneia todos os caracteres */
        for (int i = 0; i < infixo.length(); i++) {
            char c = infixo.charAt(i);

            /** Se o caractere escaneado for um operando, empilhar */
            if (Character.isLetterOrDigit(c)) {
                posfixo += c;
            } else if (c == '(') { /** Se o caractere escaneado for um '(', empilhar */
                pilha.push(c);
            } else if (c == ')') { /** Se o caractere escaneado for um ')', desempilhar e sair da pilha até algum '(' for encontrado */
                while (!pilha.isEmpty() && pilha.peek() != '(') {
                    posfixo += pilha.pop();
                }

                if (!pilha.isEmpty() && pilha.peek() != '(') {
                    return "Expressão inválida";
                } else {
                    pilha.pop();
                }
            } else { /** Um operador é encontrado */
                while (!pilha.isEmpty() && ValidaOperacoes.PrecSinal(c) <= ValidaOperacoes.PrecSinal(pilha.peek())) {
                    if (pilha.peek() == '(') {
                        return "Expressão inválida";
                    }
                    posfixo += pilha.pop();
                }
                pilha.push(c);
            }
        }

        /** Desempilhar todos os operadores da pilha */
        while (!pilha.isEmpty()) {
            if (pilha.peek() == '(') {
                return "Expressão inválida";
            }
            posfixo += pilha.pop();
        }
        return posfixo;
    }

    /**
     *
     * @param posfixo Recebe a expressão convertida no formato pós-fixo e realiza sua validação
     * @return Retorna o resultado da validação da expressão em formato pós-fixo
     */
    static int evaluatePostfix (String posfixo) {
        /** Inicialização da pilha */
        Stack<Integer> pilha = new Stack<>();

        /** Scaneia todos caracteres */
        for (int i = 0; i < posfixo.length(); i++) {
            char c = posfixo.charAt(i);

            /** Se for um operando, empilhar */
            if (Character.isLetterOrDigit(c)) {
                pilha.push(c - '0');
            } else { /** Se for um operador, desempilhar dois elementos da pilha e aplicar o operador */
                int val1 = pilha.pop();
                int val2 = pilha.pop();

                /** Realizar o cálculo da expressão de acordo com o operador encontrado */
                switch (c) {
                    case '+':
                        pilha.push(val2 + val1);
                        break;
                    case '-':
                        pilha.push(val2 - val1);
                        break;
                    case '*':
                        pilha.push(val2 * val1);
                        break;
                    case '/':
                        pilha.push(val2 / val1);
                        break;
                    case '^':
                        pilha.push((int) Math.pow(val2, val1));
                        break;
                }
            }
        }
        /** Retorna resultado da expressão */
        return pilha.pop();
    }

    /**
     *
     * @param s Recebe uma expressão e realiza o calculo
     * @return Retorna o resultado do cálculo
     */
    public int calcular(String s) {
        return evaluatePostfix(infixoParaPosfixo(s));
    }
}
