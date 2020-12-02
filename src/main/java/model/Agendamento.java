package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "agendamento", uniqueConstraints={@UniqueConstraint(columnNames = {"id"})})
public class Agendamento implements Serializable {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true)
    private Long id;
    private Cliente cliente;
    private List<Servico> servicos;
    private List<Produto> produtos;
    private Usuario usuario;
    @Column(length = 25)
    private String data;
    @Column(length = 25)
    private String hora;

    public Agendamento() {
    }

    public Agendamento(Long id) {
        this.id = id;
    }

    public Agendamento(Cliente cliente) {
        this.cliente = cliente;
    }

    public Agendamento(Cliente cliente, List<Servico> servicos, List<Produto> produtos, Usuario usuario, String data, String hora) {
        this.cliente = cliente;
        this.servicos = servicos;
        this.produtos = produtos;
        this.usuario = usuario;
        this.data = data;
        this.hora = hora;
    }

    public Agendamento(Long id, Cliente cliente, List<Servico> servicos, List<Produto> produtos, Usuario usuario, String data, String hora) {
        this.id = id;
        this.cliente = cliente;
        this.servicos = servicos;
        this.produtos = produtos;
        this.usuario = usuario;
        this.data = data;
        this.hora = hora;
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

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
       
    
}
