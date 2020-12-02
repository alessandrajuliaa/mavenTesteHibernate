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
        System.out.println(em.merge(usuario).getEmail().equals(usuario.getEmail()));
        if(em.merge(usuario).getEmail().equals(usuario.getEmail()))
            return this.update(usuario);
        else
            return this.insert(usuario);
    }
    
    public void delete(Usuario usuario){
        em.remove(em.merge(usuario));
    }
    
    private List<Usuario> retornarListaComBaseNaConsulta(Query query) {
        List<Usuario> usuarioList;
        try{
            usuarioList = query.getResultList();
        }catch(NoResultException e){
            usuarioList = new ArrayList<>();
        }
        return usuarioList;
    }
    
    public List<Usuario> selectAll(){
        String consultaJPQL = "select u from Usuario as u";
        Query query = em.createQuery(consultaJPQL);
        return retornarListaComBaseNaConsulta(query);
    }
    
    public Usuario selectPorEmail(Usuario usuario){
        return em.find(Usuario.class, usuario.getEmail());
    }
    
    public Usuario selectPorNome(Usuario user){
        Usuario usuarioEcontrado = null;
        List<Usuario> usuarios = new UsuarioDAO(em).selectAll();
        
        for(Usuario usuario : usuarios){
            if(usuario.getNome() == user.getNome())
                usuarioEcontrado = usuario;
        }
        return usuarioEcontrado;
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
