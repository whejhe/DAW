package com.mycompany.u1.e7.bombillainteligente;

public class BombillaInteligente {
    public String marca;
    public int potencia;
    public boolean encendida;
    public int numVecesEncendida;
    
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
        numVecesEncendida++;
    }
    public void apagar(){
        encendida=false;
    }
    public void imprimeEstado(){
        System.out.println("Encendida?: "+encendida);
    }
    public int obtieneNumVecesEncendida(){
        System.out.println("La bombilla se encendio "+numVecesEncendida+" veces");
        return numVecesEncendida;
    }
}
