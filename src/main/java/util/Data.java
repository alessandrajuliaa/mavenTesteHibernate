package util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe para tratar data, de String para Data e de Data para String
 * @author Alessandra
 */
public class Data {
    private String dataEmString;
    private String horaEmString;
    private Date dataEmData;

    DateFormat dateTimeFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    DateFormat timeFormat = new SimpleDateFormat("HH:mm");
    
    public Date date(){
        if(this.dataEmString != null && this.horaEmString != null){
            String dia, mes, ano, hh, mm, data = "";
            if(this.dataEmString.length() > 8){
                dia = this.dataEmString.substring(0, 2);
                mes = this.dataEmString.substring(3, 5);
                ano = this.dataEmString.substring(6, 10);
                data = ano + "/" + mes + "/" + dia;
            }else if(this.dataEmString.length() > 6){
                if(dataEmString.contains("/")){
                    dia = this.dataEmString.substring(0, 2);
                    mes = this.dataEmString.substring(3, 5);
                    ano = this.dataEmString.substring(6, 8);
                    data = "20" + ano + "/" + mes + "/" + dia;
                }else{
                    dia = this.dataEmString.substring(0, 2);
                    mes = this.dataEmString.substring(2, 4);
                    ano = this.dataEmString.substring(4, 8);
                    data = ano + "/" + mes + "/" + dia;
                }
            }else{
                dia = this.dataEmString.substring(0, 2);
                mes = this.dataEmString.substring(2, 4);
                ano = this.dataEmString.substring(4, 6);
                data = "20" + ano + "/" + mes + "/" + dia;
            }
            if(this.horaEmString.length() > 4){
                hh = this.horaEmString.substring(0, 2);
                mm = this.horaEmString.substring(3, 5);
            }else{
                hh = this.horaEmString.substring(0, 2);
                mm = this.horaEmString.substring(2, 4);
            }
            return new Date(data + " " + hh + ":" + mm);
        }else{
            return this.dataEmData;
        }
    }
    
    public String dataFormatadaEHoraString(){
        return dateTimeFormat.format(date());
    }
    public String dataFormatadaString(){
        return dateFormat.format(date());
    }
    public String horaFormatadaString(){
        return timeFormat.format(date());
    }
    
    public Data(Date dataEmData) {
        this.dataEmData = dataEmData;
    }

    public Data(String dataEmString, String horaEmString) {
        this.dataEmString = dataEmString;
        this.horaEmString = horaEmString;
    }

    public String getDataEmString() {
        return dataEmString;
    }

    public void setDataEmString(String dataEmString) {
        this.dataEmString = dataEmString;
    }

    public Date getDataEmData() {
        return dataEmData;
    }

    public void setDataEmData(Date dataEmData) {
        this.dataEmData = dataEmData;
    }

    public String getHoraEmString() {
        return horaEmString;
    }

    public void setHoraEmString(String horaEmString) {
        this.horaEmString = horaEmString;
    }
}
