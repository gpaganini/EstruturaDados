package com.gpaganini;

import javax.swing.*;

public class PilhaAR {
    int[] pilha = new int [10]; //pilha;
    int topopilha=-1; //iniciação do topo da pilha;

    //metodos

    //esvaziar pilha
    int esvazie_pilha(){
        this.topopilha= -1;
        return (this.topopilha);
    }


    //retornar o tamanho da pilha
    int tamanho(){
        return(this.topopilha+1);
    }

    //imprimir pilha e mostrar posição do valor;
    void imprimir (int topo){
        for(int i=topo;i>=0;i--){
            System.out.println("IMPRESSÃO EM PROGRESSO...");
            System.out.println("Valor na Pilha ["+i+"]: " +this.pilha[i]);
        }
    }

    //empilha um valor na pilha
    int push(int topo,int num) {
        this.topopilha = topo;
        this.topopilha++;

        if (this.topopilha < 0) {
            this.topopilha = 0;
        }

        if (this.topopilha > 9) {
            JOptionPane.showMessageDialog(null,
                    "Estouro de pilha, erro: -999");
            return(this.topopilha--);
        } else {
            this.pilha[this.topopilha] = num;
            System.out.println("Empilhando o elemento: " +num);
            return (this.topopilha);
        }
    }

    //desempilhar valor da pilha
    int pop (int topo) {
        this.topopilha = topo;
        this.topopilha--;

        if (this.topopilha < -1) {
            JOptionPane.showMessageDialog(null,
                    "Pilha vazia. Erro -997");
            return (-997);
        } else {
            System.out.println("Desempilhando o valor: "+this.pilha[this.topopilha+1]);
            return (this.topopilha);
        }
    }

    //exibir topo da pilha
    int top(int topo){
        this.topopilha = topo;

        if (this.topopilha < 0 ) {
            JOptionPane.showMessageDialog(null,
                    "Pilha vazia. ERRO: -998");
            return (-998);
        } else {
            System.out.println("O valor do topo da pilha é: " +this.pilha[this.topopilha]);
            return (this.pilha[this.topopilha]);
        }
    }
}
