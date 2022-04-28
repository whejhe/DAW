package com.mycompany.u1.e5.vehiculo;

public class Vehiculo {
    public int numRuedas;
    public double potencia;
    public double litrosEnDeposito;
    public double consumoPorKm;
    public boolean arrancado;
    
    public void setNumRuedas(int nuevoNumRuedas){
        numRuedas=nuevoNumRuedas;
    }
    public void setPotencia(double nuevaPotencia){
        potencia=nuevaPotencia;
    }
    public void setconsumoPorKm(double nuevoConsumoPorKm){
        consumoPorKm=nuevoConsumoPorKm;
    }
    public void reponerCombustible(double numLitrosRepuestos){
        litrosEnDeposito=litrosEnDeposito+numLitrosRepuestos;
    }
    public void recorrerDistancia(double numKm){
        litrosEnDeposito=consumoPorKm * numKm;
    }
    public void arrancar(){
        arrancado=true;
    }
    public void apagar(){
        arrancado=false;
    }
    public void imprimeNumRuedad(){
        System.out.println("El coche tiene "+numRuedas+" Ruedas");
    }
    public void imprimePotencia(){
        System.out.println("La potencia del coche es: "+potencia);
    }
    public void imprimeAutonomiaEnKm(){
        System.out.println("El vehículo consume "+consumoPorKm+" litros/km, tiene "+litrosEnDeposito+" litros en el deposito, asi que puede recorrer "+litrosEnDeposito*consumoPorKm+" km");
    }
    public void imprimeLitrosEnDeposito(){
        System.out.println("El coche tiene "+litrosEnDeposito+" litros");
    }
    
}
