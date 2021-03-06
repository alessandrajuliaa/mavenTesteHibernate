package view;

import controller.TelaUsuarioController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaUsuario extends javax.swing.JInternalFrame {
    
    private final TelaUsuarioController controller;

    public TelaUsuario() {
        initComponents();
        controller = new TelaUsuarioController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textPesquisarUsuario = new javax.swing.JLabel();
        textNomePesquisa = new javax.swing.JLabel();
        campoPesquisaUsuario = new javax.swing.JTextField();
        btnPesquisarUsuario = new javax.swing.JButton();
        caixaPesquisa = new javax.swing.JLabel();
        textInfo = new javax.swing.JLabel();
        textNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        textEmail = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        textTelefone = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JTextField();
        textFuncao = new javax.swing.JLabel();
        comboBoxFuncao = new javax.swing.JComboBox<>();
        textSenha = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();
        textConfirmarSenha = new javax.swing.JLabel();
        campoConfirmarSenha = new javax.swing.JPasswordField();
        caixaInfo = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setTitle("Usuário");
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setMaximumSize(new java.awt.Dimension(915, 520));
        setMinimumSize(new java.awt.Dimension(820, 425));
        setPreferredSize(new java.awt.Dimension(820, 425));
        getContentPane().setLayout(null);

        textPesquisarUsuario.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textPesquisarUsuario.setText("Pesquisar usuário:");
        getContentPane().add(textPesquisarUsuario);
        textPesquisarUsuario.setBounds(30, 13, 123, 16);

        textNomePesquisa.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textNomePesquisa.setText("Nome:");
        textNomePesquisa.setPreferredSize(new java.awt.Dimension(50, 28));
        getContentPane().add(textNomePesquisa);
        textNomePesquisa.setBounds(40, 40, 50, 28);

        campoPesquisaUsuario.setMaximumSize(new java.awt.Dimension(630, 28));
        campoPesquisaUsuario.setMinimumSize(new java.awt.Dimension(530, 28));
        campoPesquisaUsuario.setPreferredSize(new java.awt.Dimension(530, 28));
        campoPesquisaUsuario.setSelectionEnd(5);
        campoPesquisaUsuario.setSelectionStart(5);
        campoPesquisaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaUsuarioActionPerformed(evt);
            }
        });
        campoPesquisaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoPesquisaUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(campoPesquisaUsuario);
        campoPesquisaUsuario.setBounds(100, 40, 530, 28);

        btnPesquisarUsuario.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnPesquisarUsuario.setText("PESQUISAR");
        btnPesquisarUsuario.setPreferredSize(new java.awt.Dimension(110, 28));
        btnPesquisarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisarUsuario);
        btnPesquisarUsuario.setBounds(650, 40, 110, 28);

        caixaPesquisa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        caixaPesquisa.setPreferredSize(new java.awt.Dimension(850, 50));
        getContentPane().add(caixaPesquisa);
        caixaPesquisa.setBounds(30, 30, 750, 50);

        textInfo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textInfo.setText("Informações:");
        getContentPane().add(textInfo);
        textInfo.setBounds(30, 100, 135, 20);

        textNome.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textNome.setText("Nome:");
        textNome.setPreferredSize(new java.awt.Dimension(42, 28));
        getContentPane().add(textNome);
        textNome.setBounds(50, 130, 50, 28);

        campoNome.setEnabled(false);
        campoNome.setPreferredSize(new java.awt.Dimension(630, 28));
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        getContentPane().add(campoNome);
        campoNome.setBounds(130, 130, 630, 28);

        textEmail.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textEmail.setText("Email:");
        textEmail.setPreferredSize(new java.awt.Dimension(42, 28));
        getContentPane().add(textEmail);
        textEmail.setBounds(50, 170, 70, 28);

        campoEmail.setToolTipText("");
        campoEmail.setEnabled(false);
        campoEmail.setPreferredSize(new java.awt.Dimension(630, 28));
        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });
        getContentPane().add(campoEmail);
        campoEmail.setBounds(130, 170, 630, 28);

        textTelefone.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textTelefone.setText("Telefone:");
        textTelefone.setPreferredSize(new java.awt.Dimension(42, 28));
        getContentPane().add(textTelefone);
        textTelefone.setBounds(50, 210, 70, 28);

        campoTelefone.setToolTipText("");
        campoTelefone.setEnabled(false);
        campoTelefone.setPreferredSize(new java.awt.Dimension(630, 28));
        campoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(campoTelefone);
        campoTelefone.setBounds(130, 210, 630, 28);

        textFuncao.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textFuncao.setText("Função:");
        textFuncao.setPreferredSize(new java.awt.Dimension(42, 28));
        getContentPane().add(textFuncao);
        textFuncao.setBounds(50, 250, 70, 28);

        comboBoxFuncao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Barbeiro", "Gestor" }));
        comboBoxFuncao.setEnabled(false);
        comboBoxFuncao.setPreferredSize(new java.awt.Dimension(140, 28));
        comboBoxFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxFuncaoActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxFuncao);
        comboBoxFuncao.setBounds(130, 250, 140, 28);

        textSenha.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textSenha.setText("Senha:");
        textSenha.setPreferredSize(new java.awt.Dimension(42, 28));
        getContentPane().add(textSenha);
        textSenha.setBounds(280, 250, 50, 28);

        campoSenha.setEnabled(false);
        campoSenha.setMaximumSize(new java.awt.Dimension(150, 28));
        campoSenha.setMinimumSize(new java.awt.Dimension(150, 28));
        campoSenha.setPreferredSize(new java.awt.Dimension(140, 28));
        getContentPane().add(campoSenha);
        campoSenha.setBounds(340, 250, 140, 28);

        textConfirmarSenha.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textConfirmarSenha.setText("Confirmar senha:");
        textConfirmarSenha.setPreferredSize(new java.awt.Dimension(42, 28));
        getContentPane().add(textConfirmarSenha);
        textConfirmarSenha.setBounds(490, 250, 130, 28);

        campoConfirmarSenha.setEnabled(false);
        campoConfirmarSenha.setMaximumSize(new java.awt.Dimension(150, 28));
        campoConfirmarSenha.setMinimumSize(new java.awt.Dimension(150, 28));
        campoConfirmarSenha.setPreferredSize(new java.awt.Dimension(140, 28));
        campoConfirmarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoConfirmarSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(campoConfirmarSenha);
        campoConfirmarSenha.setBounds(620, 250, 140, 28);

        caixaInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        caixaInfo.setPreferredSize(new java.awt.Dimension(850, 170));
        getContentPane().add(caixaInfo);
        caixaInfo.setBounds(30, 120, 750, 170);

        btnNovo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnNovo.setText("NOVO");
        btnNovo.setPreferredSize(new java.awt.Dimension(110, 35));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo);
        btnNovo.setBounds(30, 320, 110, 35);

        btnCadastrar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setPreferredSize(new java.awt.Dimension(110, 35));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(250, 320, 110, 35);

        btnEditar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setPreferredSize(new java.awt.Dimension(110, 35));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(460, 320, 110, 35);

        btnExcluir.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.setPreferredSize(new java.awt.Dimension(110, 35));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(670, 320, 110, 35);

        getAccessibleContext().setAccessibleName("Tela de Usuário");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoPesquisaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPesquisaUsuarioActionPerformed

    private void btnPesquisarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarUsuarioActionPerformed
        try {
            controller.pesquisarPorNome();
        } catch (SQLException ex) {
            Logger.getLogger(TelaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPesquisarUsuarioActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            controller.cadastrarUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(TelaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        try {
            controller.novoUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(TelaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            controller.editarUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(TelaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            controller.excluirUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(TelaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void comboBoxFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxFuncaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxFuncaoActionPerformed

    private void campoConfirmarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoConfirmarSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoConfirmarSenhaActionPerformed

    private void campoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefoneActionPerformed

    private void campoPesquisaUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisaUsuarioKeyPressed
        try {
            controller.pesquisarPorNomeCampo();
        } catch (SQLException ex) {
            Logger.getLogger(TelaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_campoPesquisaUsuarioKeyPressed

    public JPasswordField getCampoConfirmarSenha() {
        return campoConfirmarSenha;
    }

    public void setCampoConfirmarSenha(JPasswordField campoConfirmarSenha) {
        this.campoConfirmarSenha = campoConfirmarSenha;
    }

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

    public JTextField getCampoPesquisaUsuario() {
        return campoPesquisaUsuario;
    }

    public void setCampoPesquisaUsuario(JTextField campoPesquisaUsuario) {
        this.campoPesquisaUsuario = campoPesquisaUsuario;
    }

    public JPasswordField getCampoSenha() {
        return campoSenha;
    }

    public void setCampoSenha(JPasswordField campoSenha) {
        this.campoSenha = campoSenha;
    }

    public JTextField getCampoTelefone() {
        return campoTelefone;
    }

    public void setCampoTelefone(JTextField campoTelefone) {
        this.campoTelefone = campoTelefone;
    }

    public JComboBox<String> getComboBoxFuncao() {
        return comboBoxFuncao;
    }

    public void setComboBoxFuncao(JComboBox<String> comboBoxFuncao) {
        this.comboBoxFuncao = comboBoxFuncao;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisarUsuario;
    private javax.swing.JLabel caixaInfo;
    private javax.swing.JLabel caixaPesquisa;
    private javax.swing.JPasswordField campoConfirmarSenha;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoPesquisaUsuario;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JComboBox<String> comboBoxFuncao;
    private javax.swing.JLabel textConfirmarSenha;
    private javax.swing.JLabel textEmail;
    private javax.swing.JLabel textFuncao;
    private javax.swing.JLabel textInfo;
    private javax.swing.JLabel textNome;
    private javax.swing.JLabel textNomePesquisa;
    private javax.swing.JLabel textPesquisarUsuario;
    private javax.swing.JLabel textSenha;
    private javax.swing.JLabel textTelefone;
    // End of variables declaration//GEN-END:variables
}
