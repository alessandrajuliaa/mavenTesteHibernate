package view;

import controller.MenuPrincipalController;
import javax.swing.JTable;

public class MenuPrincipal extends javax.swing.JFrame {

    private final MenuPrincipalController controller;
    
    public void abrirAgenda(){
        TelaAgendamento agenda = new TelaAgendamento();
        if(desktop.getAllFrames().length == 0){
            agenda.setVisible(true);
            desktop.add(agenda);
            agenda.toFront();
        }else{
            desktop.remove(desktop.getAllFrames()[0]);
            agenda.setVisible(true);
            desktop.add(agenda);
            agenda.toFront();
        }
    }
    public void abrirCadastrarCliente(){
        TelaCliente cliente = new TelaCliente();
        if(desktop.getAllFrames().length == 0){
            cliente.setVisible(true);
            desktop.add(cliente);
            cliente.toFront();
        }else{
            desktop.remove(desktop.getAllFrames()[0]);
            cliente.setVisible(true);
            desktop.add(cliente);
            cliente.toFront();
        }
    }
    public void abrirCadastrarProduto(){
        TelaProduto produto = new TelaProduto();
    
        if(desktop.getAllFrames().length == 0){
            produto.setVisible(true);
            desktop.add(produto);
            produto.toFront();
        }else{
            desktop.remove(desktop.getAllFrames()[0]);
            produto.setVisible(true);
            desktop.add(produto);
            produto.toFront();
        }
    }
    public void abrirCadastrarServico(){
        TelaServico servico = new TelaServico();
        if(desktop.getAllFrames().length == 0){
            servico.setVisible(true);
            desktop.add(servico);
            servico.toFront();
        }else{
            desktop.remove(desktop.getAllFrames()[0]);
            servico.setVisible(true);
            desktop.add(servico);
            servico.toFront();
        }
        //servico.setVisible(true);
        //desktop.add(servico);
    }
    public void abrirCadastrarUsuario(){
        TelaUsuario usuario = new TelaUsuario();
    
        if(desktop.getAllFrames().length == 0){
            usuario.setVisible(true);
            desktop.add(usuario);
            usuario.toFront();
        }else{
            desktop.remove(desktop.getAllFrames()[0]);
            usuario.setVisible(true);
            desktop.add(usuario);
            usuario.toFront();
        }
    }
    public void sairDoSistema(){
        new Login().setVisible(true);
        dispose();
    }
    
    public MenuPrincipal() {
        initComponents();
        controller = new MenuPrincipalController(this);
        controller.preencherTabelaAgendamentos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        textAgenda = new javax.swing.JLabel();
        btnAtualizarTabela = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        backgroundBlack = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuAgenda = new javax.swing.JMenu();
        menuItemAgenda = new javax.swing.JMenuItem();
        menuCadastro = new javax.swing.JMenu();
        menuItemCliente = new javax.swing.JMenuItem();
        menuItemServicos = new javax.swing.JMenuItem();
        menuItemUsuario = new javax.swing.JMenuItem();
        menuItemProduto = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        menuOpcoes = new javax.swing.JMenu();
        menuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(930, 570));
        setResizable(false);

        desktop.setBackground(new java.awt.Color(102, 102, 102));
        desktop.setAlignmentX(0.0F);
        desktop.setAlignmentY(0.0F);
        desktop.setPreferredSize(new java.awt.Dimension(930, 570));

        textAgenda.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        textAgenda.setForeground(new java.awt.Color(255, 255, 255));
        textAgenda.setText("Agenda");
        desktop.add(textAgenda);
        textAgenda.setBounds(410, 20, 110, 30);

        btnAtualizarTabela.setText("Atualizar");
        btnAtualizarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarTabelaActionPerformed(evt);
            }
        });
        desktop.add(btnAtualizarTabela);
        btnAtualizarTabela.setBounds(765, 160, 90, 22);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Hora", "Data", "Cliente", "Serviço", "Barbeiro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setPreferredSize(new java.awt.Dimension(810, 80));
        jScrollPane1.setViewportView(tabela);

        desktop.add(jScrollPane1);
        jScrollPane1.setBounds(50, 190, 810, 286);

        backgroundBlack.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alessandra\\Downloads\\fundo(4).png")); // NOI18N
        backgroundBlack.setPreferredSize(new java.awt.Dimension(900, 570));
        desktop.add(backgroundBlack);
        backgroundBlack.setBounds(16, 20, 880, 470);

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/fundo.png"))); // NOI18N
        backgroundImage.setName(""); // NOI18N
        backgroundImage.setPreferredSize(new java.awt.Dimension(915, 518));
        desktop.add(backgroundImage);
        backgroundImage.setBounds(0, 0, 915, 518);

        menuBar.setBackground(new java.awt.Color(204, 204, 204));
        menuBar.setBorder(null);
        menuBar.setBorderPainted(false);
        menuBar.setPreferredSize(new java.awt.Dimension(208, 25));

        menuAgenda.setText("Agenda");

        menuItemAgenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuItemAgenda.setText("Agenda");
        menuItemAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAgendaActionPerformed(evt);
            }
        });
        menuAgenda.add(menuItemAgenda);

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
        menuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUsuarioActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemUsuario);

        menuItemProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuItemProduto.setText("Produto");
        menuItemProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProdutoActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemProduto);

        menuBar.add(menuCadastro);

        menuRelatorio.setText("Relatório");
        menuBar.add(menuRelatorio);

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
            .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemClienteActionPerformed
        // TODO add your handling code here:
        abrirCadastrarCliente();
    }//GEN-LAST:event_menuItemClienteActionPerformed

    private void menuItemServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemServicosActionPerformed
        // TODO add your handling code here:
        abrirCadastrarServico();
    }//GEN-LAST:event_menuItemServicosActionPerformed

    private void menuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUsuarioActionPerformed
        // TODO add your handling code here:
        abrirCadastrarUsuario();
    }//GEN-LAST:event_menuItemUsuarioActionPerformed

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        // TODO add your handling code here:
        sairDoSistema();
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void menuItemProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProdutoActionPerformed
        abrirCadastrarProduto();
    }//GEN-LAST:event_menuItemProdutoActionPerformed

    private void menuItemAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAgendaActionPerformed
        abrirAgenda();
    }//GEN-LAST:event_menuItemAgendaActionPerformed

    private void btnAtualizarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarTabelaActionPerformed
        controller.preencherTabelaAgendamentos();
    }//GEN-LAST:event_btnAtualizarTabelaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    public JTable getTabela() {
        return tabela;
    }

    public void setTabela(JTable tabela) {
        this.tabela = tabela;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundBlack;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JButton btnAtualizarTabela;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menuAgenda;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuItemAgenda;
    private javax.swing.JMenuItem menuItemCliente;
    private javax.swing.JMenuItem menuItemProduto;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JMenuItem menuItemServicos;
    private javax.swing.JMenuItem menuItemUsuario;
    private javax.swing.JMenu menuOpcoes;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JTable tabela;
    private javax.swing.JLabel textAgenda;
    // End of variables declaration//GEN-END:variables
}
