package com.gpaganini;

class NoArvore {
    int info;
    NoArvore direita = null;
    NoArvore esquerda = null;


    private void Imp_Cres(NoArvore tree) {
        if(tree != null) {
            Imp_Cres(tree.esquerda);
            System.out.println(tree.info);
            Imp_Cres(tree.direita);
        }
    }

    private NoArvore Search(NoArvore tree, int valor) {
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

    private NoArvore InsereRaiz(NoArvore tree, int valor) {
        tree.info = valor;
        tree.direita = null;
        tree.esquerda = null;

        return tree;
    }

    private NoArvore Insere(NoArvore tree, int valor) {
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

    private NoArvore Retira(NoArvore tree, int valor) {
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
