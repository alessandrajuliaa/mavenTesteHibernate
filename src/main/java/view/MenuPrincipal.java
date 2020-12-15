package view;

import com.itextpdf.text.DocumentException;
import controller.MenuPrincipalController;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import model.Agendamento;

public class MenuPrincipal extends javax.swing.JFrame {

    private final MenuPrincipalController controller;
    Agendamento agendamento = new Agendamento();
    
    public MenuPrincipal() {
        initComponents();
        controller = new MenuPrincipalController(this);
        controller.preencherTabela();
        try {
            controller.preencherComboBoxUsuario();
        } catch (ParseException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        desktop = new javax.swing.JDesktopPane();
        btnPesquisaData = new javax.swing.JButton();
        campoDeData = new javax.swing.JTextField();
        textDe3 = new javax.swing.JLabel();
        textDe1 = new javax.swing.JLabel();
        textDe = new javax.swing.JLabel();
        campoNomeCliente = new javax.swing.JTextField();
        textDe4 = new javax.swing.JLabel();
        campoAteData = new javax.swing.JTextField();
        textAte = new javax.swing.JLabel();
        btnAtualizarTabela = new javax.swing.JButton();
        comboBoxBarbeiro = new javax.swing.JComboBox<>();
        textAgenda = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnGerarRelatorioBarbeiro = new javax.swing.JButton();
        btnGerarRelatorio = new javax.swing.JButton();
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
        menuOpcoes = new javax.swing.JMenu();
        menuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(915, 545));
        setMinimumSize(new java.awt.Dimension(915, 545));
        setPreferredSize(new java.awt.Dimension(915, 545));
        setResizable(false);

        desktop.setBackground(new java.awt.Color(102, 102, 102));
        desktop.setAlignmentX(0.0F);
        desktop.setAlignmentY(0.0F);
        desktop.setMaximumSize(new java.awt.Dimension(915, 520));
        desktop.setMinimumSize(new java.awt.Dimension(915, 520));

        btnPesquisaData.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnPesquisaData.setText("Pesquisar");
        btnPesquisaData.setMargin(new java.awt.Insets(2, 7, 2, 7));
        btnPesquisaData.setPreferredSize(new java.awt.Dimension(110, 25));
        btnPesquisaData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaDataActionPerformed(evt);
            }
        });
        desktop.add(btnPesquisaData);
        btnPesquisaData.setBounds(260, 100, 110, 25);

        campoDeData.setPreferredSize(new java.awt.Dimension(80, 25));
        campoDeData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDeDataActionPerformed(evt);
            }
        });
        campoDeData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoDeDataKeyPressed(evt);
            }
        });
        desktop.add(campoDeData);
        campoDeData.setBounds(50, 100, 80, 25);

        textDe3.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        textDe3.setForeground(new java.awt.Color(255, 255, 255));
        textDe3.setText("Pesquisar por período:");
        desktop.add(textDe3);
        textDe3.setBounds(23, 80, 160, 15);

        textDe1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        textDe1.setForeground(new java.awt.Color(255, 255, 255));
        textDe1.setText("Por barbeiro:");
        desktop.add(textDe1);
        textDe1.setBounds(580, 80, 130, 15);

        textDe.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        textDe.setForeground(new java.awt.Color(255, 255, 255));
        textDe.setText("De:");
        textDe.setPreferredSize(new java.awt.Dimension(23, 25));
        desktop.add(textDe);
        textDe.setBounds(23, 100, 30, 25);

        campoNomeCliente.setPreferredSize(new java.awt.Dimension(190, 25));
        campoNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeClienteActionPerformed(evt);
            }
        });
        campoNomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoNomeClienteKeyPressed(evt);
            }
        });
        desktop.add(campoNomeCliente);
        campoNomeCliente.setBounds(380, 100, 190, 25);

        textDe4.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        textDe4.setForeground(new java.awt.Color(255, 255, 255));
        textDe4.setText("Por nome do cliente:");
        desktop.add(textDe4);
        textDe4.setBounds(380, 80, 150, 15);

        campoAteData.setToolTipText("");
        campoAteData.setName(""); // NOI18N
        campoAteData.setPreferredSize(new java.awt.Dimension(80, 25));
        campoAteData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAteDataActionPerformed(evt);
            }
        });
        campoAteData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoAteDataKeyPressed(evt);
            }
        });
        desktop.add(campoAteData);
        campoAteData.setBounds(170, 100, 80, 25);

        textAte.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        textAte.setForeground(new java.awt.Color(255, 255, 255));
        textAte.setText("Até:");
        textAte.setPreferredSize(new java.awt.Dimension(27, 25));
        desktop.add(textAte);
        textAte.setBounds(140, 100, 27, 25);

        btnAtualizarTabela.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnAtualizarTabela.setText("Atualizar Tabela");
        btnAtualizarTabela.setAlignmentY(0.0F);
        btnAtualizarTabela.setMargin(new java.awt.Insets(2, 7, 2, 7));
        btnAtualizarTabela.setPreferredSize(new java.awt.Dimension(150, 25));
        btnAtualizarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarTabelaActionPerformed(evt);
            }
        });
        desktop.add(btnAtualizarTabela);
        btnAtualizarTabela.setBounds(742, 100, 150, 25);

        comboBoxBarbeiro.setPreferredSize(new java.awt.Dimension(150, 25));
        comboBoxBarbeiro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxBarbeiroItemStateChanged(evt);
            }
        });
        comboBoxBarbeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxBarbeiroActionPerformed(evt);
            }
        });
        comboBoxBarbeiro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboBoxBarbeiroKeyPressed(evt);
            }
        });
        desktop.add(comboBoxBarbeiro);
        comboBoxBarbeiro.setBounds(580, 100, 150, 25);

        textAgenda.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        textAgenda.setForeground(new java.awt.Color(255, 255, 255));
        textAgenda.setText("Agenda");
        desktop.add(textAgenda);
        textAgenda.setBounds(410, 10, 110, 30);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabela);

        desktop.add(jScrollPane1);
        jScrollPane1.setBounds(23, 130, 870, 310);

        btnGerarRelatorioBarbeiro.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnGerarRelatorioBarbeiro.setText("Gerar Relatório Barbeiro");
        btnGerarRelatorioBarbeiro.setAlignmentY(0.0F);
        btnGerarRelatorioBarbeiro.setMargin(new java.awt.Insets(2, 7, 2, 7));
        btnGerarRelatorioBarbeiro.setPreferredSize(new java.awt.Dimension(210, 25));
        btnGerarRelatorioBarbeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarRelatorioBarbeiroActionPerformed(evt);
            }
        });
        desktop.add(btnGerarRelatorioBarbeiro);
        btnGerarRelatorioBarbeiro.setBounds(520, 450, 210, 25);

        btnGerarRelatorio.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnGerarRelatorio.setText("Gerar Relatório");
        btnGerarRelatorio.setAlignmentY(0.0F);
        btnGerarRelatorio.setMargin(new java.awt.Insets(2, 7, 2, 7));
        btnGerarRelatorio.setPreferredSize(new java.awt.Dimension(150, 25));
        btnGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarRelatorioActionPerformed(evt);
            }
        });
        desktop.add(btnGerarRelatorio);
        btnGerarRelatorio.setBounds(742, 450, 150, 25);

        backgroundBlack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backgroundBlack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/fundoBlack.png"))); // NOI18N
        backgroundBlack.setMaximumSize(new java.awt.Dimension(915, 518));
        backgroundBlack.setMinimumSize(new java.awt.Dimension(915, 518));
        backgroundBlack.setName(""); // NOI18N
        backgroundBlack.setPreferredSize(new java.awt.Dimension(915, 518));
        desktop.add(backgroundBlack);
        backgroundBlack.setBounds(0, 0, 915, 518);

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/backgroundImage.jpg"))); // NOI18N
        backgroundImage.setMaximumSize(new java.awt.Dimension(915, 518));
        backgroundImage.setMinimumSize(new java.awt.Dimension(915, 518));
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
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        controller.preencherTabela();
    }//GEN-LAST:event_btnAtualizarTabelaActionPerformed

    private void campoDeDataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDeDataKeyPressed
        
    }//GEN-LAST:event_campoDeDataKeyPressed

    private void comboBoxBarbeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxBarbeiroActionPerformed
        
    }//GEN-LAST:event_comboBoxBarbeiroActionPerformed

    private void comboBoxBarbeiroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboBoxBarbeiroKeyPressed
        
    }//GEN-LAST:event_comboBoxBarbeiroKeyPressed

    private void comboBoxBarbeiroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxBarbeiroItemStateChanged
        controller.pesquisaPorBarbeiro();
    }//GEN-LAST:event_comboBoxBarbeiroItemStateChanged

    private void campoDeDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDeDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDeDataActionPerformed

    private void btnPesquisaDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaDataActionPerformed
        controller.pesquisaPorData();
    }//GEN-LAST:event_btnPesquisaDataActionPerformed

    private void campoAteDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAteDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoAteDataActionPerformed

    private void campoAteDataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoAteDataKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoAteDataKeyPressed

    private void campoNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeClienteActionPerformed

    private void campoNomeClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNomeClienteKeyPressed
        controller.pesquisaPorCliente();
    }//GEN-LAST:event_campoNomeClienteKeyPressed

    private void btnGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelatorioActionPerformed
        try {
            controller.gerarRelatorio();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGerarRelatorioActionPerformed

    private void btnGerarRelatorioBarbeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelatorioBarbeiroActionPerformed
        try {
            controller.gerarRelatorioBarbeiro();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGerarRelatorioBarbeiroActionPerformed

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

    public JTable getTabela() {
        return tabela;
    }

    public void setTabela(JTable tabela) {
        this.tabela = tabela;
    }

    public JComboBox<String> getComboBoxBarbeiro() {
        return comboBoxBarbeiro;
    }

    public void setComboBoxBarbeiro(JComboBox<String> comboBoxBarbeiro) {
        this.comboBoxBarbeiro = comboBoxBarbeiro;
    }

    public JTextField getCampoAteData() {
        return campoAteData;
    }

    public void setCampoAteData(JTextField campoAteData) {
        this.campoAteData = campoAteData;
    }

    public JTextField getCampoDeData() {
        return campoDeData;
    }

    public void setCampoDeData(JTextField campoDeData) {
        this.campoDeData = campoDeData;
    }

    public JTextField getCampoNomeCliente() {
        return campoNomeCliente;
    }

    public void setCampoNomeCliente(JTextField campoNomeCliente) {
        this.campoNomeCliente = campoNomeCliente;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundBlack;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JButton btnAtualizarTabela;
    private javax.swing.JButton btnGerarRelatorio;
    private javax.swing.JButton btnGerarRelatorioBarbeiro;
    private javax.swing.JButton btnPesquisaData;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campoAteData;
    private javax.swing.JTextField campoDeData;
    private javax.swing.JTextField campoNomeCliente;
    private javax.swing.JComboBox<String> comboBoxBarbeiro;
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
    private javax.swing.JTable tabela;
    private javax.swing.JLabel textAgenda;
    private javax.swing.JLabel textAte;
    private javax.swing.JLabel textDe;
    private javax.swing.JLabel textDe1;
    private javax.swing.JLabel textDe3;
    private javax.swing.JLabel textDe4;
    // End of variables declaration//GEN-END:variables
}
