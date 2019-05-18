package Estruturas;

public class Pedido {
    String nomeCliente;
    FilaBebidasPedido bebidas;

    public Pedido(String nomeCliente, FilaBebidasPedido bebidas) {
        this.nomeCliente = nomeCliente;
        this.bebidas = bebidas;
    }
}
