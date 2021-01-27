package util;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import model.Agendamento;
import model.Servico;

public class ModeloTabela extends AbstractTableModel{
    
    public static final int COL_ID_AGENDAMENTO = 0;
    public static final int COL_CLIENTE_AGENDAMENTO = 1;
    public static final int COL_DATA_AGENDAMENTO = 2;
    public static final int COL_HORA_AGENDAMENTO = 3;
    public static final int COL_BARBEIRO_AGENDAMENTO = 4;
    public static final int COL_SERVICO_AGENDAMENTO = 5;
    public static final int COL_PRECO_AGENDAMENTO = 6;
    
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
        return 7;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Agendamento agendamento = list.get(linhas);
        Data data = new Data(agendamento.getData());
        if(colunas == COL_ID_AGENDAMENTO) return agendamento.getId();
        if(colunas == COL_DATA_AGENDAMENTO) return data.dataFormatadaString();
        if(colunas == COL_HORA_AGENDAMENTO) return data.horaFormatadaString();
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
        if(colunas == COL_PRECO_AGENDAMENTO) return "R$" + agendamento.getPreco() + "0";
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        if(colunas == COL_ID_AGENDAMENTO) return "ID";
        if(colunas == COL_DATA_AGENDAMENTO) return "DATA";
        if(colunas == COL_HORA_AGENDAMENTO) return "HORA";
        if(colunas == COL_CLIENTE_AGENDAMENTO) return "CLIENTE";
        if(colunas == COL_SERVICO_AGENDAMENTO) return "SERVIÇO";
        if(colunas == COL_BARBEIRO_AGENDAMENTO) return "BARBEIRO";
        if(colunas == COL_PRECO_AGENDAMENTO) return "PREÇO";
        return "";
    }
}