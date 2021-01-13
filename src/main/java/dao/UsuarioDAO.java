package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import model.Usuario;

public class UsuarioDAO {
    
    private final EntityManager em;

    public UsuarioDAO(EntityManager em) {
        this.em = em;
    }
    
    public Usuario insert(Usuario usuario){
        em.persist(usuario);
        return usuario;
    }
    
    public Usuario update(Usuario usuario){
        em.persist(em.merge(usuario));
        return usuario;
    }
    
    public Usuario insertOrUpdate(Usuario usuario){
        if(em.merge(usuario).getEmail().equals(usuario.getEmail()))
            return this.update(usuario);
        else
            return this.insert(usuario);
    }
    
    public void delete(Usuario usuario){
        em.remove(em.merge(usuario));
    }
    
    private ArrayList<Usuario> retornarListaComBaseNaConsulta(Query query) {
        List<Usuario> usuarioList;
        ArrayList<Usuario> lista = new ArrayList<>();
        try{
            usuarioList = query.getResultList();
            for(Usuario usuario : usuarioList){
                lista.add(usuario);
            }
        }catch(NoResultException e){
            usuarioList = new ArrayList<>();
        }
        return lista;
    }
    
    public ArrayList<Usuario> selectAll(){
        String consultaJPQL = "select u from Usuario as u";
        Query query = em.createQuery(consultaJPQL);
        return retornarListaComBaseNaConsulta(query);
    }
    
    public Usuario selectPorEmail(Usuario usuario){
        return em.find(Usuario.class, usuario.getEmail());
    }
    
    public ArrayList<Usuario> selectPorNome(String usuarioNome){
        String consultaJPQL = "SELECT u FROM Usuario u WHERE u.nome = :nome";
        Query query = em.createQuery(consultaJPQL);
        query.setParameter("nome", usuarioNome);
        return retornarListaComBaseNaConsulta(query);
    }
    
    public ArrayList<Usuario> selectPorNomeCampo(String usuarioNome){
        String consultaJPQL = "SELECT u FROM Usuario u WHERE u.nome LIKE :nome";
        Query query = em.createQuery(consultaJPQL);
        query.setParameter("nome", "%" + usuarioNome + "%");
        return retornarListaComBaseNaConsulta(query);
    }
    
    public boolean existePorUsuarioESenha(Usuario usuarioNovo){
        String consultaJPQL = "select u from Usuario as u "
                + "where u.email = :pEmail and u.senha = :pSenha";
        Query query = em.createQuery(consultaJPQL);
        query.setParameter("pEmail", usuarioNovo.getEmail());
        query.setParameter("pSenha", usuarioNovo.getSenha());
        return !retornarListaComBaseNaConsulta(query).isEmpty();
    }
    
}
