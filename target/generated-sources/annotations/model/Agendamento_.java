package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Cliente;
import model.Servico;
import model.Usuario;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-01-27T03:21:37")
@StaticMetamodel(Agendamento.class)
public class Agendamento_ { 

    public static volatile SingularAttribute<Agendamento, Double> preco;
    public static volatile SingularAttribute<Agendamento, Cliente> cliente;
    public static volatile ListAttribute<Agendamento, Servico> servicos;
    public static volatile SingularAttribute<Agendamento, Date> data;
    public static volatile SingularAttribute<Agendamento, Usuario> usuario;
    public static volatile SingularAttribute<Agendamento, Long> id;

}