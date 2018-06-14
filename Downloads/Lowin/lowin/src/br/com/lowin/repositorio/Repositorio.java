package br.com.lowin.repositorio;

import br.com.lowin.dominio.Player;
import java.util.ArrayList;
import java.util.List;

public class Repositorio {

    public static List<Player> playerDBFake = new ArrayList<Player>();

    static {
        Player novoPlayer = new Player();
        novoPlayer.setNomeUsuario("ghtruesdale");
        novoPlayer.setSenha("senha123");

        Player novoPlayer2 = new Player("minort", "senha123");

        playerDBFake.add(novoPlayer);
        playerDBFake.add(novoPlayer2);
    }

}
