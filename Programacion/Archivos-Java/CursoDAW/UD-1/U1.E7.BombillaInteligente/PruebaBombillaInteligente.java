package com.mycompany.u1.e7.bombillainteligente;

public class PruebaBombillaInteligente {
    public static void main(String[] args) {
        BombillaInteligente b = new BombillaInteligente();
        
        b.encender();
        b.apagar();
        b.encender();
        b.imprimeEstado();
        b.obtieneNumVecesEncendida();
        
        
    }
}
