package com.mycompany.extras.vehiculo;

public class PruebaExtraVehiculo {
    public static void main(String[] args) {
        Vehiculo v1=new Vehiculo();
        v1.setNumRuedas(4);
        v1.setPotencia(100);
        v1.setConsumoPor100Km(2);
        v1.reponerCombustible(75);
        v1.arrancar();
        v1.recorrerDistancia(200);
        v1.parar();
        v1.arrancar();
        System.out.println("El desgaste es: "+v1.calculaPorcentajeDesgaste());
        System.out.println("El número de ruedas es: "+v1.getNumRuedas());
        System.out.println("La potencia es: "+v1.getPotencia());
        System.out.println("Los litros en depósito son: "+v1.getLitrosEnDeposito());
        System.out.println("El consumo a los 100 km es: "+v1.getConsumoPor100Km());
    }
}
