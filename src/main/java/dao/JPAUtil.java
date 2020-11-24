package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author tiago
 */
public class JPAUtil {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("testepostgre");
    //private static final EntityManagerFactory emfAdonai = Persistence.createEntityManagerFactory("adonai-teste-postgres");

    /**
     * Retorna um Entity Manager de Conexao com o banco de dados
     * @return
     */
    public EntityManager getEntityManager() {
            return emf.createEntityManager();
    }
}