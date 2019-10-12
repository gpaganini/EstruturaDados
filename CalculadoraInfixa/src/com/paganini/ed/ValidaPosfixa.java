package com.paganini.ed;
import java.util.Stack;

/**
 * Essa classe serve para realizar a validação e o cálculo de expressões numéricas Pós-fixas e Pré-fixas.
 * @version 1.0
 * @author Giovani Paganini
 */

public class ValidaPosfixa {

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
                return 2;
            case '^':
                return 3;
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

    /**
     *
     * @param expr recebe a expressão em formato infixo em uma String e converte para a notação pós-fixa
     *             ex: (2+3)*5
     * @return retorna a expressão em notação pós-fixa: 23+5*
     */
    static String infixoParaPosfixo(String expr) {
        /** Inicialização de string vazia pra resultado */
        String resultado = new String ("");

        /** Inicialização da pilha */
        Stack<Character> pilha = new Stack<>();

        /** Scaneia todos os caracteres */
        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            /** Se o caractere escaneado for um operando, empilhar */
            if (Character.isLetterOrDigit(c)) {
                resultado += c;
            } else if (c == '(') { /** Se o caractere escaneado for um '(', empilhar */
                pilha.push(c);
            } else if (c == ')') { /** Se o caractere escaneado for um ')', desempilhar e sair da pilha até algum '(' for encontrado */
                while (!pilha.isEmpty() && pilha.peek() != '(') {
                    resultado += pilha.pop();
                }

                if (!pilha.isEmpty() && pilha.peek() != '(') {
                    return "Expressão inválida";
                } else {
                    pilha.pop();
                }
            } else { /** Um operador é encontrado */
                while (!pilha.isEmpty() && PrecSinal(c) <= PrecSinal(pilha.peek())) {
                    if (pilha.peek() == '(') {
                        return "Expressão inválida";
                    }
                    resultado += pilha.pop();
                }
                pilha.push(c);
            }
        }

        /** Desempilhar todos os operadores da pilha */
        while (!pilha.isEmpty()) {
            if (pilha.peek() == '(') {
                return "Expressão inválida";
            }
            resultado += pilha.pop();
        }
        return resultado;
    }

    /**
     *
     * @param exp Recebe a expressão convertida no formato pós-fixo e realiza sua validação
     * @return Retorna o resultado da validação da expressão em formato pós-fixo
     */
    static int evaluatePostfix (String exp) {
        /** Inicialização da pilha */
        Stack<Integer> pilha = new Stack<>();

        /** Scaneia todos caracteres */
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            /** Se for um operando, empilhar */
            if (Character.isLetterOrDigit(c)) {
                pilha.push(c - '0');
            } else { /** Se for um operador, desempilhar dois elementos da pilha e aplicar o operador */
                int val1 = pilha.pop();
                int val2 = pilha.pop();

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
