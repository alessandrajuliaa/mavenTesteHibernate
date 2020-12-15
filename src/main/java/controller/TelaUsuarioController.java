package controller;

import dao.JPAUtil;
import dao.UsuarioDAO;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import model.Usuario;
import view.TelaUsuario;

public class TelaUsuarioController {
    private TelaUsuario view;

    public TelaUsuarioController(TelaUsuario view) {
        this.view = view;
    }
    
    public void cadastrarUsuario() throws SQLException{
        String nome = view.getCampoNome().getText();
        String email = view.getCampoEmail().getText();
        String telefone = view.getCampoTelefone().getText();
        String cargo = view.getComboBoxFuncao().getSelectedItem().toString();
        String senha = view.getCampoSenha().getText();
        String confirmarSenha = view.getCampoConfirmarSenha().getText();
        
        if(!"".equals(nome) && !"".equals(email) && !"".equals(telefone) && !"".equals(cargo) && !"".equals(senha) && !"".equals(confirmarSenha)){
            if(senha.equals(confirmarSenha)){
                Usuario usuario = new Usuario(nome, email, telefone, cargo, senha);
                try {
                    EntityManager em = new JPAUtil().getEntityManager();
                    em.getTransaction().begin();
                    new UsuarioDAO(em).insert(usuario);
                    em.getTransaction().commit();
                    em.close();
                    
                    JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
                }catch(Exception e){
                    Logger.getLogger(TelaUsuario.class.getName()).log(Level.SEVERE, null, e);
                    JOptionPane.showMessageDialog(null, "Desculpe, não consegui cadastrar o usuário. Tente mais tarde.");
                }
            }else{
                JOptionPane.showMessageDialog(null, "As senhas não coincidem.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum campo pode estar vazio.");
        }
    }
    
    public void editarUsuario() throws SQLException{
        if(view.getCampoNome().isEnabled()){
            String nome = view.getCampoNome().getText();
            String email = view.getCampoEmail().getText();
            String telefone = view.getCampoTelefone().getText();
            String cargo = view.getComboBoxFuncao().getSelectedItem().toString();
            String senha = view.getCampoSenha().getText();
            String confirmarSenha = view.getCampoConfirmarSenha().getText();

            if(!"".equals(nome) && !"".equals(email) && !"".equals(telefone) && !"".equals(cargo) && !"".equals(senha) && !"".equals(confirmarSenha)){
                if(senha.equals(confirmarSenha)){
                    Usuario usuario = new Usuario(nome, email, telefone, cargo, senha);
                    try {
                        EntityManager em = new JPAUtil().getEntityManager();
                        em.getTransaction().begin();
                        new UsuarioDAO(em).update(usuario);
                        em.getTransaction().commit();
                        em.close();

                        JOptionPane.showMessageDialog(null, "Usuário editado com sucesso!");
                    }catch(Exception e){
                        Logger.getLogger(TelaUsuario.class.getName()).log(Level.SEVERE, null, e);
                        JOptionPane.showMessageDialog(null, "Desculpe, não consegui editar o usuário. Tente mais tarde.");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "As senhas não coincidem.");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Nenhum campo pode estar vazio.");
            }
        }else{
            habilitarCampos();
        }
        
    }
    
    public void excluirUsuario() throws SQLException{
        String email = view.getCampoEmail().getText();
        if(!"".equals(email)){
            Usuario usuario = new Usuario(email);
            try {
                EntityManager em = new JPAUtil().getEntityManager();
                em.getTransaction().begin();

                new UsuarioDAO(em).delete(usuario);

                JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!");
                em.getTransaction().commit();
                em.close();

            } catch (Exception e) {
                Logger.getLogger(TelaUsuario.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "Usuário não encontrado, ou não excluído!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "O campo email não pode estar vazio!");
        }
    }
    
    public void novoUsuario() throws SQLException{
        view.getCampoNome().setText("");
        view.getCampoEmail().setText("");
        view.getCampoTelefone().setText("");
        view.getCampoSenha().setText("");
        view.getCampoConfirmarSenha().setText("");
        habilitarCampos();
    }
    
    public void habilitarCampos(){
        view.getCampoNome().setEnabled(true);
        view.getCampoEmail().setEnabled(true);
        view.getCampoTelefone().setEnabled(true);
        view.getCampoSenha().setEnabled(true);
        view.getCampoConfirmarSenha().setEnabled(true);
        view.getComboBoxFuncao().setEnabled(true);
    }
    
    public void pesquisarPorNome() throws SQLException{
        String nomePesquisado = view.getCampoPesquisaUsuario().getText();
        if(!"".equals(nomePesquisado)){
            try {
                EntityManager em = new JPAUtil().getEntityManager();
                em.getTransaction().begin();
                ArrayList<Usuario> usuarios = new UsuarioDAO(em).selectPorNome(nomePesquisado);
                em.getTransaction().commit();
                em.close();
                if(usuarios.size() != 0){
                    Usuario user = usuarios.get(0);
                    view.getCampoNome().setText(String.valueOf(user.getNome()));
                    view.getCampoEmail().setText(user.getEmail());
                    view.getCampoTelefone().setText(String.valueOf(user.getTelefone()));
                    view.getComboBoxFuncao().setSelectedItem(user.getCargo());
                    view.getCampoSenha().setText(user.getSenha());
                    view.getCampoConfirmarSenha().setText(user.getSenha());
                }else{
                    JOptionPane.showMessageDialog(null, "Serviço não existe!");
                }
            } catch (HeadlessException e) {
                Logger.getLogger(TelaUsuario.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "Serviço não encontrado, ou não excluído!");
            }
        }
    }
    
    public void pesquisarPorNomeCampo() throws SQLException{
        String pesquisa = view.getCampoPesquisaUsuario().getText();
            
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        ArrayList<Usuario> usuarios = new UsuarioDAO(em).selectPorNomeCampo(pesquisa);
        em.getTransaction().commit();
        em.close();
        if(usuarios.size() != 0){
            Usuario user = usuarios.get(0);
            view.getCampoNome().setText(String.valueOf(user.getNome()));
            view.getCampoEmail().setText(user.getEmail());
            view.getCampoTelefone().setText(String.valueOf(user.getTelefone()));
            view.getComboBoxFuncao().setSelectedItem(user.getCargo());
            view.getCampoSenha().setText(user.getSenha());
            view.getCampoConfirmarSenha().setText(user.getSenha());
        }
    }
}