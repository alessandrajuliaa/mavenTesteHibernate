package util;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import java.util.ArrayList;
import java.util.List;
import model.Agendamento;
import model.Produto;
import model.Servico;
import model.Usuario;

/**
 *
 * @author Alessandra
 */
public class RelatorioCalculos {
    private ArrayList<Agendamento> agendamentos;
    
    public RelatorioCalculos(ArrayList<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }
    
    public double totalServicos(){
        double total = 0;
        for(Agendamento agendamento : this.agendamentos){
            List<Servico> servicos = agendamento.getServicos();
            if((servicos != null)){
                if(servicos.size() != 0){
                    for(Servico serv : servicos){
                        total += serv.getPreco();
                    }
                }
            }
        }
        return total;
    }
    
    public double totalProdutos(){
        double total = 0;
        for(Agendamento agendamento : this.agendamentos){
            List<Produto> produtos = agendamento.getProdutos();
            if((produtos != null)){
                if(produtos.size() != 0){
                    for(Produto prod : produtos){
                        total += prod.getPreco();
                    }
                }
            }
        }
        return total;
    }
    
    public double total(){
        double total = 0;
        if(this.agendamentos.size() != 0){
            for(Agendamento agendamento : this.agendamentos){
                total += agendamento.getPreco();
            }
        }
        return total;
    }

    public ArrayList<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(ArrayList<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }
}
