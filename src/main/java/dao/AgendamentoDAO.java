package dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import jdk.nashorn.internal.objects.Global;
import model.Agendamento;
import util.Data;

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
        ArrayList<Agendamento> teste = retornarListaComBaseNaConsulta(query);
        int tamanho  = teste.size() - 1;
        Collections.sort(teste);
        for(Agendamento test : teste){
            System.out.println(test.getData());
        }
        return teste;
    }
    
    public Agendamento selectPorId(Agendamento agendamento){
        return em.find(Agendamento.class, agendamento.getId());
    }
    
    public ArrayList<Agendamento> selectPorCliente(String pesquisa){
        String consultaJPQL = "SELECT a FROM Agendamento a WHERE a.cliente.nome LIKE :nomeCliente ";
        Query query = em.createQuery(consultaJPQL);
        query.setParameter("nomeCliente", "%" + pesquisa + "%");
        return retornarListaComBaseNaConsulta(query);
        //return em.find(Agendamento.class, agendamento.getId());
    }
    public ArrayList<Agendamento> selectPorData(String pesquisa){
        Data data1 = new Data(pesquisa, "00:00");
        Data data2 = new Data("06/12/2020", "23:59");
        String consultaJPQL = "SELECT a FROM Agendamento a WHERE a.data BETWEEN '2020-12-05 00:00' AND '2020-12-06 23:59' ";
        System.out.println(data1);
        Query query = em.createQuery(consultaJPQL);
        //query.setParameter("data", "%" + pesquisa.toString() + "%");
//        query.setParameter("data1", data1);
 //       query.setParameter("data2", data2);
        return retornarListaComBaseNaConsulta(query);
        //return em.find(Agendamento.class, agendamento.getId());
    }
    public ArrayList<Agendamento> selectPorBarbeiro(String pesquisa){
        String consultaJPQL = "SELECT a FROM Agendamento a WHERE a.usuario.nome LIKE :nomeBarbeiro ";
        Query query = em.createQuery(consultaJPQL);
        query.setParameter("nomeBarbeiro", pesquisa + "%");
        ArrayList<Agendamento> agen = retornarListaComBaseNaConsulta(query);
        //System.out.println(Global.getDate(agen.get(0)));
        /*agen.sort(new Comparator<Agendamento>() {
            @Override
            public int compare(Agendamento a, Agendamento b) {
                if(a.getHora()  < b.getHora()){
                    System.out.println(Global.getDate(a));
                    return -1;
                }
                if(a.getHora() > b.getHora()){
                    return 1;
                }
                return 0;
            }
        });*/
        return agen;
    
        //return em.find(Agendamento.class, agendamento.getId());
    }
}
