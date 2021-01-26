package controller;

import view.Login;
import view.MenuPrincipal;
import view.TelaAgenda;
import view.TelaCliente;
import view.TelaProduto;
import view.TelaServico;
import view.TelaUsuario;

public class MenuPrincipalController {
    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
    public void abrirAgenda(){
        TelaAgenda agenda = new TelaAgenda();
        if(view.getDesktop().getAllFrames().length == 0){
            agenda.setVisible(true);
            view.getDesktop().add(agenda);
            agenda.toFront();
        }else{
            view.getDesktop().remove(view.getDesktop().getAllFrames()[0]);
            agenda.setVisible(true);
            view.getDesktop().add(agenda);
            agenda.toFront();
        }
    }
    public void abrirCadastrarCliente(){
        TelaCliente cliente = new TelaCliente();
        if(view.getDesktop().getAllFrames().length == 0){
            cliente.setVisible(true);
            view.getDesktop().add(cliente);
            cliente.toFront();
        }else{
            view.getDesktop().remove(view.getDesktop().getAllFrames()[0]);
            cliente.setVisible(true);
            view.getDesktop().add(cliente);
            cliente.toFront();
        }
    }
    public void abrirCadastrarProduto(){
        TelaProduto produto = new TelaProduto();
    
        if(view.getDesktop().getAllFrames().length == 0){
            produto.setVisible(true);
            view.getDesktop().add(produto);
            produto.toFront();
        }else{
            view.getDesktop().remove(view.getDesktop().getAllFrames()[0]);
            produto.setVisible(true);
            view.getDesktop().add(produto);
            produto.toFront();
        }
    }
    public void abrirCadastrarServico(){
        TelaServico servico = new TelaServico();
        if(view.getDesktop().getAllFrames().length == 0){
            servico.setVisible(true);
            view.getDesktop().add(servico);
            servico.toFront();
        }else{
            view.getDesktop().remove(view.getDesktop().getAllFrames()[0]);
            servico.setVisible(true);
            view.getDesktop().add(servico);
            servico.toFront();
        }
    }
    
    public void abrirCadastrarUsuario(){
        TelaUsuario usuario = new TelaUsuario();
    
        if(view.getDesktop().getAllFrames().length == 0){
            usuario.setVisible(true);
            view.getDesktop().add(usuario);
            usuario.toFront();
        }else{
            view.getDesktop().remove(view.getDesktop().getAllFrames()[0]);
            usuario.setVisible(true);
            view.getDesktop().add(usuario);
            usuario.toFront();
        }
    }
    
    public void sairDoSistema(){
        new Login().setVisible(true);
        view.dispose();
    }
}


