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
        if(em.merge(cliente).getTelefone().equals(cliente.getTelefone()))
            return this.update(cliente);
        else
            return this.insert(cliente);
    }
    
    public void delete(Cliente cliente){
        em.remove(em.merge(cliente));
    }
    
    private ArrayList<Cliente> retornarListaComBaseNaConsulta(Query query) {
        List<Cliente> clienteList;
        ArrayList<Cliente> lista = new ArrayList<>();
        try{
            clienteList = query.getResultList();
            for(Cliente cliente : clienteList){
                lista.add(cliente);
            }
        }catch(NoResultException e){
            clienteList = new ArrayList<>();
        }
        return lista;
    }
    
    public ArrayList<Cliente> selectAll(){
        String consultaJPQL = "select u from Cliente as u";
        Query query = em.createQuery(consultaJPQL);
        return retornarListaComBaseNaConsulta(query);
    }
    
    public Cliente selectPorEmail(Cliente cliente){
        return em.find(Cliente.class, cliente.getTelefone());
    }
    
    public ArrayList<Cliente> selectPorNome(String clienteNome){
        String consultaJPQL = "SELECT c FROM Cliente c WHERE c.nome = :nome";
        Query query = em.createQuery(consultaJPQL);
        query.setParameter("nome", clienteNome);
        return retornarListaComBaseNaConsulta(query);
    }
    
    public ArrayList<Cliente> selectPorNomeCampo(String clienteNome){
        String consultaJPQL = "SELECT c FROM Cliente c WHERE c.nome LIKE :nome";
        Query query = em.createQuery(consultaJPQL);
        query.setParameter("nome", "%" + clienteNome + "%");
        return retornarListaComBaseNaConsulta(query);
    }
}
