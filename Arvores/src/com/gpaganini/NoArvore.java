package com.gpaganini;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class NoArvore {
    int info;
    NoArvore direita = null;
    NoArvore esquerda = null;

    public void writeFile(NoArvore tree) {
        FileOutputStream outputStream = null;
        PrintWriter printWriter = null;

        try {
            outputStream = new FileOutputStream("Arve.txt");
            printWriter = new PrintWriter(outputStream);

            write(tree, printWriter);
            printWriter.flush();
        } catch (IOException e) {
            System.out.println("ERRO");
            printWriter.close();
        }
    }

    public void write(NoArvore tree, PrintWriter w) {
        if(tree != null) {
            write(tree.esquerda, w);
            w.println(tree.info);
            write(tree.direita, w);
        }
    }

    void Imp_Cres(NoArvore tree, PrintWriter w) {
        if(tree != null) {
            Imp_Cres(tree.esquerda, w);
            w.println(tree.info);
            Imp_Cres(tree.direita, w);
        }
    }

    NoArvore Search(NoArvore tree, int valor) {
        if (tree == null) {
            return (null);
        } else if (tree.info > valor) {
            return (Search(tree.esquerda,valor));
        } else if (tree.info < valor) {
            return Search(tree.direita, valor);
        } else {
            return tree;
        }
    }

    NoArvore InsereRaiz(NoArvore tree, int valor) {
        tree.info = valor;
        tree.direita = null;
        tree.esquerda = null;

        return tree;
    }

    NoArvore Insere(NoArvore tree, int valor) {
        if (tree == null) {
            tree = new NoArvore();
            tree.info = valor; tree.direita = null; tree.esquerda = null;
        } else if (valor < tree.info) {
            tree.esquerda = Insere(tree.esquerda, valor);
        } else {
            tree.direita = Insere(tree.direita, valor);
        }

        return tree;
    }

    NoArvore Retira(NoArvore tree, int valor) {
        if (tree == null) {
            System.out.println("Elemento não encontrado...:" +valor);
            return null;
        } else if (tree.info > valor) {
            tree.esquerda = Retira(tree.esquerda, valor);
        } else if (tree.info < valor) {
            tree.direita = Retira(tree.direita, valor);
        } else {
            if ((tree.esquerda == null) && (tree.direita == null)) {
                tree = null;
            } else if (tree.esquerda == null) {
                NoArvore novo = tree; tree = tree.direita;
            } else if (tree.direita == null) {
                NoArvore novo = tree; tree = tree.esquerda;
            } else {
                NoArvore novo = tree.esquerda;

                while (novo.direita != null) {
                    novo = novo.direita;
                }
                tree.info = novo.info;
                novo.info = valor; tree.esquerda = Retira(tree.esquerda,valor);
            }
        }
        return tree;
    }
}
