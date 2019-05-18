package Estruturas;

public class Bebida {

    TipoBebida tipo;
    int qtd; //verificar

    Bebida proximo;

    public Bebida(TipoBebida tipo, int qtd) {
        this.qtd = qtd;
        this.tipo = tipo; 
        proximo = null;
    }
}
