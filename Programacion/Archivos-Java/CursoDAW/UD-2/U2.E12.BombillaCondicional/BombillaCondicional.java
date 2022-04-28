package com.mycompany.u2.e12.bombillacondicional;

public class BombillaCondicional {
    public String marca;
    public int potencia;
    public boolean encendida;
    public int numVecesEncendida=0;
    
    public void setMarca(String nuevaMarca){
        marca=nuevaMarca;
    }
    public void imprimeMarca(){
        System.out.println(marca);
    }
    public void setPotencia(int nuevaPotencia){
        potencia=nuevaPotencia;
    }
    public void imprimePotencia(){
        System.out.println(potencia);
    }
    public void encender(){
        if(encendida==true){
            System.out.println("La bombilla ya esta encendida");
        }else{
            encendida=true;
            numVecesEncendida++;
        }
    }
    public void apagar(){
        if(encendida==false){
            System.out.println("La bombilla ya esta apagada");
        }else{
            encendida=false;
        }
    }
    public void imprimeEstado(){
        if(encendida==true){
            System.out.println("La bombilla esta encendida");
        }else{
            System.out.println("La bombilla esta apagada");
        }
    }
    public int getNumVecesEncendida(){
        System.out.println("La bombilla se encendio "+numVecesEncendida+" veces");
        return numVecesEncendida;
    }
}
