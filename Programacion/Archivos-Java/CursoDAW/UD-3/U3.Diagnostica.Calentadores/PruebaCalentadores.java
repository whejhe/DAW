
package com.mycompany.u3.diagnostica.calentadores;

public class PruebaCalentadores {
    public static void main(String[] args) {
        Radiador r = new Radiador();
        Secador s = new Secador();
        r.setPotencia(1000);
        s.setPotencia(1000);
        System.out.println("---RADIADOR---");
        r.setPorcentaje(80);
        System.out.println("La potencia actual con el radiador apagado "+r.calculaPotenciaActual());
        r.encender();
        System.out.println("La potencia actual con el radiador encendido "+r.calculaPotenciaActual());
        
        System.out.println("---SECADOR---");
        System.out.println("La potencia actual con el secador apagado "+s.calculaPotenciaActual());
        s.encender();
        System.out.println("La potencia actual con el secador encendido pero ninguna resistencia activa"+s.calculaPotenciaActual());
        s.encenderRes1();
        System.out.println("La potencia actual con el secador encendido pero una resistencia activa (res1)"+s.calculaPotenciaActual());
        s.encenderRes2();
        System.out.println("La potencia actual con el secador encendido y las dos resistencias encendidas"+s.calculaPotenciaActual());
        s.apagarRes1();
        System.out.println("La potencia actual con el secador encendido pero una resistencia activa (res2)"+s.calculaPotenciaActual());
    }
    
}
