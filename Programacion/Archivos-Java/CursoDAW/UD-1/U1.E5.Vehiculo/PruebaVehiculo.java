package com.mycompany.u1.e5.vehiculo;

public class PruebaVehiculo {
    public static void main(String[] args) {
        Vehiculo v =new Vehiculo();
        
        v.setNumRuedas(4);
        v.setPotencia(100);
        v.setconsumoPorKm(0.30);
        v.arrancar();
        v.recorrerDistancia(50);
        v.apagar();
        v.imprimeAutonomiaEnKm();
        v.imprimeLitrosEnDeposito();
        v.reponerCombustible(10);
        v.imprimeLitrosEnDeposito();
        v.imprimeAutonomiaEnKm();
        v.arrancar();
        v.recorrerDistancia(50);
        v.imprimeNumRuedad();
        v.imprimePotencia();
        v.imprimeLitrosEnDeposito();
        v.imprimeAutonomiaEnKm();
        
        
    }
}
