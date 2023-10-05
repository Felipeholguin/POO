package org.example.validaciones;

import org.example.utilidades.Utilidad;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionAfiliado {

    Utilidad utilidad = new Utilidad(); //Inyeccion de dependencias
    public ValidacionAfiliado() {
    }
    public Boolean validarId(Integer id) throws Exception{

        if(id<0){
            throw new Exception("El id no puede ser negativo");
        }
        //PASE TODAS LAS VALIDACIONES
        return true;
    }
    public Boolean validarNombres(String nombre)throws Exception{
        //Longitud sea menor 3 o mayor que 40
        if(nombre.length()<3 || nombre.length()>40){
            throw new Exception("El nombre debe tener entre 3 y 40 caracteres");
        }
        String expresionRegular="^[a-zA-Z ]+$";
        if (!this.utilidad.buscarcoincidencia(expresionRegular,nombre)){
            throw  new Exception("El nombre no cumple los parametros");
        }
        return true;
    }

    public Boolean  validarApellidos(String apellidos)throws Exception{
        if(apellidos.length()<10 || apellidos.length()>50){
            throw new Exception("Los apellidos ingresados no cumplen" + "con el minimo o maximo de caracteres");
        }
        String expresionRegular="^[a-zA-Z]+$";
        if (!this.utilidad.buscarcoincidencia(expresionRegular,apellidos)){
            throw new Exception("Formato invalido");
    }
            return true;
        }
        public Boolean validarDocumento(String documento)throws Exception{
        if (documento.length()<7 || documento.length()>10){
            throw new Exception("documento con longitud invalidad");
        }
        String expresionRegular="^[0-9]+$";
        if (!this.utilidad.buscarcoincidencia(expresionRegular,documento)){
            throw new Exception("Revise el formato ingresado");
        }
        return true;
        }

}
