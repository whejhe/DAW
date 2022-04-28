package com.mycompany.u2.e13.bombillacondicional2;

public class BombillaCondicional {
    public String marca;
    public int potencia;
    public boolean encendida;
    public int numVecesEncendida=0;
    public boolean fundida;
    
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
        if(fundida==true){
            System.out.println("La bombilla está fundida y no se puede encender");
        }else{
            if(encendida){
                  System.out.println("La bombilla ya esta encendida");
            }else{
                  numVecesEncendida++;
                  encendida=true;
                  if(numVecesEncendida >=10){
                      fundida =true;
                      encendida = false;
                      System.out.println("Se fundió en la vez "+numVecesEncendida);
                  }
              }
        }
    }
    public void apagar(){
        if(fundida==true){
            System.out.println("La bombilla esta fundida y no se puede apagar");
        }else{
            if(encendida==false){
                System.out.println("La bombilla ya esta apagada");
            }else{
                encendida=false;
            }
        }
    }
    public void imprimeEstado(){
        if(fundida==true){
            System.out.println("La bombilla esta fundida");
        }else{
            System.out.println("Encendida?: "+encendida);
        }
    }
    public int getNumVecesEncendida(){
        System.out.println("La bombilla se encendio "+numVecesEncendida+" veces");
        return numVecesEncendida;
    }
    public void estaFundida(){
        fundida=false;
    }
}
