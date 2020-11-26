package dao;

import dao.JPAUtil;
import javax.persistence.EntityManager;
import model.Usuario;

public class TesteHiber {
    public static void main(String[] args) {
        
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        
        Usuario usu = new Usuario("ale@gmaail.com");
        new UsuarioDAO(em).delete(usu);
        
        em.getTransaction().commit();
        em.close();
        
    }
}
