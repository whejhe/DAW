package com.mycompany.u1.e2.bombilla;

public class PruebaBombilla {
    public static void main(String[] args) {
        Bombilla b= new Bombilla();
        
        b.imprimeMarca();
        b.imprimePotencia();
        b.cambiaMarca("Phillips");
        b.cambiaPotencia(100);
        b.encender();
        b.apagar();
        b.encender();
        b.imprimeMarca();
        b.imprimePotencia();
        b.imprimeEstado();
    }
}
