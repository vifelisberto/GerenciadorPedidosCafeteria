package Estruturas;

public interface TADListaBebidasEstoque {
    //TODO: DEFINIR SE IRÁ USAR ESTATICA OU DINAMICA, E TAMBÉM COMO ARMAZENAR OS ITENS
    public boolean isEmpty();
    public int size();
    public void add(Bebida bebida);
    public int remove(int indice) throws IndexOutOfBoundsException;
    public int set(Bebida bebida, int indice) throws IndexOutOfBoundsException;
    public int get(int indice) throws IndexOutOfBoundsException;
}
