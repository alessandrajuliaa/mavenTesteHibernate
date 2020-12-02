package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "cliente", uniqueConstraints={@UniqueConstraint(columnNames = {"telefone"})})
public class Cliente implements Serializable {
    
    @Column(length = 100)
    private String nome;
    @Id
    @Column(length = 30, unique=true)
    private String telefone;

    public Cliente() {
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
