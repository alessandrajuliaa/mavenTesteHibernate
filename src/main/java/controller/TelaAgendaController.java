package controller;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.DottedLineSeparator;
import com.itextpdf.text.pdf.draw.VerticalPositionMark;
import dao.AgendamentoDAO;
import dao.ClienteDAO;
import dao.JPAUtil;
import dao.ServicoDAO;
import dao.UsuarioDAO;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Agendamento;
import model.Cliente;
import model.Servico;
import model.Usuario;
import util.Data;
import util.ModeloTabela;
import util.RelatorioCalculos;
import view.TelaServico;
import view.TelaAgenda;

/**
 *
 * @author Alessandra
 */
public class TelaAgendaController {
    private TelaAgenda view;
    Set<Integer> setServicos = new HashSet<>();
    ArrayList<Servico> servicos = new ArrayList<>();
    double preco;
    int opc = 0;

    public TelaAgendaController(TelaAgenda view) {
        this.view = view;
    }
    
    public void cadastrarAgendamento(){
        String data = view.getCampoData().getText();
        String hora = view.getCampoHora().getText();
        Usuario usuario = pegarUsuario();
        Cliente cliente = pegarCliente();
        Data date = new Data(data, hora);
        String priceString = view.getCampoPreco().getText().replace(",", ".");
        double price = Double.parseDouble(priceString);
        
        
        if(!"".equals(data) && !"".equals(hora) && !"".equals(servicos)){
           
           if("Barbeiro".equals(usuario.getCargo()) || "Gestor".equals(usuario.getCargo())){
                
                try {
                    EntityManager em = new JPAUtil().getEntityManager();
                    em.getTransaction().begin();
                    
                    Iterator<Integer> ids = setServicos.iterator();
                    while(ids.hasNext()){
                        Integer id = ids.next();
                        Servico servico = new Servico(id);
                        Servico serv = new ServicoDAO(em).selectPorId(servico);
                        servicos.add(serv);
                    }
                    Agendamento agendamento = new Agendamento(cliente, servicos, usuario, date.date(), price);
                    new AgendamentoDAO(em).insert(agendamento);
                    em.getTransaction().commit();
                    em.close();

                    JOptionPane.showMessageDialog(null, "Horário Agendado com sucesso!");
                }catch(HeadlessException e){
                    Logger.getLogger(TelaServico.class.getName()).log(Level.SEVERE, null, e);
                    JOptionPane.showMessageDialog(null, "Desculpe, não consegui cadastrar o serviço. Tente mais tarde.");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Esse usuário não é um barbeiro.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum campo pode estar vazio.");
        }
    }
    
    public void editarAgendamento() throws SQLException{
        long id = Integer.parseInt(view.getCampoId().getText());
        String data = view.getCampoData().getText();
        String hora = view.getCampoHora().getText();
        Usuario usuario = pegarUsuario();
        Cliente cliente = pegarCliente();
        Data date = new Data(data, hora);
        String priceString = view.getCampoPreco().getText().replace(",", ".");
        double price = Double.parseDouble(priceString);
        
        if(!"".equals(data) && !"".equals(hora) && !servicos.isEmpty()){
            if("Barbeiro".equals(usuario.getCargo()) || "Gestor".equals(usuario.getCargo())){
                Agendamento agendamento = new Agendamento(id, cliente, servicos, usuario, date.date(), price);
                try {
                    EntityManager em = new JPAUtil().getEntityManager();
                    em.getTransaction().begin();
                    new AgendamentoDAO(em).update(agendamento);
                    em.getTransaction().commit();
                    em.close();

                    JOptionPane.showMessageDialog(null, "Agendamento editado com sucesso!");
                }catch(HeadlessException e){
                    Logger.getLogger(TelaServico.class.getName()).log(Level.SEVERE, null, e);
                    JOptionPane.showMessageDialog(null, "Desculpe, não consegui editar o agendamento. Tente mais tarde.");
                }
                }else{
                    JOptionPane.showMessageDialog(null, "Esse usuário não é um barbeiro.");
                }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum campo pode estar vazio.");
        }
    }
    
    public void excluirAgendamento() throws SQLException{
        long id = Integer.parseInt(view.getCampoId().getText());
        if(!"".equals(id)){
            Agendamento agendamento = new Agendamento(id);
            try {
                EntityManager em = new JPAUtil().getEntityManager();
                em.getTransaction().begin();

                new AgendamentoDAO(em).delete(agendamento);

                JOptionPane.showMessageDialog(null, "Agendamento excluído com sucesso!");
                em.getTransaction().commit();
                em.close();

            } catch (HeadlessException e) {
                Logger.getLogger(TelaServico.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "Agendamento não encontrado, ou não excluído!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "O campo id não pode estar vazio!");
        }
    }
        
    public void novoAgendamento() throws SQLException{
        limparCampos();
        habilitarCampos();
    }
    
    public void limparCampos(){
        view.getCampoPesquisaCliente().setText("");
        view.getCampoId().setText("");
        view.getCampoData().setText("");
        view.getCampoHora().setText("");
        view.getCampoPreco().setText("");
        view.getCampoPesquisaCliente().setText("");
        view.getComboBoxCliente().removeAllItems();
        preencherComboBoxCliente();
        preco = 0;
        setServicos = new HashSet<>();
        servicos = new ArrayList<>();
    }
    
    public void habilitarCampos(){
        view.getCampoPesquisaCliente().setEnabled(true);
        view.getComboBoxCliente().setEnabled(true);
        view.getComboBoxServico().setEnabled(true);
        view.getComboBoxBarbeiro().setEnabled(true);
        view.getCampoData().setEnabled(true);
        view.getCampoHora().setEnabled(true);
        view.getCampoPreco().setEnabled(true);
    }
    
    public void preencherTabela(ArrayList<Agendamento> l) {        
        ModeloTabela modelo = new ModeloTabela(l);
        view.getTabela().setModel(modelo);
        view.getTabela().getColumnModel().getColumn(0).setMaxWidth(60);
        view.getTabela().getColumnModel().getColumn(1).setMinWidth(90);
        view.getTabela().getColumnModel().getColumn(3).setMaxWidth(90);
        view.getTabela().getColumnModel().getColumn(4).setMinWidth(100);
        view.getTabela().getColumnModel().getColumn(5).setMinWidth(250);
    }
    
    public void preencherComboBoxServico(){
        DefaultComboBoxModel comboServico = (DefaultComboBoxModel) view.getComboBoxServico().getModel();
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        servicos = new ServicoDAO(em).selectAll();
        if(servicos.size() != 0){
            for(Servico servico : servicos){
                comboServico.addElement(servico.getNome());
            }
        }
        em.getTransaction().commit();
        em.close();
    }
    
    public void preencherComboBoxBarbeiro(ComboBoxModel combo){
        DefaultComboBoxModel comboBarbeiro = (DefaultComboBoxModel)combo;
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        ArrayList<Usuario> usuarios = new UsuarioDAO(em).selectAll();
        if(usuarios.size() != 0){
            for(Usuario usuario : usuarios){
                if("Barbeiro".equals(usuario.getCargo())){
                    comboBarbeiro.addElement(usuario.getNome());
                }
            }
        }
        em.getTransaction().commit();
        em.close();
    }
    
    public void preencherComboBoxCliente(){
        DefaultComboBoxModel comboCliente = (DefaultComboBoxModel) view.getComboBoxCliente().getModel();
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        ArrayList<Cliente> clientes = new ClienteDAO(em).selectAll();
        if(clientes.size() != 0){
            for(Cliente cliente : clientes){
                comboCliente.addElement(cliente.getNome());
            }
        }
        em.getTransaction().commit();
        em.close();
    }

    public void iniciarTabela(){
        Data data = new Data(new Date());
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        preencherTabela(new AgendamentoDAO(em).selectPorData(data.dataFormatadaString(), data.dataFormatadaString()));
        em.getTransaction().commit();
        em.close();
    }
    
    public void iniciarAgenda(){
        iniciarTabela();
        preencherComboBoxBarbeiro(view.getComboBoxBarbeiro().getModel());
        pesquisaCliente();
        preencherComboBoxServico();
        preencherComboBoxBarbeiro(view.getComboBoxBarbeiroPesquisa().getModel());
    }
    
    public Boolean temEmServicos(String nome){
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        Servico servico = new ServicoDAO(em).selectPorNome(nome).get(0);
        
        if(servicos.contains(servico) == true){
            System.out.println(servicos.contains(servico));
            //System.out.println("JÁ EXISTE !!! Estou no vdd, diferente de -1");
            return true;
        }else{
            System.out.println(servicos.contains(servico));
            System.out.println("NÃO EXITE !!! Estou no else, == -1");
            servicos.add(servico);
            preco += new ServicoDAO(em).selectPorNome(nome).get(0).getPreco();
                    view.getCampoPreco().setText("");
            view.getCampoPreco().setText("" + preco);
            em.getTransaction().commit();
            em.close();
            return false;
        }
    }
    
    public void adicionarServico(){
        String nomeServicoSelecionado = view.getComboBoxServico().getSelectedItem().toString();
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        Servico servicoSelecionado = new ServicoDAO(em).selectPorNome(nomeServicoSelecionado).get(0);
        Integer idServicoSelecionado = servicoSelecionado.getId();
        if(setServicos.add(idServicoSelecionado)){
            preco += new ServicoDAO(em).selectPorId(servicoSelecionado).getPreco();
            view.getCampoPreco().setText("");
            view.getCampoPreco().setText("" + preco);
        }else{
            JOptionPane.showMessageDialog(view, "Esse serviço já foi adicionado.");
        }
        em.getTransaction().commit();
        em.close();
    }
    
    public void removerServico(){
        String nomeServicoSelecionado = view.getComboBoxServico().getSelectedItem().toString();
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        Servico servicoSelecionado = new ServicoDAO(em).selectPorNome(nomeServicoSelecionado).get(0);
        Integer idServicoSelecionado = servicoSelecionado.getId();
        if(setServicos.size() != 0){
            if(setServicos.remove(idServicoSelecionado)){
            preco -= new ServicoDAO(em).selectPorId(servicoSelecionado).getPreco();
            view.getCampoPreco().setText("");
            view.getCampoPreco().setText("" + preco);
            }else{
                JOptionPane.showMessageDialog(view, "Esse serviço já foi adicionado.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Você ainda não adicionou nenhum serviço.");
        }
        em.getTransaction().commit();
        em.close();
    }

    public Cliente pegarCliente(){
        String clienteNome = view.getComboBoxCliente().getSelectedItem().toString();
        Cliente clienteEcontrado;
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        clienteEcontrado = new ClienteDAO(em).selectPorNome(clienteNome).get(0);
        em.getTransaction().commit();
        em.close();
        return clienteEcontrado;
    }
   
    public Usuario pegarUsuario(){
        String usuarioNome = view.getComboBoxBarbeiro().getSelectedItem().toString();
        Usuario usuarioEcontrado;
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        usuarioEcontrado = new UsuarioDAO(em).selectPorNome(usuarioNome).get(0);
        em.getTransaction().commit();
        em.close();
        return usuarioEcontrado;
    }
    
    public void pesquisarPorId() throws SQLException{
        String pesquisa = view.getCampoPesquisaPorId().getText();
        if(!"".equals(pesquisa)){
            long id = Integer.parseInt(pesquisa);
            Agendamento agendamento = new Agendamento(id);
            try {
                EntityManager em = new JPAUtil().getEntityManager();
                em.getTransaction().begin();
                Agendamento agendamentoEncontrado = new AgendamentoDAO(em).selectPorId(agendamento);
                em.getTransaction().commit();
                em.close();
                
                if(agendamentoEncontrado != null){
                    Data date = new Data(agendamentoEncontrado.getData());
                    view.getComboBoxCliente().setSelectedItem(agendamentoEncontrado.getCliente().getNome());
                    view.getComboBoxCliente().setEnabled(true);
                    view.getCampoId().setText(String.valueOf(agendamentoEncontrado.getId()));
                    view.getCampoId().setEnabled(true);
                    view.getComboBoxServico().setSelectedItem(agendamentoEncontrado.getServicos().get(0).getNome());
                    view.getComboBoxServico().setEnabled(true);
                    view.getComboBoxBarbeiro().setSelectedItem(agendamentoEncontrado.getUsuario().getNome());
                    view.getComboBoxBarbeiro().setEnabled(true);
                    view.getCampoData().setText(date.dataFormatadaString());
                    view.getCampoData().setEnabled(true);
                    view.getCampoHora().setText(date.horaFormatadaString());
                    view.getCampoHora().setEnabled(true);
                    view.getCampoPreco().setText("0");
                    view.getCampoPreco().setEnabled(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Agendamento não existe!");
                }
            } catch (HeadlessException e) {
                Logger.getLogger(TelaAgenda.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "Agendamento não encontrado!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "O campo id não pode estar vazio.");
        }
    }
    
    public ArrayList<Agendamento> pesquisaPorData() {
        ArrayList<Agendamento> agendamentos = new ArrayList<>();
        String dataDe = view.getCampoDeData().getText();
        String dataAte = view.getCampoAteData().getText();
        if(!"".equals(view.getCampoDeData().getText())){
            EntityManager em = new JPAUtil().getEntityManager();
            em.getTransaction().begin();
            if(!"".equals(view.getCampoAteData().getText())){
                agendamentos = new AgendamentoDAO(em).selectPorData(dataDe, dataAte);
            }else{
                Data dataAtual = new Data(new Date());
                agendamentos = new AgendamentoDAO(em).selectPorData(dataDe, dataAtual.dataFormatadaString());
            }
            em.getTransaction().commit();
            em.close();
        }else{
            JOptionPane.showMessageDialog(null, "A primeira data não pode estar vazia.");
        }
        return agendamentos;
    }
    
    public void pesquisaPorCliente() {        
        String dataDe = view.getCampoDeData().getText();
        String dataAte = view.getCampoAteData().getText();
        String nome = view.getCampoPesquisaCliente().getText();
        Data dataAtual = new Data(new Date());
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        if("".equals(view.getCampoDeData().getText()) && "".equals(view.getCampoAteData().getText())){
            view.getTabela().setModel(new ModeloTabela(new AgendamentoDAO(em).selectPorCliente("01/01/2000", dataAtual.dataFormatadaString(), nome)));
        }else if(!"".equals(view.getCampoDeData().getText())){
            view.getTabela().setModel(new ModeloTabela(new AgendamentoDAO(em).selectPorCliente(dataDe, dataAtual.dataFormatadaString(), nome)));
        }else if(!"".equals(view.getCampoAteData().getText())){
            view.getTabela().setModel(new ModeloTabela(new AgendamentoDAO(em).selectPorCliente("01/01/2000", dataAte, nome)));
        }else{
            view.getTabela().setModel(new ModeloTabela(new AgendamentoDAO(em).selectPorCliente(dataDe, dataAte, nome)));
        }
        em.getTransaction().commit();
        em.close();
    }
    
    public ArrayList<Agendamento> pesquisaPorBarbeiro() {
        ArrayList<Agendamento> agendamentos = new ArrayList<>();
        String nome = view.getComboBoxBarbeiroPesquisa().getSelectedItem().toString();
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        agendamentos = new AgendamentoDAO(em).selectPorBarbeiro(nome);
        em.getTransaction().commit();
        em.close();
        return agendamentos;
    }
       
    public ArrayList<Agendamento> pesquisaPorDataEBarbeiro(){
        ArrayList<Agendamento> agendamentos = new ArrayList<>();
        String dataDe = view.getCampoDeData().getText();
        String dataAte = view.getCampoAteData().getText();
        String nome = view.getComboBoxBarbeiroPesquisa().getSelectedItem().toString();
        Data dataAtual = new Data(new Date());
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
            if("".equals(view.getCampoDeData().getText()) && "".equals(view.getCampoAteData().getText())){
                agendamentos = new AgendamentoDAO(em).selectPorDataEBarbeiro("01/01/2000", dataAtual.dataFormatadaString(), nome);
            }else if(!"".equals(view.getCampoDeData().getText())){
                agendamentos = new AgendamentoDAO(em).selectPorDataEBarbeiro(dataDe, dataAtual.dataFormatadaString(), nome);
            }else if(!"".equals(view.getCampoAteData().getText())){
                agendamentos = new AgendamentoDAO(em).selectPorDataEBarbeiro("01/01/2000", dataAte, nome);
            }else{
                agendamentos = new AgendamentoDAO(em).selectPorDataEBarbeiro(dataDe, dataAte, nome);
            }        
        em.getTransaction().commit();
        em.close();
        return agendamentos;
    }
            
    public void pesquisaFiltro(){
        if(opc == 1){
            preencherTabela(pesquisaPorData());
        }else if(opc == 2){
            preencherTabela(pesquisaPorBarbeiro());
        }else if(opc == 3){
            preencherTabela(pesquisaPorDataEBarbeiro());
        }else{
            Data dataAtual = new Data(new Date());
            String barbeiro = view.getComboBoxBarbeiroPesquisa().getSelectedItem().toString();
            EntityManager em = new JPAUtil().getEntityManager();
            em.getTransaction().begin();
            preencherTabela(new AgendamentoDAO(em).selectPorDataEBarbeiro(dataAtual.dataFormatadaString(), dataAtual.dataFormatadaString(), barbeiro));
            em.getTransaction().commit();
            em.close();
        }
    }
    
    public void filtrar() {
        String opcaoFiltro = view.getComboBoxFiltro().getSelectedItem().toString();
        switch(opcaoFiltro){
            case "Data":
                view.getCampoDeData().setEnabled(true);
                view.getCampoAteData().setEnabled(true);
                view.getBtnPesquisaData().setEnabled(true);
                view.getComboBoxBarbeiroPesquisa().setEnabled(false);
                view.getComboBoxBarbeiroPesquisa().setSelectedItem("");
                opc = 1;
                break;
            case "Barbeiro":
                view.getCampoDeData().setEnabled(false);
                view.getCampoAteData().setEnabled(false);
                view.getBtnPesquisaData().setEnabled(false);
                view.getComboBoxBarbeiroPesquisa().setEnabled(true);
                opc = 2;
                break;
            case "Data e Barbeiro":
                view.getCampoDeData().setEnabled(true);
                view.getCampoAteData().setEnabled(true);
                view.getBtnPesquisaData().setEnabled(true);
                view.getComboBoxBarbeiroPesquisa().setEnabled(true);
                opc = 3;
                break;
            default:
                opc = 0;
                break;
        }
    }
    
    public void pesquisaCliente() {        
        String nome = view.getCampoPesquisaCliente().getText();
        DefaultComboBoxModel comboCliente = (DefaultComboBoxModel) view.getComboBoxCliente().getModel();
        ArrayList<Cliente> clientes = null;
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        view.getComboBoxCliente().removeAllItems();
        if(nome == "")
            clientes = new ClienteDAO(em).selectAll();
        else
            clientes = new ClienteDAO(em).selectPorNomeCampo(nome);    
        
        if(clientes.size() != 0){
            for(Cliente cliente : clientes){
                comboCliente.addElement(cliente.getNome());
            }
        }
        em.getTransaction().commit();
        em.close();
    }
    
    public void gerarRelatorio() throws FileNotFoundException, DocumentException{
        ArrayList<Agendamento> agendamentos = new ArrayList<>();
        String dataDe = view.getCampoDeData().getText();
        String dataAte = view.getCampoAteData().getText();
        Data dataAtual = new Data(new Date());
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        if(!"".equals(view.getCampoDeData().getText())){
            if(!"".equals(view.getCampoAteData().getText())){
                agendamentos = new AgendamentoDAO(em).selectPorData(dataDe, dataAte);
            }else{
                dataAte = dataAtual.dataFormatadaString();
                agendamentos = new AgendamentoDAO(em).selectPorData(dataDe, dataAtual.dataFormatadaString());
            }
        }else{
            JOptionPane.showMessageDialog(null, "A primeira data não pode estar vazia.");
        }
        em.getTransaction().commit();
        em.close();
        
        // CRIANDO RELATORIO PARA CALCULOS 
        RelatorioCalculos relatorio = new RelatorioCalculos(agendamentos);
            
        //CRIANDO O ARQUIVO 
        String data = dataAtual.dataFormatadaString().replace("/", "-");
        String caminho = "C:\\Users\\Public/relatorio" + data + ".pdf";
        
        Chunk glue = new Chunk(new VerticalPositionMark());
        DottedLineSeparator dottedline = new DottedLineSeparator();
        dottedline.setOffset(-2);
        dottedline.setGap(2f);
        Document doc = new Document();
        PdfWriter.getInstance(doc, new FileOutputStream(caminho));
        doc.open();
        // ABRINDO O DOCUMENTO
        
        // Header
        Paragraph header = new Paragraph("Relatório\n\n", new Font(Font.FontFamily.HELVETICA, 18));
        header.setAlignment(Element.ALIGN_CENTER);
        doc.add(header);
        
        Paragraph textData = new Paragraph(dataDe + " à " + dataAte + "\n\n", new Font(Font.FontFamily.HELVETICA, 10));
        textData.setAlignment(Element.ALIGN_RIGHT);
        doc.add(textData);
        
        // Body
        Paragraph servicos = new Paragraph("Serviços:", new Font(Font.FontFamily.HELVETICA, 12));
        servicos.setAlignment(Element.ALIGN_LEFT);
        servicos.add(new Chunk(glue));
        servicos.add("R$" + relatorio.totalServicos());
        doc.add(servicos);

        /*Paragraph produtos = new Paragraph("Produtos:", new Font(FontFamily.HELVETICA, 12));
        produtos.setAlignment(Element.ALIGN_LEFT);
        produtos.add(new Chunk(glue));
        produtos.add("R$" + relatorio.totalProdutos());
        doc.add(produtos);*/
        
        // Total
        Paragraph textTotalMensal = new Paragraph("Total:", new Font(Font.FontFamily.HELVETICA, 12));
        textTotalMensal.setAlignment(Element.ALIGN_LEFT);
        textTotalMensal.add(new Chunk(glue));
        textTotalMensal.add("R$" + relatorio.total());
        doc.add(textTotalMensal);
        
        // FECHANDO O DOCUMENTO
        doc.close();
    }
    
    public void gerarRelatorioBarbeiro() throws FileNotFoundException, DocumentException{
        ArrayList<Agendamento> agendamentos = new ArrayList<>();
        String dataDe = view.getCampoDeData().getText();
        String dataAte = view.getCampoAteData().getText();
        String nome = view.getComboBoxBarbeiro().getSelectedItem().toString();
        Data dataAtual = new Data(new Date());
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        if("".equals(view.getCampoDeData().getText()) && "".equals(view.getCampoAteData().getText())){
            dataDe = "01/01/2000";
            dataAte = dataAtual.dataFormatadaString();
            agendamentos = new AgendamentoDAO(em).selectPorDataEBarbeiro("01/01/2000", dataAtual.dataFormatadaString(), nome);
        }else if(!"".equals(view.getCampoDeData().getText())){
            dataAte = dataAtual.dataFormatadaString();
            agendamentos = new AgendamentoDAO(em).selectPorDataEBarbeiro(dataDe, dataAtual.dataFormatadaString(), nome);
        }else if(!"".equals(view.getCampoAteData().getText())){
            agendamentos = new AgendamentoDAO(em).selectPorDataEBarbeiro("01/01/2000", dataAte, nome);
        }else{
            agendamentos = new AgendamentoDAO(em).selectPorDataEBarbeiro(dataDe, dataAte, nome);
        }
        em.getTransaction().commit();
        em.close();
        
        // CRIANDO RELATORIO PARA CALCULOS 
        RelatorioCalculos relatorio = new RelatorioCalculos(agendamentos);
            
        //CRIANDO O ARQUIVO 
        String data = dataAtual.dataFormatadaString().replace("/", "-");
        String caminho = "C:\\Users\\Public/relatorio" + nome + data + ".pdf";
        
        Chunk glue = new Chunk(new VerticalPositionMark());
        DottedLineSeparator dottedline = new DottedLineSeparator();
        dottedline.setOffset(-2);
        dottedline.setGap(2f);
        Document doc = new Document();
        PdfWriter.getInstance(doc, new FileOutputStream(caminho));
        doc.open();
        // ABRINDO O DOCUMENTO
        
        // Header
        Paragraph header = new Paragraph("Relatório do Barbeiro " + nome + "\n\n", new Font(Font.FontFamily.HELVETICA, 18));
        header.setAlignment(Element.ALIGN_CENTER);
        doc.add(header);
        
        Paragraph textData = new Paragraph(dataDe + " à " + dataAte + "\n\n", new Font(Font.FontFamily.HELVETICA, 10));
        textData.setAlignment(Element.ALIGN_RIGHT);
        doc.add(textData);
        
        // Body
        Paragraph servicos = new Paragraph("Serviços:", new Font(Font.FontFamily.HELVETICA, 12));
        servicos.setAlignment(Element.ALIGN_LEFT);
        servicos.add(new Chunk(glue));
        servicos.add("R$" + relatorio.totalServicos());
        doc.add(servicos);

        /*Paragraph produtos = new Paragraph("Produtos:", new Font(FontFamily.HELVETICA, 12));
        produtos.setAlignment(Element.ALIGN_LEFT);
        produtos.add(new Chunk(glue));
        produtos.add("R$" + relatorio.totalProdutos());
        doc.add(produtos);*/
        
        // Total
        Paragraph textTotalMensal = new Paragraph("Total:", new Font(Font.FontFamily.HELVETICA, 12));
        textTotalMensal.setAlignment(Element.ALIGN_LEFT);
        textTotalMensal.add(new Chunk(glue));
        textTotalMensal.add("R$" + relatorio.total());
        doc.add(textTotalMensal);
        
        // FECHANDO O DOCUMENTO
        doc.close();
    }
}
