package view;

public class TelaCliente extends javax.swing.JInternalFrame {

     public TelaCliente() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        textPreco = new javax.swing.JLabel();
        campoPreco = new javax.swing.JTextField();
        textPreco1 = new javax.swing.JLabel();
        campoPreco1 = new javax.swing.JTextField();
        textPreco2 = new javax.swing.JLabel();
        campoPreco2 = new javax.swing.JTextField();
        btnCadastrarServico3 = new javax.swing.JButton();
        btnCadastrarServico4 = new javax.swing.JButton();
        btnCadastrarServico2 = new javax.swing.JButton();

        setTitle("Cliente");
        setPreferredSize(new java.awt.Dimension(915, 518));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoPesquisar.setBackground(new java.awt.Color(250, 250, 250));
        campoPesquisar.setPreferredSize(new java.awt.Dimension(290, 30));
        campoPesquisar.setSelectionEnd(5);
        campoPesquisar.setSelectionStart(5);
        campoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(campoPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 28, -1, -1));

        btnPesquisar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnPesquisar.setText("PESQUISAR");
        btnPesquisar.setPreferredSize(new java.awt.Dimension(115, 30));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 28, -1, -1));

        textPreco.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        textPreco.setText("NOME");
        getContentPane().add(textPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 188, -1, -1));

        campoPreco.setPreferredSize(new java.awt.Dimension(200, 30));
        campoPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPrecoActionPerformed(evt);
            }
        });
        getContentPane().add(campoPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 181, 780, -1));

        textPreco1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        textPreco1.setText("EMAIL");
        getContentPane().add(textPreco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 243, -1, -1));

        campoPreco1.setPreferredSize(new java.awt.Dimension(200, 30));
        campoPreco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPreco1ActionPerformed(evt);
            }
        });
        getContentPane().add(campoPreco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 236, 780, -1));

        textPreco2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        textPreco2.setText("TELEFONE");
        getContentPane().add(textPreco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 298, -1, -1));

        campoPreco2.setPreferredSize(new java.awt.Dimension(200, 30));
        campoPreco2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPreco2ActionPerformed(evt);
            }
        });
        getContentPane().add(campoPreco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 291, 780, -1));

        btnCadastrarServico3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnCadastrarServico3.setText("SALVAR");
        btnCadastrarServico3.setPreferredSize(new java.awt.Dimension(120, 45));
        btnCadastrarServico3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarServico3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrarServico3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 431, -1, -1));

        btnCadastrarServico4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnCadastrarServico4.setText("EDITAR");
        btnCadastrarServico4.setPreferredSize(new java.awt.Dimension(120, 45));
        btnCadastrarServico4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarServico4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrarServico4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 431, -1, -1));

        btnCadastrarServico2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnCadastrarServico2.setText("EXCLUIR");
        btnCadastrarServico2.setPreferredSize(new java.awt.Dimension(120, 45));
        btnCadastrarServico2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarServico2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrarServico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 431, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPesquisarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void campoPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPrecoActionPerformed

    private void campoPreco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPreco1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPreco1ActionPerformed

    private void campoPreco2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPreco2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPreco2ActionPerformed

    private void btnCadastrarServico3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarServico3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarServico3ActionPerformed

    private void btnCadastrarServico4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarServico4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarServico4ActionPerformed

    private void btnCadastrarServico2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarServico2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarServico2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarServico2;
    private javax.swing.JButton btnCadastrarServico3;
    private javax.swing.JButton btnCadastrarServico4;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JTextField campoPesquisar;
    private javax.swing.JTextField campoPreco;
    private javax.swing.JTextField campoPreco1;
    private javax.swing.JTextField campoPreco2;
    private javax.swing.JLabel textPreco;
    private javax.swing.JLabel textPreco1;
    private javax.swing.JLabel textPreco2;
    // End of variables declaration//GEN-END:variables
}
