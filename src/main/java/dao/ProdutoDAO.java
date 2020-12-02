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
    
    private List<Produto> retornarListaComBaseNaConsulta(Query query) {
        List<Produto> produtoList;
        try{
            produtoList = query.getResultList();
        }catch(NoResultException e){
            produtoList = new ArrayList<>();
        }
        return produtoList;
    }
    
    public List<Produto> selectAll(){
        String consultaJPQL = "select u from Produto as u";
        Query query = em.createQuery(consultaJPQL);
        return retornarListaComBaseNaConsulta(query);
    }
    
    public Produto selectPorId(Produto produto){
        return em.find(Produto.class, produto.getId());
    }
    
    public Produto selectPorNome(Produto prod){
        Produto produtoEcontrado = null;
        List<Produto> produtos = new ProdutoDAO(em).selectAll();
        
        for(Produto produto : produtos){
            if(produto.getNome() == prod.getNome())
                produtoEcontrado = produto;
        }
        return produtoEcontrado;
    }
}
