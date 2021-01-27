package view;

import controller.TelaClienteController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

public class TelaCliente extends javax.swing.JInternalFrame {

    private final TelaClienteController controller;
    
     public TelaCliente() {
        initComponents();
        controller = new TelaClienteController(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textPesquisarCliente = new javax.swing.JLabel();
        textPesquisaNome = new javax.swing.JLabel();
        campoPesquisaCliente = new javax.swing.JTextField();
        btnPesquisarCliente = new javax.swing.JButton();
        caixaPesquisa = new javax.swing.JLabel();
        textInfo = new javax.swing.JLabel();
        textNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        textTelefone = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JTextField();
        caixaInfo = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cliente");
        setMaximumSize(new java.awt.Dimension(915, 520));
        setMinimumSize(new java.awt.Dimension(820, 395));
        setPreferredSize(new java.awt.Dimension(820, 360));
        getContentPane().setLayout(null);

        textPesquisarCliente.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textPesquisarCliente.setText("Pesquisar cliente:");
        getContentPane().add(textPesquisarCliente);
        textPesquisarCliente.setBounds(30, 13, 118, 16);

        textPesquisaNome.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textPesquisaNome.setText("Nome:");
        textPesquisaNome.setPreferredSize(new java.awt.Dimension(50, 28));
        getContentPane().add(textPesquisaNome);
        textPesquisaNome.setBounds(40, 40, 50, 28);

        campoPesquisaCliente.setMinimumSize(new java.awt.Dimension(64, 28));
        campoPesquisaCliente.setPreferredSize(new java.awt.Dimension(530, 28));
        campoPesquisaCliente.setSelectionEnd(5);
        campoPesquisaCliente.setSelectionStart(5);
        campoPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaClienteActionPerformed(evt);
            }
        });
        campoPesquisaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoPesquisaClienteKeyPressed(evt);
            }
        });
        getContentPane().add(campoPesquisaCliente);
        campoPesquisaCliente.setBounds(100, 40, 530, 28);

        btnPesquisarCliente.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnPesquisarCliente.setText("PESQUISAR");
        btnPesquisarCliente.setPreferredSize(new java.awt.Dimension(110, 28));
        btnPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisarCliente);
        btnPesquisarCliente.setBounds(650, 40, 110, 28);

        caixaPesquisa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        caixaPesquisa.setPreferredSize(new java.awt.Dimension(750, 50));
        getContentPane().add(caixaPesquisa);
        caixaPesquisa.setBounds(30, 30, 750, 50);

        textInfo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textInfo.setText("Informações:");
        getContentPane().add(textInfo);
        textInfo.setBounds(30, 100, 88, 20);

        textNome.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textNome.setText("Nome:");
        textNome.setPreferredSize(new java.awt.Dimension(42, 28));
        getContentPane().add(textNome);
        textNome.setBounds(40, 130, 50, 28);

        campoNome.setEnabled(false);
        campoNome.setPreferredSize(new java.awt.Dimension(640, 28));
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        getContentPane().add(campoNome);
        campoNome.setBounds(120, 130, 640, 28);

        textTelefone.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textTelefone.setText("Telefone:");
        textTelefone.setPreferredSize(new java.awt.Dimension(42, 28));
        getContentPane().add(textTelefone);
        textTelefone.setBounds(40, 170, 70, 28);

        campoTelefone.setToolTipText("");
        campoTelefone.setEnabled(false);
        campoTelefone.setPreferredSize(new java.awt.Dimension(640, 28));
        campoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(campoTelefone);
        campoTelefone.setBounds(120, 170, 640, 28);

        caixaInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        caixaInfo.setPreferredSize(new java.awt.Dimension(750, 90));
        getContentPane().add(caixaInfo);
        caixaInfo.setBounds(30, 120, 750, 90);

        btnExcluir.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.setPreferredSize(new java.awt.Dimension(110, 35));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(670, 250, 110, 35);

        btnEditar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setPreferredSize(new java.awt.Dimension(110, 35));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(460, 250, 110, 35);

        btnCadastrar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setPreferredSize(new java.awt.Dimension(110, 35));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(250, 250, 110, 35);

        btnNovo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnNovo.setText("NOVO");
        btnNovo.setPreferredSize(new java.awt.Dimension(110, 35));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo);
        btnNovo.setBounds(30, 250, 110, 35);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPesquisaClienteActionPerformed

    private void btnPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarClienteActionPerformed
        try {
            controller.pesquisarPorNome();
        } catch (SQLException ex) {
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPesquisarClienteActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefoneActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            controller.excluirCliente();
        } catch (SQLException ex) {
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            controller.editarCliente();
        } catch (SQLException ex) {
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            controller.cadastrarCliente();
        } catch (SQLException ex) {
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        try {
            controller.novoCliente();
        } catch (SQLException ex) {
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNovoActionPerformed

    private void campoPesquisaClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisaClienteKeyPressed
        try {
            controller.pesquisarPorNomeCampo();
        } catch (SQLException ex) {
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_campoPesquisaClienteKeyPressed

    public JTextField getCampoNome() {
        return campoNome;
    }

    public void setCampoNome(JTextField campoNome) {
        this.campoNome = campoNome;
    }

    public JTextField getCampoPesquisaCliente() {
        return campoPesquisaCliente;
    }

    public void setCampoPesquisaCliente(JTextField campoPesquisaCliente) {
        this.campoPesquisaCliente = campoPesquisaCliente;
    }

    public JTextField getCampoTelefone() {
        return campoTelefone;
    }

    public void setCampoTelefone(JTextField campoTelefone) {
        this.campoTelefone = campoTelefone;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisarCliente;
    private javax.swing.JLabel caixaInfo;
    private javax.swing.JLabel caixaPesquisa;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoPesquisaCliente;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JLabel textInfo;
    private javax.swing.JLabel textNome;
    private javax.swing.JLabel textPesquisaNome;
    private javax.swing.JLabel textPesquisarCliente;
    private javax.swing.JLabel textTelefone;
    // End of variables declaration//GEN-END:variables
}
