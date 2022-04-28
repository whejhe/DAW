package com.mycompany.u1.e3.triangulo;

public class PruebaTriangulo {
    public static void main(String[] args) {
        Triangulo trian = new Triangulo();
        
        trian.cambiaLado1(23.32);
        trian.cambiaLado2(12.21);
        trian.cambiaLado3(44.34);
        
        trian.imprimePerimetro();
        trian.imprimeDescripcion();
    }
}
