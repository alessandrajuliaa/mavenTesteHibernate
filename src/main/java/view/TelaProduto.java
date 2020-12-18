package view;

import controller.TelaProdutoController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

public class TelaProduto extends javax.swing.JInternalFrame {

    private final TelaProdutoController controller;
    
    public TelaProduto() {
        initComponents();
        controller = new TelaProdutoController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoPesquisaProduto = new javax.swing.JTextField();
        btnPesquisarAgendamento = new javax.swing.JButton();
        textIdPesquisa = new javax.swing.JLabel();
        textPesquisarProduto = new javax.swing.JLabel();
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
        setTitle("Produto");
        setMaximumSize(new java.awt.Dimension(915, 507));
        setMinimumSize(new java.awt.Dimension(915, 507));
        setPreferredSize(new java.awt.Dimension(915, 507));
        getContentPane().setLayout(null);

        campoPesquisaProduto.setMinimumSize(new java.awt.Dimension(64, 28));
        campoPesquisaProduto.setPreferredSize(new java.awt.Dimension(630, 28));
        campoPesquisaProduto.setSelectionEnd(5);
        campoPesquisaProduto.setSelectionStart(5);
        campoPesquisaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaProdutoActionPerformed(evt);
            }
        });
        campoPesquisaProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoPesquisaProdutoKeyPressed(evt);
            }
        });
        getContentPane().add(campoPesquisaProduto);
        campoPesquisaProduto.setBounds(100, 40, 630, 28);

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

        textPesquisarProduto.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textPesquisarProduto.setText("Pesquisar produto:");
        getContentPane().add(textPesquisarProduto);
        textPesquisarProduto.setBounds(27, 13, 125, 16);

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

        getAccessibleContext().setAccessibleName("Tela de Produtos");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoPesquisaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPesquisaProdutoActionPerformed

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
            controller.excluirProduto();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            controller.editarProduto();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        controller.cadastrarProduto();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        try {
            controller.novoProduto();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNovoActionPerformed

    private void campoPesquisaProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisaProdutoKeyPressed
        try {
            controller.pesquisarPorNomeCampo();
        } catch (SQLException ex) {
            Logger.getLogger(TelaProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_campoPesquisaProdutoKeyPressed

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

    public JTextField getCampoPesquisaProduto() {
        return campoPesquisaProduto;
    }

    public void setCampoPesquisaProduto(JTextField campoPesquisaProduto) {
        this.campoPesquisaProduto = campoPesquisaProduto;
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
    private javax.swing.JTextField campoPesquisaProduto;
    private javax.swing.JTextField campoPreco;
    private javax.swing.JLabel textId;
    private javax.swing.JLabel textIdPesquisa;
    private javax.swing.JLabel textInfo;
    private javax.swing.JLabel textNome;
    private javax.swing.JLabel textPesquisarProduto;
    private javax.swing.JLabel textPreco;
    // End of variables declaration//GEN-END:variables
}
