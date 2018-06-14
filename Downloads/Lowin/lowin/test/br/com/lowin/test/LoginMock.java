package br.com.lowin.test;

import br.com.lowin.business.PlayerBusiness;
import br.com.lowin.business.LoginBusiness;
import br.com.lowin.business.interfaces.LoginInterface;
import br.com.lowin.dominio.Usuario;
import br.com.lowin.util.Util;
import javax.swing.JOptionPane;
import br.com.lowin.business.interfaces.PlayerInterface;

public class LoginMock {
    
    public static void main(String agrs[]){
        
        Usuario novoUsuario = new Usuario();
        novoUsuario.setNomeUsuario("minort");
        novoUsuario.setSenha("senha123");        
            
        if(!Util.validaUsuario(novoUsuario.getNomeUsuario())){
            JOptionPane.showMessageDialog(null, "Usuario Inválido");
        }
               
        LoginInterface loginBusiness = new LoginBusiness();
        PlayerInterface playerBusiness = new PlayerBusiness();
        
        
        if(loginBusiness.validaUsuario(novoUsuario)){
            if(playerBusiness.buscarPlayerPorUsuario(novoUsuario)!=null){
                JOptionPane.showMessageDialog(null, "Usuario é um Player!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Usuario não encontrado!");
        }
    }
}




