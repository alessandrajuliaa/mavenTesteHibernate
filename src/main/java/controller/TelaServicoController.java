package controller;

import dao.JPAUtil;
import dao.ServicoDAO;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import model.Servico;
import view.TelaServico;

public class TelaServicoController {
    
    private final TelaServico view;

    public TelaServicoController(TelaServico view) {
        this.view = view;
    }
    
    public void cadastrarServico(){
        String nome = view.getCampoNome().getText();
        double preco = Double.parseDouble(view.getCampoPreco().getText());
        
        if(!"".equals(nome) && !"".equals(preco)){
            Servico servico = new Servico(nome, preco);
            try {
                EntityManager em = new JPAUtil().getEntityManager();
                em.getTransaction().begin();
                new ServicoDAO(em).insert(servico);
                em.getTransaction().commit();
                em.close();

                JOptionPane.showMessageDialog(null, "Serviço cadastrado com sucesso!");
            }catch(HeadlessException e){
                Logger.getLogger(TelaServico.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "Desculpe, não consegui cadastrar o serviço. Tente mais tarde.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum campo pode estar vazio.");
        }
    }
    
    public void editarServico() throws SQLException{
        String codigo = view.getCampoId().getText();
        String nome = view.getCampoNome().getText();
        double preco = Double.parseDouble(view.getCampoPreco().getText());
        
        if(!"".equals(nome) && !"".equals(codigo) && !"".equals(preco)){
            int id = Integer.parseInt(codigo);
            Servico servico = new Servico(id, nome, preco);
            try {
                EntityManager em = new JPAUtil().getEntityManager();
                em.getTransaction().begin();
                new ServicoDAO(em).update(servico);
                em.getTransaction().commit();
                em.close();

                JOptionPane.showMessageDialog(null, "Serviço editado com sucesso!");
            }catch(HeadlessException e){
                Logger.getLogger(TelaServico.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "Desculpe, não consegui editar o serviço. Tente mais tarde.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum campo pode estar vazio.");
        }
    }
    
    public void excluirServico() throws SQLException{
        int codigo = Integer.parseInt(view.getCampoId().getText());
        if(!"".equals(codigo)){
            Servico servico = new Servico(codigo);
            try {
                EntityManager em = new JPAUtil().getEntityManager();
                em.getTransaction().begin();

                new ServicoDAO(em).delete(servico);

                JOptionPane.showMessageDialog(null, "Serviço excluído com sucesso!");
                em.getTransaction().commit();
                em.close();

            } catch (HeadlessException e) {
                Logger.getLogger(TelaServico.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "Serviço não encontrado, ou não excluído!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "O campo email não pode estar vazio!");
        }
    }
    
    public void novoServico() throws SQLException{
        view.getCampoNome().setText("");
        view.getCampoPreco().setText("");
        view.getCampoId().setText("");
    }
    
    public void pesquisar() throws SQLException{
        String pesquisa = view.getCampoPesquisa().getText();
        if(!"".equals(pesquisa)){
            int id = Integer.parseInt(pesquisa);
            Servico servico = new Servico(id);
            try {
                EntityManager em = new JPAUtil().getEntityManager();
                em.getTransaction().begin();
                Servico servicoEncontrado = new ServicoDAO(em).selectPorId(servico);
                em.getTransaction().commit();
                em.close();
                
                if(servicoEncontrado != null){
                    view.getCampoNome().setText(servicoEncontrado.getNome());
                    view.getCampoPreco().setText(String.valueOf(servicoEncontrado.getPreco()));
                    view.getCampoId().setText(String.valueOf(servicoEncontrado.getId()));
                }else{
                    JOptionPane.showMessageDialog(null, "Serviço não existe!");
                }
            } catch (HeadlessException e) {
                Logger.getLogger(TelaServico.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "Serviço não encontrado, ou não excluído!");
            }
        }else{
            EntityManager em = new JPAUtil().getEntityManager();
            em.getTransaction().begin();
            List<Servico> servicos = new ServicoDAO(em).selectAll();
            for(Servico servico : servicos){
                System.out.println(servico.getId()+ " - " + servico.getNome() + " - " + servico.getPreco());
            }
            em.getTransaction().commit();
            em.close();
        }
    }
}
