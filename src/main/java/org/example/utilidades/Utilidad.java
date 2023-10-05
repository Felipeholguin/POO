package org.example.utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilidad {
    public Boolean buscarcoincidencia(String expresionRegular,String cadenaTexto){
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia=patron.matcher(cadenaTexto);
        if (coincidencia.matches()){
            System.out.println("Tenemos coincidencia, cumple");
            return true;
        }else {
            System.out.println("No tenemos coincidencia");
            return false;
        }
    }
}
