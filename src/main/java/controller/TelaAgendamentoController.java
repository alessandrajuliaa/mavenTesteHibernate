package controller;

import dao.AgendamentoDAO;
import dao.ClienteDAO;
import dao.JPAUtil;
import dao.ProdutoDAO;
import dao.ServicoDAO;
import dao.UsuarioDAO;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Agendamento;
import model.Cliente;
import model.Produto;
import model.Servico;
import model.Usuario;
import view.TelaAgendamento;
import view.TelaServico;

public class TelaAgendamentoController {
    private final TelaAgendamento view;
    List<Servico> servicos = new ArrayList<>();
    List<Produto> produtos = new ArrayList<>();
    double preco;

    public TelaAgendamentoController(TelaAgendamento view) {
        this.view = view;
    }
    
    public void cadastrarAgendamento(){
        String data = view.getCampoData().getText();
        String hora = view.getCampoHora().getText();
        Usuario usuario = pegarUsuario();
        Cliente cliente = pegarCliente();
        

        if(!"".equals(data) && !"".equals(hora) && !servicos.isEmpty()){
           
           if("Barbeiro".equals(usuario.getCargo()) || "Gestor".equals(usuario.getCargo())){
                Agendamento agendamento = new Agendamento(cliente, servicos, produtos, usuario, data, hora);
                try {
                    EntityManager em = new JPAUtil().getEntityManager();
                    em.getTransaction().begin();
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
        
        if(!"".equals(data) && !"".equals(hora) && !servicos.isEmpty()){
            if("Barbeiro".equals(usuario.getCargo()) || "Gestor".equals(usuario.getCargo())){
                Agendamento agendamento = new Agendamento(id, cliente, servicos, produtos, usuario, data, hora);
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
        view.getCampoHora().getText();
        view.getCampoHora().getText();
        view.getComboBoxBarbeiro().getSelectedItem().toString();
        view.getCampoHora().getText();
        view.getCampoData().getText();
        view.getCampoPreco().getText();
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
        view.getCampoPesquisaCliente().setText("");
        view.getCampoPesquisaCliente().setEnabled(true);
        view.getComboBoxCliente().setEnabled(true);
        view.getCampoId().setText("");
        view.getComboBoxServico().setEnabled(true);
        view.getComboBoxBarbeiro().setEnabled(true);
        view.getComboBoxProduto().setEnabled(true);
        view.getCampoData().setText("");
        view.getCampoData().setEnabled(true);
        view.getCampoHora().setText("");
        view.getCampoHora().setEnabled(true);
        view.getCampoPreco().setText("");
        view.getCampoPreco().setEnabled(true);
    }
    
    public void pesquisar() throws SQLException{
        String pesquisa = view.getCampoPesquisaAgendamento().getText();
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
                    view.getComboBoxCliente().setSelectedItem(agendamentoEncontrado.getCliente().getNome());
                    view.getComboBoxCliente().setEnabled(true);
                    view.getCampoId().setText(String.valueOf(agendamentoEncontrado.getId()));
                    view.getCampoId().setEnabled(true);
                    view.getComboBoxServico().setSelectedItem(agendamentoEncontrado.getServicos().get(0).getNome());
                    view.getComboBoxServico().setEnabled(true);
                    view.getComboBoxBarbeiro().setSelectedItem(agendamentoEncontrado.getUsuario().getNome());
                    view.getComboBoxBarbeiro().setEnabled(true);
                    view.getCampoData().setText(agendamentoEncontrado.getData());
                    view.getCampoData().setEnabled(true);
                    view.getCampoHora().setText(agendamentoEncontrado.getHora());
                    view.getCampoHora().setEnabled(true);
                    view.getCampoPreco().setText("0");
                    view.getCampoPreco().setEnabled(true);
                    view.getComboBoxProduto().setEnabled(true);
                    if(!agendamentoEncontrado.getProdutos().isEmpty())
                        view.getComboBoxProduto().setSelectedItem(agendamentoEncontrado.getProdutos().get(0).getNome());
                }else{
                    JOptionPane.showMessageDialog(null, "Agendamento não existe!");
                }
            } catch (HeadlessException e) {
                Logger.getLogger(TelaServico.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "Agendamento não encontrado!");
            }
        }else{
            /*EntityManager em = new JPAUtil().getEntityManager();
            em.getTransaction().begin();
            List<Agendamento> servicos = new AgendamentoDAO(em).selectAll();
            for(Servico servico : servicos){
                System.out.println(servico.getId()+ " - " + servico.getNome() + " - " + servico.getPreco());
            }
            em.getTransaction().commit();
            em.close();*/
            JOptionPane.showMessageDialog(null, "O campo id não pode estar vazio.");
        }
    }
    public void preencherComboBoxServico(){
        DefaultComboBoxModel comboServico = (DefaultComboBoxModel) view.getComboBoxServico().getModel();
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        List<Servico> servicos = new ServicoDAO(em).selectAll();
        for(Servico servico : servicos){
            comboServico.addElement(servico.getNome());
        }
        em.getTransaction().commit();
        em.close();
    }
    public void preencherComboBoxUsuario(){
        DefaultComboBoxModel comboUsuario = (DefaultComboBoxModel) view.getComboBoxBarbeiro().getModel();
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        List<Usuario> usuarios = new UsuarioDAO(em).selectAll();
        for(Usuario usuario : usuarios){
            if("Barbeiro".equals(usuario.getCargo())){
                comboUsuario.addElement(usuario.getNome());
            }
        }
        em.getTransaction().commit();
        em.close();
    }
    public void preencherComboBoxCliente(){
        DefaultComboBoxModel comboCliente = (DefaultComboBoxModel) view.getComboBoxCliente().getModel();
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        List<Cliente> clientes = new ClienteDAO(em).selectAll();
        for(Cliente cliente : clientes){
            comboCliente.addElement(cliente.getNome());
        }
        em.getTransaction().commit();
        em.close();
    }
    public void preencherComboBoxProduto(){
        DefaultComboBoxModel comboProduto = (DefaultComboBoxModel) view.getComboBoxProduto().getModel();
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        List<Produto> produtos = new ProdutoDAO(em).selectAll();
        for(Produto produto : produtos){
            comboProduto.addElement(produto.getNome());
        }
        em.getTransaction().commit();
        em.close();
    }
    
    /*public void preencherTabelaAgendamentos(){
        DefaultTableModel tabelaModelo = (DefaultTableModel) view.getTabela().getModel();
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        List<Agendamento> agendamentos = new AgendamentoDAO(em).selectAll();
        tabelaModelo.setNumRows(0);
        for(Agendamento agendamento : agendamentos){
            //System.out.println(agendamento.getCliente().getNome() + " - " + agendamento.getUsuario().getNome() 
            //            + " - " + agendamento.getProdutos() + " - " + agendamento.getServicos());
            System.out.println(agendamento.getCliente());
            tabelaModelo.addRow(new Object[]{
                agendamento.getHora(),
                agendamento.getData()
                //agendamento.getCliente().getNome()
                //agendamento.getUsuario().getNome() ,
                //agendamento.getProdutos(),
               // agendamento.getServicos()
            });
        }
        em.getTransaction().commit();
        em.close();
    }*/
    
    public void iniciarAgenda(){
        preencherComboBoxCliente();
        preencherComboBoxServico();
        preencherComboBoxProduto();
        preencherComboBoxUsuario();
    }
    
    public void adicionarServico(){
        String servicoNome = view.getComboBoxServico().getSelectedItem().toString();
        Servico servico = new Servico(servicoNome);

        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        servicos.add(new ServicoDAO(em).selectPorNome(servico));
        em.getTransaction().commit();
        em.close();
    }
    
    public void adicionarProduto(){
        String produtoNome = view.getComboBoxProduto().getSelectedItem().toString();
        Produto produto = new Produto(produtoNome);

        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        produtos.add(new ProdutoDAO(em).selectPorNome(produto));
        em.getTransaction().commit();
        em.close();
    }
    
    public Cliente pegarCliente(){
        String clienteNome = view.getComboBoxCliente().getSelectedItem().toString();
        Cliente cliente = new Cliente(clienteNome);
        Cliente clienteEcontrado;
        
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        clienteEcontrado = new ClienteDAO(em).selectPorNome(cliente);
        em.getTransaction().commit();
        em.close();
        return clienteEcontrado;
    }
    
    public Usuario pegarUsuario(){
        String usuarioNome = view.getComboBoxBarbeiro().getSelectedItem().toString();
        Usuario usuario = new Usuario(usuarioNome);
        Usuario usuarioEcontrado;
        
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        usuarioEcontrado = new UsuarioDAO(em).selectPorNome(usuario);
        em.getTransaction().commit();
        em.close();
        return usuarioEcontrado;
    }
}
