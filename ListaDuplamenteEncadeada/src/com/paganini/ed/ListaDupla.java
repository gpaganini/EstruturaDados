package com.paganini.ed;

public class ListaDupla {
    Celula Primeira;
    Celula Ultima;
    int totalDeElementos = 0;

    boolean posicaoOcupada(int pos) {
        return ((pos >= 0) && (pos < this.totalDeElementos));
    }

    Celula PegaCelula(int pos) {
        if (!this.posicaoOcupada(pos)) {
            throw new IllegalArgumentException("Posição não existe!");
        } else {
            Celula atual = this.Primeira;

            for (int i = 0; i < pos; i++) {
                atual = atual.getProxima();
            }
            return (atual);
        }
    }

    Object Pega (int pos) {
        return (this.PegaCelula(pos).getElemento());
    }

    void AdicionaNoComeco(Object elemento) {
        if (this.totalDeElementos == 0) {
            Celula nova = new Celula(elemento);
            this.Primeira = nova;
            this.Ultima = nova;
        } else {
            Celula nova = new Celula(this.Primeira, elemento);
            this.Primeira.setAnterior(nova);
            this.Primeira = nova;
        }
        this.totalDeElementos++;
    }

    void Adiciona(Object elemento) {
        if (this.totalDeElementos == 0) {
            this.AdicionaNoComeco(elemento);
        } else {
            Celula nova = new Celula(elemento);
            this.Ultima.setProxima(nova);
            nova.setAnterior(this.Ultima);
            this.Ultima = nova;
            this.totalDeElementos++;
        }
    }

    void Adiciona (int pos, Object elemento) {
        if (pos == 0) {
            this.AdicionaNoComeco(elemento);
        } else if (pos == this.totalDeElementos) {
            this.AdicionaNoComeco(elemento);
        } else {
            Celula anterior = this.PegaCelula(pos - 1);
            Celula proxima = anterior.getProxima();
            Celula nova = new Celula(anterior.getProxima(), elemento);
            nova.setAnterior(anterior);
            anterior.setProxima(nova);
            proxima.setAnterior(nova);
            this.totalDeElementos++;
        }
    }

    void RemoveDoComeco() {
        if (!this.posicaoOcupada(0)) {
            throw new IllegalArgumentException("Posição não existe!");
        } else {
            this.Primeira = this.Primeira.getProxima();
            this.totalDeElementos--;
        }

        if (this.totalDeElementos == 0) {
            this.Ultima = null;
        }

    }

    void RemoveDoFim() {
        if (!this.posicaoOcupada(totalDeElementos - 1)){
            throw new IllegalArgumentException("Posição não existe");
        } else {
            if (this.totalDeElementos == 1) {
                this.RemoveDoComeco();
            } else {
                Celula penultima = this.Ultima.getAnterior();
                penultima.setProxima(null);
                this.Ultima = penultima;
                this.totalDeElementos--;
            }
        }
    }

    void Remove (int pos) {
        if (!this.posicaoOcupada(pos)) {
            throw new IllegalArgumentException("Posição não existe!");
        } else {
            if (pos == 0) {
                this.RemoveDoComeco();
            } else if (pos == this.totalDeElementos - 1) {
                this.RemoveDoFim();
            } else {
                Celula anterior = this.PegaCelula(pos -1);
                Celula atual = anterior.getProxima();
                Celula proxima = atual.getProxima();
                anterior.setProxima(proxima);
                proxima.setAnterior(anterior);
                this.totalDeElementos--;
            }
        }
    }

    boolean Contem(Object elemento) {
        Celula atual = this.Primeira;
        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
                return (true);
            }
            atual = atual.getProxima();
        }
        return false;
    }

    int tamanho() {
        return this.totalDeElementos;
    }

    void EsvaziaLista() {
        this.Primeira = null;
        this.Ultima = null;
        this.totalDeElementos = 0;
    }

    String Imprimir() {
        if (this.totalDeElementos == 0) {
            return ("[]");
        } else {
            StringBuilder builder = new StringBuilder("[");
            Celula atual = this.Primeira;

            for (int i = 0; i < this.totalDeElementos -1; i++) {
                builder.append(atual.getElemento());
                builder.append(", ");
                atual.getProxima();
            }

            builder.append(atual.getElemento());
            builder.append("]");
            return builder.toString();
        }
    }
}