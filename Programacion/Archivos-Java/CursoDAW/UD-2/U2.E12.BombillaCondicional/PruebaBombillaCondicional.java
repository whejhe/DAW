package com.mycompany.u2.e12.bombillacondicional;

public class PruebaBombillaCondicional {
    public static void main(String[] args) {
        BombillaCondicional b = new BombillaCondicional();
        
        b.setMarca("Phillips");
        b.setPotencia(100);
        
        b.encender();
        b.apagar();
        
        b.apagar();
        b.encender();
        b.encender();
        
        b.apagar();
        b.imprimeEstado();
        
        b.getNumVecesEncendida();
    }
}
