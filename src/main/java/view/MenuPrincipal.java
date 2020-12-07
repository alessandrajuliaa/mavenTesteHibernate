package view;

import controller.MenuPrincipalController;
import dao.AgendamentoDAO;
import dao.JPAUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import model.Agendamento;
import util.Data;
import util.ModeloTabela;

public class MenuPrincipal extends javax.swing.JFrame {

    private final MenuPrincipalController controller;
    Agendamento agendamento = new Agendamento();
    
    
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
        Data data = new Data(new Date());
        //data.dataFormatadaString()
        //this.getPesquisa().setText("05/12/2020");
        controller = new MenuPrincipalController(this);
        controller.preencherTabela();
        //controller.preencherComboBoxUsuario();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        desktop = new javax.swing.JDesktopPane();
        btnPesquisaData = new javax.swing.JButton();
        pesquisa = new javax.swing.JTextField();
        textPesquisarAgendamento = new javax.swing.JLabel();
        textDe3 = new javax.swing.JLabel();
        textDe1 = new javax.swing.JLabel();
        textDe = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        textDe4 = new javax.swing.JLabel();
        pesquisa1 = new javax.swing.JTextField();
        textAte = new javax.swing.JLabel();
        btnAtualizarTabela = new javax.swing.JButton();
        comboBoxBarbeiro = new javax.swing.JComboBox<>();
        caixaPesquisa = new javax.swing.JLabel();
        textAgenda = new javax.swing.JLabel();
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
        setResizable(false);

        desktop.setBackground(new java.awt.Color(102, 102, 102));
        desktop.setAlignmentX(0.0F);
        desktop.setAlignmentY(0.0F);
        desktop.setPreferredSize(new java.awt.Dimension(930, 570));

        btnPesquisaData.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnPesquisaData.setText("Pesquisar");
        btnPesquisaData.setPreferredSize(new java.awt.Dimension(100, 25));
        btnPesquisaData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaDataActionPerformed(evt);
            }
        });
        desktop.add(btnPesquisaData);
        btnPesquisaData.setBounds(270, 233, 100, 25);

        pesquisa.setPreferredSize(new java.awt.Dimension(70, 25));
        pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaActionPerformed(evt);
            }
        });
        pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pesquisaKeyPressed(evt);
            }
        });
        desktop.add(pesquisa);
        pesquisa.setBounds(70, 233, 70, 25);

        textPesquisarAgendamento.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textPesquisarAgendamento.setForeground(new java.awt.Color(255, 255, 255));
        textPesquisarAgendamento.setText("Pesquisar:");
        desktop.add(textPesquisarAgendamento);
        textPesquisarAgendamento.setBounds(30, 200, 70, 16);

        textDe3.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        textDe3.setForeground(new java.awt.Color(255, 255, 255));
        textDe3.setText("Período:");
        desktop.add(textDe3);
        textDe3.setBounds(40, 220, 60, 15);

        textDe1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        textDe1.setForeground(new java.awt.Color(255, 255, 255));
        textDe1.setText("Barbeiro:");
        desktop.add(textDe1);
        textDe1.setBounds(570, 220, 110, 15);

        textDe.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textDe.setForeground(new java.awt.Color(255, 255, 255));
        textDe.setText("De:");
        desktop.add(textDe);
        textDe.setBounds(40, 240, 30, 16);

        jTextField1.setText("jTextField1");
        jTextField1.setPreferredSize(new java.awt.Dimension(160, 25));
        desktop.add(jTextField1);
        jTextField1.setBounds(390, 233, 160, 25);

        textDe4.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        textDe4.setForeground(new java.awt.Color(255, 255, 255));
        textDe4.setText("Nome do cliente:");
        desktop.add(textDe4);
        textDe4.setBounds(390, 220, 110, 15);

        pesquisa1.setToolTipText("");
        pesquisa1.setName(""); // NOI18N
        pesquisa1.setPreferredSize(new java.awt.Dimension(70, 25));
        pesquisa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisa1ActionPerformed(evt);
            }
        });
        pesquisa1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pesquisa1KeyPressed(evt);
            }
        });
        desktop.add(pesquisa1);
        pesquisa1.setBounds(190, 233, 70, 25);

        textAte.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textAte.setForeground(new java.awt.Color(255, 255, 255));
        textAte.setText("Até:");
        desktop.add(textAte);
        textAte.setBounds(150, 240, 30, 16);

        btnAtualizarTabela.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnAtualizarTabela.setText("Atualizar Tabela");
        btnAtualizarTabela.setPreferredSize(new java.awt.Dimension(140, 25));
        btnAtualizarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarTabelaActionPerformed(evt);
            }
        });
        desktop.add(btnAtualizarTabela);
        btnAtualizarTabela.setBounds(750, 233, 140, 25);

        comboBoxBarbeiro.setPreferredSize(new java.awt.Dimension(160, 25));
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
        comboBoxBarbeiro.setBounds(570, 233, 160, 25);

        caixaPesquisa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        caixaPesquisa.setPreferredSize(new java.awt.Dimension(850, 50));
        desktop.add(caixaPesquisa);
        caixaPesquisa.setBounds(30, 220, 870, 50);

        textAgenda.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        textAgenda.setForeground(new java.awt.Color(255, 255, 255));
        textAgenda.setText("Agenda");
        desktop.add(textAgenda);
        textAgenda.setBounds(400, 70, 110, 30);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabela);

        desktop.add(jScrollPane1);
        jScrollPane1.setBounds(30, 270, 870, 250);

        backgroundBlack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backgroundBlack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/fundoBlack.png"))); // NOI18N
        backgroundBlack.setPreferredSize(new java.awt.Dimension(900, 570));
        desktop.add(backgroundBlack);
        backgroundBlack.setBounds(0, 0, 930, 570);

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/backgroundImage.jpg"))); // NOI18N
        backgroundImage.setName(""); // NOI18N
        backgroundImage.setPreferredSize(new java.awt.Dimension(915, 518));
        desktop.add(backgroundImage);
        backgroundImage.setBounds(0, 0, 930, 570);

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
        controller.preencherTabela();
    }//GEN-LAST:event_btnAtualizarTabelaActionPerformed

    private void pesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisaKeyPressed
        
    }//GEN-LAST:event_pesquisaKeyPressed

    private void comboBoxBarbeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxBarbeiroActionPerformed
        
    }//GEN-LAST:event_comboBoxBarbeiroActionPerformed

    private void comboBoxBarbeiroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboBoxBarbeiroKeyPressed
        
    }//GEN-LAST:event_comboBoxBarbeiroKeyPressed

    private void comboBoxBarbeiroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxBarbeiroItemStateChanged
        String pesquisa = this.getComboBoxBarbeiro().getSelectedItem().toString();
        System.out.println(pesquisa);
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        this.getTabela().setModel(new ModeloTabela(new AgendamentoDAO(em).selectPorBarbeiro(pesquisa)));
        em.getTransaction().commit();
        em.close();
    }//GEN-LAST:event_comboBoxBarbeiroItemStateChanged

    private void pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisaActionPerformed

    private void btnPesquisaDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaDataActionPerformed
        String pesquisa = this.getPesquisa().getText();
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        this.getTabela().setModel(new ModeloTabela(new AgendamentoDAO(em).selectPorData(pesquisa)));
        em.getTransaction().commit();
        em.close();
    }//GEN-LAST:event_btnPesquisaDataActionPerformed

    private void pesquisa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisa1ActionPerformed

    private void pesquisa1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisa1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisa1KeyPressed

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

    public JTextField getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(JTextField pesquisa) {
        this.pesquisa = pesquisa;
    }

    public JComboBox<String> getComboBoxBarbeiro() {
        return comboBoxBarbeiro;
    }

    public void setComboBoxBarbeiro(JComboBox<String> comboBoxBarbeiro) {
        this.comboBoxBarbeiro = comboBoxBarbeiro;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundBlack;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JButton btnAtualizarTabela;
    private javax.swing.JButton btnPesquisaData;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel caixaPesquisa;
    private javax.swing.JComboBox<String> comboBoxBarbeiro;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
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
    private javax.swing.JTextField pesquisa;
    private javax.swing.JTextField pesquisa1;
    private javax.swing.JTable tabela;
    private javax.swing.JLabel textAgenda;
    private javax.swing.JLabel textAte;
    private javax.swing.JLabel textDe;
    private javax.swing.JLabel textDe1;
    private javax.swing.JLabel textDe3;
    private javax.swing.JLabel textDe4;
    private javax.swing.JLabel textPesquisarAgendamento;
    // End of variables declaration//GEN-END:variables
}
