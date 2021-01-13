package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "agendamento", uniqueConstraints={@UniqueConstraint(columnNames = {"id"})})
public class Agendamento implements Serializable, Comparable<Agendamento> {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true)
    private Long id;
    private Cliente cliente;
    private ArrayList<Servico> servicos;
    private Usuario usuario;
    private Date data;
    private double preco;
    
    public Agendamento() {
    }

    public Agendamento(Long id) {
        this.id = id;
    }

    public Agendamento(Cliente cliente) {
        this.cliente = cliente;
    }

    public Agendamento(Cliente cliente, ArrayList<Servico> servicos, Usuario usuario, Date data, double preco) {
        this.cliente = cliente;
        this.servicos = servicos;
        this.usuario = usuario;
        this.data = data;
        this.preco = preco;
    }

    public Agendamento(Long id, Cliente cliente, ArrayList<Servico> servicos, Usuario usuario, Date data, double preco) {
        this.id = id;
        this.cliente = cliente;
        this.servicos = servicos;
        this.usuario = usuario;
        this.data = data;
        this.preco = preco;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(ArrayList<Servico> servicos) {
        this.servicos = servicos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    @Override
    public int compareTo(Agendamento o) {
        //System.out.println(this.data);
        //System.out.println(o.getData());
        //Date dataTeste = new Date("24/12/2020");
        //System.out.println(dataTeste.before(new Date("01/12/2020")));
        if(this.data.before(o.getData())){
            return -1;
        }else if(this.data.after(o.getData())){
            return 1;
        }else{
            return 0;
        }    
    }
}
