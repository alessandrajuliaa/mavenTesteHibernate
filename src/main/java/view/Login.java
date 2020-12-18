package view;

import controller.LoginController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends javax.swing.JFrame {

    private final LoginController controller;

    public Login() {
        initComponents();
        controller = new LoginController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLoginEsquerda1 = new javax.swing.JPanel();
        textLogin = new javax.swing.JLabel();
        textEmail = new javax.swing.JLabel();
        separadorEmail = new javax.swing.JPanel();
        campoEmail = new javax.swing.JTextField();
        textSenha = new javax.swing.JLabel();
        separadorSenha = new javax.swing.JPanel();
        campoSenha = new javax.swing.JPasswordField();
        btnLogar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jPanelLoginEsquerda = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(680, 460));
        setMinimumSize(new java.awt.Dimension(680, 460));
        getContentPane().setLayout(null);

        jPanelLoginEsquerda1.setBackground(new java.awt.Color(255, 204, 0));
        jPanelLoginEsquerda1.setAlignmentX(0.0F);
        jPanelLoginEsquerda1.setAlignmentY(0.0F);
        jPanelLoginEsquerda1.setPreferredSize(new java.awt.Dimension(360, 460));
        jPanelLoginEsquerda1.setLayout(null);

        textLogin.setBackground(new java.awt.Color(0, 0, 0));
        textLogin.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        textLogin.setForeground(new java.awt.Color(0, 0, 0));
        textLogin.setText("LOGIN");
        jPanelLoginEsquerda1.add(textLogin);
        textLogin.setBounds(137, 55, 87, 30);

        textEmail.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        textEmail.setForeground(new java.awt.Color(0, 0, 0));
        textEmail.setText("EMAIL");
        jPanelLoginEsquerda1.add(textEmail);
        textEmail.setBounds(48, 150, 51, 18);

        separadorEmail.setBackground(new java.awt.Color(255, 255, 255));
        separadorEmail.setPreferredSize(new java.awt.Dimension(259, 3));

        javax.swing.GroupLayout separadorEmailLayout = new javax.swing.GroupLayout(separadorEmail);
        separadorEmail.setLayout(separadorEmailLayout);
        separadorEmailLayout.setHorizontalGroup(
            separadorEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
        );
        separadorEmailLayout.setVerticalGroup(
            separadorEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanelLoginEsquerda1.add(separadorEmail);
        separadorEmail.setBounds(48, 200, 259, 3);

        campoEmail.setBackground(new java.awt.Color(255, 204, 0));
        campoEmail.setForeground(new java.awt.Color(0, 0, 0));
        campoEmail.setBorder(null);
        campoEmail.setPreferredSize(new java.awt.Dimension(259, 35));
        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });
        jPanelLoginEsquerda1.add(campoEmail);
        campoEmail.setBounds(48, 170, 259, 35);

        textSenha.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        textSenha.setForeground(new java.awt.Color(0, 0, 0));
        textSenha.setText("SENHA");
        jPanelLoginEsquerda1.add(textSenha);
        textSenha.setBounds(48, 222, 53, 18);

        separadorSenha.setBackground(new java.awt.Color(255, 255, 255));
        separadorSenha.setPreferredSize(new java.awt.Dimension(259, 3));

        javax.swing.GroupLayout separadorSenhaLayout = new javax.swing.GroupLayout(separadorSenha);
        separadorSenha.setLayout(separadorSenhaLayout);
        separadorSenhaLayout.setHorizontalGroup(
            separadorSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
        );
        separadorSenhaLayout.setVerticalGroup(
            separadorSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanelLoginEsquerda1.add(separadorSenha);
        separadorSenha.setBounds(48, 272, 259, 3);

        campoSenha.setBackground(new java.awt.Color(255, 204, 0));
        campoSenha.setForeground(new java.awt.Color(0, 0, 0));
        campoSenha.setBorder(null);
        campoSenha.setPreferredSize(new java.awt.Dimension(259, 35));
        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });
        jPanelLoginEsquerda1.add(campoSenha);
        campoSenha.setBounds(48, 242, 259, 35);

        btnLogar.setBackground(new java.awt.Color(255, 255, 255));
        btnLogar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnLogar.setForeground(new java.awt.Color(0, 0, 0));
        btnLogar.setText("Entrar");
        btnLogar.setAlignmentY(0.0F);
        btnLogar.setBorder(null);
        btnLogar.setBorderPainted(false);
        btnLogar.setIconTextGap(0);
        btnLogar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnLogar.setPreferredSize(new java.awt.Dimension(155, 35));
        btnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarActionPerformed(evt);
            }
        });
        jPanelLoginEsquerda1.add(btnLogar);
        btnLogar.setBounds(96, 312, 155, 35);

        btnCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setAlignmentY(0.0F);
        btnCadastrar.setBorder(null);
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setIconTextGap(0);
        btnCadastrar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnCadastrar.setPreferredSize(new java.awt.Dimension(155, 35));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanelLoginEsquerda1.add(btnCadastrar);
        btnCadastrar.setBounds(96, 365, 155, 35);

        getContentPane().add(jPanelLoginEsquerda1);
        jPanelLoginEsquerda1.setBounds(320, 0, 360, 460);

        jPanelLoginEsquerda.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLoginEsquerda.setPreferredSize(new java.awt.Dimension(325, 460));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanelLoginEsquerdaLayout = new javax.swing.GroupLayout(jPanelLoginEsquerda);
        jPanelLoginEsquerda.setLayout(jPanelLoginEsquerdaLayout);
        jPanelLoginEsquerdaLayout.setHorizontalGroup(
            jPanelLoginEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginEsquerdaLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelLoginEsquerdaLayout.setVerticalGroup(
            jPanelLoginEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginEsquerdaLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel1)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelLoginEsquerda);
        jPanelLoginEsquerda.setBounds(0, 0, 320, 460);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarActionPerformed
        try {
            controller.autenticar();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLogarActionPerformed

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        
    }//GEN-LAST:event_campoEmailActionPerformed

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenhaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            controller.cadastrar();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    public JTextField getCampoEmail() {
        return campoEmail;
    }

    public void setCampoEmail(JTextField campoEmail) {
        this.campoEmail = campoEmail;
    }

    public JPasswordField getCampoSenha() {
        return campoSenha;
    }

    public void setCampoSenha(JPasswordField campoSenha) {
        this.campoSenha = campoSenha;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLogar;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelLoginEsquerda;
    private javax.swing.JPanel jPanelLoginEsquerda1;
    private javax.swing.JPanel separadorEmail;
    private javax.swing.JPanel separadorSenha;
    private javax.swing.JLabel textEmail;
    private javax.swing.JLabel textLogin;
    private javax.swing.JLabel textSenha;
    // End of variables declaration//GEN-END:variables
}
