package com.mycompany.extras.relojdespertador;

public class PruebaAlarma {
    public static void main(String[] args) {
        RelojDespertador r = new RelojDespertador();
        
        r.setHora(23, 25);
        r.setHoraAlarma(6, 20);
        
        r.getHoraActual();
        r.getMinutoActual();
        r.getHoraAlarma();
        r.getMinutoAlarma();
        
        r.imprimirHoraActual();
        r.imprimirHoraAlarma();
        r.activarAlarma();
        r.imprimirEstadoAlarma();
        r.sonarAlarma();
        
    }
}
