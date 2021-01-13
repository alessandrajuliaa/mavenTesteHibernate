package controller;

import dao.AgendamentoDAO;
import dao.ClienteDAO;
import dao.JPAUtil;
import dao.ServicoDAO;
import dao.UsuarioDAO;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Agendamento;
import model.Cliente;
import model.Servico;
import model.Usuario;
import util.Data;
import view.TelaAgendamento;
import view.TelaServico;

public class TelaAgendamentoController {
    private final TelaAgendamento view;
    Set<Integer> setServicos = new HashSet<>();
    ArrayList<Servico> servicos = new ArrayList<>();
     
    //servicos = setServicos;
    double preco;

    public TelaAgendamentoController(TelaAgendamento view) {
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
        view.getCampoPesquisaCliente().setText("");
        view.getCampoId().setText("");
        view.getCampoData().setText("");
        view.getCampoHora().setText("");
        view.getCampoPreco().setText("");
        preco = 0;
        
        servicos = new ArrayList<>();
        habilitarCampos();
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
                    //if(!agendamentoEncontrado.getProdutos().isEmpty())
                     //   view.getComboBoxProduto().setSelectedItem(agendamentoEncontrado.getProdutos().get(0).getNome());
                }else{
                    JOptionPane.showMessageDialog(null, "Agendamento não existe!");
                }
            } catch (HeadlessException e) {
                Logger.getLogger(TelaServico.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "Agendamento não encontrado!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "O campo id não pode estar vazio.");
        }
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
    
    public void preencherComboBoxUsuario(){
        DefaultComboBoxModel comboUsuario = (DefaultComboBoxModel) view.getComboBoxBarbeiro().getModel();
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        ArrayList<Usuario> usuarios = new UsuarioDAO(em).selectAll();
        if(usuarios.size() != 0){
            for(Usuario usuario : usuarios){
                if("Barbeiro".equals(usuario.getCargo())){
                    comboUsuario.addElement(usuario.getNome());
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

    public void iniciarAgenda(){
        preencherComboBoxCliente();
        preencherComboBoxServico();
        preencherComboBoxUsuario();
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
}