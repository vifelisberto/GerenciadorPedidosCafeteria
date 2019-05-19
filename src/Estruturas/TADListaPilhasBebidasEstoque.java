package Estruturas;

public interface TADListaPilhasBebidasEstoque {
    public boolean isEmpty();
    public int size();
    public void add(PilhaBebidas pilhaBebida, int indice);
    public boolean remove(int indice) throws IndexOutOfBoundsException;
    public boolean set(PilhaBebidas pilhaBebida, int indice) throws IndexOutOfBoundsException;
    public PilhaBebidas get(int indice) throws IndexOutOfBoundsException;
    public PilhaBebidas getTipoBebida(TipoBebida tipoBebida) throws Exception;// faz get pelo tipo de pilha
}
