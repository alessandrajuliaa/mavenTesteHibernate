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

        separaatorVBP = new javax.swing.JSeparator();
        separaatorVCP = new javax.swing.JSeparator();
        separaatorVEP = new javax.swing.JSeparator();
        separaatorVDP = new javax.swing.JSeparator();
        textEmailPesquisa = new javax.swing.JLabel();
        campoPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        separatorVCM = new javax.swing.JSeparator();
        separatorVEM = new javax.swing.JSeparator();
        separatorVDM = new javax.swing.JSeparator();
        separatorVBM = new javax.swing.JSeparator();
        textId = new javax.swing.JLabel();
        campoId = new javax.swing.JTextField();
        textNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        textPreco = new javax.swing.JLabel();
        campoPreco = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        separatorVBM2 = new javax.swing.JSeparator();

        setClosable(true);
        setTitle("Serviço");
        setPreferredSize(new java.awt.Dimension(915, 507));

        separaatorVBP.setPreferredSize(new java.awt.Dimension(850, 3));

        separaatorVCP.setPreferredSize(new java.awt.Dimension(850, 3));

        separaatorVEP.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separaatorVEP.setPreferredSize(new java.awt.Dimension(3, 100));

        separaatorVDP.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separaatorVDP.setPreferredSize(new java.awt.Dimension(3, 100));

        textEmailPesquisa.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textEmailPesquisa.setText("Código:");

        campoPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        campoPesquisa.setPreferredSize(new java.awt.Dimension(640, 28));
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

        separatorVCM.setPreferredSize(new java.awt.Dimension(850, 3));

        separatorVEM.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separatorVEM.setPreferredSize(new java.awt.Dimension(3, 300));

        separatorVDM.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separatorVDM.setPreferredSize(new java.awt.Dimension(3, 300));

        separatorVBM.setPreferredSize(new java.awt.Dimension(850, 3));

        textId.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        textId.setText("CÓDIGO");
        textId.setPreferredSize(new java.awt.Dimension(37, 28));

        campoId.setEnabled(false);
        campoId.setPreferredSize(new java.awt.Dimension(700, 28));
        campoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIdActionPerformed(evt);
            }
        });

        textNome.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        textNome.setText("NOME");
        textNome.setPreferredSize(new java.awt.Dimension(38, 28));

        campoNome.setPreferredSize(new java.awt.Dimension(700, 28));
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        textPreco.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        textPreco.setText("PREÇO");
        textPreco.setPreferredSize(new java.awt.Dimension(64, 28));

        campoPreco.setPreferredSize(new java.awt.Dimension(700, 28));
        campoPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPrecoActionPerformed(evt);
            }
        });

        btnNovo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnNovo.setText("NOVO");
        btnNovo.setPreferredSize(new java.awt.Dimension(120, 45));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setPreferredSize(new java.awt.Dimension(120, 45));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setPreferredSize(new java.awt.Dimension(120, 45));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.setPreferredSize(new java.awt.Dimension(120, 45));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        separatorVBM2.setPreferredSize(new java.awt.Dimension(850, 3));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 903, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(textEmailPesquisa))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(703, 703, 703)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(separaatorVEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(847, 847, 847)
                            .addComponent(separaatorVDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(separaatorVCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(separaatorVBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(693, 693, 693)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(separatorVEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(113, 113, 113)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(separatorVCM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(473, 473, 473)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(113, 113, 113)
                            .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(separatorVBM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(253, 253, 253)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(separatorVBM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(750, 750, 750)
                                    .addComponent(separatorVDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(textEmailPesquisa))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(separaatorVEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(separaatorVDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(separaatorVCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(separaatorVBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(240, 240, 240)
                                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(240, 240, 240)
                                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(150, 150, 150)
                                    .addComponent(textPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(separatorVEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(100, 100, 100)
                                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(100, 100, 100)
                                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(separatorVCM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(240, 240, 240)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(separatorVDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(150, 150, 150)
                                    .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(220, 220, 220)
                                    .addComponent(separatorVBM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(240, 240, 240)
                                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(separatorVBM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPesquisaActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            controller.pesquisar();
        } catch (SQLException ex) {
            Logger.getLogger(TelaServico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void campoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIdActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPrecoActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        try {
            controller.novoServico();
        } catch (SQLException ex) {
            Logger.getLogger(TelaServico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        controller.cadastrarServico();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            controller.editarServico();
        } catch (SQLException ex) {
            Logger.getLogger(TelaServico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            controller.excluirServico();
        } catch (SQLException ex) {
            Logger.getLogger(TelaServico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

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

    public JTextField getCampoPesquisa() {
        return campoPesquisa;
    }

    public void setCampoPesquisa(JTextField campoPesquisa) {
        this.campoPesquisa = campoPesquisa;
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
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JTextField campoPreco;
    private javax.swing.JSeparator separaatorVBP;
    private javax.swing.JSeparator separaatorVCP;
    private javax.swing.JSeparator separaatorVDP;
    private javax.swing.JSeparator separaatorVEP;
    private javax.swing.JSeparator separatorVBM;
    private javax.swing.JSeparator separatorVBM2;
    private javax.swing.JSeparator separatorVCM;
    private javax.swing.JSeparator separatorVDM;
    private javax.swing.JSeparator separatorVEM;
    private javax.swing.JLabel textEmailPesquisa;
    private javax.swing.JLabel textId;
    private javax.swing.JLabel textNome;
    private javax.swing.JLabel textPreco;
    // End of variables declaration//GEN-END:variables
}
