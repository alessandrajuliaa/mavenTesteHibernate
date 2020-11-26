package view;

public class MenuPrincipal extends javax.swing.JFrame {

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
        }
        //cliente.setVisible(true);
        //desktop.add(cliente);
    }
    public void abrirCadastrarProduto(){
        TelaUsuario usuario = new TelaUsuario();
    
        if(desktop.getAllFrames().length == 0){
            usuario.setVisible(true);
            desktop.add(usuario);
            usuario.toFront();
        }else{
            desktop.remove(desktop.getAllFrames()[0]);
            usuario.setVisible(true);
            desktop.add(usuario);
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
        }
    }
    public void sairDoSistema(){
        new Login().setVisible(true);
        dispose();
    }
    
    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        campoPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAgenda = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        textAgenda = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuAgenda = new javax.swing.JMenu();
        menuCadastro = new javax.swing.JMenu();
        menuItemCliente = new javax.swing.JMenuItem();
        menuItemServicos = new javax.swing.JMenuItem();
        menuItemUsuario = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        menuOpcoes = new javax.swing.JMenu();
        menuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(930, 570));

        desktop.setBackground(new java.awt.Color(102, 102, 102));
        desktop.setAlignmentX(0.0F);
        desktop.setAlignmentY(0.0F);
        desktop.setPreferredSize(new java.awt.Dimension(930, 570));

        campoPesquisa.setBackground(new java.awt.Color(250, 250, 250));
        campoPesquisa.setPreferredSize(new java.awt.Dimension(290, 30));
        campoPesquisa.setSelectionEnd(5);
        campoPesquisa.setSelectionStart(5);
        campoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaActionPerformed(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnPesquisar.setText("PESQUISAR");
        btnPesquisar.setPreferredSize(new java.awt.Dimension(115, 30));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tabelaAgenda.setBackground(new java.awt.Color(250, 250, 250));
        tabelaAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cliente", "Data", "Hora", "Serviço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaAgenda);

        textAgenda.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        textAgenda.setForeground(new java.awt.Color(255, 255, 255));
        textAgenda.setText("Agenda");

        desktop.setLayer(campoPesquisa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(btnPesquisar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(textAgenda, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, desktopLayout.createSequentialGroup()
                        .addComponent(campoPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopLayout.createSequentialGroup()
                .addContainerGap(398, Short.MAX_VALUE)
                .addComponent(textAgenda)
                .addGap(430, 430, 430))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(textAgenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        menuBar.setBackground(new java.awt.Color(204, 204, 204));
        menuBar.setBorder(null);
        menuBar.setBorderPainted(false);
        menuBar.setPreferredSize(new java.awt.Dimension(208, 25));

        menuAgenda.setText("Agenda");
        menuBar.add(menuAgenda);

        menuCadastro.setText("Cadastro");

        menuItemCliente.setText("Cliente");
        menuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemCliente);

        menuItemServicos.setText("Serviços");
        menuItemServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemServicosActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemServicos);

        menuItemUsuario.setText("Usuário");
        menuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUsuarioActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemUsuario);

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

    private void campoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPesquisaActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenu menuAgenda;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuItemCliente;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JMenuItem menuItemServicos;
    private javax.swing.JMenuItem menuItemUsuario;
    private javax.swing.JMenu menuOpcoes;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JTable tabelaAgenda;
    private javax.swing.JLabel textAgenda;
    // End of variables declaration//GEN-END:variables
}
