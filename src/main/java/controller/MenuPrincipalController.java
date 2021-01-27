package controller;

import javax.swing.JInternalFrame;
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
    
    public void abrirTelas(JInternalFrame tela){
        if(view.getDesktop().getAllFrames().length == 0){
            tela.setVisible(true);
            view.getDesktop().add(tela);
            tela.toFront();
        }else{
            for(JInternalFrame frame : view.getDesktop().getAllFrames()){
                if(frame.getTitle()!= "Agenda"){
                    view.getDesktop().remove(frame);
                }
            }            
            tela.setVisible(true);
            view.getDesktop().add(tela);
            tela.toFront();
        }
    }
            
    public void abrirCadastrarCliente(){
        TelaCliente cliente = new TelaCliente();
        abrirTelas(cliente);
    }

    public void abrirCadastrarProduto(){
        TelaProduto produto = new TelaProduto();
        abrirTelas(produto);
    }
    
    public void abrirCadastrarServico(){
        TelaServico servico = new TelaServico();
        abrirTelas(servico);
    }
    
    public void abrirCadastrarUsuario(){
        TelaUsuario usuario = new TelaUsuario();
        abrirTelas(usuario);
    }
    
    public void abrirAgenda(){
        TelaAgenda agenda = new TelaAgenda();
        if(view.getDesktop().getAllFrames().length == 0){
            agenda.setVisible(true);
            view.getDesktop().add(agenda);
            agenda.toFront();
        }else{
            for(JInternalFrame frame : view.getDesktop().getAllFrames()){
                view.getDesktop().remove(frame);
            }
            agenda.setVisible(true);
            view.getDesktop().add(agenda);
            agenda.toFront();
        }
    }
    
    public void sairDoSistema(){
        new Login().setVisible(true);
        view.dispose();
    }
}


