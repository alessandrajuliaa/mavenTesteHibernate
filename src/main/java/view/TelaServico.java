package view;

import controller.TelaServicoController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

public class TelaServico extends javax.swing.JInternalFrame {
    
    private TelaServicoController controller;
    public TelaServico() {
        initComponents();
        controller = new TelaServicoController(this);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoPesquisaServico = new javax.swing.JTextField();
        btnPesquisarAgendamento = new javax.swing.JButton();
        textIdPesquisa = new javax.swing.JLabel();
        textPesquisarServico = new javax.swing.JLabel();
        caixaPesquisa = new javax.swing.JLabel();
        textInfo = new javax.swing.JLabel();
        textId = new javax.swing.JLabel();
        campoId = new javax.swing.JTextField();
        textNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        textPreco = new javax.swing.JLabel();
        campoPreco = new javax.swing.JTextField();
        caixaInfo = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();

        setClosable(true);
        setTitle("Serviço");
        setMaximumSize(new java.awt.Dimension(915, 507));
        setMinimumSize(new java.awt.Dimension(915, 507));
        setPreferredSize(new java.awt.Dimension(915, 507));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoPesquisaServico.setMaximumSize(new java.awt.Dimension(630, 28));
        campoPesquisaServico.setMinimumSize(new java.awt.Dimension(630, 28));
        campoPesquisaServico.setPreferredSize(new java.awt.Dimension(630, 28));
        campoPesquisaServico.setSelectionEnd(5);
        campoPesquisaServico.setSelectionStart(5);
        campoPesquisaServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaServicoActionPerformed(evt);
            }
        });
        campoPesquisaServico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoPesquisaServicoKeyPressed(evt);
            }
        });
        getContentPane().add(campoPesquisaServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        btnPesquisarAgendamento.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnPesquisarAgendamento.setText("PESQUISAR");
        btnPesquisarAgendamento.setPreferredSize(new java.awt.Dimension(110, 28));
        btnPesquisarAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarAgendamentoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisarAgendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, -1, -1));

        textIdPesquisa.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textIdPesquisa.setText("Nome:");
        textIdPesquisa.setPreferredSize(new java.awt.Dimension(50, 28));
        getContentPane().add(textIdPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 50, -1));

        textPesquisarServico.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textPesquisarServico.setText("Pesquisar serviço:");
        getContentPane().add(textPesquisarServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 13, -1, -1));

        caixaPesquisa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        caixaPesquisa.setPreferredSize(new java.awt.Dimension(850, 50));
        getContentPane().add(caixaPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 30, -1, -1));

        textInfo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textInfo.setText("Outras informações:");
        getContentPane().add(textInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 20));

        textId.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textId.setText("Id:");
        textId.setPreferredSize(new java.awt.Dimension(42, 28));
        getContentPane().add(textId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 30, -1));

        campoId.setEnabled(false);
        campoId.setPreferredSize(new java.awt.Dimension(760, 28));
        getContentPane().add(campoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        textNome.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textNome.setText("Nome:");
        textNome.setPreferredSize(new java.awt.Dimension(42, 28));
        getContentPane().add(textNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 50, -1));

        campoNome.setEnabled(false);
        campoNome.setPreferredSize(new java.awt.Dimension(760, 28));
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        getContentPane().add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        textPreco.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textPreco.setText("Preço:");
        textPreco.setPreferredSize(new java.awt.Dimension(42, 28));
        getContentPane().add(textPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 50, -1));

        campoPreco.setToolTipText("");
        campoPreco.setEnabled(false);
        campoPreco.setPreferredSize(new java.awt.Dimension(760, 28));
        campoPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPrecoActionPerformed(evt);
            }
        });
        getContentPane().add(campoPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        caixaInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        caixaInfo.setPreferredSize(new java.awt.Dimension(850, 170));
        getContentPane().add(caixaInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 130));

        btnExcluir.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.setPreferredSize(new java.awt.Dimension(110, 35));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 420, -1, -1));

        btnEditar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setPreferredSize(new java.awt.Dimension(110, 35));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, -1, -1));

        btnCadastrar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setPreferredSize(new java.awt.Dimension(110, 35));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, -1, -1));

        btnNovo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnNovo.setText("NOVO");
        btnNovo.setPreferredSize(new java.awt.Dimension(110, 35));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoPesquisaServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPesquisaServicoActionPerformed

    private void btnPesquisarAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarAgendamentoActionPerformed
        try {
            controller.pesquisarPorNome();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPesquisarAgendamentoActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPrecoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            controller.excluirServico();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            controller.editarServico();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        controller.cadastrarServico();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        try {
            controller.novoServico();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNovoActionPerformed

    private void campoPesquisaServicoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisaServicoKeyPressed
        try {
            controller.pesquisarPorNomeCampo();
        } catch (SQLException ex) {
            Logger.getLogger(TelaServico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_campoPesquisaServicoKeyPressed

    public JTextField getCampoId() {
        return campoId;
    }

    public void setCampoId(JTextField campoId) {
        this.campoId = campoId;
    }

    public JTextField getCampoNome() {
        return campoNome;
    }

    public void setCampoNome(JTextField campoNome) {
        this.campoNome = campoNome;
    }

    public JTextField getCampoPesquisaServico() {
        return campoPesquisaServico;
    }

    public void setCampoPesquisaServico(JTextField campoPesquisaServico) {
        this.campoPesquisaServico = campoPesquisaServico;
    }

    public JTextField getCampoPreco() {
        return campoPreco;
    }

    public void setCampoPreco(JTextField campoPreco) {
        this.campoPreco = campoPreco;
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisarAgendamento;
    private javax.swing.JLabel caixaInfo;
    private javax.swing.JLabel caixaPesquisa;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoPesquisaServico;
    private javax.swing.JTextField campoPreco;
    private javax.swing.JLabel textId;
    private javax.swing.JLabel textIdPesquisa;
    private javax.swing.JLabel textInfo;
    private javax.swing.JLabel textNome;
    private javax.swing.JLabel textPesquisarServico;
    private javax.swing.JLabel textPreco;
    // End of variables declaration//GEN-END:variables
}
