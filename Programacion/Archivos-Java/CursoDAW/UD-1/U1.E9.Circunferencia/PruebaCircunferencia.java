package com.mycompany.u1.e9.circunferencia;

public class PruebaCircunferencia {
    public static void main(String[] args) {
        Circunferencia c = new Circunferencia();
        
        c.estableceRadio(10);
        c.calculaPerimetro();
        c.calculaSuperficie();
        c.imprimePerimetro();
        c.imprimeSuperficie();
    }
}
