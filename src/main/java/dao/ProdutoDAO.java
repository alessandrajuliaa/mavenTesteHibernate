package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import model.Produto;

public class ProdutoDAO {
    private final EntityManager em;

    public ProdutoDAO(EntityManager em) {
        this.em = em;
    }
    
    public Produto insert(Produto produto){
        em.persist(produto);
        return produto;
    }
    
    public Produto update(Produto produto){
        em.persist(em.merge(produto));
        return produto;
    }
    
    public Produto insertOrUpdate(Produto produto){
        if(em.merge(produto).getId() > 0)
            return this.update(produto);
        else
            return this.insert(produto);
    }
    
    public void delete(Produto produto){
        em.remove(em.merge(produto));
    }
    
    private ArrayList<Produto> retornarListaComBaseNaConsulta(Query query) {
        List<Produto> produtoList;
        ArrayList<Produto> lista = new ArrayList<>();
        try{
            produtoList = query.getResultList();
            for(Produto produto : produtoList){
                lista.add(produto);
            }
            System.out.println(lista);
        }catch(NoResultException e){
            produtoList = new ArrayList<>();
        }
        return lista;
    }
    
    public ArrayList<Produto> selectAll(){
        String consultaJPQL = "select p from Produto as p";
        Query query = em.createQuery(consultaJPQL);
        return retornarListaComBaseNaConsulta(query);
    }
    
    public Produto selectPorId(Produto produto){
        return em.find(Produto.class, produto.getId());
    }
    
    public ArrayList<Produto> selectPorNome(String nomeProduto){
        String consultaJPQL = "SELECT p FROM Produto p WHERE p.nome = :nome";
        Query query = em.createQuery(consultaJPQL);
        query.setParameter("nome", nomeProduto);
        return retornarListaComBaseNaConsulta(query);
    }
    
    public ArrayList<Produto> selectPorNomeCampo(String nomeProduto){
        String consultaJPQL = "SELECT p from Produto p WHERE p.nome LIKE :nome";
        Query query = em.createQuery(consultaJPQL);
        query.setParameter("nome", "%" + nomeProduto + "%");
        return retornarListaComBaseNaConsulta(query);
    }
}
