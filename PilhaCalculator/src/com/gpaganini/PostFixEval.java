package com.gpaganini;

import java.util.Stack;

public class PostFixEval {
    private String iS;
    private Stack s;

    public PostFixEval(String iString) {
        iS = iString;
        s = new Stack();

        String outputString = "";

        boolean first = false;

        for (int i = 0; i < iS.length(); i++) {
            char curChar = iS.charAt(i);

            if (!isOperator(curChar)) {
                outputString += Character.toString(curChar);
                if (i == iString.length() -1) {
                    while (!s.empty()) {
                        outputString += s.pop();
                    }
                }
            } else {
                if (first) {
                    if (pMin(curChar) && pMin((Character)s.peek())) {
                        outputString += s.pop();
                        s.push(curChar);
                        if (i == (iS.length())) {
                            
                        }
                    }
                }

            }
        }

    }

    public Boolean isOperator(char op) {
        switch (op) {
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

    public boolean pMin (char op) {
        switch (op) {
            case '+':
                return true;
            case '-':
                return true;
            default:
                return false;
        }
    }



}
