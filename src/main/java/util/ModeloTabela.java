package util;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;
import model.Agendamento;
import model.Servico;

public class ModeloTabela extends AbstractTableModel{
    
    public static final int COL_DATA_AGENDAMENTO = 0;
    public static final int COL_CLIENTE_AGENDAMENTO = 1;
    public static final int COL_SERVICO_AGENDAMENTO = 2;
    public static final int COL_BARBEIRO_AGENDAMENTO = 3;
    
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
        return 4;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Agendamento agendamento = list.get(linhas);
        Data data = new Data(agendamento.getData());
        if(colunas == COL_DATA_AGENDAMENTO) return data.dataFormatadaEHoraString();
        if(colunas == COL_CLIENTE_AGENDAMENTO) return agendamento.getCliente().getNome();
        if(colunas == COL_SERVICO_AGENDAMENTO){
            String servicos = "";
            if(agendamento.getServicos().size() > 1){
                for(Servico agen : agendamento.getServicos()){
                    servicos += agen.getNome() + "  ";
                }
            }else{
                servicos = agendamento.getServicos().get(0).getNome();
            }
            return servicos;
        }
        if(colunas == COL_BARBEIRO_AGENDAMENTO) return agendamento.getUsuario().getNome();
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        if(colunas == COL_DATA_AGENDAMENTO) return "Data";
        if(colunas == COL_CLIENTE_AGENDAMENTO) return "Cliente";
        if(colunas == COL_SERVICO_AGENDAMENTO) return "Serviço";
        if(colunas == COL_BARBEIRO_AGENDAMENTO) return "Barbeiro";
        return "";
    }
}
