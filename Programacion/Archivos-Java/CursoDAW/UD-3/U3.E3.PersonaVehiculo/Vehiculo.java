package com.mycompany.u3.e3.personavehiculo;

public class Vehiculo {
    public int numRuedas;
    public double potencia;
    public double litrosEnDeposito;
    //public double consumoPorKm;
    public boolean arrancado;
    public double kmRecorridos;
    public double consumoPor100Km;

    public void setLitrosEnDeposito(double litrosEnDeposito) {
        this.litrosEnDeposito = litrosEnDeposito;
    }
    
    public void setNumRuedas (int nuevoNumRuedas){
        numRuedas = nuevoNumRuedas;
    }
    public void setPotencia (double nuevaPotencia){
        potencia = nuevaPotencia;
    }
    
   /* public void setConsumoPorKm (double nuevoConsumoPorKm){
        consumoPorKm = nuevoConsumoPorKm;
    }*/
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
        //litrosEnDeposito += numLitrosRepuesto;
    }
   /* public void recorrerDistancia (double numKm){
        litrosEnDeposito = litrosEnDeposito - (numKm * consumoPorKm);
        //litrosEnDeposito -=(numKm * consumoPorKm);
        
    }*/
    public void recorrerDistancia (double numKm){
       //litrosEnDeposito = litrosEnDeposito - (numKm * consumoPorKm);
       litrosEnDeposito = litrosEnDeposito - (numKm * consumoPor100Km);
      // kmRecorridos += numKm;
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
  /* public void imprimeNumRuedas(){
        System.out.println("El número de ruedas es: "+numRuedas);
    }
    public void imprimePotencia(){
        System.out.println("La potencia es: "+potencia);
    }
    public void imprimeLitrosEnDeposito(){
        System.out.println("Los litros en depósito son: "+litrosEnDeposito);
    }
   public void imprimeConsumoPorKm(){
       System.out.println("El consumo por km es: " +consumoPorKm);
   }*/
  /* public void imprimeArrancado(){
       System.out.println("¿Está arrancado? "+arrancado);
   }*/
   /*public void imprimeAutonomiaEnKm(){
       double autonomia = litrosEnDeposito /consumoPorKm;
       System.out.println("El vehículo consume "
               +consumoPorKm+ " litros/km, tiene "
               + litrosEnDeposito+ 
               " litros en el depósito, así que puede recorrer "
               +autonomia+" km");
   }
   public void imprimeKmRecorridos(){
       System.out.println("Kilómetros recorridos: " +kmRecorridos);
   }*/
   public double calculaPorcentajeDesgaste(){
       double desgaste = (kmRecorridos*100)/200000;
       return desgaste;
   }
}
