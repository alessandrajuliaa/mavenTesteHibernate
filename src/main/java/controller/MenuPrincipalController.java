package controller;

import dao.AgendamentoDAO;
import dao.JPAUtil;
import dao.UsuarioDAO;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Agendamento;
import model.Usuario;
import util.ModeloTabela;
import view.MenuPrincipal;

public class MenuPrincipalController {
    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    public void preencherTabela() {        
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        view.getTabela().setModel(new ModeloTabela(new AgendamentoDAO(em).selectAll()));
        em.getTransaction().commit();
        em.close();
    }
    
    public void preencherComboBoxUsuario() throws ParseException{
        DefaultComboBoxModel comboUsuario = (DefaultComboBoxModel) view.getComboBoxBarbeiro().getModel();
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        List<Usuario> usuarios = new UsuarioDAO(em).selectAll();
        for(Usuario usuario : usuarios){
            if("Barbeiro".equals(usuario.getCargo())){
                comboUsuario.addElement(usuario.getNome());
            }
        }
        em.getTransaction().commit();
        em.close();
    }
}
