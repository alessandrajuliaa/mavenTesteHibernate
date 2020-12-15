package dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
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
    
    private ArrayList<Agendamento> retornarListaComBaseNaConsulta(Query query) {
        List<Agendamento> agendamentoList;
        ArrayList<Agendamento> lista = new ArrayList<>();
        try{
            agendamentoList = query.getResultList();
            for(Agendamento agendamento : agendamentoList){
                Agendamento agen = new Agendamento();
                agen.setId(agendamento.getId());
                agen.setData(agendamento.getData());
                agen.setCliente(agendamento.getCliente());
                agen.setServicos(agendamento.getServicos());
                agen.setUsuario(agendamento.getUsuario());
                agen.setProdutos(agendamento.getProdutos());
                agen.setPreco(agendamento.getPreco());
                lista.add(agen);
            }
            System.out.println(lista);
        }catch(NoResultException e){
            agendamentoList = null;
        }
        return lista;
    }
    
    public ArrayList<Agendamento> selectAll(){
        String consultaJPQL = "select u from Agendamento as u";
        Query query = em.createQuery(consultaJPQL);
        ArrayList<Agendamento> ordenar = retornarListaComBaseNaConsulta(query);
        Collections.sort(ordenar);
        return ordenar;
    }
    
    public Agendamento selectPorId(Agendamento agendamento){
        return em.find(Agendamento.class, agendamento.getId());
    }
    
    public ArrayList<Agendamento> selectPorCliente(String dataDe, String dataAte, String nome){
        String de = dataDe.substring(5, 10) + "/" + dataDe.substring(3, 5) + "/" + dataDe.substring(0, 2) + " 00:00";
        String ate = dataAte.substring(5, 10) + "/" + dataAte.substring(3, 5) + "/" + dataAte.substring(0, 2) + " 23:59";
        Date deData = new Date(de);
        Date ateData = new Date(ate);
        System.out.println(nome);
        String consultaJPQL = "SELECT a FROM Agendamento a join a.cliente c WHERE a.data BETWEEN :datade and :dataate AND c.nome LIKE :nomeCliente ";
        //String consultaJPQL = "SELECT a FROM Agendamento a join a.cliente c WHERE a.data = :dataate and c.nome LIKE :nomeCliente ";
        // "SELECT u from Usuario u join u.pessoa p where p.matricula = :matricula and u.senha = :senha "
        Query query = em.createQuery(consultaJPQL);
        query.setParameter("datade", deData);
        query.setParameter("dataate", ateData);
        query.setParameter("nomeCliente", nome + "%");
        ArrayList<Agendamento> ordenar = retornarListaComBaseNaConsulta(query);
        Collections.sort(ordenar);
        return ordenar;
    }
    public ArrayList<Agendamento> selectPorData(String dataDe, String dataAte){
        String de = dataDe.substring(5, 10) + "/" + dataDe.substring(3, 5) + "/" + dataDe.substring(0, 2) + " 00:00";
        String ate = dataAte.substring(5, 10) + "/" + dataAte.substring(3, 5) + "/" + dataAte.substring(0, 2) + " 23:59";
        Date deData = new Date(de);
        Date ateData = new Date(ate);
        String consultaJPQL = "SELECT a FROM Agendamento a WHERE a.data BETWEEN :datade and :dataate ";
        Query query = em.createQuery(consultaJPQL);
        query.setParameter("datade", deData);
        query.setParameter("dataate", ateData);
        ArrayList<Agendamento> ordenar = retornarListaComBaseNaConsulta(query);
        Collections.sort(ordenar);
        return ordenar;
    }
    public ArrayList<Agendamento> selectPorBarbeiro(String dataDe, String dataAte, String barbeiro){
        String de = dataDe.substring(5, 10) + "/" + dataDe.substring(3, 5) + "/" + dataDe.substring(0, 2) + " 00:00";
        String ate = dataAte.substring(5, 10) + "/" + dataAte.substring(3, 5) + "/" + dataAte.substring(0, 2) + " 23:59";
        Date deData = new Date(de);
        Date ateData = new Date(ate);
        String consultaJPQL = "SELECT a FROM Agendamento a join a.usuario u WHERE a.data BETWEEN :datade and :dataate AND u.nome = :nomeBarbeiro ";
        Query query = em.createQuery(consultaJPQL);
        query.setParameter("datade", deData);
        query.setParameter("dataate", ateData);
        query.setParameter("nomeBarbeiro", barbeiro);
        ArrayList<Agendamento> ordenar = retornarListaComBaseNaConsulta(query);
        Collections.sort(ordenar);
        return ordenar;
    }
}