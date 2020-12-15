package controller;

import dao.JPAUtil;
import dao.ServicoDAO;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.ArrayList;
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
        if(!"".equals(view.getCampoNome().getText()) && !"".equals(view.getCampoPreco().getText())){
            String nome = view.getCampoNome().getText();
            double preco = Double.parseDouble(view.getCampoPreco().getText().replace(",", "."));
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
        if(view.getCampoNome().isEnabled()){
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
        }else{
            habilitarCampos();
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
        habilitarCampos();
    }
    
    public void habilitarCampos(){
        view.getCampoNome().setEnabled(true);
        view.getCampoPreco().setEnabled(true);
    }
    
    public void pesquisarPorNome() throws SQLException{
        String nomePesquisado = view.getCampoPesquisaServico().getText();
        if(!"".equals(nomePesquisado)){
            try {
                EntityManager em = new JPAUtil().getEntityManager();
                em.getTransaction().begin();
                ArrayList<Servico> servicos = new ServicoDAO(em).selectPorNome(nomePesquisado);
                em.getTransaction().commit();
                em.close();
                if(servicos.size() != 0){
                    Servico serv = servicos.get(0);
                    view.getCampoId().setText(String.valueOf(serv.getId()));
                    view.getCampoNome().setText(serv.getNome());
                    view.getCampoPreco().setText(String.valueOf(serv.getPreco()));
                }else{
                    JOptionPane.showMessageDialog(null, "Serviço não existe!");
                }
            } catch (HeadlessException e) {
                Logger.getLogger(TelaServico.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "Serviço não encontrado, ou não excluído!");
            }
        }
    }
    
    public void pesquisarPorNomeCampo() throws SQLException{
        String pesquisa = view.getCampoPesquisaServico().getText();
            
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        ArrayList<Servico> produtos = new ServicoDAO(em).selectPorNomeCampo(pesquisa);
        em.getTransaction().commit();
        em.close();
        if(produtos.size() != 0){
            Servico serv = produtos.get(0);
            view.getCampoId().setText(String.valueOf(serv.getId()));
            view.getCampoNome().setText(serv.getNome());
            view.getCampoPreco().setText(String.valueOf(serv.getPreco()));
        }
    }
}
