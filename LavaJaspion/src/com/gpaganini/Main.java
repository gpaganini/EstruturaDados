package com.gpaganini;

public class Main {

    public static void main(String[] args) {

        Fila naoLavada = new Fila();
        Fila lavada = new Fila();

	    Carro A = new Carro();
        Carro B = new Carro();
        Carro C = new Carro();
        Carro D = new Carro();
        Carro E = new Carro();
        Carro F = new Carro();
        Carro G = new Carro();
        Carro H = new Carro();
        Carro I = new Carro();
        Carro J = new Carro();
        Carro K = new Carro();
        Carro L = new Carro();
        Carro M = new Carro();
        Carro N = new Carro();
        Carro O = new Carro();

        A.Ano = 1994;
        A.Modelo = "Marea";
        A.Placa = "AFJ-1897";

        B.Ano = 2005;
        B.Modelo = "Uno";
        B.Placa = "PRN-1907";

        C.Ano = 2007;
        C.Modelo = "Gol";
        C.Placa = "CKJ-7861";

        D.Ano = 2001;
        D.Modelo = "Civic";
        D.Placa = "ALK-9801";

        E.Ano = 1985;
        E.Modelo = "Fusca";
        E.Placa = "AJL-3247";

        F.Ano = 2012;
        F.Modelo = "Civic";
        F.Placa = "HGF-1895";

        G.Ano = 2008;
        G.Modelo = "Corsa";
        G.Placa = "MKS-7839";

        H.Ano = 2010;
        H.Modelo = "Palio";
        H.Placa = "JDF-3654";

        I.Ano = 2003;
        I.Modelo = "206";
        I.Placa = "JTK-1089";

        J.Ano = 2007;
        J.Modelo = "Celta";
        J.Placa = "KFT-7526";

        K.Ano = 2011;
        K.Modelo = "Elane";
        K.Placa = "JMG-5284";

        L.Ano = 2015;
        L.Modelo = "Citroen C4 Pallace";
        L.Placa = "AGE-1346";

        M.Ano = 2013;
        M.Modelo = "Eco Sport";
        M.Placa = "MSQ-9340";

        N.Ano = 2017;
        N.Modelo = "Mercedez C300";
        N.Placa = "LWO-8576";

        O.Ano = 2018;
        O.Modelo = "BMW GTR M3";
        O.Placa = "KTQ-9572";

        naoLavada.insere(A);
        naoLavada.insere(B);
        naoLavada.insere(C);
        naoLavada.insere(D);

        Carro carro = new Carro();
        carro = naoLavada.remove();
        A = (Carro)carro;
        lavada.insere(carro);

        naoLavada.insere(E);
        naoLavada.insere(F);
        naoLavada.insere(G);
        naoLavada.insere(H);

        carro = naoLavada.remove();
        B = (Carro)carro;
        lavada.insere(carro);

        naoLavada.insere(I);
        naoLavada.insere(J);
        naoLavada.insere(K);
        naoLavada.insere(L);

        carro = naoLavada.remove();
        C = (Carro)carro;
        lavada.insere(carro);

        naoLavada.insere(M);
        naoLavada.insere(N);
        naoLavada.insere(O);

        carro = naoLavada.remove();
        D = (Carro)carro;
        lavada.insere(carro);

        carro = naoLavada.remove();
        E = (Carro)carro;
        lavada.insere(carro);

        carro = naoLavada.remove();
        F = (Carro)carro;
        lavada.insere(carro);

        carro = naoLavada.remove();
        G = (Carro)carro;
        lavada.insere(carro);

        carro = naoLavada.remove();
        H = (Carro)carro;
        lavada.insere(carro);

        carro = naoLavada.remove();
        I = (Carro)carro;
        lavada.insere(carro);

        carro = naoLavada.remove();
        J = (Carro)carro;
        lavada.insere(carro);

        carro = naoLavada.remove();
        K = (Carro)carro;
        lavada.insere(carro);

        carro = naoLavada.remove();
        L = (Carro)carro;
        lavada.insere(carro);

        carro = naoLavada.remove();
        M = (Carro)carro;
        lavada.insere(carro);

        carro = naoLavada.remove();
        N = (Carro)carro;
        lavada.insere(carro);

        carro = naoLavada.remove();
        O = (Carro)carro;
        lavada.insere(carro);

        System.out.println("============================================="
        + "\nFila Lavada ordenada por Placa:");
        lavada.mostrarListaOrdenada();
    }
}
