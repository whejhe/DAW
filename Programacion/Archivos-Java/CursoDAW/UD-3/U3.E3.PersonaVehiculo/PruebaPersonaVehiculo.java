package com.mycompany.u3.e3.personavehiculo;

public class PruebaPersonaVehiculo {

    public static void main(String[] args) {
        Persona p = new Persona("Pepe", "12345678A");
        Vehiculo v1 = new Vehiculo();
        Vehiculo v2 = new Vehiculo();
        Vehiculo v3 = new Vehiculo();
        Vehiculo v4 = new Vehiculo();

        v1.setNumRuedas(4);
        v1.setPotencia(250);
        v1.setConsumoPor100Km(5.6);
        v1.setLitrosEnDeposito(30);

        p.comprarCoche(v1);
        p.arrancarCoche(v1);
        p.recorrerDistancia(v1, 100);
        p.reponerCombustible(v1, 60);
        p.apagarCoche(v1);

        v2.setNumRuedas(4);
        v2.setPotencia(150);
        v2.setConsumoPor100Km(3.6);
        v2.setLitrosEnDeposito(40);

        p.comprarCoche(v2);
        p.arrancarCoche(v2);
        p.recorrerDistancia(v2, 50);

        v3.setNumRuedas(4);
        v3.setPotencia(250);
        v3.setConsumoPor100Km(5.6);
        v3.setLitrosEnDeposito(30);

        p.comprarCoche(v3);

        v4.setNumRuedas(4);
        v4.setPotencia(250);
        v4.setConsumoPor100Km(5.6);
        v4.setLitrosEnDeposito(30);
        
        p.comprarCoche(v4);

    }
}
