package controller;

import dao.AgendamentoDAO;
import dao.JPAUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.Agendamento;
import util.ModeloTabela;
import view.MenuPrincipal;

public class MenuPrincipalController {
    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
    @SuppressWarnings("empty-statement")
    public void preencherTabelaAgendamentos(){
        /*List dados = new ArrayList<>();
        String[] colunas = new String[]{"Id", "Hora", "Data", "Cliente", "Servicos", "Barbeiro"};
        
        
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        List<Agendamento> agendamentos = new AgendamentoDAO(em).selectAll();
        for(Agendamento agendamento : agendamentos) {
            System.out.println(agendamento);
            dados.add(new Object[]{
                agendamento.getHora(),
                agendamento.getData(),
                agendamento.getCliente().getNome(),
                agendamento.getServicos(),
                agendamento.getUsuario().getNome()
            });
        }
        em.getTransaction().commit();
        em.close();
        
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        view.getTabela().setModel(modelo);
        view.getTabela().getColumnModel().getColumn(0).setPreferredWidth(20);
        view.getTabela().getColumnModel().getColumn(0).setResizable(false);
        view.getTabela().getColumnModel().getColumn(1).setPreferredWidth(60);
        view.getTabela().getColumnModel().getColumn(1).setResizable(false);
        view.getTabela().getColumnModel().getColumn(2).setPreferredWidth(60);
        view.getTabela().getColumnModel().getColumn(2).setResizable(false);
        view.getTabela().getColumnModel().getColumn(3).setPreferredWidth(60);
        view.getTabela().getColumnModel().getColumn(3).setResizable(false);
        view.getTabela().getColumnModel().getColumn(4).setPreferredWidth(70);
        view.getTabela().getColumnModel().getColumn(4).setResizable(false);
        view.getTabela().getColumnModel().getColumn(5).setPreferredWidth(70);
        view.getTabela().getColumnModel().getColumn(5).setResizable(false);
        view.getTabela().getTableHeader().setReorderingAllowed(false);
        view.getTabela().setAutoResizeMode(view.getTabela().AUTO_RESIZE_OFF);
        view.getTabela().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);*/
        
        DefaultTableModel tabelaModelo = (DefaultTableModel) view.getTabela().getModel();
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        List<Agendamento> agendamentos = new AgendamentoDAO(em).selectAll();
        tabelaModelo.setNumRows(0);
        
        for(Agendamento agendamento : agendamentos) {
            System.out.println(agendamento);
            tabelaModelo.addRow(new Object[]{
                agendamento.getId().toString(),
                agendamento.getHora(),
                agendamento.getData(),
                agendamento.getCliente().getNome(),
                agendamento.getServicos(),
                agendamento.getUsuario().getNome()
            });
        }
        em.getTransaction().commit();
        em.close();
    }
}
