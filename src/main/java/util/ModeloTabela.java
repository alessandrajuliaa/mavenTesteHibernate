package util;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import model.Agendamento;
import model.Produto;
import model.Servico;

public class ModeloTabela extends AbstractTableModel{
    
    public static final int COL_ID_AGENDAMENTO = 0;
    public static final int COL_DATA_AGENDAMENTO = 1;
    public static final int COL_CLIENTE_AGENDAMENTO = 2;
    public static final int COL_SERVICO_AGENDAMENTO = 3;
    public static final int COL_BARBEIRO_AGENDAMENTO = 4;
    public static final int COL_PRECO_AGENDAMENTO = 5;
    
    public ArrayList<Agendamento> list = null;
    
    public ModeloTabela(ArrayList<Agendamento>l){
        list = new ArrayList<Agendamento>(l);
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Agendamento agendamento = list.get(linhas);
        Data data = new Data(agendamento.getData());
        if(colunas == COL_ID_AGENDAMENTO) return agendamento.getId();
        if(colunas == COL_DATA_AGENDAMENTO) return data.dataFormatadaEHoraString();
        if(colunas == COL_CLIENTE_AGENDAMENTO) return agendamento.getCliente().getNome();
        if(colunas == COL_SERVICO_AGENDAMENTO){
            String servicos = "";
            System.out.println(agendamento.getServicos());
            if(agendamento.getServicos() != null){
                if(agendamento.getServicos().size() > 1){
                    for(Servico agen : agendamento.getServicos()){
                        servicos += agen.getNome() + "  ";
                    }
                }else if(agendamento.getServicos().size() == 1){
                    servicos = agendamento.getServicos().get(0).getNome();
                }
            }
            return servicos;
        }
        if(colunas == COL_BARBEIRO_AGENDAMENTO) return agendamento.getUsuario().getNome();
        if(colunas == COL_PRECO_AGENDAMENTO) return agendamento.getPreco();
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        if(colunas == COL_ID_AGENDAMENTO) return "Id";
        if(colunas == COL_DATA_AGENDAMENTO) return "Data";
        if(colunas == COL_CLIENTE_AGENDAMENTO) return "Cliente";
        if(colunas == COL_SERVICO_AGENDAMENTO) return "Serviço";
        if(colunas == COL_BARBEIRO_AGENDAMENTO) return "Barbeiro";
        if(colunas == COL_PRECO_AGENDAMENTO) return "Preço";
        return "";
    }
}