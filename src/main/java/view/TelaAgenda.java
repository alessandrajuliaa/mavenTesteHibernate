package view;

import controller.TelaAgendaController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Alessandra
 */
public class TelaAgenda extends javax.swing.JInternalFrame {

    private final TelaAgendaController controller;

    public TelaAgenda() {
        initComponents();
        controller = new TelaAgendaController(this);
        controller.iniciarAgenda();
        
        getTextProduto().setVisible(false);
        getTextQuantidade().setVisible(false);
        getCampoQuantidade().setVisible(false);
        getComboBoxProduto().setVisible(false);
        getBtnAdicionarProduto().setVisible(false);
        getBtnRemoverProduto().setVisible(false);
        getLabelProdutos().setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textPesquisarPorId = new javax.swing.JLabel();
        textIdPesquisa1 = new javax.swing.JLabel();
        campoPesquisaPorId = new javax.swing.JTextField();
        btnPesquisarAgendamentoPorId = new javax.swing.JButton();
        textPesquisarPorCliente = new javax.swing.JLabel();
        campoPesquisaPorCliente = new javax.swing.JTextField();
        separador = new javax.swing.JSeparator();
        textPesquisarPorPeriodo = new javax.swing.JLabel();
        textDe = new javax.swing.JLabel();
        campoDeData = new javax.swing.JTextField();
        textAte = new javax.swing.JLabel();
        campoAteData = new javax.swing.JTextField();
        btnPesquisaData = new javax.swing.JButton();
        textPesquisarPorBarbeiro = new javax.swing.JLabel();
        comboBoxBarbeiroPesquisa = new javax.swing.JComboBox<>();
        textFiltrarAgendamentos = new javax.swing.JLabel();
        comboBoxFiltro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        separadorVertical = new javax.swing.JSeparator();
        textAgendar = new javax.swing.JLabel();
        textCliente = new javax.swing.JLabel();
        textNome = new javax.swing.JLabel();
        campoPesquisaCliente = new javax.swing.JTextField();
        comboBoxCliente = new javax.swing.JComboBox<>();
        separadorInfo = new javax.swing.JSeparator();
        textInfo = new javax.swing.JLabel();
        textId = new javax.swing.JLabel();
        campoId = new javax.swing.JTextField();
        textData = new javax.swing.JLabel();
        campoData = new javax.swing.JTextField();
        textHora = new javax.swing.JLabel();
        campoHora = new javax.swing.JTextField();
        textServico = new javax.swing.JLabel();
        comboBoxServico = new javax.swing.JComboBox<>();
        textBarbeiro = new javax.swing.JLabel();
        comboBoxBarbeiro = new javax.swing.JComboBox<>();
        btnAdicionarServico = new javax.swing.JButton();
        btnRemoverServico = new javax.swing.JButton();
        textProduto = new javax.swing.JLabel();
        comboBoxProduto = new javax.swing.JComboBox<>();
        textQuantidade = new javax.swing.JLabel();
        campoQuantidade = new javax.swing.JTextField();
        btnAdicionarProduto = new javax.swing.JButton();
        btnRemoverProduto = new javax.swing.JButton();
        labelProdutos = new javax.swing.JLabel();
        textPreco = new javax.swing.JLabel();
        campoPreco = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnAgendar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Agenda");
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(1300, 649));

        textPesquisarPorId.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textPesquisarPorId.setText("PESQUISAR AGENDAMENTO POR ID:");

        textIdPesquisa1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textIdPesquisa1.setText("Id:");
        textIdPesquisa1.setPreferredSize(new java.awt.Dimension(50, 28));

        campoPesquisaPorId.setMinimumSize(new java.awt.Dimension(64, 28));
        campoPesquisaPorId.setNextFocusableComponent(btnPesquisarAgendamentoPorId);
        campoPesquisaPorId.setPreferredSize(new java.awt.Dimension(210, 28));
        campoPesquisaPorId.setSelectionEnd(5);
        campoPesquisaPorId.setSelectionStart(5);
        campoPesquisaPorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaPorIdActionPerformed(evt);
            }
        });

        btnPesquisarAgendamentoPorId.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnPesquisarAgendamentoPorId.setText("PESQUISAR");
        btnPesquisarAgendamentoPorId.setNextFocusableComponent(campoPesquisaPorCliente);
        btnPesquisarAgendamentoPorId.setPreferredSize(new java.awt.Dimension(110, 28));
        btnPesquisarAgendamentoPorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarAgendamentoPorIdActionPerformed(evt);
            }
        });

        textPesquisarPorCliente.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textPesquisarPorCliente.setText("PESQUISAR AGENDAMENTO POR CLIENTE:");

        campoPesquisaPorCliente.setInheritsPopupMenu(true);
        campoPesquisaPorCliente.setNextFocusableComponent(campoDeData);
        campoPesquisaPorCliente.setPreferredSize(new java.awt.Dimension(190, 28));
        campoPesquisaPorCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaPorClienteActionPerformed(evt);
            }
        });
        campoPesquisaPorCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoPesquisaPorClienteKeyPressed(evt);
            }
        });

        textPesquisarPorPeriodo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textPesquisarPorPeriodo.setText("PESQUISAR POR PERÍODO:");

        textDe.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textDe.setText("De:");
        textDe.setPreferredSize(new java.awt.Dimension(50, 28));

        campoDeData.setEnabled(false);
        campoDeData.setInheritsPopupMenu(true);
        campoDeData.setNextFocusableComponent(campoAteData);
        campoDeData.setPreferredSize(new java.awt.Dimension(100, 28));
        campoDeData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDeDataActionPerformed(evt);
            }
        });
        campoDeData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoDeDataKeyPressed(evt);
            }
        });

        textAte.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textAte.setText("Até:");
        textAte.setPreferredSize(new java.awt.Dimension(50, 28));

        campoAteData.setToolTipText("");
        campoAteData.setEnabled(false);
        campoAteData.setInheritsPopupMenu(true);
        campoAteData.setName(""); // NOI18N
        campoAteData.setNextFocusableComponent(btnPesquisaData);
        campoAteData.setPreferredSize(new java.awt.Dimension(100, 28));
        campoAteData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAteDataActionPerformed(evt);
            }
        });
        campoAteData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoAteDataKeyPressed(evt);
            }
        });

        btnPesquisaData.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnPesquisaData.setText("Pesquisar");
        btnPesquisaData.setEnabled(false);
        btnPesquisaData.setInheritsPopupMenu(true);
        btnPesquisaData.setMargin(new java.awt.Insets(2, 7, 2, 7));
        btnPesquisaData.setNextFocusableComponent(comboBoxBarbeiroPesquisa);
        btnPesquisaData.setPreferredSize(new java.awt.Dimension(110, 28));
        btnPesquisaData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaDataActionPerformed(evt);
            }
        });

        textPesquisarPorBarbeiro.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textPesquisarPorBarbeiro.setText("PESQUISAR POR BARBEiRO:");

        comboBoxBarbeiroPesquisa.setInheritsPopupMenu(true);
        comboBoxBarbeiroPesquisa.setNextFocusableComponent(comboBoxFiltro);
        comboBoxBarbeiroPesquisa.setPreferredSize(new java.awt.Dimension(150, 28));
        comboBoxBarbeiroPesquisa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxBarbeiroPesquisaItemStateChanged(evt);
            }
        });
        comboBoxBarbeiroPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxBarbeiroPesquisaActionPerformed(evt);
            }
        });
        comboBoxBarbeiroPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboBoxBarbeiroPesquisaKeyPressed(evt);
            }
        });

        textFiltrarAgendamentos.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textFiltrarAgendamentos.setText("FILTRAR AGENDAMENTOS");

        comboBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Data", "Barbeiro", "Data e Barbeiro" }));
        comboBoxFiltro.setMinimumSize(new java.awt.Dimension(130, 28));
        comboBoxFiltro.setNextFocusableComponent(campoPesquisaCliente);
        comboBoxFiltro.setPreferredSize(new java.awt.Dimension(240, 28));
        comboBoxFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxFiltroItemStateChanged(evt);
            }
        });
        comboBoxFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxFiltroActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabela);
        tabela.setColumnModel(tabela.getColumnModel());

        separadorVertical.setOrientation(javax.swing.SwingConstants.VERTICAL);

        textAgendar.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        textAgendar.setText("AGENDAR");

        textCliente.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textCliente.setText("CLIENTE:");

        textNome.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textNome.setText("Nome:");
        textNome.setPreferredSize(new java.awt.Dimension(50, 28));

        campoPesquisaCliente.setEnabled(false);
        campoPesquisaCliente.setMinimumSize(new java.awt.Dimension(64, 28));
        campoPesquisaCliente.setNextFocusableComponent(comboBoxCliente);
        campoPesquisaCliente.setPreferredSize(new java.awt.Dimension(210, 28));
        campoPesquisaCliente.setSelectionEnd(5);
        campoPesquisaCliente.setSelectionStart(5);
        campoPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaClienteActionPerformed(evt);
            }
        });
        campoPesquisaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoPesquisaClienteKeyPressed(evt);
            }
        });

        comboBoxCliente.setEnabled(false);
        comboBoxCliente.setMinimumSize(new java.awt.Dimension(64, 28));
        comboBoxCliente.setNextFocusableComponent(campoId);
        comboBoxCliente.setPreferredSize(new java.awt.Dimension(49, 28));
        comboBoxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxClienteActionPerformed(evt);
            }
        });

        textInfo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textInfo.setText("INFORMAÇÕES:");

        textId.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textId.setText("Id:");
        textId.setPreferredSize(new java.awt.Dimension(42, 28));

        campoId.setEnabled(false);
        campoId.setMinimumSize(new java.awt.Dimension(64, 28));
        campoId.setNextFocusableComponent(campoData);
        campoId.setPreferredSize(new java.awt.Dimension(240, 28));
        campoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIdActionPerformed(evt);
            }
        });

        textData.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textData.setText("Data:");
        textData.setPreferredSize(new java.awt.Dimension(42, 28));

        campoData.setToolTipText("");
        campoData.setEnabled(false);
        campoData.setMinimumSize(new java.awt.Dimension(64, 28));
        campoData.setNextFocusableComponent(campoHora);
        campoData.setPreferredSize(new java.awt.Dimension(340, 28));
        campoData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataActionPerformed(evt);
            }
        });

        textHora.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textHora.setText("Hora:");
        textHora.setPreferredSize(new java.awt.Dimension(42, 28));

        campoHora.setEnabled(false);
        campoHora.setMinimumSize(new java.awt.Dimension(64, 28));
        campoHora.setNextFocusableComponent(comboBoxBarbeiro);
        campoHora.setPreferredSize(new java.awt.Dimension(340, 28));
        campoHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoHoraActionPerformed(evt);
            }
        });

        textServico.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textServico.setText("Serviço:");
        textServico.setPreferredSize(new java.awt.Dimension(42, 28));

        comboBoxServico.setEnabled(false);
        comboBoxServico.setMinimumSize(new java.awt.Dimension(64, 28));
        comboBoxServico.setNextFocusableComponent(btnAdicionarServico);
        comboBoxServico.setPreferredSize(new java.awt.Dimension(340, 28));
        comboBoxServico.setVerifyInputWhenFocusTarget(false);
        comboBoxServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxServicoActionPerformed(evt);
            }
        });

        textBarbeiro.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textBarbeiro.setText("Barbeiro:");
        textBarbeiro.setPreferredSize(new java.awt.Dimension(42, 28));

        comboBoxBarbeiro.setEnabled(false);
        comboBoxBarbeiro.setMinimumSize(new java.awt.Dimension(64, 28));
        comboBoxBarbeiro.setNextFocusableComponent(comboBoxServico);
        comboBoxBarbeiro.setPreferredSize(new java.awt.Dimension(310, 28));
        comboBoxBarbeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxBarbeiroActionPerformed(evt);
            }
        });

        btnAdicionarServico.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnAdicionarServico.setText("+");
        btnAdicionarServico.setNextFocusableComponent(btnRemoverServico);
        btnAdicionarServico.setPreferredSize(new java.awt.Dimension(120, 28));
        btnAdicionarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarServicoActionPerformed(evt);
            }
        });

        btnRemoverServico.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnRemoverServico.setText("-");
        btnRemoverServico.setNextFocusableComponent(comboBoxProduto);
        btnRemoverServico.setPreferredSize(new java.awt.Dimension(120, 28));
        btnRemoverServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverServicoActionPerformed(evt);
            }
        });

        textProduto.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textProduto.setText("Produto:");
        textProduto.setPreferredSize(new java.awt.Dimension(42, 28));

        comboBoxProduto.setEnabled(false);
        comboBoxProduto.setMinimumSize(new java.awt.Dimension(64, 28));
        comboBoxProduto.setNextFocusableComponent(campoQuantidade);
        comboBoxProduto.setPreferredSize(new java.awt.Dimension(240, 28));
        comboBoxProduto.setVerifyInputWhenFocusTarget(false);
        comboBoxProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxProdutoActionPerformed(evt);
            }
        });

        textQuantidade.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textQuantidade.setText("Quantidade:");
        textQuantidade.setPreferredSize(new java.awt.Dimension(42, 28));

        campoQuantidade.setEnabled(false);
        campoQuantidade.setMinimumSize(new java.awt.Dimension(64, 28));
        campoQuantidade.setNextFocusableComponent(btnAdicionarProduto);
        campoQuantidade.setPreferredSize(new java.awt.Dimension(340, 28));
        campoQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoQuantidadeActionPerformed(evt);
            }
        });

        btnAdicionarProduto.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnAdicionarProduto.setText("+");
        btnAdicionarProduto.setNextFocusableComponent(btnRemoverProduto);
        btnAdicionarProduto.setPreferredSize(new java.awt.Dimension(120, 28));
        btnAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarProdutoActionPerformed(evt);
            }
        });

        btnRemoverProduto.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnRemoverProduto.setText("-");
        btnRemoverProduto.setNextFocusableComponent(campoPreco);
        btnRemoverProduto.setPreferredSize(new java.awt.Dimension(120, 28));
        btnRemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverProdutoActionPerformed(evt);
            }
        });

        textPreco.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textPreco.setText("Preço:");
        textPreco.setPreferredSize(new java.awt.Dimension(42, 28));

        campoPreco.setToolTipText("");
        campoPreco.setEnabled(false);
        campoPreco.setMinimumSize(new java.awt.Dimension(64, 28));
        campoPreco.setNextFocusableComponent(btnAgendar);
        campoPreco.setPreferredSize(new java.awt.Dimension(340, 28));
        campoPreco.setRequestFocusEnabled(false);
        campoPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPrecoActionPerformed(evt);
            }
        });

        btnNovo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnNovo.setText("NOVO");
        btnNovo.setNextFocusableComponent(btnExcluir);
        btnNovo.setPreferredSize(new java.awt.Dimension(130, 45));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnAgendar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnAgendar.setText("AGENDAR");
        btnAgendar.setNextFocusableComponent(btnNovo);
        btnAgendar.setPreferredSize(new java.awt.Dimension(130, 45));
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setPreferredSize(new java.awt.Dimension(130, 45));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.setNextFocusableComponent(btnEditar);
        btnExcluir.setPreferredSize(new java.awt.Dimension(130, 45));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textPesquisarPorId)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textIdPesquisa1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(campoPesquisaPorId, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addComponent(btnPesquisarAgendamentoPorId, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textPesquisarPorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoPesquisaPorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textDe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(campoDeData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(textAte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(campoAteData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(btnPesquisaData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(textPesquisarPorPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textPesquisarPorBarbeiro)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(comboBoxBarbeiroPesquisa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFiltrarAgendamentos)
                                    .addComponent(comboBoxFiltro, 0, 0, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1))
                        .addGap(15, 15, 15)))
                .addComponent(separadorVertical, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)
                                        .addComponent(campoPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)
                                        .addComponent(campoId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)
                                        .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGap(12, 12, 12)
                                        .addComponent(textHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoHora, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)
                                        .addComponent(campoPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(textQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                                .addComponent(textProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(textServico, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(comboBoxServico, 0, 1, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnAdicionarServico, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnRemoverServico, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnRemoverProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(comboBoxProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(150, 150, 150)
                                        .addComponent(textAgendar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(textCliente))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(separadorInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(textInfo))
                                    .addComponent(labelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textBarbeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(comboBoxBarbeiro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separadorVertical)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(textPesquisarPorId)
                            .addComponent(textPesquisarPorCliente))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(textIdPesquisa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoPesquisaPorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisarAgendamentoPorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoPesquisaPorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(textPesquisarPorPeriodo)
                            .addComponent(textPesquisarPorBarbeiro)
                            .addComponent(textFiltrarAgendamentos))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(comboBoxBarbeiroPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDeData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoAteData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textAte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textAgendar)
                                .addGap(28, 28, 28)
                                .addComponent(textCliente)
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(separadorInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(textInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(comboBoxBarbeiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(comboBoxServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnAdicionarServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnRemoverServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(comboBoxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(11, 11, 11)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnRemoverProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(6, 6, 6)
                                        .addComponent(labelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(textBarbeiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(btnPesquisaData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoPesquisaPorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaPorIdActionPerformed
        
    }//GEN-LAST:event_campoPesquisaPorIdActionPerformed

    private void btnPesquisarAgendamentoPorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarAgendamentoPorIdActionPerformed
        try {
            controller.pesquisarPorId();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAgenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPesquisarAgendamentoPorIdActionPerformed

    private void comboBoxFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxFiltroActionPerformed
        
    }//GEN-LAST:event_comboBoxFiltroActionPerformed

    private void campoDeDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDeDataActionPerformed
        
    }//GEN-LAST:event_campoDeDataActionPerformed

    private void campoDeDataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDeDataKeyPressed

    }//GEN-LAST:event_campoDeDataKeyPressed

    private void campoAteDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAteDataActionPerformed
        
    }//GEN-LAST:event_campoAteDataActionPerformed

    private void campoAteDataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoAteDataKeyPressed
        
    }//GEN-LAST:event_campoAteDataKeyPressed

    private void btnPesquisaDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaDataActionPerformed
        controller.pesquisaFiltro();
    }//GEN-LAST:event_btnPesquisaDataActionPerformed

    private void campoPesquisaPorClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaPorClienteActionPerformed
        
    }//GEN-LAST:event_campoPesquisaPorClienteActionPerformed

    private void campoPesquisaPorClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisaPorClienteKeyPressed
        controller.pesquisaPorCliente();
    }//GEN-LAST:event_campoPesquisaPorClienteKeyPressed

    private void comboBoxBarbeiroPesquisaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxBarbeiroPesquisaItemStateChanged
        controller.pesquisaFiltro();
    }//GEN-LAST:event_comboBoxBarbeiroPesquisaItemStateChanged

    private void comboBoxBarbeiroPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxBarbeiroPesquisaActionPerformed

    }//GEN-LAST:event_comboBoxBarbeiroPesquisaActionPerformed

    private void comboBoxBarbeiroPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboBoxBarbeiroPesquisaKeyPressed
        controller.pesquisaFiltro();
    }//GEN-LAST:event_comboBoxBarbeiroPesquisaKeyPressed

    private void campoPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaClienteActionPerformed
        
    }//GEN-LAST:event_campoPesquisaClienteActionPerformed

    private void btnRemoverServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverServicoActionPerformed
        controller.removerServico();
    }//GEN-LAST:event_btnRemoverServicoActionPerformed

    private void btnAdicionarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarServicoActionPerformed
        controller.adicionarServico();
    }//GEN-LAST:event_btnAdicionarServicoActionPerformed

    private void comboBoxBarbeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxBarbeiroActionPerformed

    }//GEN-LAST:event_comboBoxBarbeiroActionPerformed

    private void campoHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoHoraActionPerformed
        
    }//GEN-LAST:event_campoHoraActionPerformed

    private void campoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataActionPerformed
        
    }//GEN-LAST:event_campoDataActionPerformed

    private void campoPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPrecoActionPerformed
        
    }//GEN-LAST:event_campoPrecoActionPerformed

    private void comboBoxServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxServicoActionPerformed
        
    }//GEN-LAST:event_comboBoxServicoActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        try {
            controller.novoAgendamento();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAgenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
        try {
            controller.cadastrarAgendamento();
            controller.pesquisaFiltro();
            controller.novoAgendamento();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAgenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgendarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            controller.editarAgendamento();
            controller.pesquisaFiltro();
            controller.novoAgendamento();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAgenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void campoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIdActionPerformed
        
    }//GEN-LAST:event_campoIdActionPerformed

    private void comboBoxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxClienteActionPerformed
        
    }//GEN-LAST:event_comboBoxClienteActionPerformed

    private void comboBoxProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxProdutoActionPerformed
        
    }//GEN-LAST:event_comboBoxProdutoActionPerformed

    private void campoQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoQuantidadeActionPerformed
        
    }//GEN-LAST:event_campoQuantidadeActionPerformed

    private void btnAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoActionPerformed
        
    }//GEN-LAST:event_btnAdicionarProdutoActionPerformed

    private void btnRemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverProdutoActionPerformed
        
    }//GEN-LAST:event_btnRemoverProdutoActionPerformed

    private void campoPesquisaClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisaClienteKeyPressed
        controller.pesquisaCliente();
    }//GEN-LAST:event_campoPesquisaClienteKeyPressed

    private void comboBoxFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxFiltroItemStateChanged
        controller.filtrar();
    }//GEN-LAST:event_comboBoxFiltroItemStateChanged

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            controller.excluirAgendamento();
            controller.pesquisaFiltro();
            controller.novoAgendamento();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAgenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    public JTextField getCampoPesquisaPorId() {
        return campoPesquisaPorId;
    }

    public void setCampoPesquisaPorId(JTextField campoPesquisaPorId) {
        this.campoPesquisaPorId = campoPesquisaPorId;
    }

    public JTextField getCampoPesquisaPorCliente() {
        return campoPesquisaPorCliente;
    }

    public void setCampoPesquisaPorCliente(JTextField campoPesquisaPorCliente) {
        this.campoPesquisaPorCliente = campoPesquisaPorCliente;
    }

    public JButton getBtnPesquisaData() {
        return btnPesquisaData;
    }

    public void setBtnPesquisaData(JButton btnPesquisaData) {
        this.btnPesquisaData = btnPesquisaData;
    }

    public JTextField getCampoAteData() {
        return campoAteData;
    }

    public void setCampoAteData(JTextField campoAteData) {
        this.campoAteData = campoAteData;
    }

    public JTextField getCampoDeData() {
        return campoDeData;
    }

    public void setCampoDeData(JTextField campoDeData) {
        this.campoDeData = campoDeData;
    }

    public JComboBox<String> getComboBoxBarbeiroPesquisa() {
        return comboBoxBarbeiroPesquisa;
    }

    public void setComboBoxBarbeiroPesquisa(JComboBox<String> comboBoxBarbeiroPesquisa) {
        this.comboBoxBarbeiroPesquisa = comboBoxBarbeiroPesquisa;
    }
    
    public JComboBox<String> getComboBoxFiltro() {
        return comboBoxFiltro;
    }

    public void setComboBoxFiltro(JComboBox<String> comboBoxFiltro) {
        this.comboBoxFiltro = comboBoxFiltro;
    }

    public JTable getTabela() {
        return tabela;
    }

    public void setTabela(JTable tabela) {
        this.tabela = tabela;
    }

    public JTextField getCampoPesquisaCliente() {
        return campoPesquisaCliente;
    }

    public void setCampoPesquisaCliente(JTextField campoPesquisaCliente) {
        this.campoPesquisaCliente = campoPesquisaCliente;
    }

    public JComboBox<String> getComboBoxCliente() {
        return comboBoxCliente;
    }

    public void setComboBoxCliente(JComboBox<String> comboBoxCliente) {
        this.comboBoxCliente = comboBoxCliente;
    }

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

    public JComboBox<String> getComboBoxBarbeiro() {
        return comboBoxBarbeiro;
    }

    public void setComboBoxBarbeiro(JComboBox<String> comboBoxBarbeiro) {
        this.comboBoxBarbeiro = comboBoxBarbeiro;
    }

    public JComboBox<String> getComboBoxServico() {
        return comboBoxServico;
    }

    public void setComboBoxServico(JComboBox<String> comboBoxServico) {
        this.comboBoxServico = comboBoxServico;
    }

    public JButton getBtnAdicionarProduto() {
        return btnAdicionarProduto;
    }

    public void setBtnAdicionarProduto(JButton btnAdicionarProduto) {
        this.btnAdicionarProduto = btnAdicionarProduto;
    }

    public JButton getBtnRemoverProduto() {
        return btnRemoverProduto;
    }

    public void setBtnRemoverProduto(JButton btnRemoverProduto) {
        this.btnRemoverProduto = btnRemoverProduto;
    }

    public JTextField getCampoQuantidade() {
        return campoQuantidade;
    }

    public void setCampoQuantidade(JTextField campoQuantidade) {
        this.campoQuantidade = campoQuantidade;
    }

    public JComboBox<String> getComboBoxProduto() {
        return comboBoxProduto;
    }

    public void setComboBoxProduto(JComboBox<String> comboBoxProduto) {
        this.comboBoxProduto = comboBoxProduto;
    }

    public JLabel getLabelProdutos() {
        return labelProdutos;
    }

    public void setLabelProdutos(JLabel labelProdutos) {
        this.labelProdutos = labelProdutos;
    }

    public JLabel getTextProduto() {
        return textProduto;
    }

    public void setTextProduto(JLabel textProduto) {
        this.textProduto = textProduto;
    }

    public JLabel getTextQuantidade() {
        return textQuantidade;
    }

    public void setTextQuantidade(JLabel textQuantidade) {
        this.textQuantidade = textQuantidade;
    }

    public JTextField getCampoPreco() {
        return campoPreco;
    }

    public void setCampoPreco(JTextField campoPreco) {
        this.campoPreco = campoPreco;
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnAdicionarServico;
    private javax.swing.JButton btnAgendar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisaData;
    private javax.swing.JButton btnPesquisarAgendamentoPorId;
    private javax.swing.JButton btnRemoverProduto;
    private javax.swing.JButton btnRemoverServico;
    private javax.swing.JTextField campoAteData;
    private javax.swing.JTextField campoData;
    private javax.swing.JTextField campoDeData;
    private javax.swing.JTextField campoHora;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoPesquisaCliente;
    private javax.swing.JTextField campoPesquisaPorCliente;
    private javax.swing.JTextField campoPesquisaPorId;
    private javax.swing.JTextField campoPreco;
    private javax.swing.JTextField campoQuantidade;
    private javax.swing.JComboBox<String> comboBoxBarbeiro;
    private javax.swing.JComboBox<String> comboBoxBarbeiroPesquisa;
    private javax.swing.JComboBox<String> comboBoxCliente;
    private javax.swing.JComboBox<String> comboBoxFiltro;
    private javax.swing.JComboBox<String> comboBoxProduto;
    private javax.swing.JComboBox<String> comboBoxServico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelProdutos;
    private javax.swing.JSeparator separador;
    private javax.swing.JSeparator separadorInfo;
    private javax.swing.JSeparator separadorVertical;
    private javax.swing.JTable tabela;
    private javax.swing.JLabel textAgendar;
    private javax.swing.JLabel textAte;
    private javax.swing.JLabel textBarbeiro;
    private javax.swing.JLabel textCliente;
    private javax.swing.JLabel textData;
    private javax.swing.JLabel textDe;
    private javax.swing.JLabel textFiltrarAgendamentos;
    private javax.swing.JLabel textHora;
    private javax.swing.JLabel textId;
    private javax.swing.JLabel textIdPesquisa1;
    private javax.swing.JLabel textInfo;
    private javax.swing.JLabel textNome;
    private javax.swing.JLabel textPesquisarPorBarbeiro;
    private javax.swing.JLabel textPesquisarPorCliente;
    private javax.swing.JLabel textPesquisarPorId;
    private javax.swing.JLabel textPesquisarPorPeriodo;
    private javax.swing.JLabel textPreco;
    private javax.swing.JLabel textProduto;
    private javax.swing.JLabel textQuantidade;
    private javax.swing.JLabel textServico;
    // End of variables declaration//GEN-END:variables
}
