package com.mycompany.u1.e8.bombillainteligente;

public class Prueba2Bombillas {
    public static void main(String[] args) {
        BombillaInteligente b1 = new BombillaInteligente();
        BombillaInteligente b2 = new BombillaInteligente();
        
        b1.encender();
        b1.apagar();
        b1.encender();
        b1.apagar();
        b1.encender();
        b1.apagar();
        
        b2.encender();
        b2.apagar();
        
        System.out.println("Bombilla 1:");
        b1.obtieneNumVecesEncendida();
        
        System.out.println("Bombilla 2:");
        b2.obtieneNumVecesEncendida();
    }
}
