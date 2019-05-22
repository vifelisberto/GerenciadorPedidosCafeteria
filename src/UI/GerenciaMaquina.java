package UI;

//Classe responsável por iniciar as variavéis de controle da maquina
import Estruturas.Bebida;
import Estruturas.FilaBebidasPedido;
import Estruturas.ListaPilhasBebidasEstoque;
import Estruturas.Pedido;
import Estruturas.PilhaBebidas;
import Estruturas.TipoBebida;
import java.awt.Frame;
import javax.swing.ImageIcon;
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
            for (int i = 0; i < 10; i++) {
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

    public static void ProcessaPedido(Pedido pedido, Frame frameParent) {
        FilaBebidasPedido filaBebidas = pedido.getBebidas();

        while (!filaBebidas.isEmpty()) {
            Bebida bebida = filaBebidas.dequeue();

            try {
                PilhaBebidas pilhaBebidas = listaEstoque.getTipoBebida(bebida.tipo);
                if (!pilhaBebidas.isEmpty()) {
                    pilhaBebidas.pop();

                    //Aqui é onde a bebida é tirada do estoque para ser entregue.
//                    String strPath = System.getProperty("user.dir") + "/src/UI/";
//                    ImageIcon img = new ImageIcon(strPath + "cafeFinal.png");
                    //JoptionPane que "entrega a bebida"
                    // JOptionPane.showMessageDialog(null, "Pegue seu " + bebida.tipo.name() + " =D", "Entrega Pedido - GustCoffee", JOptionPane.INFORMATION_MESSAGE, img);
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
