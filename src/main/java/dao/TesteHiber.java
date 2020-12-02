package dao;

import javax.persistence.EntityManager;
import model.Servico;
import view.TelaAgendamento;

public class TesteHiber {
    private final TelaAgendamento view = new TelaAgendamento();
    public static void main(String[] args) {
        
        String servicoNome;
        //servicoNome = view.getComboBoxServico().getSelectedItem().toString();
        Servico servico = new Servico();
        
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        
        //new ServicoDAO(em).selectPorNome(servico, "Lucas");
        //System.out.println(new ServicoDAO(em).selectPorNome(servico, "Lucas"));
        
        em.getTransaction().commit();
        em.close();
        
    }
}
