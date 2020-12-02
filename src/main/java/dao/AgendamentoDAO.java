package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import model.Agendamento;

public class AgendamentoDAO {
    
    private final EntityManager em;

    public AgendamentoDAO(EntityManager em) {
        this.em = em;
    }
    
    public Agendamento insert(Agendamento agendamento){
        em.persist(agendamento);
        return agendamento;
    }
    
    public Agendamento update(Agendamento agendamento){
        em.persist(em.merge(agendamento));
        return agendamento;
    }
    
    public Agendamento insertOrUpdate(Agendamento agendamento){
        if(em.merge(agendamento).getId() > 0)
            return this.update(agendamento);
        else
            return this.insert(agendamento);
    }
    
    public void delete(Agendamento agendamento){
        em.remove(em.merge(agendamento));
    }
    
    private List<Agendamento> retornarListaComBaseNaConsulta(Query query) {
        List<Agendamento> agendamentoList;
        try{
            agendamentoList = query.getResultList();
        }catch(NoResultException e){
            agendamentoList = new ArrayList<>();
        }
        return agendamentoList;
    }
    
    public List<Agendamento> selectAll(){
        String consultaJPQL = "select u from Agendamento as u";
        Query query = em.createQuery(consultaJPQL);
        return retornarListaComBaseNaConsulta(query);
    }
    
    public Agendamento selectPorId(Agendamento agendamento){
        return em.find(Agendamento.class, agendamento.getId());
    }
}
