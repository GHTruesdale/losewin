package br.com.lowin.dominio;

import java.util.Objects;

public class Usuario {

    private String nomeUsuario;

    private String senha;

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.nomeUsuario);
        hash = 89 * hash + Objects.hashCode(this.senha);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;        
        }
        if (!Objects.equals(this.nomeUsuario, nomeUsuario)) {
            return false;
        }
        if (!Objects.equals(this.senha, senha)) {
            return false;
        }
        return true;
    }

}
