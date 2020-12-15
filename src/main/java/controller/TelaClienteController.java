package controller;

import dao.ClienteDAO;
import dao.JPAUtil;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        String telefone = view.getCampoTelefone().getText();
        
        if(!"".equals(nome) && !"".equals(telefone)){
            Cliente cliente = new Cliente(nome, telefone);
            try {
                EntityManager em = new JPAUtil().getEntityManager();
                em.getTransaction().begin();
                new ClienteDAO(em).insert(cliente);
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
        if(view.getCampoNome().isEnabled()){
            String nome = view.getCampoNome().getText();
            String telefone = view.getCampoTelefone().getText();

            if(!"".equals(nome) && !"".equals(telefone)){
                Cliente cliente = new Cliente(nome, telefone);
                try {
                    EntityManager em = new JPAUtil().getEntityManager();
                    em.getTransaction().begin();
                    new ClienteDAO(em).update(cliente);
                    em.getTransaction().commit();
                    em.close();

                    JOptionPane.showMessageDialog(null, "Usuário editado com sucesso!");
                }catch(HeadlessException e){
                    JOptionPane.showMessageDialog(null, "Desculpe, não consegui editar o cliente. Tente mais tarde.");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Nenhum campo pode estar vazio.");
            }
        }else{
            habilitarCampos();
        }
        
    }
    
    public void excluirCliente() throws SQLException{
        String telefone = view.getCampoTelefone().getText();
        if(!"".equals(telefone)){
            Cliente cliente = new Cliente(telefone);
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
        view.getCampoTelefone().setText("");
        habilitarCampos();
    }
    
    public void habilitarCampos(){
        view.getCampoNome().setEnabled(true);
        view.getCampoTelefone().setEnabled(true);
    }
    
    public void pesquisarPorNome() throws SQLException{
        String nomePesquisado = view.getCampoPesquisaCliente().getText();
        if(!"".equals(nomePesquisado)){
            try {
                EntityManager em = new JPAUtil().getEntityManager();
                em.getTransaction().begin();
                ArrayList<Cliente> clientes = new ClienteDAO(em).selectPorNome(nomePesquisado);
                em.getTransaction().commit();
                em.close();
                if(clientes.size() != 0){
                    Cliente cliente = clientes.get(0);
                    //view.getCampoId().setText(String.valueOf(cliente.get()));
                    view.getCampoNome().setText(cliente.getNome());
                    view.getCampoTelefone().setText(String.valueOf(cliente.getTelefone()));
                }else{
                    JOptionPane.showMessageDialog(null, "Cliente não existe!");
                }
            } catch (HeadlessException e) {
                Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "Cliente não encontrado, ou não excluído!");
            }
        }
    }
    
    public void pesquisarPorNomeCampo() throws SQLException{
        String pesquisa = view.getCampoPesquisaCliente().getText();
            
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        ArrayList<Cliente> clientes = new ClienteDAO(em).selectPorNomeCampo(pesquisa);
        em.getTransaction().commit();
        em.close();
        if(clientes.size() != 0){
            Cliente cliente = clientes.get(0);
            //view.getCampoId().setText(String.valueOf(cliente.getId()));
            view.getCampoNome().setText(cliente.getNome());
            view.getCampoTelefone().setText(String.valueOf(cliente.getTelefone()));
        }
    }
}
