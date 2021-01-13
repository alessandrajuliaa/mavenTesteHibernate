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
        jInternalFrame1 = new javax.swing.JInternalFrame();
        campoPesquisaServico1 = new javax.swing.JTextField();
        btnPesquisarAgendamento1 = new javax.swing.JButton();
        textIdPesquisa1 = new javax.swing.JLabel();
        textPesquisarServico1 = new javax.swing.JLabel();
        caixaPesquisa1 = new javax.swing.JLabel();
        textInfo1 = new javax.swing.JLabel();
        textId1 = new javax.swing.JLabel();
        campoId1 = new javax.swing.JTextField();
        textNome1 = new javax.swing.JLabel();
        campoNome1 = new javax.swing.JTextField();
        textPreco1 = new javax.swing.JLabel();
        campoPreco1 = new javax.swing.JTextField();
        caixaInfo1 = new javax.swing.JLabel();
        btnExcluir1 = new javax.swing.JButton();
        btnEditar1 = new javax.swing.JButton();
        btnCadastrar1 = new javax.swing.JButton();
        btnNovo1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Serviço");
        setMaximumSize(new java.awt.Dimension(915, 520));
        setMinimumSize(new java.awt.Dimension(915, 520));
        setPreferredSize(new java.awt.Dimension(915, 520));
        getContentPane().setLayout(null);

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
        getContentPane().add(campoPesquisaServico);
        campoPesquisaServico.setBounds(100, 40, 630, 28);

        btnPesquisarAgendamento.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnPesquisarAgendamento.setText("PESQUISAR");
        btnPesquisarAgendamento.setPreferredSize(new java.awt.Dimension(110, 28));
        btnPesquisarAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarAgendamentoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisarAgendamento);
        btnPesquisarAgendamento.setBounds(750, 40, 110, 28);

        textIdPesquisa.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textIdPesquisa.setText("Nome:");
        textIdPesquisa.setPreferredSize(new java.awt.Dimension(50, 28));
        getContentPane().add(textIdPesquisa);
        textIdPesquisa.setBounds(40, 40, 50, 28);

        textPesquisarServico.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textPesquisarServico.setText("Pesquisar serviço:");
        getContentPane().add(textPesquisarServico);
        textPesquisarServico.setBounds(27, 13, 122, 16);

        caixaPesquisa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        caixaPesquisa.setPreferredSize(new java.awt.Dimension(850, 50));
        getContentPane().add(caixaPesquisa);
        caixaPesquisa.setBounds(27, 30, 850, 50);

        textInfo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textInfo.setText("Outras informações:");
        getContentPane().add(textInfo);
        textInfo.setBounds(30, 150, 135, 20);

        textId.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textId.setText("Id:");
        textId.setPreferredSize(new java.awt.Dimension(42, 28));
        getContentPane().add(textId);
        textId.setBounds(40, 180, 30, 28);

        campoId.setEnabled(false);
        campoId.setPreferredSize(new java.awt.Dimension(760, 28));
        getContentPane().add(campoId);
        campoId.setBounds(100, 180, 760, 28);

        textNome.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textNome.setText("Nome:");
        textNome.setPreferredSize(new java.awt.Dimension(42, 28));
        getContentPane().add(textNome);
        textNome.setBounds(40, 220, 50, 28);

        campoNome.setEnabled(false);
        campoNome.setPreferredSize(new java.awt.Dimension(760, 28));
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        getContentPane().add(campoNome);
        campoNome.setBounds(100, 220, 760, 28);

        textPreco.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textPreco.setText("Preço:");
        textPreco.setPreferredSize(new java.awt.Dimension(42, 28));
        getContentPane().add(textPreco);
        textPreco.setBounds(40, 260, 50, 28);

        campoPreco.setToolTipText("");
        campoPreco.setEnabled(false);
        campoPreco.setPreferredSize(new java.awt.Dimension(760, 28));
        campoPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPrecoActionPerformed(evt);
            }
        });
        getContentPane().add(campoPreco);
        campoPreco.setBounds(100, 260, 760, 28);

        caixaInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        caixaInfo.setPreferredSize(new java.awt.Dimension(850, 170));
        getContentPane().add(caixaInfo);
        caixaInfo.setBounds(30, 170, 850, 130);

        btnExcluir.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.setPreferredSize(new java.awt.Dimension(110, 35));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(770, 420, 110, 35);

        btnEditar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setPreferredSize(new java.awt.Dimension(110, 35));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(530, 420, 110, 35);

        btnCadastrar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setPreferredSize(new java.awt.Dimension(110, 35));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(280, 420, 110, 35);

        btnNovo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnNovo.setText("NOVO");
        btnNovo.setPreferredSize(new java.awt.Dimension(110, 35));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo);
        btnNovo.setBounds(30, 420, 110, 35);

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setTitle("Serviço");
        jInternalFrame1.setMaximumSize(new java.awt.Dimension(915, 507));
        jInternalFrame1.setMinimumSize(new java.awt.Dimension(915, 507));
        jInternalFrame1.setPreferredSize(new java.awt.Dimension(915, 507));
        jInternalFrame1.getContentPane().setLayout(null);

        campoPesquisaServico1.setMaximumSize(new java.awt.Dimension(630, 28));
        campoPesquisaServico1.setMinimumSize(new java.awt.Dimension(630, 28));
        campoPesquisaServico1.setPreferredSize(new java.awt.Dimension(630, 28));
        campoPesquisaServico1.setSelectionEnd(5);
        campoPesquisaServico1.setSelectionStart(5);
        campoPesquisaServico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaServico1ActionPerformed(evt);
            }
        });
        campoPesquisaServico1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoPesquisaServico1KeyPressed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(campoPesquisaServico1);
        campoPesquisaServico1.setBounds(100, 40, 630, 28);

        btnPesquisarAgendamento1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnPesquisarAgendamento1.setText("PESQUISAR");
        btnPesquisarAgendamento1.setPreferredSize(new java.awt.Dimension(110, 28));
        btnPesquisarAgendamento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarAgendamento1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(btnPesquisarAgendamento1);
        btnPesquisarAgendamento1.setBounds(750, 40, 110, 28);

        textIdPesquisa1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textIdPesquisa1.setText("Nome:");
        textIdPesquisa1.setPreferredSize(new java.awt.Dimension(50, 28));
        jInternalFrame1.getContentPane().add(textIdPesquisa1);
        textIdPesquisa1.setBounds(40, 40, 50, 28);

        textPesquisarServico1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textPesquisarServico1.setText("Pesquisar serviço:");
        jInternalFrame1.getContentPane().add(textPesquisarServico1);
        textPesquisarServico1.setBounds(27, 13, 122, 16);

        caixaPesquisa1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        caixaPesquisa1.setPreferredSize(new java.awt.Dimension(850, 50));
        jInternalFrame1.getContentPane().add(caixaPesquisa1);
        caixaPesquisa1.setBounds(27, 30, 850, 50);

        textInfo1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textInfo1.setText("Outras informações:");
        jInternalFrame1.getContentPane().add(textInfo1);
        textInfo1.setBounds(30, 150, 135, 20);

        textId1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textId1.setText("Id:");
        textId1.setPreferredSize(new java.awt.Dimension(42, 28));
        jInternalFrame1.getContentPane().add(textId1);
        textId1.setBounds(40, 180, 30, 28);

        campoId1.setEnabled(false);
        campoId1.setPreferredSize(new java.awt.Dimension(760, 28));
        jInternalFrame1.getContentPane().add(campoId1);
        campoId1.setBounds(100, 180, 760, 28);

        textNome1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textNome1.setText("Nome:");
        textNome1.setPreferredSize(new java.awt.Dimension(42, 28));
        jInternalFrame1.getContentPane().add(textNome1);
        textNome1.setBounds(40, 220, 50, 28);

        campoNome1.setEnabled(false);
        campoNome1.setPreferredSize(new java.awt.Dimension(760, 28));
        campoNome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNome1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(campoNome1);
        campoNome1.setBounds(100, 220, 760, 28);

        textPreco1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textPreco1.setText("Preço:");
        textPreco1.setPreferredSize(new java.awt.Dimension(42, 28));
        jInternalFrame1.getContentPane().add(textPreco1);
        textPreco1.setBounds(40, 260, 50, 28);

        campoPreco1.setToolTipText("");
        campoPreco1.setEnabled(false);
        campoPreco1.setPreferredSize(new java.awt.Dimension(760, 28));
        campoPreco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPreco1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(campoPreco1);
        campoPreco1.setBounds(100, 260, 760, 28);

        caixaInfo1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        caixaInfo1.setPreferredSize(new java.awt.Dimension(850, 170));
        jInternalFrame1.getContentPane().add(caixaInfo1);
        caixaInfo1.setBounds(30, 170, 850, 130);

        btnExcluir1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnExcluir1.setText("EXCLUIR");
        btnExcluir1.setPreferredSize(new java.awt.Dimension(110, 35));
        btnExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(btnExcluir1);
        btnExcluir1.setBounds(770, 420, 110, 35);

        btnEditar1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnEditar1.setText("EDITAR");
        btnEditar1.setPreferredSize(new java.awt.Dimension(110, 35));
        btnEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(btnEditar1);
        btnEditar1.setBounds(530, 420, 110, 35);

        btnCadastrar1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnCadastrar1.setText("CADASTRAR");
        btnCadastrar1.setPreferredSize(new java.awt.Dimension(110, 35));
        btnCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrar1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(btnCadastrar1);
        btnCadastrar1.setBounds(280, 420, 110, 35);

        btnNovo1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnNovo1.setText("NOVO");
        btnNovo1.setPreferredSize(new java.awt.Dimension(110, 35));
        btnNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovo1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(btnNovo1);
        btnNovo1.setBounds(30, 420, 110, 35);

        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(0, 0, 915, 507);

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

    private void campoPesquisaServico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaServico1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPesquisaServico1ActionPerformed

    private void campoPesquisaServico1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisaServico1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPesquisaServico1KeyPressed

    private void btnPesquisarAgendamento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarAgendamento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarAgendamento1ActionPerformed

    private void campoNome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNome1ActionPerformed

    private void campoPreco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPreco1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPreco1ActionPerformed

    private void btnExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluir1ActionPerformed

    private void btnEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditar1ActionPerformed

    private void btnCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrar1ActionPerformed

    private void btnNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovo1ActionPerformed

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
    private javax.swing.JButton btnCadastrar1;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditar1;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExcluir1;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnNovo1;
    private javax.swing.JButton btnPesquisarAgendamento;
    private javax.swing.JButton btnPesquisarAgendamento1;
    private javax.swing.JLabel caixaInfo;
    private javax.swing.JLabel caixaInfo1;
    private javax.swing.JLabel caixaPesquisa;
    private javax.swing.JLabel caixaPesquisa1;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoId1;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNome1;
    private javax.swing.JTextField campoPesquisaServico;
    private javax.swing.JTextField campoPesquisaServico1;
    private javax.swing.JTextField campoPreco;
    private javax.swing.JTextField campoPreco1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel textId;
    private javax.swing.JLabel textId1;
    private javax.swing.JLabel textIdPesquisa;
    private javax.swing.JLabel textIdPesquisa1;
    private javax.swing.JLabel textInfo;
    private javax.swing.JLabel textInfo1;
    private javax.swing.JLabel textNome;
    private javax.swing.JLabel textNome1;
    private javax.swing.JLabel textPesquisarServico;
    private javax.swing.JLabel textPesquisarServico1;
    private javax.swing.JLabel textPreco;
    private javax.swing.JLabel textPreco1;
    // End of variables declaration//GEN-END:variables
}
