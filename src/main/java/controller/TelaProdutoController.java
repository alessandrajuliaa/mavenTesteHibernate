package controller;

import dao.JPAUtil;
import dao.ProdutoDAO;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.List;
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
        String nome = view.getCampoNome().getText();
        double preco = Double.parseDouble(view.getCampoPreco().getText());
        
        if(!"".equals(nome) && !"".equals(preco)){
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
    }
    
    public void pesquisar() throws SQLException{
        String pesquisa = view.getCampoPesquisa().getText();
        if(!"".equals(pesquisa)){
            int id = Integer.parseInt(pesquisa);
            Produto produto = new Produto(id);
            try {
                EntityManager em = new JPAUtil().getEntityManager();
                em.getTransaction().begin();
                Produto produtoEncontrado = new ProdutoDAO(em).selectPorId(produto);
                em.getTransaction().commit();
                em.close();
                
                if(produtoEncontrado != null){
                    view.getCampoNome().setText(produtoEncontrado.getNome());
                    view.getCampoPreco().setText(String.valueOf(produtoEncontrado.getPreco()));
                    view.getCampoId().setText(String.valueOf(produtoEncontrado.getId()));
                }else{
                    JOptionPane.showMessageDialog(null, "Produto não existe!");
                }
            } catch (HeadlessException e) {
                Logger.getLogger(TelaServico.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "Produto não encontrado, ou não excluído!");
            }
        }else{
            EntityManager em = new JPAUtil().getEntityManager();
            em.getTransaction().begin();
            List<Produto> produtos = new ProdutoDAO(em).selectAll();
            for(Produto produto : produtos){
                System.out.println(produto.getId()+ " - " + produto.getNome() + " - " + produto.getPreco());
            }
            em.getTransaction().commit();
            em.close();
        }
    }
}
