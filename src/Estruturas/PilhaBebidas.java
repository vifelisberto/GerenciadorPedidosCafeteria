package Estruturas;

// Pilha dinamica para armazenas bebidas
import java.util.EmptyStackException;

public class PilhaBebidas implements TADPilhaBebidas {

    private Bebida topo;
    private final TipoBebida tipoPilha;

    public PilhaBebidas(TipoBebida tipoPilha) {
        topo = null;
        this.tipoPilha = tipoPilha;
    }

    @Override
    public boolean isEmpty() {
        return topo == null;
    }

    @Override
    public int size() {
        int cont = 0;
        Bebida aux = topo;
        while (aux != null) {
            cont++;
            aux = aux.proximo;
        }
        return cont;
    }

    @Override
    public void push(TipoBebida tipoBebida) throws Exception {
        //Verifica se a nova bebida é do tipo da pilha
        if (this.tipoPilha == tipoBebida) {
            Bebida novo = new Bebida(tipoBebida);
            novo.proximo = topo;
            topo = novo;
        } else {
            throw new Exception("Somente bebidas do tipo: " + this.tipoPilha.name() + " podem ser adicionadas nessa pilha.");
        }
    }

    @Override
    public Bebida pop() throws EmptyStackException {
        if (!isEmpty()) {
            Bebida aux = topo;
            topo = topo.proximo;
            aux.proximo = null;
            return aux;
        }
        throw new EmptyStackException();
    }

    @Override
    public Bebida top() throws EmptyStackException {
        if (!isEmpty()) {
            return topo;
        }
        throw new EmptyStackException();
    }
    
    @Override
    public TipoBebida getTipoPilha(){
        return this.tipoPilha;
    }
}
