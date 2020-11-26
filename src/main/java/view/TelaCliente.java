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
        textNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        textEmail = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        textTelefone = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        separatorVBM2 = new javax.swing.JSeparator();

        setTitle("Cliente");
        setPreferredSize(new java.awt.Dimension(915, 518));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        separaatorVBP.setPreferredSize(new java.awt.Dimension(850, 3));
        getContentPane().add(separaatorVBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 117, -1, -1));

        separaatorVCP.setPreferredSize(new java.awt.Dimension(850, 3));
        getContentPane().add(separaatorVCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 17, -1, -1));

        separaatorVEP.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separaatorVEP.setPreferredSize(new java.awt.Dimension(3, 100));
        getContentPane().add(separaatorVEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 17, -1, -1));

        separaatorVDP.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separaatorVDP.setPreferredSize(new java.awt.Dimension(3, 100));
        getContentPane().add(separaatorVDP, new org.netbeans.lib.awtextra.AbsoluteConstraints(874, 17, -1, -1));

        textEmailPesquisa.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textEmailPesquisa.setText("Email:");
        getContentPane().add(textEmailPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        campoPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        campoPesquisa.setPreferredSize(new java.awt.Dimension(640, 28));
        campoPesquisa.setSelectionEnd(5);
        campoPesquisa.setSelectionStart(5);
        campoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(campoPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        btnPesquisar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnPesquisar.setText("PESQUISAR");
        btnPesquisar.setPreferredSize(new java.awt.Dimension(115, 30));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, -1, -1));

        separatorVCM.setPreferredSize(new java.awt.Dimension(850, 3));
        getContentPane().add(separatorVCM, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 150, -1, -1));

        separatorVEM.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separatorVEM.setPreferredSize(new java.awt.Dimension(3, 300));
        getContentPane().add(separatorVEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 150, -1, -1));

        separatorVDM.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separatorVDM.setPreferredSize(new java.awt.Dimension(3, 300));
        getContentPane().add(separatorVDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(874, 150, -1, -1));

        separatorVBM.setPreferredSize(new java.awt.Dimension(850, 3));
        getContentPane().add(separatorVBM, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 370, -1, -1));

        textNome.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        textNome.setText("NOME");
        textNome.setPreferredSize(new java.awt.Dimension(37, 28));
        getContentPane().add(textNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        campoNome.setPreferredSize(new java.awt.Dimension(700, 28));
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        getContentPane().add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        textEmail.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        textEmail.setText("EMAIL");
        textEmail.setPreferredSize(new java.awt.Dimension(38, 28));
        getContentPane().add(textEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        campoEmail.setPreferredSize(new java.awt.Dimension(700, 28));
        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });
        getContentPane().add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        textTelefone.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        textTelefone.setText("TELEFONE");
        textTelefone.setPreferredSize(new java.awt.Dimension(64, 28));
        getContentPane().add(textTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        campoTelefone.setPreferredSize(new java.awt.Dimension(700, 28));
        campoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(campoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        btnNovo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnNovo.setText("NOVO");
        btnNovo.setPreferredSize(new java.awt.Dimension(120, 45));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        btnCadastrar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setPreferredSize(new java.awt.Dimension(120, 45));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        btnEditar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setPreferredSize(new java.awt.Dimension(120, 45));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, -1, -1));

        btnExcluir.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.setPreferredSize(new java.awt.Dimension(120, 45));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 390, -1, -1));

        separatorVBM2.setPreferredSize(new java.awt.Dimension(850, 3));
        getContentPane().add(separatorVBM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 450, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPesquisaActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            controller.pesquisar();
        } catch (SQLException ex) {
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailActionPerformed

    private void campoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefoneActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        try {
            controller.novoCliente();
        } catch (SQLException ex) {
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            controller.cadastrarCliente();
        } catch (SQLException ex) {
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            controller.editarCliente();
        } catch (SQLException ex) {
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            controller.excluirCliente();
        } catch (SQLException ex) {
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    public JTextField getCampoEmail() {
        return campoEmail;
    }

    public void setCampoEmail(JTextField campoEmail) {
        this.campoEmail = campoEmail;
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
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JSeparator separaatorVBP;
    private javax.swing.JSeparator separaatorVCP;
    private javax.swing.JSeparator separaatorVDP;
    private javax.swing.JSeparator separaatorVEP;
    private javax.swing.JSeparator separatorVBM;
    private javax.swing.JSeparator separatorVBM2;
    private javax.swing.JSeparator separatorVCM;
    private javax.swing.JSeparator separatorVDM;
    private javax.swing.JSeparator separatorVEM;
    private javax.swing.JLabel textEmail;
    private javax.swing.JLabel textEmailPesquisa;
    private javax.swing.JLabel textNome;
    private javax.swing.JLabel textTelefone;
    // End of variables declaration//GEN-END:variables
}
