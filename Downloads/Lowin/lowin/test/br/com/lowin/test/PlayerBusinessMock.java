package br.com.lowin.test;

import br.com.lowin.business.PlayerBusiness;
import br.com.lowin.dominio.Player;
import java.util.ArrayList;
import br.com.lowin.business.interfaces.PlayerInterface;

public class PlayerBusinessMock {
    
    public static void main(String[] args){
        Player novoPlayer = new Player();
        novoPlayer.setNome("Gustavo");

        PlayerInterface playerBusiness = new PlayerBusiness(); 
        
        Player segundoNovoPlayer = null;
        try{
            playerBusiness.salvarPlayer(novoPlayer);
            playerBusiness.salvarPlayer(segundoNovoPlayer);
        }catch(UnsupportedOperationException exc){
            System.out.println(exc.getMessage());
        }        
                
    }    
}
