package UI;

//Classe responsável por iniciar as variavéis de controle da maquina
import Estruturas.Bebida;
import Estruturas.FilaBebidasPedido;
import Estruturas.ListaPilhasBebidasEstoque;
import Estruturas.Pedido;
import Estruturas.PilhaBebidas;
import Estruturas.TipoBebida;
import java.awt.Frame;
import javax.swing.JOptionPane;

public class GerenciaMaquina {

    //Lista de Pilhas de bebidas é usada como nosso ESTOQUE, todas as pilhas serão armazenadas nessa lista com as respectivas bebidas dentro de cada pilha
    public final static ListaPilhasBebidasEstoque LISTA_ESTOQUE = new ListaPilhasBebidasEstoque(4);

    //"liga a maquina" com as quantidades 'default' de itens
    static {

        PilhaBebidas pilhaCafe = new PilhaBebidas(TipoBebida.Cafe);
        PilhaBebidas pilhaCappuccino = new PilhaBebidas(TipoBebida.Cappuccino);
        PilhaBebidas pilhaChocolate = new PilhaBebidas(TipoBebida.Chocolate);
        PilhaBebidas pilhaCha = new PilhaBebidas(TipoBebida.Cha);

        try {
            for (int i = 0; i < 20; i++) {
                //Somente para ter valores diferentes como exemplo
                if (i < 15) {
                    pilhaCafe.push(TipoBebida.Cafe);
                }

                if (i < 15) {
                    pilhaCappuccino.push(TipoBebida.Cappuccino);
                }
                pilhaChocolate.push(TipoBebida.Chocolate);
                pilhaCha.push(TipoBebida.Cha);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro", 1);
        }

        //Depois das pilhas terem sido preenchidas, adicionamos cada uma na nossa lista(estoque)
        LISTA_ESTOQUE.add(pilhaCafe, 0);
        LISTA_ESTOQUE.add(pilhaCappuccino, 1);
        LISTA_ESTOQUE.add(pilhaChocolate, 2);
        LISTA_ESTOQUE.add(pilhaCha, 3);
    }

    public static void ProcessaPedido(Pedido pedido, Frame frameParent) {
        //Aqui pegamos a fila de bebidas que está no pedido.
        FilaBebidasPedido filaBebidas = pedido.getBebidas();

        //Enquanto nossa fila não estiver vazia, o sistema irá processar cada bebida que foi solicitada no pedido.
        while (!filaBebidas.isEmpty()) {
            //Pega a bebida da fila.
            Bebida bebida = filaBebidas.dequeue();

            try {
                //Busca a pilha pelo tipo (Café ou Cappuccino ou Chocolate ou Chá), retorna a pilha respectiva da lista.
                PilhaBebidas pilhaBebidas = LISTA_ESTOQUE.getTipoBebida(bebida.tipo);
                
                //Caso exista bebidas na pilha do tipo de bebida atual...
                if (!pilhaBebidas.isEmpty()) {
                    //A bebida é retirada da pilha do estoque para ser entregue ao usuário.
                    pilhaBebidas.pop();

                    //JDialog/Modal para exibir a bebida
                    EntregaBebida telaEntregaBebida = new EntregaBebida(frameParent, true, bebida.tipo.name(), pedido.getNomeCliente());
                    telaEntregaBebida.setLocationRelativeTo(frameParent);
                    telaEntregaBebida.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(frameParent, "Infelizmente não temos mais " + bebida.tipo.name() + " :(", "Alerta - GuestCoffee", 3);
                }

            } catch (Exception ex) {
                System.out.println("Erro ao realizar pedido, tente novamente: " + ex.getMessage());
            }
        }
    }

}
