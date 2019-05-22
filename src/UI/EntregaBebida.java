/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

/**
 *
 * @author asus
 */
public class EntregaBebida extends javax.swing.JDialog {

    /**
     * Creates new form EntregaBebida
     * @param parent
     * @param modal
     * @param bebida
     * @param nomeCliente
     */
    private final String nomeCliente;
    public EntregaBebida(java.awt.Frame parent, boolean modal, String bebida, String nomeCliente) {
        super(parent, modal);
        initComponents();
        
        this.nomeCliente = nomeCliente;
        this.getContentPane().setBackground(new Color(254, 244, 234));
        
        //Insere o nome da bebida no texto da tela.
//        lblBebidaPronta.setText(String.format(lblBebidaPronta.getText(), bebida));;;
//        

           
        //Insere o nome do cliente "no copo" da tela.
//        lblIconBebidaNomeCliente.setText(nomeCliente);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        lblIconBebidaNomeCliente = new JLabel(new javax.swing.ImageIcon(getClass().getResource("/Arquivos/cafeFimIcon (1).png"))) {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setFont(new java.awt.Font("Comic Sans MS", 1, 20));
                g.drawString(nomeCliente, 38, 123); //these are x and y positions
            }
        };
        btnPegarBebida = new javax.swing.JButton();
        lblBebidaPronta = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Entrega Bebida - GustCoffee ;)");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblIconBebidaNomeCliente.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblIconBebidaNomeCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconBebidaNomeCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arquivos/cafeFimIcon (1).png"))); // NOI18N
        lblIconBebidaNomeCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnPegarBebida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arquivos/pegarCafe.png"))); // NOI18N
        btnPegarBebida.setBorder(null);
        btnPegarBebida.setBorderPainted(false);
        btnPegarBebida.setContentAreaFilled(false);
        btnPegarBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPegarBebidaActionPerformed(evt);
            }
        });

        lblBebidaPronta.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lblBebidaPronta.setForeground(new java.awt.Color(96, 58, 37));
        lblBebidaPronta.setText("%s Pronto! Pegue-o!");
        lblBebidaPronta.setToolTipText("");

        jLayeredPane1.setLayer(lblIconBebidaNomeCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnPegarBebida, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblBebidaPronta, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lblIconBebidaNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btnPegarBebida)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 54, Short.MAX_VALUE)
                .addComponent(lblBebidaPronta)
                .addGap(48, 48, 48))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addComponent(lblBebidaPronta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(lblIconBebidaNomeCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPegarBebida)
                .addGap(0, 0, 0))
        );

        lblIconBebidaNomeCliente.getAccessibleContext().setAccessibleName("lblIconeNomeCliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPegarBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPegarBebidaActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_btnPegarBebidaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EntregaBebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntregaBebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntregaBebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntregaBebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EntregaBebida dialog = new EntregaBebida(new javax.swing.JFrame(), true, "", "");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPegarBebida;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBebidaPronta;
    private javax.swing.JLabel lblIconBebidaNomeCliente;
    // End of variables declaration//GEN-END:variables
}