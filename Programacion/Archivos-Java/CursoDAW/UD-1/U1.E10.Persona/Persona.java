package com.mycompany.u1.e10.persona;

public class Persona {
    public String nombre;
    public int edad;
    public boolean trabaja;
    public boolean casada;
    
    public void cambiaNombre(String nuevoNombre){
        nombre=nuevoNombre;
    }
    public void imprimeNombre(){
        System.out.println("Su nombre es: "+nombre);
    }
    public void cambiaEdad(int nuevaEdad){
        edad=nuevaEdad;
    }
    public void imprimeEdad(){
        System.out.println("Tiene "+edad+" años");
    }
    public void consigueTrabajo(){
        trabaja=true;
    }
    public void pierdeTrabajo(){
        trabaja=false;
    }
    public void imprimeEstadoTrabajo(){
        System.out.println("Trabaja?: "+trabaja);
    }
    public void seCasa(){
        casada=true;
    }
    public void seDivorcia(){
        casada=false;
    }
    public void imprimeEstadoCivil(){
        System.out.println("Esta casada? "+casada);
    }
    public void cumpleaños(){
        edad++;
    }
    public int obtieneNumAnios(){
        return edad;
    }
}
