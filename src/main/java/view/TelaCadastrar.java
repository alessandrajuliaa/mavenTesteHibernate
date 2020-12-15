package view;

import controller.TelaCadastrarController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaCadastrar extends javax.swing.JFrame {

    private final TelaCadastrarController controller;
    
    public TelaCadastrar() {
        initComponents();
        controller = new TelaCadastrarController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLoginEsquerda1 = new javax.swing.JPanel();
        textEmail = new javax.swing.JLabel();
        textNome = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textTelefone = new javax.swing.JLabel();
        textFuncao = new javax.swing.JLabel();
        textConfirmarSenha = new javax.swing.JLabel();
        textSenha = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        campoNome = new javax.swing.JTextField();
        comboBoxFuncao = new javax.swing.JComboBox<>();
        campoConfirmarSenha = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(680, 460));
        setMinimumSize(new java.awt.Dimension(680, 460));
        setPreferredSize(new java.awt.Dimension(680, 460));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelLoginEsquerda1.setBackground(new java.awt.Color(255, 204, 0));
        jPanelLoginEsquerda1.setPreferredSize(new java.awt.Dimension(680, 460));
        jPanelLoginEsquerda1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textEmail.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textEmail.setForeground(new java.awt.Color(0, 0, 0));
        textEmail.setText("Email:");
        textEmail.setPreferredSize(new java.awt.Dimension(42, 28));
        jPanelLoginEsquerda1.add(textEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 70, -1));

        textNome.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textNome.setForeground(new java.awt.Color(0, 0, 0));
        textNome.setText("Nome:");
        textNome.setPreferredSize(new java.awt.Dimension(42, 28));
        jPanelLoginEsquerda1.add(textNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 50, -1));

        btnCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setPreferredSize(new java.awt.Dimension(150, 35));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanelLoginEsquerda1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Usuário");
        jPanelLoginEsquerda1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        textTelefone.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textTelefone.setForeground(new java.awt.Color(0, 0, 0));
        textTelefone.setText("Telefone:");
        textTelefone.setPreferredSize(new java.awt.Dimension(42, 28));
        jPanelLoginEsquerda1.add(textTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 70, -1));

        textFuncao.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textFuncao.setForeground(new java.awt.Color(0, 0, 0));
        textFuncao.setText("Função:");
        textFuncao.setPreferredSize(new java.awt.Dimension(42, 28));
        jPanelLoginEsquerda1.add(textFuncao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 70, -1));

        textConfirmarSenha.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textConfirmarSenha.setForeground(new java.awt.Color(0, 0, 0));
        textConfirmarSenha.setText("Confirmar senha:");
        textConfirmarSenha.setPreferredSize(new java.awt.Dimension(42, 28));
        jPanelLoginEsquerda1.add(textConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 130, -1));

        textSenha.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textSenha.setForeground(new java.awt.Color(0, 0, 0));
        textSenha.setText("Senha:");
        textSenha.setPreferredSize(new java.awt.Dimension(42, 28));
        jPanelLoginEsquerda1.add(textSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 50, -1));

        campoTelefone.setToolTipText("");
        campoTelefone.setPreferredSize(new java.awt.Dimension(540, 28));
        campoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefoneActionPerformed(evt);
            }
        });
        jPanelLoginEsquerda1.add(campoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        campoEmail.setToolTipText("");
        campoEmail.setPreferredSize(new java.awt.Dimension(540, 28));
        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });
        jPanelLoginEsquerda1.add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        campoSenha.setMaximumSize(new java.awt.Dimension(150, 28));
        campoSenha.setMinimumSize(new java.awt.Dimension(150, 28));
        campoSenha.setPreferredSize(new java.awt.Dimension(200, 28));
        jPanelLoginEsquerda1.add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        campoNome.setPreferredSize(new java.awt.Dimension(540, 28));
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        jPanelLoginEsquerda1.add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        comboBoxFuncao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Barbeiro", "Gestor" }));
        comboBoxFuncao.setPreferredSize(new java.awt.Dimension(540, 28));
        comboBoxFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxFuncaoActionPerformed(evt);
            }
        });
        jPanelLoginEsquerda1.add(comboBoxFuncao, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        campoConfirmarSenha.setMaximumSize(new java.awt.Dimension(150, 28));
        campoConfirmarSenha.setMinimumSize(new java.awt.Dimension(150, 28));
        campoConfirmarSenha.setPreferredSize(new java.awt.Dimension(180, 28));
        campoConfirmarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoConfirmarSenhaActionPerformed(evt);
            }
        });
        jPanelLoginEsquerda1.add(campoConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin.setText("LOGIN");
        btnLogin.setPreferredSize(new java.awt.Dimension(150, 35));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanelLoginEsquerda1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, -1, -1));

        getContentPane().add(jPanelLoginEsquerda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoConfirmarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoConfirmarSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoConfirmarSenhaActionPerformed

    private void comboBoxFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxFuncaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxFuncaoActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailActionPerformed

    private void campoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefoneActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            controller.cadastrarUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(TelaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastrar().setVisible(true);
            }
        });
    }

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
    private javax.swing.JButton btnLogin;
    private javax.swing.JPasswordField campoConfirmarSenha;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JComboBox<String> comboBoxFuncao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelLoginEsquerda1;
    private javax.swing.JLabel textConfirmarSenha;
    private javax.swing.JLabel textEmail;
    private javax.swing.JLabel textFuncao;
    private javax.swing.JLabel textNome;
    private javax.swing.JLabel textSenha;
    private javax.swing.JLabel textTelefone;
    // End of variables declaration//GEN-END:variables
}
