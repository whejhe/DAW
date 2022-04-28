package com.mycompany.ud3.pruebaherencia;

public class PruebaCalentadores {
    public static void main(String[] args) {
        
       radiador r = new radiador(1000,false,0);
       secador s = new secador(1000,false,0);
       
       System.out.println("RADIADOR");
       r.setPorcentaje(13);
       r.getCalculaPotenciaActual();
       r.encender();
       r.getCalculaPotenciaActual();
       
       System.out.println("");
       
       System.out.println("SECADOR");
       s.getCalculaPotenciaActual();
       s.encender();
       s.getCalculaPotenciaActual();
       s.encenderResistencia1();
       s.getCalculaPotenciaActual();
       s.encenderResistencia2();
       s.getCalculaPotenciaActual();
    }
}
