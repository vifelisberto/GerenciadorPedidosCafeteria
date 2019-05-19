package UI;

//Classe responsável por iniciar as variavéis de controle da maquina
import Estruturas.Bebida;
import Estruturas.FilaBebidasPedido;
import Estruturas.ListaPilhasBebidasEstoque;
import Estruturas.Pedido;
import Estruturas.PilhaBebidas;
import Estruturas.TipoBebida;
import javax.swing.JOptionPane;

public class GerenciaMaquina {

    public final static ListaPilhasBebidasEstoque listaEstoque = new ListaPilhasBebidasEstoque(4);

    //"liga a maquina" com as quantidades default de itens
    static {

        PilhaBebidas pilhaCafe = new PilhaBebidas(TipoBebida.Cafe);
        PilhaBebidas pilhaCappuccino = new PilhaBebidas(TipoBebida.Cappuccino);
        PilhaBebidas pilhaChocolate = new PilhaBebidas(TipoBebida.Chocolate);
        PilhaBebidas pilhaCha = new PilhaBebidas(TipoBebida.Cha);

        try {
            for (int i = 0; i < 50; i++) {
                pilhaCafe.push(TipoBebida.Cafe);
                pilhaCappuccino.push(TipoBebida.Cappuccino);
                pilhaChocolate.push(TipoBebida.Chocolate);
                pilhaCha.push(TipoBebida.Cha);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro", 1);
        }

        listaEstoque.add(pilhaCafe, 0);
        listaEstoque.add(pilhaCappuccino, 1);
        listaEstoque.add(pilhaChocolate, 2);
        listaEstoque.add(pilhaCha, 3);
    }

    public static void ProcessaPedido(Pedido pedido) {
        FilaBebidasPedido filaBebidas = pedido.getBebidas();

        Bebida bebida = filaBebidas.dequeue();

        try {
            listaEstoque.getTipoBebida(bebida.tipo);
        } catch (Exception ex) {
            System.out.println("Não existem bebidas disponíveis :'(");
        }

    }

}
