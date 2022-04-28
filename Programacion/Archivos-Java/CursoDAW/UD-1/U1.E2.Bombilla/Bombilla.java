package com.mycompany.u1.e2.bombilla;

public class Bombilla {
    public String marca;
    public int potencia;
    public boolean encendida;
    
    public void cambiaMarca(String nuevaMarca){
        marca=nuevaMarca;
    }
    public void imprimeMarca(){
        System.out.println("Marca = "+marca);
    }
    public void cambiaPotencia(int nuevaPotencia){
        potencia=nuevaPotencia;
    }
    public void imprimePotencia(){
        System.out.println("Potencia = "+potencia);
    }
    public void encender(){
        encendida=true;
    }
    public void apagar(){
        encendida=false;
    }
    public void imprimeEstado(){
        System.out.println("Encendida?: "+encendida);
    }
}

