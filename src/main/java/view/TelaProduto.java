package view;

public class TelaProduto extends javax.swing.JInternalFrame {

    public TelaProduto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoPesquisar = new javax.swing.JTextField();
        btnCadastrarServico1 = new javax.swing.JButton();
        textNome = new javax.swing.JLabel();
        campoNome1 = new javax.swing.JTextField();
        textPreco = new javax.swing.JLabel();
        campoPreco = new javax.swing.JTextField();
        textPreco1 = new javax.swing.JLabel();
        campoPreco1 = new javax.swing.JTextField();
        btnCadastrarServico3 = new javax.swing.JButton();
        btnCadastrarServico4 = new javax.swing.JButton();
        btnCadastrarServico2 = new javax.swing.JButton();

        campoPesquisar.setBackground(new java.awt.Color(250, 250, 250));
        campoPesquisar.setPreferredSize(new java.awt.Dimension(290, 30));
        campoPesquisar.setSelectionEnd(5);
        campoPesquisar.setSelectionStart(5);
        campoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisarActionPerformed(evt);
            }
        });

        btnCadastrarServico1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnCadastrarServico1.setText("PESQUISAR");
        btnCadastrarServico1.setPreferredSize(new java.awt.Dimension(115, 30));
        btnCadastrarServico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarServico1ActionPerformed(evt);
            }
        });

        textNome.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        textNome.setText("CÓDIGO");

        campoNome1.setPreferredSize(new java.awt.Dimension(200, 30));
        campoNome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNome1ActionPerformed(evt);
            }
        });

        textPreco.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        textPreco.setText("NOME");

        campoPreco.setPreferredSize(new java.awt.Dimension(200, 30));
        campoPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPrecoActionPerformed(evt);
            }
        });

        textPreco1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        textPreco1.setText("PREÇO");

        campoPreco1.setPreferredSize(new java.awt.Dimension(200, 30));
        campoPreco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPreco1ActionPerformed(evt);
            }
        });

        btnCadastrarServico3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnCadastrarServico3.setText("SALVAR");
        btnCadastrarServico3.setPreferredSize(new java.awt.Dimension(120, 45));
        btnCadastrarServico3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarServico3ActionPerformed(evt);
            }
        });

        btnCadastrarServico4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnCadastrarServico4.setText("EDITAR");
        btnCadastrarServico4.setPreferredSize(new java.awt.Dimension(120, 45));
        btnCadastrarServico4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarServico4ActionPerformed(evt);
            }
        });

        btnCadastrarServico2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnCadastrarServico2.setText("EXCLUIR");
        btnCadastrarServico2.setPreferredSize(new java.awt.Dimension(120, 45));
        btnCadastrarServico2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarServico2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 903, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoNome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoPreco1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 263, Short.MAX_VALUE)
                            .addComponent(btnCadastrarServico3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70)
                            .addComponent(btnCadastrarServico4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70)
                            .addComponent(btnCadastrarServico2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(80, 80, 80))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textPreco)
                                .addComponent(textNome)
                                .addComponent(textPreco1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(campoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnCadastrarServico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(30, 30, 30)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCadastrarServico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(68, 68, 68)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textNome)
                        .addComponent(campoNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(25, 25, 25)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textPreco)
                        .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(25, 25, 25)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textPreco1)
                        .addComponent(campoPreco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(btnCadastrarServico3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCadastrarServico4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCadastrarServico2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)))
        );

        getAccessibleContext().setAccessibleName("Tela de Produtos");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPesquisarActionPerformed

    private void btnCadastrarServico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarServico1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarServico1ActionPerformed

    private void campoNome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNome1ActionPerformed

    private void campoPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPrecoActionPerformed

    private void campoPreco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPreco1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPreco1ActionPerformed

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
    private javax.swing.JButton btnCadastrarServico1;
    private javax.swing.JButton btnCadastrarServico2;
    private javax.swing.JButton btnCadastrarServico3;
    private javax.swing.JButton btnCadastrarServico4;
    private javax.swing.JTextField campoNome1;
    private javax.swing.JTextField campoPesquisar;
    private javax.swing.JTextField campoPreco;
    private javax.swing.JTextField campoPreco1;
    private javax.swing.JLabel textNome;
    private javax.swing.JLabel textPreco;
    private javax.swing.JLabel textPreco1;
    // End of variables declaration//GEN-END:variables
}
