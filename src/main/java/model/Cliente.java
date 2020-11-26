package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "cliente", uniqueConstraints={@UniqueConstraint(columnNames = {"email"})})
public class Cliente implements Serializable {
    
    @Column(length = 50)
    private String nome;
    @Id
    @Column(length = 70)
    private String email;
    @Column(length = 15)
    private String telefone;

    public Cliente() {
    }
    
    public Cliente(String email) {
        this.email = email;
    }

    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
