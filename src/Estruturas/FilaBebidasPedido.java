package Estruturas;

import java.util.NoSuchElementException;

public class FilaBebidasPedido implements TADFilaBebidasPedido {

    private Bebida inicio, fim;
    private int quantidade;

    public FilaBebidasPedido() {
        quantidade = 0;
        inicio = fim = null;
    }

    @Override
    public boolean isEmpty() {
        return quantidade == 0;
    }

    @Override
    public int size() {
        return quantidade;
    }

    @Override
    public void enqueue(TipoBebida bebida, int qtd) {

        while (qtd-- > 0) {
            Bebida novo = new Bebida(bebida);
            
            if (!isEmpty()) {
                fim.proximo = novo;
            } else {
                inicio = novo;
            }
            fim = novo;
            quantidade++;
        }
    }

    @Override
    public Bebida dequeue() throws NoSuchElementException {
        if (!isEmpty()) {
            Bebida aux = inicio;
            inicio = inicio.proximo;
            aux.proximo = null;
            quantidade--;
            if (inicio == null) {
                fim = null;
            }
            return aux;
        }
        throw new NoSuchElementException();
    }

    @Override
    public Bebida front() throws NoSuchElementException {
        if (!isEmpty()) {
            return inicio;
        }
        throw new NoSuchElementException();
    }
}
