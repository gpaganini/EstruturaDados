package com.paganini.ed;


/**
 * Essa classe serve para realizar a validação de operadores e precedencia de sinais.
 * @version 1.1
 * @author Giovani Paganini
 */
public class ValidaOperacoes {
    /**
     *
     * @param ps Função para validação da precedencia do sinal: quanto maior o numero, maior a precedência
     * @return Retorna -1 caso não seja validada
     */
    static int PrecSinal(char ps) { /**  */
        switch (ps) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '^':
                return 2;
        }
        return -1;
    }

    /**
     *
     * @param op Função para verificação dos operadores
     * @return Retorna true por default
     */
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


}
