package com.mycompany.u1.e12.importapaquetes;
import figuras.Circulo;
import figuras.Triangulo;
import lineas.*;

public class PruebaImportaciones {
    public static void main(String[] args) {
        Circulo c = new Circulo();
        Triangulo t = new Triangulo();
        Recta r = new Recta();
        Curva cu = new Curva();
        
        c.quienSoy();
        t.quienSoy();
        r.quienSoy();
        cu.quienSoy();
    }
}
