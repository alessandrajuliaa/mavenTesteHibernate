package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import model.Servico;

public class ServicoDAO {
    
    private final EntityManager em;

    public ServicoDAO(EntityManager em) {
        this.em = em;
    }
    
    public Servico insert(Servico servico){
        em.persist(servico);
        return servico;
    }
    
    public Servico update(Servico servico){
        em.persist(em.merge(servico));
        return servico;
    }
    
    public Servico insertOrUpdate(Servico servico){
        if(em.merge(servico).getId() > 0)
            return this.update(servico);
        else
            return this.insert(servico);
    }
    
    public void delete(Servico servico){
        em.remove(em.merge(servico));
    }
    
    private ArrayList<Servico> retornarListaComBaseNaConsulta(Query query) {
        List<Servico> servicoList;
        ArrayList<Servico> lista = new ArrayList<>();
        try{
            servicoList = query.getResultList();
            for(Servico serv : servicoList){
                lista.add(serv);
            }
        }catch(NoResultException e){
            servicoList = new ArrayList<>();
        }
        return lista;
    }
    
    public ArrayList<Servico> selectAll(){
        String consultaJPQL = "select u from Servico as u";
        Query query = em.createQuery(consultaJPQL);
        return retornarListaComBaseNaConsulta(query);
    }
    
    public Servico selectPorId(Servico servico){
        return em.find(Servico.class, servico.getId());
    }
    
    public ArrayList<Servico> selectPorNome(String servicoNome){
        String consultaJPQL = "SELECT s FROM Servico s WHERE s.nome = :nome";
        Query query = em.createQuery(consultaJPQL);
        query.setParameter("nome", servicoNome);
        return retornarListaComBaseNaConsulta(query);
    }
    
    public ArrayList<Servico> selectPorNomeCampo(String servicoNome){
        String consultaJPQL = "SELECT s FROM Servico s WHERE s.nome like :nome";
        Query query = em.createQuery(consultaJPQL);
        query.setParameter("nome", "%" + servicoNome + "%");
        return retornarListaComBaseNaConsulta(query);
    }
}
