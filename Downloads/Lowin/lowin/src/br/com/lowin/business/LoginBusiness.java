package br.com.lowin.business;

import br.com.lowin.business.interfaces.LoginInterface;
import br.com.lowin.dominio.Player;
import br.com.lowin.dominio.Usuario;
import br.com.lowin.repositorio.Repositorio;

public class LoginBusiness implements LoginInterface {

    @Override
    public boolean validaUsuario(Usuario usuario) {

        for (Player player : Repositorio.playerDBFake) {
            if (player.getNomeUsuario().
                    equals(usuario.getNomeUsuario())
                    && player.getSenha().equals(player.getSenha())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Usuario validaUsuario(String nomeUsuario, String senha) {
        Usuario usuario = null;

        for (Player player : Repositorio.playerDBFake) {
            if (player.getNomeUsuario().
                    equals(nomeUsuario)
                    && player.getSenha().equals(senha)) {
                usuario = new Usuario();
                usuario.setNomeUsuario(nomeUsuario);
                usuario.setSenha(senha);

            }
        }
        return usuario;
    }

}
