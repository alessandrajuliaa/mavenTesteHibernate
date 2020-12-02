package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "produto", uniqueConstraints={@UniqueConstraint(columnNames = {"id"})})
public class Produto implements Serializable {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true)
    private int id;
    @Column(length = 50)
    private String nome;
    private double preco;

    public Produto() {
    }

    public Produto(int id) {
        this.id = id;
    }

    public Produto(String nome) {
        this.nome = nome;
    }
    
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
