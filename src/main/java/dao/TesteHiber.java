package dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.EntityManager;
import model.Servico;
import view.TelaAgendamento;

public class TesteHiber {
    private final TelaAgendamento view = new TelaAgendamento();
    public static void main(String[] args) {
        ArrayList<Servico> servicos = new ArrayList<>();
        Set<Servico> set = new HashSet<Servico>();
        String servicoNome = "corte";
        //servicoNome = view.getComboBoxServico().getSelectedItem().toString();
        Servico servico1 = new Servico("corte");
        
        
        //servicos.add(servico2);

        
        //System.out.println(servicos.indexOf(servico2));
        //System.out.println(servicos.indexOf(servico1));
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        Servico servico2 = new ServicoDAO(em).selectPorNome(servicoNome).get(0);
        System.out.println(set.add(servico1));
        System.out.println(set.add(servico2));
        System.out.println(set.add(servico2));
        
        //new ServicoDAO(em).selectPorNome(servico, "Lucas");
        //System.out.println(new ServicoDAO(em).selectPorNome(servico, "Lucas"));
        
        em.getTransaction().commit();
        em.close();
        
    }
}
