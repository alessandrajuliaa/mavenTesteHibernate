package controller;

import dao.JPAUtil;
import dao.UsuarioDAO;
import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import model.Usuario;
import view.Login;
import view.MenuPrincipal;

public class LoginController {
    private Login view;

    public LoginController(Login view) {
        this.view = view;
    }
    
    public void autenticar() throws SQLException{
        
        String user = view.getCampoEmail().getText();
        String senha = view.getCampoSenha().getText();
        
        Usuario usuarioAutenticar = new Usuario(user, senha);
        
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        
        boolean existe = new UsuarioDAO(em).existePorUsuarioESenha(usuarioAutenticar);
        
        if(existe){
           new MenuPrincipal().setVisible(true);
            view.dispose(); 
        }else{
            JOptionPane.showMessageDialog(view, "Usuário ou senha inválidos!");
        }
        
        em.getTransaction().commit();
        em.close();
    }
}
