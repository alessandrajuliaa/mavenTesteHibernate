package dao;

import dao.JPAUtil;
import javax.persistence.EntityManager;
import model.Usuario;

/**
 *
 * @author tiago
 */
public class TesteHiber {
    public static void main(String[] args) {
        
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
            
        Usuario usu = new Usuario("Ale", "ale@gmail.com", "34341394", "Adm", "senha");
        em.persist(usu);
            
        em.getTransaction().commit();
        em.close();
        
    }
}
