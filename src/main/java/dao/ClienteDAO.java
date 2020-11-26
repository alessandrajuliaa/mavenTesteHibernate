package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import model.Cliente;

public class ClienteDAO {
    
    private final EntityManager em;

    public ClienteDAO(EntityManager em) {
        this.em = em;
    }
    
    public Cliente insert(Cliente cliente){
        em.persist(cliente);
        return cliente;
    }
    
    public Cliente update(Cliente cliente){
        em.persist(em.merge(cliente));
        return cliente;
    }
    
    public Cliente insertOrUpdate(Cliente cliente){
        if(em.merge(cliente).getEmail() == cliente.getEmail())
            return this.update(cliente);
        else
            return this.insert(cliente);
    }
    
    public void delete(Cliente cliente){
        em.remove(em.merge(cliente));
    }
    
    private List<Cliente> retornarListaComBaseNaConsulta(Query query) {
        List<Cliente> clienteList;
        try{
            clienteList = query.getResultList();
        }catch(NoResultException e){
            clienteList = new ArrayList<>();
        }
        return clienteList;
    }
    
    public List<Cliente> selectAll(){
        String consultaJPQL = "select u from Cliente as u";
        Query query = em.createQuery(consultaJPQL);
        return retornarListaComBaseNaConsulta(query);
    }
    
    public Cliente selectPorEmail(Cliente cliente){
        return em.find(Cliente.class, cliente.getEmail());
    }
}
