package br.com.lowin.business.interfaces;

import br.com.lowin.dominio.Player;
import br.com.lowin.dominio.Usuario;

public interface PlayerInterface {
       
    public Player salvarPlayer(Player player);       
    public Player buscarPlayerPorUsuario(Usuario usuario);
}
