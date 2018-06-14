package br.com.lowin.business;

import br.com.lowin.dominio.Player;
import br.com.lowin.dominio.Usuario;
import br.com.lowin.repositorio.Repositorio;
import br.com.lowin.business.interfaces.PlayerInterface;

public class PlayerBusiness implements PlayerInterface {

    @Override
    public Player salvarPlayer(Player player) {
        if (validarPlayer(player)) {
            Repositorio.playerDBFake.add(player);
            System.out.println("Player cadastrado!");
        } else {
            System.err.println("Player com dados inválido");
        }
        return null;
    }

    public boolean validarPlayer(Player player) {
        boolean playerValido = false;
        if (player != null) {
            if ((player.getNome() != null
                    && !player.getNome().equals(""))) {
                playerValido = true;
            }
        }
        return playerValido;
    }

    public boolean validarPlayer2(Player player) {
        boolean playerValido = true;
        if (player != null) {
            if (player.getNome() == null
                    || player.getNome().equals("")) {
                playerValido = false;
            }
        }
        return playerValido;
    }

    @Override
    public Player buscarPlayerPorUsuario(Usuario usuario) {
        for (Player player : Repositorio.playerDBFake) {
            if (player.getNomeUsuario().equals(usuario.getNomeUsuario())) {
                return player;
            }
        }
        return null;
    }

}
