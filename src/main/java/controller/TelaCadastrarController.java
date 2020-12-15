package controller;

import dao.JPAUtil;
import dao.UsuarioDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import model.Usuario;
import view.TelaCadastrar;
import view.TelaUsuario;

public class TelaCadastrarController {
    private TelaCadastrar view;

    public TelaCadastrarController(TelaCadastrar view) {
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
}
