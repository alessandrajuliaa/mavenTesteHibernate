package controller;


import dao.JPAUtil;
import dao.UsuarioDAO;
import java.sql.SQLException;
import java.util.List;
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
        String cargo = view.getComboBoxCargo().getSelectedItem().toString();
        String senha = view.getCampoSenha().getText();
        String confirmarSenha = view.getCampoConfirmarSenha().getText();
        
        if(!"".equals(nome) && !"".equals(email) && !"".equals(telefone) && !"".equals(cargo) && !"".equals(senha) && !"".equals(confirmarSenha)){
            if(senha.equals(confirmarSenha)){
                Usuario usuario = new Usuario(nome, email, telefone, cargo, senha);
                try {
                    EntityManager em = new JPAUtil().getEntityManager();
                    em.getTransaction().begin();
                    new UsuarioDAO(em).insertOrUpdate(usuario);
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
        String nome = view.getCampoNome().getText();
        String email = view.getCampoEmail().getText();
        String telefone = view.getCampoTelefone().getText();
        String cargo = view.getComboBoxCargo().getSelectedItem().toString();
        String senha = view.getCampoSenha().getText();
        String confirmarSenha = view.getCampoConfirmarSenha().getText();
        
        if(!"".equals(nome) && !"".equals(email) && !"".equals(telefone) && !"".equals(cargo) && !"".equals(senha) && !"".equals(confirmarSenha)){
            if(senha.equals(confirmarSenha)){
                Usuario usuario = new Usuario(nome, email, telefone, cargo, senha);
                try {
                    EntityManager em = new JPAUtil().getEntityManager();
                    em.getTransaction().begin();
                    new UsuarioDAO(em).insertOrUpdate(usuario);
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
    }
    
    public void pesquisar() throws SQLException{
        String pesquisa = view.getCampoPesquisa().getText();
        if(!"".equals(pesquisa)){
            Usuario usuario = new Usuario(pesquisa);
            try {
                EntityManager em = new JPAUtil().getEntityManager();
                em.getTransaction().begin();
                Usuario usuarioEncontrado = new UsuarioDAO(em).selectPorEmail(usuario);
                em.getTransaction().commit();
                em.close();
                
                if(usuarioEncontrado != null){
                    view.getCampoNome().setText(usuarioEncontrado.getNome());
                    view.getCampoEmail().setText(usuarioEncontrado.getEmail());
                    view.getCampoTelefone().setText(usuarioEncontrado.getTelefone());
                    view.getComboBoxCargo().setSelectedItem(usuarioEncontrado.getCargo());
                    view.getCampoSenha().setText(usuarioEncontrado.getSenha());
                    view.getCampoConfirmarSenha().setText(usuarioEncontrado.getSenha());     
                }else{
                    JOptionPane.showMessageDialog(null, "Usuário não existe!");
                }
            } catch (Exception e) {
                Logger.getLogger(TelaUsuario.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "Usuário não encontrado, ou não excluído!");
            }
        }else{
            EntityManager em = new JPAUtil().getEntityManager();
            em.getTransaction().begin();
            List<Usuario> usuarios = new UsuarioDAO(em).selectAll();
            for(Usuario usuario : usuarios){
                System.out.println(usuario.getNome() + " - " + usuario.getEmail());
            }
            em.getTransaction().commit();
            em.close();
        }

//            ArrayList<Usuario> usuarios = usuarioDao.selectAll();
//            
//            
//        if(nome != ""){
//            Usuario usuario = new Usuario(nome);
//            Usuario usuarioSelecionado = usuarioDao.selectPorNome(usuario);
//            if(usuarioSelecionado != null){
//                
//                view.getCampoUsuario().setText(usuarioSelecionado.getUsuario());
//                
//                  
//            }else{
//                JOptionPane.showMessageDialog(null, "Não existe um usuário com esse nome!");
//            }
//        }else{
//            ArrayList<Usuario> usuarios = usuarioDao.selectAll();
            
//            for (Usuario usuario : usuarios) {
//                System.out.println(usuario.getUsuario());
//            }
            //view.getComboBoxPesquisa().setModel(usuarios);
//       }/*
    }
    
    /*public void pesquisaUsuarioPorNome() throws SQLException{
        String nome = view.getCampoPesquisa().getText();
        Usuario usuario = new Usuario(nome);
        try {
            Connection conexao = new Conexao().getConnection();
            UsuarioDAO usuarioDao = new UsuarioDAO(conexao);

            Usuario usuarioSelecionado = usuarioDao.selectPorNome(usuario);
            if(usuarioSelecionado != null){
                view.getCampoCodigo().setText(String.valueOf(usuarioSelecionado.getId()));
                view.getCampoNome().setText(usuarioSelecionado.getNome());
                view.getCampoUsuario().setText(usuarioSelecionado.getUsuario());
                view.getCampoTelefone().setText(usuarioSelecionado.getTelefone());
                view.getComboBoxCargo().setSelectedItem(usuarioSelecionado.getCargo());
                view.getCampoSenha().setText(usuarioSelecionado.getSenha());
                view.getCampoConfirmarSenha().setText(usuarioSelecionado.getSenha());       
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
}