package Estruturas;

public class Bebida {

    public TipoBebida tipo;
    protected int qtd; //Usada para o controle de quantidade de bebidas no pedido.

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
