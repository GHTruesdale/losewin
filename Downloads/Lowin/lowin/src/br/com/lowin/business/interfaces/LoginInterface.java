package br.com.lowin.business.interfaces;

import br.com.lowin.dominio.Usuario;

public interface LoginInterface {
    
    public boolean validaUsuario(Usuario usuario);
    
    public Usuario validaUsuario(String nomeUsuario, String senha);
            
    
}
