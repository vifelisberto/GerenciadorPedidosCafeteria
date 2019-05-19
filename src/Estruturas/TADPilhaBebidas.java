package Estruturas;

import java.util.EmptyStackException;

public interface TADPilhaBebidas {
    public boolean isEmpty();
    public int size();
    public void push(TipoBebida tipoBebida) throws Exception;
    public Bebida pop() throws EmptyStackException;
    public Bebida top() throws EmptyStackException;
    public TipoBebida getTipoPilha();
}
