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

        while (!filaBebidas.isEmpty()) {
            Bebida bebida = filaBebidas.dequeue();

            try {
                PilhaBebidas pilhaBebidas = listaEstoque.getTipoBebida(bebida.tipo);
                if (!pilhaBebidas.isEmpty()) {
                    pilhaBebidas.pop();

                    //Aqui é onde a bebida é tirada do estoque para ser entregue.
                    JOptionPane.showConfirmDialog(null, "Pegue seu " + bebida.tipo.name() + " =D", "ENTREGA", 2);
                } else {
                    JOptionPane.showMessageDialog(null, "Infelizmente não temos mais " + bebida.tipo.name() + " :(", "Alerta", 2);
                }

            } catch (Exception ex) {

            }
        }
    }

}
