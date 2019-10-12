package com.paganini.ed;

import javax.swing.*;

public class PilhaAR {
    int[] pilha = new int[10];
    int topoPilha = -1;

    void esvazie_pilha() {
        this.topoPilha = -1;
    }

    int tamanho(){
        return(this.topoPilha + 1);
    }

    void imprimir(int topo) {
        for(int i = topo; i >= 0; i--) {
            System.out.println("Valor na pilha na posição " +"["+topo+"]:   " +this.pilha[i]);
        }
    }

    int push(int topo, int num) {
        this.topoPilha = topo;
        this.topoPilha++;

        if (this.topoPilha < 0) {
            this.topoPilha = 0;
        }

        if (this.topoPilha > 9) {
            JOptionPane.showMessageDialog(null,
                    "STACK OVERFLOW, ERROR: -999");
            return(this.topoPilha--);
        } else {
            this.pilha[this.topoPilha] = num;
            System.out.println("Inserindo o elemento " + num);
            return(this.topoPilha);
        }
    }

    int pop(int topo) {
        this.topoPilha = topo;
        this.topoPilha--;

        if (this.topoPilha < -1) {
            JOptionPane.showMessageDialog(null,
                    "Pilha vazia. Erro -997");
            return (-997);
        } else {
            System.out.println("Retirando o valor: "
                    +this.pilha[this.topoPilha + 1]);
            return (this.pilha[this.topoPilha + 1]);
        }

    }

    int top(int topo){
        this.topoPilha = topo;

        if (this.topoPilha < 0) {
            JOptionPane.showMessageDialog(null,
                    "Pilha vazia. Erro -998");
            return(-998);
        } else {
            System.out.println("O valor no topo da pilha é " +this.topoPilha+1); //TODO resto do codigo
            return (this.pilha[this.topoPilha]);
        }
    }

}
