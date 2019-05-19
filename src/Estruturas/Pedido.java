package Estruturas;

public class Pedido {
    String nomeCliente;
    FilaBebidasPedido bebidas;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public FilaBebidasPedido getBebidas() {
        return bebidas;
    }

    public Pedido(String nomeCliente, FilaBebidasPedido bebidas) {
        this.nomeCliente = nomeCliente;
        this.bebidas = bebidas;
    }
    
}
