package Estruturas;

//Enumerable para identificar os tipos de bebida no sistema
public enum TipoBebida {
    Cafe(1), Cappuccino(2), Chocolate(3), Cha(4);

    private final int tipo;

    TipoBebida(int tipo) {
        this.tipo = tipo;
    }

    public int getTipoBebida() {
        return tipo;
    }
}
