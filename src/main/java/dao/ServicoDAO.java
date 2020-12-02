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
    
    private List<Servico> retornarListaComBaseNaConsulta(Query query) {
        List<Servico> servicoList;
        try{
            servicoList = query.getResultList();
        }catch(NoResultException e){
            servicoList = new ArrayList<>();
        }
        return servicoList;
    }
    
    public List<Servico> selectAll(){
        String consultaJPQL = "select u from Servico as u";
        Query query = em.createQuery(consultaJPQL);
        return retornarListaComBaseNaConsulta(query);
    }
    
    public Servico selectPorId(Servico servico){
        return em.find(Servico.class, servico.getId());
    }
    
    public Servico selectPorNome(Servico serv){
        Servico servicoEcontrado = null;
        List<Servico> servicos = new ServicoDAO(em).selectAll();
        
        for(Servico servico : servicos){
            if(servico.getNome() == serv.getNome())
                servicoEcontrado = servico;
        }
        return servicoEcontrado;
    }
}
