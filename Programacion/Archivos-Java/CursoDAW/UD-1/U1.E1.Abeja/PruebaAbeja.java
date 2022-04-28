package com.mycompany.u1.e1.abeja;

public class PruebaAbeja {
    public static void main(String[] args) {
        Abeja Maya;
        Maya = new Abeja(); //Nombramos a Maya como una abeja
        
        Abeja Abejorro;
        Abejorro = new Abeja(); //Nombramos a Abejorro usano el mismo molde de Abeja
        
        //Vemos el estado actual
        Maya.imprimePosicionX();
        Maya.imprimePosicionY();
        Maya.imprimeEstadoVuelo();
        
        //Ahora se va volando y se posa en otra posicion
        Maya.vuela();
        Maya.imprimeEstadoVuelo();
        Maya.cambiaPosicionX(4);
        Maya.cambiaPosicionY(4);
        Maya.sePosa();
        
        Abejorro.vuela();
        Abejorro.imprimeEstadoVuelo();
        Abejorro.cambiaPosicionX(10);
        Abejorro.cambiaPosicionY(8);
        Abejorro.sePosa();
        
        //De nuevo vemos cúal es su estado actual
        Maya.imprimePosicionX();
        Maya.imprimePosicionY();
        Maya.imprimeEstadoVuelo();
        
        Abejorro.imprimePosicionX();
        Abejorro.imprimePosicionY();
        Abejorro.imprimeEstadoVuelo();
    
    
    }
    
}
