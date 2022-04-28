
package com.mycompany.u3.diagnostica.ascensores;

public class PruebaAscensor {
    public static void main(String[] args) {
        //AscensorInterface a = new Ascensor("Otis", "2000",10);
        Ascensor a = new Ascensor("Otis", "2000",10);
        a.sube(20);
        a.sube(5);
        System.out.println(a.toString());
        a.sube(1);
        a.baja(1);
        System.out.println(a.toString());
        a.baja(5);
        a.baja(-1);
        System.out.println(a.toString());
        System.out.println("El ascensor está en la planta actual "+a.getPlantaActual());
    }
    
}
