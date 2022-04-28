package com.mycompany.extras.vehiculo;

public class Vehiculo {
    public int numRuedas;
    public double potencia;
    public double litrosEnDeposito;
    public boolean arrancado;
    public double kmRecorridos;
    public double consumoPor100Km;
    
    public void setNumRuedas (int nuevoNumRuedas){
        numRuedas = nuevoNumRuedas;
    }
    public void setPotencia (double nuevaPotencia){
        potencia = nuevaPotencia;
    }
    
    public void setConsumoPor100Km (double nuevoConsumoPor100Km){
       consumoPor100Km = nuevoConsumoPor100Km;
    }
    public void arrancar(){
        arrancado = true;
    }
    public void parar(){
        arrancado = false;
    }
    public void reponerCombustible (double numLitrosRepuesto){
        litrosEnDeposito = litrosEnDeposito + numLitrosRepuesto;
    }
   
    public void recorrerDistancia (double numKm){
       litrosEnDeposito = litrosEnDeposito - (numKm * consumoPor100Km);
    }
    
    public int getNumRuedas(){
            return numRuedas;
    }


    public double getPotencia() {
        return potencia;
    }

    public double getLitrosEnDeposito() {
        return litrosEnDeposito;
    }

    public double getConsumoPor100Km() {
        return consumoPor100Km;
    }
  
    public double calculaPorcentajeDesgaste(){
       double desgaste = (kmRecorridos*100)/200000;
       return desgaste;
   }
}
