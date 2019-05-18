package Estruturas;

import java.util.NoSuchElementException;

public interface TADFilaBebidasPedido {
    public boolean isEmpty();
    public int size();
    public void enqueue(TipoBebida bebida, int qtd);
    public Bebida dequeue() throws NoSuchElementException;
    public Bebida front() throws NoSuchElementException;
}
