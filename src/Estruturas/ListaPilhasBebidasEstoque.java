package Estruturas;

// Lista estática para armazenar pilhas de bebidas
public class ListaPilhasBebidasEstoque implements TADListaPilhasBebidasEstoque {

    private int inicio, fim, quantidade;
    private final PilhaBebidas lista[];

    public ListaPilhasBebidasEstoque(int tamanho) {
        lista = new PilhaBebidas[tamanho];
        inicio = fim = -1;
        quantidade = 0;
    }

    @Override
    public boolean isEmpty() {
        return quantidade == 0;
    }

    public boolean isFull() {
        return quantidade == lista.length;
    }

    @Override
    public int size() {
        return quantidade;
    }

    @Override
    public void add(PilhaBebidas pilhaBebida, int indice) throws IndexOutOfBoundsException {
        if (!isFull() && indice >= 0 && indice <= quantidade) {
            if (quantidade == 0) {
                inicio = 0;
            } else {
                for (int i = fim; i >= indice; i--) {
                    lista[i + 1] = lista[i];
                }
            }
            lista[indice] = pilhaBebida;
            quantidade++;
            fim++;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public boolean remove(int indice) throws IndexOutOfBoundsException {
        if (!isEmpty() && indice >= 0 && indice < quantidade) {
//            PilhaBebidas aux = lista[indice];
            if (quantidade == 1) {
                inicio--;
            } else {
                for (int i = indice; i < fim; i++) {
                    lista[i] = lista[i + 1];
                }
            }
            fim--;
            quantidade--;
            return true;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public boolean set(PilhaBebidas elemento, int indice) throws IndexOutOfBoundsException {
        if (!isEmpty() && indice >= 0 && indice < quantidade) {
//            PilhaBebidas aux = lista[indice];
            lista[indice] = elemento;
            return true;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public PilhaBebidas get(int indice) throws IndexOutOfBoundsException {
        if (!isEmpty() && indice >= 0 && indice < quantidade) {
            return lista[indice];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public PilhaBebidas getTipoBebida(TipoBebida tipoBebida) throws Exception {
        if (!isEmpty()) {
            for (int i = inicio; i <= fim; i++) {
                if (lista[i].getTipoPilha() == tipoBebida) {
                    return lista[i];
                }
            }
        }

        throw new Exception("Pilha vazia ou tipo não existe na lista");
    }
}
