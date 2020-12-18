package view;

import controller.MenuPrincipalController;
import controller.TelaAgendamentoController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class TelaAgendamento extends javax.swing.JInternalFrame {
    
    private final TelaAgendamentoController controller;
    private final MenuPrincipal viewMenu = new MenuPrincipal();
    private final MenuPrincipalController controllerMenu = new MenuPrincipalController(viewMenu);

    public TelaAgendamento() {
        initComponents();
        controller = new TelaAgendamentoController(this);
        controller.iniciarAgenda();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textPesquisarAgendamento = new javax.swing.JLabel();
        textIdPesquisa = new javax.swing.JLabel();
        campoPesquisaAgendamento = new javax.swing.JTextField();
        btnPesquisarAgendamento = new javax.swing.JButton();
        caixaPesquisa = new javax.swing.JLabel();
        textCliente = new javax.swing.JLabel();
        textNome = new javax.swing.JLabel();
        campoPesquisaCliente = new javax.swing.JTextField();
        btnPesquisarCliente = new javax.swing.JButton();
        comboBoxCliente = new javax.swing.JComboBox<>();
        caixaCliente = new javax.swing.JLabel();
        textInfo = new javax.swing.JLabel();
        textId = new javax.swing.JLabel();
        campoId = new javax.swing.JTextField();
        textServico = new javax.swing.JLabel();
        comboBoxServico = new javax.swing.JComboBox<>();
        btnAdicionarServico = new javax.swing.JButton();
        btnRemoverServico = new javax.swing.JButton();
        textHora = new javax.swing.JLabel();
        campoHora = new javax.swing.JTextField();
        textProduto = new javax.swing.JLabel();
        comboBoxProduto = new javax.swing.JComboBox<>();
        btnAdicionarProduto = new javax.swing.JButton();
        btnRemoverProduto = new javax.swing.JButton();
        textData = new javax.swing.JLabel();
        campoData = new javax.swing.JTextField();
        textBarbeiro = new javax.swing.JLabel();
        comboBoxBarbeiro = new javax.swing.JComboBox<>();
        textPreco = new javax.swing.JLabel();
        campoPreco = new javax.swing.JTextField();
        caixaInfo = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnAgendar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setForeground(new java.awt.Color(204, 204, 204));
        setTitle("Agendar");
        setEnabled(false);
        setMaximumSize(new java.awt.Dimension(915, 507));
        setMinimumSize(new java.awt.Dimension(915, 507));
        setPreferredSize(new java.awt.Dimension(915, 507));
        getContentPane().setLayout(null);

        textPesquisarAgendamento.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textPesquisarAgendamento.setText("Pesquisar agendamento:");
        getContentPane().add(textPesquisarAgendamento);
        textPesquisarAgendamento.setBounds(27, 13, 163, 16);

        textIdPesquisa.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textIdPesquisa.setText("Id:");
        textIdPesquisa.setPreferredSize(new java.awt.Dimension(50, 28));
        getContentPane().add(textIdPesquisa);
        textIdPesquisa.setBounds(40, 40, 30, 28);

        campoPesquisaAgendamento.setMinimumSize(new java.awt.Dimension(64, 28));
        campoPesquisaAgendamento.setPreferredSize(new java.awt.Dimension(210, 28));
        campoPesquisaAgendamento.setSelectionEnd(5);
        campoPesquisaAgendamento.setSelectionStart(5);
        campoPesquisaAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaAgendamentoActionPerformed(evt);
            }
        });
        getContentPane().add(campoPesquisaAgendamento);
        campoPesquisaAgendamento.setBounds(70, 40, 660, 28);

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

        caixaPesquisa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        caixaPesquisa.setPreferredSize(new java.awt.Dimension(850, 50));
        getContentPane().add(caixaPesquisa);
        caixaPesquisa.setBounds(27, 30, 850, 50);

        textCliente.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textCliente.setText("Cliente:");
        getContentPane().add(textCliente);
        textCliente.setBounds(30, 110, 51, 16);

        textNome.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textNome.setText("Nome:");
        textNome.setPreferredSize(new java.awt.Dimension(50, 28));
        getContentPane().add(textNome);
        textNome.setBounds(40, 140, 50, 28);

        campoPesquisaCliente.setEnabled(false);
        campoPesquisaCliente.setMinimumSize(new java.awt.Dimension(64, 28));
        campoPesquisaCliente.setPreferredSize(new java.awt.Dimension(210, 28));
        campoPesquisaCliente.setSelectionEnd(5);
        campoPesquisaCliente.setSelectionStart(5);
        campoPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaClienteActionPerformed(evt);
            }
        });
        getContentPane().add(campoPesquisaCliente);
        campoPesquisaCliente.setBounds(110, 140, 270, 28);

        btnPesquisarCliente.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnPesquisarCliente.setText("PESQUISAR");
        btnPesquisarCliente.setPreferredSize(new java.awt.Dimension(110, 28));
        btnPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisarCliente);
        btnPesquisarCliente.setBounds(400, 140, 110, 28);

        comboBoxCliente.setEnabled(false);
        comboBoxCliente.setPreferredSize(new java.awt.Dimension(49, 28));
        getContentPane().add(comboBoxCliente);
        comboBoxCliente.setBounds(530, 140, 330, 28);

        caixaCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        caixaCliente.setPreferredSize(new java.awt.Dimension(850, 50));
        getContentPane().add(caixaCliente);
        caixaCliente.setBounds(30, 129, 850, 50);

        textInfo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textInfo.setText("Outras informações:");
        getContentPane().add(textInfo);
        textInfo.setBounds(30, 210, 135, 20);

        textId.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textId.setText("Id:");
        textId.setPreferredSize(new java.awt.Dimension(42, 28));
        getContentPane().add(textId);
        textId.setBounds(40, 240, 50, 28);

        campoId.setEnabled(false);
        campoId.setPreferredSize(new java.awt.Dimension(240, 28));
        getContentPane().add(campoId);
        campoId.setBounds(110, 240, 750, 28);

        textServico.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textServico.setText("Serviço:");
        textServico.setPreferredSize(new java.awt.Dimension(42, 28));
        getContentPane().add(textServico);
        textServico.setBounds(40, 280, 60, 28);

        comboBoxServico.setEnabled(false);
        comboBoxServico.setMinimumSize(new java.awt.Dimension(130, 28));
        comboBoxServico.setPreferredSize(new java.awt.Dimension(240, 28));
        comboBoxServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxServicoActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxServico);
        comboBoxServico.setBounds(110, 280, 240, 28);

        btnAdicionarServico.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnAdicionarServico.setText("ADICIONAR");
        btnAdicionarServico.setPreferredSize(new java.awt.Dimension(110, 28));
        btnAdicionarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarServicoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionarServico);
        btnAdicionarServico.setBounds(370, 280, 110, 28);

        btnRemoverServico.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnRemoverServico.setText("REMOVER");
        btnRemoverServico.setPreferredSize(new java.awt.Dimension(110, 28));
        btnRemoverServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverServicoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemoverServico);
        btnRemoverServico.setBounds(500, 280, 110, 28);

        textHora.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textHora.setText("Hora:");
        textHora.setPreferredSize(new java.awt.Dimension(42, 28));
        getContentPane().add(textHora);
        textHora.setBounds(630, 280, 50, 28);

        campoHora.setEnabled(false);
        campoHora.setPreferredSize(new java.awt.Dimension(180, 28));
        campoHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoHoraActionPerformed(evt);
            }
        });
        getContentPane().add(campoHora);
        campoHora.setBounds(680, 280, 180, 28);

        textProduto.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textProduto.setText("Produto:");
        textProduto.setPreferredSize(new java.awt.Dimension(42, 28));
        getContentPane().add(textProduto);
        textProduto.setBounds(40, 320, 70, 28);

        comboBoxProduto.setEnabled(false);
        comboBoxProduto.setMinimumSize(new java.awt.Dimension(130, 28));
        comboBoxProduto.setPreferredSize(new java.awt.Dimension(240, 28));
        getContentPane().add(comboBoxProduto);
        comboBoxProduto.setBounds(110, 320, 240, 28);

        btnAdicionarProduto.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnAdicionarProduto.setText("ADICIONAR");
        btnAdicionarProduto.setPreferredSize(new java.awt.Dimension(110, 28));
        btnAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionarProduto);
        btnAdicionarProduto.setBounds(370, 320, 110, 28);

        btnRemoverProduto.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnRemoverProduto.setText("REMOVER");
        btnRemoverProduto.setPreferredSize(new java.awt.Dimension(110, 28));
        btnRemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemoverProduto);
        btnRemoverProduto.setBounds(500, 320, 110, 28);

        textData.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textData.setText("Data:");
        textData.setPreferredSize(new java.awt.Dimension(42, 28));
        getContentPane().add(textData);
        textData.setBounds(630, 320, 50, 28);

        campoData.setToolTipText("");
        campoData.setEnabled(false);
        campoData.setPreferredSize(new java.awt.Dimension(180, 28));
        campoData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataActionPerformed(evt);
            }
        });
        getContentPane().add(campoData);
        campoData.setBounds(680, 320, 180, 28);

        textBarbeiro.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textBarbeiro.setText("Barbeiro:");
        textBarbeiro.setPreferredSize(new java.awt.Dimension(42, 28));
        getContentPane().add(textBarbeiro);
        textBarbeiro.setBounds(40, 360, 70, 28);

        comboBoxBarbeiro.setEnabled(false);
        comboBoxBarbeiro.setPreferredSize(new java.awt.Dimension(370, 28));
        comboBoxBarbeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxBarbeiroActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxBarbeiro);
        comboBoxBarbeiro.setBounds(110, 360, 370, 28);

        textPreco.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textPreco.setText("Preço:");
        textPreco.setPreferredSize(new java.awt.Dimension(42, 28));
        getContentPane().add(textPreco);
        textPreco.setBounds(500, 360, 50, 28);

        campoPreco.setToolTipText("");
        campoPreco.setEnabled(false);
        campoPreco.setPreferredSize(new java.awt.Dimension(310, 28));
        campoPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPrecoActionPerformed(evt);
            }
        });
        getContentPane().add(campoPreco);
        campoPreco.setBounds(550, 360, 310, 28);

        caixaInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        caixaInfo.setPreferredSize(new java.awt.Dimension(850, 170));
        getContentPane().add(caixaInfo);
        caixaInfo.setBounds(30, 230, 850, 170);

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

        btnAgendar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnAgendar.setText("AGENDAR");
        btnAgendar.setPreferredSize(new java.awt.Dimension(110, 35));
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgendar);
        btnAgendar.setBounds(280, 420, 110, 35);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarServicoActionPerformed
        controller.adicionarServico();
        //controller.calcularPreco();
    }//GEN-LAST:event_btnAdicionarServicoActionPerformed

    private void campoPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPesquisaClienteActionPerformed

    private void comboBoxBarbeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxBarbeiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxBarbeiroActionPerformed

    private void btnPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarClienteActionPerformed

    private void btnAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoActionPerformed
        controller.adicionarProduto();
        //controller.calcularPreco();
    }//GEN-LAST:event_btnAdicionarProdutoActionPerformed

    private void campoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDataActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            controller.excluirAgendamento();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        try {
            controller.novoAgendamento();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
        controller.cadastrarAgendamento();
        controllerMenu.preencherTabela();
    }//GEN-LAST:event_btnAgendarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            controller.editarAgendamento();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void campoPesquisaAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaAgendamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPesquisaAgendamentoActionPerformed

    private void btnPesquisarAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarAgendamentoActionPerformed
        try {
            controller.pesquisar();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPesquisarAgendamentoActionPerformed

    private void comboBoxServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxServicoActionPerformed

    private void campoPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPrecoActionPerformed

    private void campoHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoHoraActionPerformed

    private void btnRemoverServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverServicoActionPerformed
        controller.removerServico();
        //controller.calcularPreco();
    }//GEN-LAST:event_btnRemoverServicoActionPerformed

    private void btnRemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverProdutoActionPerformed
        controller.removerProduto();
        //controller.calcularPreco();
    }//GEN-LAST:event_btnRemoverProdutoActionPerformed

    public JTextField getCampoData() {
        return campoData;
    }

    public void setCampoData(JTextField campoData) {
        this.campoData = campoData;
    }

    public JTextField getCampoHora() {
        return campoHora;
    }

    public void setCampoHora(JTextField campoHora) {
        this.campoHora = campoHora;
    }

    public JTextField getCampoId() {
        return campoId;
    }

    public void setCampoId(JTextField campoId) {
        this.campoId = campoId;
    }

    public JTextField getCampoPesquisaAgendamento() {
        return campoPesquisaAgendamento;
    }

    public void setCampoPesquisaAgendamento(JTextField campoPesquisaAgendamento) {
        this.campoPesquisaAgendamento = campoPesquisaAgendamento;
    }

    public JTextField getCampoPesquisaCliente() {
        return campoPesquisaCliente;
    }

    public void setCampoPesquisaCliente(JTextField campoPesquisaCliente) {
        this.campoPesquisaCliente = campoPesquisaCliente;
    }

    public JTextField getCampoPreco() {
        return campoPreco;
    }

    public void setCampoPreco(JTextField campoPreco) {
        this.campoPreco = campoPreco;
    }

    public JComboBox<String> getComboBoxBarbeiro() {
        return comboBoxBarbeiro;
    }

    public void setComboBoxBarbeiro(JComboBox<String> comboBoxBarbeiro) {
        this.comboBoxBarbeiro = comboBoxBarbeiro;
    }

    public JComboBox<String> getComboBoxCliente() {
        return comboBoxCliente;
    }

    public void setComboBoxCliente(JComboBox<String> comboBoxCliente) {
        this.comboBoxCliente = comboBoxCliente;
    }

    public JComboBox<String> getComboBoxProduto() {
        return comboBoxProduto;
    }

    public void setComboBoxProduto(JComboBox<String> comboBoxProduto) {
        this.comboBoxProduto = comboBoxProduto;
    }

    public JComboBox<String> getComboBoxServico() {
        return comboBoxServico;
    }

    public void setComboBoxServico(JComboBox<String> comboBoxServico) {
        this.comboBoxServico = comboBoxServico;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnAdicionarServico;
    private javax.swing.JButton btnAgendar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisarAgendamento;
    private javax.swing.JButton btnPesquisarCliente;
    private javax.swing.JButton btnRemoverProduto;
    private javax.swing.JButton btnRemoverServico;
    private javax.swing.JLabel caixaCliente;
    private javax.swing.JLabel caixaInfo;
    private javax.swing.JLabel caixaPesquisa;
    private javax.swing.JTextField campoData;
    private javax.swing.JTextField campoHora;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoPesquisaAgendamento;
    private javax.swing.JTextField campoPesquisaCliente;
    private javax.swing.JTextField campoPreco;
    private javax.swing.JComboBox<String> comboBoxBarbeiro;
    private javax.swing.JComboBox<String> comboBoxCliente;
    private javax.swing.JComboBox<String> comboBoxProduto;
    private javax.swing.JComboBox<String> comboBoxServico;
    private javax.swing.JLabel textBarbeiro;
    private javax.swing.JLabel textCliente;
    private javax.swing.JLabel textData;
    private javax.swing.JLabel textHora;
    private javax.swing.JLabel textId;
    private javax.swing.JLabel textIdPesquisa;
    private javax.swing.JLabel textInfo;
    private javax.swing.JLabel textNome;
    private javax.swing.JLabel textPesquisarAgendamento;
    private javax.swing.JLabel textPreco;
    private javax.swing.JLabel textProduto;
    private javax.swing.JLabel textServico;
    // End of variables declaration//GEN-END:variables
}
