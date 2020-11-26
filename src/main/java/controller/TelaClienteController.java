package controller;

import dao.ClienteDAO;
import dao.JPAUtil;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import model.Cliente;
import view.TelaCliente;

public class TelaClienteController {
    private final TelaCliente view;

    public TelaClienteController(TelaCliente view) {
        this.view = view;
    }
    
    public void cadastrarCliente() throws SQLException{
        String nome = view.getCampoNome().getText();
        String email = view.getCampoEmail().getText();
        String telefone = view.getCampoTelefone().getText();
        
        if(!"".equals(nome) && !"".equals(email) && !"".equals(telefone)){
            Cliente cliente = new Cliente(nome, email, telefone);
            try {
                EntityManager em = new JPAUtil().getEntityManager();
                em.getTransaction().begin();
                new ClienteDAO(em).insertOrUpdate(cliente);
                em.getTransaction().commit();
                em.close();

                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
            }catch(HeadlessException e){
                JOptionPane.showMessageDialog(null, "Desculpe, não consegui cadastrar o cliente. Tente mais tarde.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum campo pode estar vazio.");
        }
    }
    
    public void editarCliente() throws SQLException{
        String nome = view.getCampoNome().getText();
        String email = view.getCampoEmail().getText();
        String telefone = view.getCampoTelefone().getText();
        
        if(!"".equals(nome) && !"".equals(email) && !"".equals(telefone)){
            Cliente cliente = new Cliente(nome, email, telefone);
            try {
                EntityManager em = new JPAUtil().getEntityManager();
                em.getTransaction().begin();
                new ClienteDAO(em).insertOrUpdate(cliente);
                em.getTransaction().commit();
                em.close();

                JOptionPane.showMessageDialog(null, "Usuário editado com sucesso!");
            }catch(HeadlessException e){
                JOptionPane.showMessageDialog(null, "Desculpe, não consegui editar o cliente. Tente mais tarde.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum campo pode estar vazio.");
        }
    }
    
    public void excluirCliente() throws SQLException{
        String email = view.getCampoEmail().getText();
        if(!"".equals(email)){
            Cliente cliente = new Cliente(email);
            try {
                EntityManager em = new JPAUtil().getEntityManager();
                em.getTransaction().begin();

                new ClienteDAO(em).delete(cliente);

                JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!");
                em.getTransaction().commit();
                em.close();

            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado, ou não excluído!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "O campo email não pode estar vazio!");
        }
    }
    
    public void novoCliente() throws SQLException{
        view.getCampoNome().setText("");
        view.getCampoEmail().setText("");
        view.getCampoTelefone().setText("");
    }
    
    public void pesquisar() throws SQLException{
        String pesquisa = view.getCampoPesquisa().getText();
        if(!"".equals(pesquisa)){
            Cliente cliente = new Cliente(pesquisa);
            try {
                EntityManager em = new JPAUtil().getEntityManager();
                em.getTransaction().begin();
                Cliente clienteEncontrado = new ClienteDAO(em).selectPorEmail(cliente);
                em.getTransaction().commit();
                em.close();
                
                if(clienteEncontrado != null){
                    view.getCampoNome().setText(clienteEncontrado.getNome());
                    view.getCampoEmail().setText(clienteEncontrado.getEmail());
                    view.getCampoTelefone().setText(clienteEncontrado.getTelefone());
                }else{
                    JOptionPane.showMessageDialog(null, "Cliente não existe!");
                }
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado, ou não excluído!");
            }
        }else{
            EntityManager em = new JPAUtil().getEntityManager();
            em.getTransaction().begin();
            List<Cliente> clientes = new ClienteDAO(em).selectAll();
            for (Cliente cliente : clientes){
                System.out.println(cliente.getNome() + " - " + cliente.getEmail() + " - " + cliente.getTelefone());
            }
            em.getTransaction().commit();
            em.close();
        }
    }
}
