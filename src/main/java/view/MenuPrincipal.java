package view;

import controller.MenuPrincipalController;
import javax.swing.JDesktopPane;
import javax.swing.JMenuItem;

public class MenuPrincipal extends javax.swing.JFrame {

    private final MenuPrincipalController controller;
    
    public MenuPrincipal() {
        initComponents();
        controller = new MenuPrincipalController(this);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuAgenda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuCadastro = new javax.swing.JMenu();
        menuItemCliente = new javax.swing.JMenuItem();
        menuItemServicos = new javax.swing.JMenuItem();
        menuItemUsuario = new javax.swing.JMenuItem();
        menuOpcoes = new javax.swing.JMenu();
        menuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(980, 600));
        setPreferredSize(new java.awt.Dimension(1350, 750));

        desktop.setBackground(new java.awt.Color(102, 102, 102));
        desktop.setAlignmentX(0.0F);
        desktop.setAlignmentY(0.0F);
        desktop.setMinimumSize(new java.awt.Dimension(915, 520));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alessandra\\Downloads\\children-hairdresser-cutting-little-boy-against-a-dark.jpg")); // NOI18N
        desktop.add(jLabel1);
        jLabel1.setBounds(0, -5, 1580, 1050);

        menuBar.setBackground(new java.awt.Color(204, 204, 204));
        menuBar.setBorder(null);
        menuBar.setBorderPainted(false);
        menuBar.setPreferredSize(new java.awt.Dimension(208, 25));

        menuAgenda.setText("Operações");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem1.setText("Agendar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuAgenda.add(jMenuItem1);

        menuBar.add(menuAgenda);

        menuCadastro.setText("Cadastro");

        menuItemCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuItemCliente.setText("Cliente");
        menuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemCliente);

        menuItemServicos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuItemServicos.setText("Serviço");
        menuItemServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemServicosActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemServicos);

        menuItemUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuItemUsuario.setText("Usuário");
        menuItemUsuario.setEnabled(false);
        menuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUsuarioActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemUsuario);

        menuBar.add(menuCadastro);

        menuOpcoes.setText("Opções");

        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        menuOpcoes.add(menuItemSair);

        menuBar.add(menuOpcoes);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemClienteActionPerformed
        // TODO add your handling code here:
        controller.abrirCadastrarCliente();
    }//GEN-LAST:event_menuItemClienteActionPerformed

    private void menuItemServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemServicosActionPerformed
        // TODO add your handling code here:
        controller.abrirCadastrarServico();
    }//GEN-LAST:event_menuItemServicosActionPerformed

    private void menuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUsuarioActionPerformed
        // TODO add your handling code here:
        controller.abrirCadastrarUsuario();
    }//GEN-LAST:event_menuItemUsuarioActionPerformed

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        // TODO add your handling code here:
        controller.sairDoSistema();
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        controller.abrirAgenda();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    public JDesktopPane getDesktop() {
        return desktop;
    }

    public void setDesktop(JDesktopPane desktop) {
        this.desktop = desktop;
    }

    public JMenuItem getMenuItemUsuario() {
        return menuItemUsuario;
    }

    public void setMenuItemUsuario(JMenuItem menuItemUsuario) {
        this.menuItemUsuario = menuItemUsuario;
    }
    
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuAgenda;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuItemCliente;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JMenuItem menuItemServicos;
    private javax.swing.JMenuItem menuItemUsuario;
    private javax.swing.JMenu menuOpcoes;
    // End of variables declaration//GEN-END:variables
}
