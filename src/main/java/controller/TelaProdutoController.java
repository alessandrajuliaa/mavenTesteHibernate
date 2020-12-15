package controller;

import dao.JPAUtil;
import dao.ProdutoDAO;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import model.Produto;
import view.TelaProduto;
import view.TelaServico;

public class TelaProdutoController {
    
    private final TelaProduto view;

    public TelaProdutoController(TelaProduto view) {
        this.view = view;
    }
    
    public void cadastrarProduto(){
        if(!"".equals(view.getCampoNome().getText()) && !"".equals(view.getCampoPreco().getText())){
            String nome = view.getCampoNome().getText();
            double preco = Double.parseDouble(view.getCampoPreco().getText().replace(",", "."));
            Produto produto = new Produto(nome, preco);
            try {
                EntityManager em = new JPAUtil().getEntityManager();
                em.getTransaction().begin();
                new ProdutoDAO(em).insert(produto);
                em.getTransaction().commit();
                em.close();

                JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
            }catch(HeadlessException e){
                Logger.getLogger(TelaProduto.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "Desculpe, não consegui cadastrar o produto. Tente mais tarde.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum campo pode estar vazio.");
        }
    }
    
    public void editarProduto() throws SQLException{
        if(view.getCampoNome().isEnabled()){
            String codigo = view.getCampoId().getText();
            String nome = view.getCampoNome().getText();
            double preco = Double.parseDouble(view.getCampoPreco().getText());

            if(!"".equals(nome) && !"".equals(codigo) && !"".equals(preco)){
                int id = Integer.parseInt(codigo);
                Produto produto = new Produto(id, nome, preco);
                try {
                    EntityManager em = new JPAUtil().getEntityManager();
                    em.getTransaction().begin();
                    new ProdutoDAO(em).update(produto);
                    em.getTransaction().commit();
                    em.close();

                    JOptionPane.showMessageDialog(null, "Produto editado com sucesso!");
                }catch(HeadlessException e){
                    Logger.getLogger(TelaProduto.class.getName()).log(Level.SEVERE, null, e);
                    JOptionPane.showMessageDialog(null, "Desculpe, não consegui editar o produto. Tente mais tarde.");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Nenhum campo pode estar vazio.");
            }
        }else{
            habilitarCampos();
        }
        
    }
    
    public void excluirProduto() throws SQLException{
        int codigo = Integer.parseInt(view.getCampoId().getText());
        if(!"".equals(codigo)){
            Produto produto = new Produto(codigo);
            try {
                EntityManager em = new JPAUtil().getEntityManager();
                em.getTransaction().begin();

                new ProdutoDAO(em).delete(produto);

                JOptionPane.showMessageDialog(null, "Produto excluído com sucesso!");
                em.getTransaction().commit();
                em.close();

            } catch (HeadlessException e) {
                Logger.getLogger(TelaProduto.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "Produto não encontrado, ou não excluído!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "O campo email não pode estar vazio!");
        }
    }
    
    public void novoProduto() throws SQLException{
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
        String nomePesquisado = view.getCampoPesquisaProduto().getText();
        if(!"".equals(nomePesquisado)){
            try {
                EntityManager em = new JPAUtil().getEntityManager();
                em.getTransaction().begin();
                ArrayList<Produto> produtosEncontrado = new ProdutoDAO(em).selectPorNome(nomePesquisado);
                em.getTransaction().commit();
                em.close();
                if(produtosEncontrado.size() != 0){
                    Produto prod = produtosEncontrado.get(0);
                    view.getCampoId().setText(String.valueOf(prod.getId()));
                    view.getCampoNome().setText(prod.getNome());
                    view.getCampoPreco().setText(String.valueOf(prod.getPreco()));
                }else{
                    JOptionPane.showMessageDialog(null, "Produto não existe!");
                }
            } catch (HeadlessException e) {
                Logger.getLogger(TelaServico.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "Produto não encontrado, ou não excluído!");
            }
        }
    }
    
    public void pesquisarPorNomeCampo() throws SQLException{
        String pesquisa = view.getCampoPesquisaProduto().getText();
            
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        ArrayList<Produto> produtos = new ProdutoDAO(em).selectPorNomeCampo(pesquisa);
        em.getTransaction().commit();
        em.close();
        if(produtos.size() != 0){
            Produto produto = produtos.get(0);
            view.getCampoId().setText(String.valueOf(produto.getId()));
            view.getCampoNome().setText(produto.getNome());
            view.getCampoPreco().setText(String.valueOf(produto.getPreco()));
        }
    }
}
