package controller;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.DottedLineSeparator;
import com.itextpdf.text.pdf.draw.VerticalPositionMark;
import dao.AgendamentoDAO;
import dao.JPAUtil;
import dao.UsuarioDAO;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Agendamento;
import model.Usuario;
import util.Data;
import util.ModeloTabela;
import util.RelatorioCalculos;
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
    
    public void pesquisaPorData() {
        String dataDe = view.getCampoDeData().getText();
        String dataAte = view.getCampoAteData().getText();
        if(!"".equals(view.getCampoDeData().getText())){
            EntityManager em = new JPAUtil().getEntityManager();
            em.getTransaction().begin();
            if(!"".equals(view.getCampoAteData().getText())){
                view.getTabela().setModel(new ModeloTabela(new AgendamentoDAO(em).selectPorData(dataDe, dataAte)));
            }else{
                Data dataAtual = new Data(new Date());
                view.getTabela().setModel(new ModeloTabela(new AgendamentoDAO(em).selectPorData(dataDe, dataAtual.dataFormatadaString())));
            }
            em.getTransaction().commit();
            em.close();
        }else{
            JOptionPane.showMessageDialog(null, "A primeira data não pode estar vazia.");
        }
    }
    
    public void pesquisaPorCliente() {        
        String dataDe = view.getCampoDeData().getText();
        String dataAte = view.getCampoAteData().getText();
        String nome = view.getCampoNomeCliente().getText();
        Data dataAtual = new Data(new Date());
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        if("".equals(view.getCampoDeData().getText()) && "".equals(view.getCampoAteData().getText())){
            view.getTabela().setModel(new ModeloTabela(new AgendamentoDAO(em).selectPorCliente("01/01/2000", dataAtual.dataFormatadaString(), nome)));
        }else if(!"".equals(view.getCampoDeData().getText())){
            view.getTabela().setModel(new ModeloTabela(new AgendamentoDAO(em).selectPorCliente(dataDe, dataAtual.dataFormatadaString(), nome)));
        }else if(!"".equals(view.getCampoAteData().getText())){
            view.getTabela().setModel(new ModeloTabela(new AgendamentoDAO(em).selectPorCliente("01/01/2000", dataAte, nome)));
        }else{
            view.getTabela().setModel(new ModeloTabela(new AgendamentoDAO(em).selectPorCliente(dataDe, dataAte, nome)));
        }
        em.getTransaction().commit();
        em.close();
    }
    
    public void pesquisaPorBarbeiro() {
        String dataDe = view.getCampoDeData().getText();
        String dataAte = view.getCampoAteData().getText();
        String nome = view.getComboBoxBarbeiro().getSelectedItem().toString();
        Data dataAtual = new Data(new Date());
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        if("".equals(view.getCampoDeData().getText()) && "".equals(view.getCampoAteData().getText())){
            view.getTabela().setModel(new ModeloTabela(new AgendamentoDAO(em).selectPorBarbeiro("01/01/2000", dataAtual.dataFormatadaString(), nome)));
        }else if(!"".equals(view.getCampoDeData().getText())){
            view.getTabela().setModel(new ModeloTabela(new AgendamentoDAO(em).selectPorBarbeiro(dataDe, dataAtual.dataFormatadaString(), nome)));
        }else if(!"".equals(view.getCampoAteData().getText())){
            view.getTabela().setModel(new ModeloTabela(new AgendamentoDAO(em).selectPorBarbeiro("01/01/2000", dataAte, nome)));
        }else{
            view.getTabela().setModel(new ModeloTabela(new AgendamentoDAO(em).selectPorBarbeiro(dataDe, dataAte, nome)));
        }
        em.getTransaction().commit();
        em.close();
    }
    
    public void gerarRelatorio() throws FileNotFoundException, DocumentException{
        ArrayList<Agendamento> agendamentos = new ArrayList<>();
        String dataDe = view.getCampoDeData().getText();
        String dataAte = view.getCampoAteData().getText();
        Data dataAtual = new Data(new Date());
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        if(!"".equals(view.getCampoDeData().getText())){
            if(!"".equals(view.getCampoAteData().getText())){
                agendamentos = new AgendamentoDAO(em).selectPorData(dataDe, dataAte);
            }else{
                dataAte = dataAtual.dataFormatadaString();
                agendamentos = new AgendamentoDAO(em).selectPorData(dataDe, dataAtual.dataFormatadaString());
            }
        }else{
            JOptionPane.showMessageDialog(null, "A primeira data não pode estar vazia.");
        }
        em.getTransaction().commit();
        em.close();
        
        // CRIANDO RELATORIO PARA CALCULOS 
        RelatorioCalculos relatorio = new RelatorioCalculos(agendamentos);
            
        //CRIANDO O ARQUIVO 
        String data = dataAtual.dataFormatadaString().replace("/", "-");
        String caminho = "C:\\Users\\Public/relatorio" + data + ".pdf";
        
        Chunk glue = new Chunk(new VerticalPositionMark());
        DottedLineSeparator dottedline = new DottedLineSeparator();
        dottedline.setOffset(-2);
        dottedline.setGap(2f);
        Document doc = new Document();
        PdfWriter.getInstance(doc, new FileOutputStream(caminho));
        doc.open();
        // ABRINDO O DOCUMENTO
        
        // Header
        Paragraph header = new Paragraph("Relatório\n\n", new Font(FontFamily.HELVETICA, 18));
        header.setAlignment(Element.ALIGN_CENTER);
        doc.add(header);
        
        Paragraph textData = new Paragraph(dataDe + " à " + dataAte + "\n\n", new Font(FontFamily.HELVETICA, 10));
        textData.setAlignment(Element.ALIGN_RIGHT);
        doc.add(textData);
        
        // Body
        Paragraph servicos = new Paragraph("Serviços:", new Font(FontFamily.HELVETICA, 12));
        servicos.setAlignment(Element.ALIGN_LEFT);
        servicos.add(new Chunk(glue));
        servicos.add("R$" + relatorio.totalServicos());
        doc.add(servicos);

        /*Paragraph produtos = new Paragraph("Produtos:", new Font(FontFamily.HELVETICA, 12));
        produtos.setAlignment(Element.ALIGN_LEFT);
        produtos.add(new Chunk(glue));
        produtos.add("R$" + relatorio.totalProdutos());
        doc.add(produtos);*/
        
        // Total
        Paragraph textTotalMensal = new Paragraph("Total:", new Font(FontFamily.HELVETICA, 12));
        textTotalMensal.setAlignment(Element.ALIGN_LEFT);
        textTotalMensal.add(new Chunk(glue));
        textTotalMensal.add("R$" + relatorio.total());
        doc.add(textTotalMensal);
        
        // FECHANDO O DOCUMENTO
        doc.close();
    }
    
    public void gerarRelatorioBarbeiro() throws FileNotFoundException, DocumentException{
        ArrayList<Agendamento> agendamentos = new ArrayList<>();
        String dataDe = view.getCampoDeData().getText();
        String dataAte = view.getCampoAteData().getText();
        String nome = view.getComboBoxBarbeiro().getSelectedItem().toString();
        Data dataAtual = new Data(new Date());
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        if("".equals(view.getCampoDeData().getText()) && "".equals(view.getCampoAteData().getText())){
            dataDe = "01/01/2000";
            dataAte = dataAtual.dataFormatadaString();
            agendamentos = new AgendamentoDAO(em).selectPorBarbeiro("01/01/2000", dataAtual.dataFormatadaString(), nome);
        }else if(!"".equals(view.getCampoDeData().getText())){
            dataAte = dataAtual.dataFormatadaString();
            agendamentos = new AgendamentoDAO(em).selectPorBarbeiro(dataDe, dataAtual.dataFormatadaString(), nome);
        }else if(!"".equals(view.getCampoAteData().getText())){
            agendamentos = new AgendamentoDAO(em).selectPorBarbeiro("01/01/2000", dataAte, nome);
        }else{
            agendamentos = new AgendamentoDAO(em).selectPorBarbeiro(dataDe, dataAte, nome);
        }
        em.getTransaction().commit();
        em.close();
        
        // CRIANDO RELATORIO PARA CALCULOS 
        RelatorioCalculos relatorio = new RelatorioCalculos(agendamentos);
            
        //CRIANDO O ARQUIVO 
        String data = dataAtual.dataFormatadaString().replace("/", "-");
        String caminho = "C:\\Users\\Public/relatorio" + nome + data + ".pdf";
        
        Chunk glue = new Chunk(new VerticalPositionMark());
        DottedLineSeparator dottedline = new DottedLineSeparator();
        dottedline.setOffset(-2);
        dottedline.setGap(2f);
        Document doc = new Document();
        PdfWriter.getInstance(doc, new FileOutputStream(caminho));
        doc.open();
        // ABRINDO O DOCUMENTO
        
        // Header
        Paragraph header = new Paragraph("Relatório do Barbeiro " + nome + "\n\n", new Font(FontFamily.HELVETICA, 18));
        header.setAlignment(Element.ALIGN_CENTER);
        doc.add(header);
        
        Paragraph textData = new Paragraph(dataDe + " à " + dataAte + "\n\n", new Font(FontFamily.HELVETICA, 10));
        textData.setAlignment(Element.ALIGN_RIGHT);
        doc.add(textData);
        
        // Body
        Paragraph servicos = new Paragraph("Serviços:", new Font(FontFamily.HELVETICA, 12));
        servicos.setAlignment(Element.ALIGN_LEFT);
        servicos.add(new Chunk(glue));
        servicos.add("R$" + relatorio.totalServicos());
        doc.add(servicos);

        /*Paragraph produtos = new Paragraph("Produtos:", new Font(FontFamily.HELVETICA, 12));
        produtos.setAlignment(Element.ALIGN_LEFT);
        produtos.add(new Chunk(glue));
        produtos.add("R$" + relatorio.totalProdutos());
        doc.add(produtos);*/
        
        // Total
        Paragraph textTotalMensal = new Paragraph("Total:", new Font(FontFamily.HELVETICA, 12));
        textTotalMensal.setAlignment(Element.ALIGN_LEFT);
        textTotalMensal.add(new Chunk(glue));
        textTotalMensal.add("R$" + relatorio.total());
        doc.add(textTotalMensal);
        
        // FECHANDO O DOCUMENTO
        doc.close();
    }
}


