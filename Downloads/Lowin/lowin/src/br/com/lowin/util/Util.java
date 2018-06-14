package br.com.lowin.util;

public class Util {

    public static boolean validaUsuario(String usuario){
        if(usuario.contains("@")){
            return false;
        }       
        return true;
    }
    
}
