package Estruturas;

public class Bebida {

    public TipoBebida tipo;
    protected int qtd; //verificar

    Bebida proximo;

    public Bebida(TipoBebida tipo) {
        this.qtd = 1;
        this.tipo = tipo;
        proximo = null;
    }

    public Bebida(TipoBebida tipo, int qtd) {
        this.qtd = qtd;
        this.tipo = tipo;
        proximo = null;
    }
}
