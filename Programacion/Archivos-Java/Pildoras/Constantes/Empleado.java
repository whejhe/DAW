package com.mycompany.constantes;

public class Empleado {
    
    private final String nombre;
    private String seccion;

    public Empleado(String nom) {
        nombre = nom;
        seccion = "Administracion";
    }
    
    public Empleado(String nom,double sue,int agno,int mes,int dia){
        nombre=nom;
        
    }
    
    public void cambiaSeccion(String seccion){//setter
        this.seccion=seccion;
    }
    
    /*public void cambiaNombre(String nombre){
        this.nombre=nombre;//Al ser una constante no puede cambiar de valor
    }*/
    
    public String devuelveDatos(){
        return "El nombre es: "+nombre+" y la seccion es: "+seccion;
    }
}
